/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javajezpruebas;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jezreel_avila
 */
public class JavaJezPruebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double dd = 4.99;
        double finals = 0;
        
        
        

//        finals = (int)dd;
//        Date _fechaHoy = new java.sql.Date(new java.util.Date().getTime());
//        Date _fechaQry = new java.sql.Date(_fechaHoy.getYear(), _fechaHoy.getMonth(), _fechaHoy.getDate());
//        PreparedStatement ps = null;
//conn.prepareStatement("SELECT producto,zeconomica,sucursal,finicio,plista,pmayoreo," + 
//	            "psucursal,costo,costoprv,costoofta,costoprom FROM precios" + 
//	            " WHERE producto = ? AND (zeconomica = ? OR zeconomica = 0) AND (sucursal = ? OR sucursal = 0) " +
//                "AND finicio <= ? ORDER BY sucursal DESC, zeconomica DESC, finicio DESC LIMIT 1");
//        try {
//            ps.setDate(1, _fechaQry);
//        } catch (SQLException ex) {
//            Logger.getLogger(JavaJezPruebas.class.getName()).log(Level.SEVERE, null, ex);
//        }

//        System.out.println("dd    : " + dd);
//        System.out.println("Final : " + finals);
        
//        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
//        hm.put(0, 25);
//        System.out.println("dd    : " + hm.get(0));
//        hm.put(0, hm.get(0) + 3);
//        System.out.println("" + hm.get(0));
        //hm.get(0).
        Date fechaHoraHoy = new Date(new java.util.Date().getTime());
        Date fecha = null;
        
        fechaHoraHoy = new Date(new java.util.Date().getTime());
        fecha = new Date(fechaHoraHoy.getYear(), fechaHoraHoy.getMonth(), fechaHoraHoy.getDate());
//        
        SimpleDateFormat df = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
//        Calendar c = Calendar.getInstance();
//        c.setTime(fechaHoraHoy);
//        c.set(Calendar.YEAR, fechaHoraHoy.getYear());
//        c.set(Calendar.MONTH, fechaHoraHoy.getMonth());
//        c.set(Calendar.DATE, fechaHoraHoy.getDate());
//        c.add(Calendar.MINUTE, 3);
//        fecha = new Date(c.getTime().getTime());
        
        System.out.println("" + df.format(fechaHoraHoy));
        System.out.println("" + df.format(fecha));
        
        
        String query = "tienda,caja,ticket,fecha,hora,fpago,gpodocto,concepto,recolectado,status,dserie,documento,cliente,cta_adicional,nreceta,ndoctos,importe,referencia,cvecorte,valija_id,c_num1,c_num2,c_num3,c_alfab20,ticketrecol,refreceta,fcancela,escupon,formato,idafiliado,afiliado,saldoxafil,clave,fconsulta,beneficiario,autreceta";
        String [] lquerys = query.split(",");
        StringBuilder comodines = new StringBuilder();
        StringBuilder queryFinal = new StringBuilder();
        ArrayList<String> lineas = new ArrayList<String>();
        queryFinal.append("INSERT INTO pgo_vtasdoctos (tienda,caja,ticket,fecha,hora,fpago,gpodocto,concepto,recolectado,status,dserie,documento,cliente,cta_adicional,nreceta,ndoctos,importe,referencia,cvecorte,valija_id,c_num1,c_num2,c_num3,c_alfab20,ticketrecol,refreceta,fcancela,escupon,formato,idafiliado,afiliado,saldoxafil,clave,fconsulta,beneficiario,autreceta) ");
        int ii = 0;
        for (String s : lquerys) {
            ii++;
            comodines.append("?").append(",");
            String a = "ps.setInt("+ii+", b.get" + s.substring(0, 1).toUpperCase() + s.substring(1, s.length()) + "());";
            int x = a.indexOf("_");            
//            if (x > 0) {
//                a = a.replace("_", "");
//                a = a.substring(0, x - 1) + a.substring(x, x + 1).toUpperCase() + a.substring(x + 1);
//            }                
            lineas.add(a);
            System.out.println(a);
        }
        if (lquerys.length > 0) {
            comodines.deleteCharAt(comodines.length() - 1);
            queryFinal.append("values (").append(comodines).append(");");
        }
        System.out.println("" + queryFinal);
        int count = 0;
        int nuevoInicio = 0;
        String cadFin = "INSERT INTO pgo_vtasdoctos (tienda,caja,ticket,fecha,hora,fpago,gpodocto,concepto,recolectado,status,dserie,documento,cliente,cta_adicional,nreceta,ndoctos,importe,referencia,cvecorte,valija_id,c_num1,c_num2,c_num3,c_alfab20,ticketrecol,refreceta,fcancela,escupon,formato,idafiliado,afiliado,saldoxafil,clave,fconsulta,beneficiario,autreceta) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);";
        StringBuilder cadFinal = new StringBuilder();
        int i = 0;
        for (; i < cadFin.length(); i++) {
            if (cadFin.substring(i, i + 1).equals(",")) {
                count++;
            }
            if (count > 0  
                    && (count % 10 == 0 
                    /*|| (count % 9 == 0 && ((i + 1) - nuevoInicio) > 92)*/)) {                
                //cadFinal.append(cadFin.substring(nuevoInicio, i)).append(" \\n ");
                
                System.out.println("" + cadFin.substring(nuevoInicio, i + 1) + " \\n"); // + cadFin.substring(nuevoInicio, i + 1).length()
                nuevoInicio = i + 1;
                count = 0;
            }
        }
        System.out.println("" + cadFin.substring(i-3) + " \\n");
    }
    
}
