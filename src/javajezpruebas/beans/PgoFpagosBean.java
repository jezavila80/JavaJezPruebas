package javajezpruebas.beans;

import java.math.BigDecimal;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;

import javajezpruebas.genericos.Creable;

/**
* Descripción: [aquí].
* @author jezreel_avila
* @created 17/09/2018 
*/
public class PgoFpagosBean extends Pgo_fpagos implements Creable {
	
	public static final String TABLA = "pgo_fpagos";

    public static final String QUERY =
        "SELECT tienda,caja,ticket,fecha,hora,fpago,importe,referencia,tipo_cambio,afectado,autorizacion,"   +
        "conceptori,secuencial,auttarjeta,fp_alfab20,fp_entero,tarjeta,autcodigo,doc,forzada,tipotarjeta,"   +
        "tipoautoriza,planpago,nmeses,equivfpago,equivimporte,refertrans,sivale,fp_alfab10,fp_num1,fp_num2," +
        "fp_num3,impoptos,autoriza,idbanco,nmesesint FROM pgo_fpagos";
    
    public final String queryInsert = "INSERT INTO pgo_fpagos (tienda,caja,ticket,fecha,hora,fpago,importe,referencia,tipo_cambio,afectado, \n" + 
    		"autorizacion,conceptori,secuencial,auttarjeta,fp_alfab20,fp_entero,tarjeta,autcodigo,doc,forzada, \n" + 
    		"tipotarjeta,tipoautoriza,planpago,nmeses,equivfpago,equivimporte,refertrans,sivale,fp_alfab10,fp_num1, \n" + 
    		"fp_num2,fp_num3,impoptos,autoriza,idbanco,nmesesint) values (?,?,?,?,?, \n" + 
    		"?,?,?,?,?,?,?,?,?,?, \n" + 
    		"?,?,?,?,?,?,?,?,?,?, \n" + 
    		"?,?,?,?,?,?,?,?,?,?, \n" + 
    		"?);";

	// ===========================================================
	// VARIABLES
	// ===========================================================
    
    private double impoPtos;
    private int idBanco;
    private int numMesesInt;

	// ===========================================================
	// CONSTRUCTORES
	// ===========================================================
    
    public PgoFpagosBean() {
    	
    }
	
	public PgoFpagosBean(int tienda, int caja, int ticket, Date fecha, int hora, int fpago, int secuencial) {
		this.setTienda((short)tienda);
        this.setCaja((short)caja);
        this.setTicket(ticket);
        this.setFecha(fecha);
        this.setHora((short)hora);
        this.setFpago((short)fpago);
        this.setSecuencial((short)secuencial);
	}
	
	public PgoFpagosBean(ResultSet resultSet) {
		try {
			datosResultadoQuery(resultSet);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// ===========================================================
	// MÉTODOS
	// ===========================================================
	
	public void datosResultadoQuery(ResultSet resultSet) throws SQLException {
		if (resultSet == null || !resultSet.next()) {
			return;
		}
        setTienda((short)resultSet.getInt("tienda"));
        setCaja((short)resultSet.getInt("caja"));
        setTicket(resultSet.getInt("ticket"));
        setFecha(resultSet.getDate("fecha"));
        setHora((short)resultSet.getInt("hora"));
        setFpago((short)resultSet.getInt("fpago"));
        setSecuencial((short)resultSet.getInt("secuencial"));
        
		setImporte(new BigDecimal(Redondea(resultSet.getDouble("importe"), 2)));
		setReferencia(resultSet.getString("referencia").trim());
		setTipo_cambio(new BigDecimal(Redondea(resultSet.getDouble("tipo_cambio"), 2)));
		setAfectado(resultSet.getString("afectado").trim());
		setAutorizacion(resultSet.getInt("autorizacion"));
		setConceptori((short)resultSet.getInt("conceptori"));
		setAuttarjeta(resultSet.getInt("auttarjeta"));
		setFp_alfab20(resultSet.getString("fp_alfab20").trim());
		setFp_entero(resultSet.getInt("fp_entero"));
		setTarjeta(resultSet.getString("tarjeta").trim());
		setAutcodigo(resultSet.getString("autcodigo").trim());
		setDoc(resultSet.getString("doc").trim());
		setForzada(resultSet.getString("forzada").trim());
		setTipotarjeta((short)resultSet.getInt("tipotarjeta"));
		setTipoautoriza((short)resultSet.getInt("tipoautoriza"));
		setPlanpago((short)resultSet.getInt("planpago"));
		setNmeses((short)resultSet.getInt("nmeses"));
		setEquivfpago((short)resultSet.getInt("equivfpago"));
		setEquivimporte(new BigDecimal(Redondea(resultSet.getDouble("equivimporte"), 2)));
		setRefertrans(resultSet.getInt("refertrans"));
		setSivale(resultSet.getString("sivale").trim());
		setFp_alfab10(resultSet.getString("fp_alfab10").trim());
		setFp_num1((short)resultSet.getInt("fp_num1"));
		setFp_num2(new BigDecimal(Redondea(resultSet.getDouble("fp_num2"), 2)));
		setFp_num3(new BigDecimal(Redondea(resultSet.getDouble("fp_num3"), 2)));
		setImpoPtos(Redondea(resultSet.getDouble("impoptos"), 2));
		setAutoriza((short)resultSet.getInt("autoriza"));
		setIdBanco(resultSet.getInt("idbanco"));
		setNumMesesInt(resultSet.getInt("nmesesint"));
    }

	public double getImpoPtos() {
		return impoPtos;
	}

	public void setImpoPtos(double impoPtos) {
		this.impoPtos = impoPtos;
	}

	public int getIdBanco() {
		return idBanco;
	}

	public void setIdBanco(int idBanco) {
		this.idBanco = idBanco;
	}

	public int getNumMesesInt() {
		return numMesesInt;
	}

	public void setNumMesesInt(int numMesesInt) {
		this.numMesesInt = numMesesInt;
	}
        
        public double Redondea(double numero, int decimales){
        try{
            if(Double.isNaN(numero)) {
                numero = 0;
            }

            java.math.BigDecimal redondeo
                    = new java.math.BigDecimal(numero).setScale(decimales, java.math.RoundingMode.HALF_UP);

            return redondeo.doubleValue();
        } catch (Exception ex){
            return 0;
        }
    }

	public String getQueryInsert() {		
		return queryInsert;
	}
	
	

}


