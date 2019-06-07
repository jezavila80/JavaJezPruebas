package javajezpruebas.genericos;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javajezpruebas.beans.Bean;

/**
 * Descripción: [aquí].
 *
 * @author jezreel_avila
 * @created 19/09/2018
 */
public abstract class DatabaseDAO<T> {

    // ===========================================================
    // VARIABLES
    // ===========================================================
    private Connection conn;
    protected String QUERY_INSERT = null;
    protected String QUERY_UPDATE = null;
    protected String QUERY_DELETE = null;

    // ===========================================================
    // CONSTRUCTORES
    // ===========================================================
    protected DatabaseDAO(Connection conn) {
        this.conn = conn;
    }

    // ===========================================================
    // MÉTODOS
    // ===========================================================
    @SuppressWarnings("unchecked")
    protected <T extends Bean> ArrayList<T> encontrarTodo(String query, Class<?> cls, Object ... params) throws SQLException {
        T t = null;
        ArrayList<T> li = new ArrayList<T>();
        PreparedStatement ps = null;
        ResultSet rs = null;
        int cnt = 0;
        
        try {
            t = (T)cls.newInstance();
            Class.forName("com.informix.jdbc.IfxDriver");
            conn = DriverManager.getConnection("jdbc:informix-sqli://10.15.11.247:1526/sas:INFORMIXSERVER=sas","informix","informix");
        
        
            ps = conn.prepareStatement(query);
            for (Object o : params) {
                try {
                    if (o == null) {
                        ps.setObject(++cnt, null);
                    } else if (o instanceof String) {
                        ps.setString(++cnt, (String) o);
                    } else if (o instanceof Integer) {
                        ps.setInt(++cnt, (Integer) o);
                    } else if (o instanceof Date) {
                        ps.setDate(++cnt, (Date)o);
                    } else if (Double.isNaN((Double) o)) {
                        ps.setDouble(++cnt, 0.0);
                    } else if (o instanceof Double) {
                        ps.setDouble(++cnt, (Double) o);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            rs = ps.executeQuery(); //8	83	8840	2018-06-27	1936
            try {
                while (rs.next()) {
                    t = (T)cls.newInstance();
                    t.datosResultadoQuery(rs);
                    Field[] campos = t.getClass().getDeclaredFields();
                    li.add(t);
                }
                return li;
                //t = (T) cls.asSubclass(cls).getConstructors()[0].newInstance(rs);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DatabaseDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(DatabaseDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(DatabaseDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            //cierraRs(rs);
            //cierraPs(ps);
            try {
                rs.close();
            } catch (Exception e) {
            }
            try {
                ps.close();
            } catch (Exception e) {
            }
            try {
                conn.close();
            } catch (Exception e) {
            }
            System.out.println("Todo Cerrado!!");
        }
        return null;
    }

    public boolean actualizar(DatabaseDAO<? extends Actualizable> b) {

        return false;
    }

    public boolean borrar(DatabaseDAO<? extends Borrable> b) {

        return false;
    }

    protected boolean crear(Creable b, Class<T> cls) {
        PreparedStatement ps = null;
        ArrayList<DatosCampo> colDatos = new ArrayList<DatosCampo>();
        T t = null;
        try {
            t = (T )cls.newInstance();
            //t = (T)b;
            Class.forName("com.informix.jdbc.IfxDriver");
            conn = DriverManager.getConnection("jdbc:informix-sqli://10.15.11.247:1526/sas:INFORMIXSERVER=sas","informix","informix");
        } catch (Exception ex) {
            Logger.getLogger(DatabaseDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        if (t == null) {
            Logger.getLogger(DatabaseDAO.class.getName()).log(Level.SEVERE, "Error al castear un objecto!!");
            return false;
        }
        Field[] campos = t.getClass().getDeclaredFields();
        Field[] camposSup = t.getClass().getSuperclass().getDeclaredFields();
        int cnt = 0;
        for (Field campo : campos) {
            campo.setAccessible(true);
            String nombre = campo.getName();
            Object valor = null; 
            java.lang.reflect.Type tipo = campo.getGenericType();
            try {
                valor = campo.get(t);
                System.out.println("Campo['" + campo.getName() + "']=" + valor);
            } catch (IllegalArgumentException ex) {
                Logger.getLogger(DatabaseDAO.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                Logger.getLogger(DatabaseDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (!java.lang.reflect.Modifier.isStatic(campo.getModifiers())) {
                if (!campo.getName().equals("queryInsert")) {
                    colDatos.add(new DatosCampo(nombre, valor, tipo));
                    //System.out.print("" + campo.getName() + ",");
                    cnt++;
                }
            }
        }
        if (!t.getClass().getSuperclass().isInterface()) {
            for (Field campo : camposSup) {
                campo.setAccessible(true);
                String nombre = campo.getName();
                Object valor = null;
                java.lang.reflect.Type tipo = campo.getGenericType();
                try {
                    valor = campo.get(t);
                    System.out.println("Campo['" + campo.getName() + "']=" + valor);
                } catch (IllegalArgumentException ex) {
                    Logger.getLogger(DatabaseDAO.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                    Logger.getLogger(DatabaseDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
                if (!java.lang.reflect.Modifier.isStatic(campo.getModifiers())) {
                    if (!campo.getName().equals("queryInsert")) {
                        colDatos.add(new DatosCampo(nombre, valor, tipo));
                        //System.out.print("" + campo.getName() + ",");
                        cnt++;
                    }
                }
            }
        }
        System.out.println("Campos : " + cnt);
        
        try {
            
            ps = conn.prepareStatement(b.getQueryInsert());
            cnt = 0;
            for (DatosCampo dc : colDatos) {
                if (dc.valor instanceof String) {
                    ps.setString(++cnt, (String) dc.valor);
                } else if (dc.valor instanceof Integer) {
                    ps.setInt(++cnt, (Integer) dc.valor);
                } else if (dc.valor instanceof Double) {
                    ps.setDouble(++cnt, (Double) dc.valor);
                } else if (dc.valor instanceof Date) {
                    ps.setDate(++cnt, (Date) dc.valor);
                } else if (dc.valor == null) {
                    if (dc.tipo.equals(String.class)) {
                        ps.setString(++cnt, "");
                    } else if (dc.tipo.equals(Date.class)) {
                        ps.setDate(++cnt, new Date(new java.util.Date().getTime()));
                    } else if (dc.tipo.equals(Integer.class)) {
                        ps.setInt(++cnt, new Integer(0));
                    } else {
                        ps.setObject(++cnt, null);
                    }
                } 
            }
            return ps.executeUpdate() > 0;

        } catch (SQLException ex) {
            Logger.getLogger(DatabaseDAO.class.getName()).log(Level.SEVERE, "Cuantos: " + cnt + ", Query: " + b.getQueryInsert(), ex);
        } finally {
            try {
                ps.close();
            } catch (Exception e) {
            }
            try {
                conn.close();
            } catch (Exception e) {
            }
            System.out.println("Todo Cerrado!!");
        }

        return false;
    }

    protected Connection getConnection() {
        return conn;
    }
    
    public static class DatosCampo {
        public String nombre;
        public Object valor;
        public java.lang.reflect.Type tipo;

        public DatosCampo(String nombre, Object valor, Type tipo) {
            this.nombre = nombre;
            this.valor = valor;
            this.tipo = tipo;
        }

        @Override
        public String toString() {
            return "DatosCampo{" + "nombre=" + nombre + ", valor=" + valor + ", tipo=" + tipo + '}';
        }
        
    }

}
