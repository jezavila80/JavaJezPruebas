package javajezpruebas.beans;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import javajezpruebas.genericos.Creable;


/**
* Descripción: [aquí].
* @author jezreel_avila
* @created 20/09/2018 
*/
public class PgoImpuestosBean extends Bean implements Creable {
	
	public static final String TABLA = "pgo_impuestos";

    public static final String QUERY =
        "SELECT \n" +
        "  tienda, caja, ticket, fecha, hora, tipo, t_impto, p_impto, impuesto, venta\n" +
        "FROM pgo_impuestos";
    
    public final String queryInsert = "INSERT INTO pgo_impuestos (tienda,caja,ticket,fecha,hora,tipo,t_impto,p_impto,impuesto,venta) "
    		+ "values (?,?,?,?,?,?,?,?,?,?);";

	// ===========================================================
	// VARIABLES
	// ===========================================================
    
	public int tienda;
	public int caja;
	public int ticket;
	public Date fecha;
	public int hora;
	public int tipo;
	public int tImpto;
	public double pImpto;
	public double impuesto;
	public double venta;

	// ===========================================================
	// CONSTRUCTORES
	// ===========================================================
	
	public PgoImpuestosBean(ResultSet resultSet) {
		try {
			if (resultSet == null || !resultSet.next()) {
				return;
			}
			datosResultadoQuery(resultSet);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// ===========================================================
	// MÉTODOS
	// ===========================================================
	
	@Override
	public void datosResultadoQuery(ResultSet resultSet) throws SQLException {
		tienda = resultSet.getInt("tienda");
		caja = resultSet.getInt("caja");
		ticket = resultSet.getInt("ticket");
		fecha = resultSet.getDate("fecha");
		hora = resultSet.getInt("hora");
		tipo = resultSet.getInt("tipo");
		tImpto = resultSet.getInt("t_impto");
		pImpto = resultSet.getInt("p_impto");
		impuesto = resultSet.getInt("impuesto");
		venta = resultSet.getInt("venta");
	}

	public double getpImpto() {
		return pImpto;
	}

	public void setpImpto(double pImpto) {
		this.pImpto = pImpto;
	}

	public double getImpuesto() {
		return impuesto;
	}

	public void setImpuesto(double impuesto) {
		this.impuesto = impuesto;
	}

	public double getVenta() {
		return venta;
	}

	public void setVenta(double venta) {
		this.venta = venta;
	}

	public int getTienda() {
		return tienda;
	}

	public void setTienda(int tienda) {
		this.tienda = tienda;
	}

	public int getCaja() {
		return caja;
	}

	public void setCaja(int caja) {
		this.caja = caja;
	}

	public int getTicket() {
		return ticket;
	}

	public void setTicket(int ticket) {
		this.ticket = ticket;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public int gettImpto() {
		return tImpto;
	}

	public void settImpto(int tImpto) {
		this.tImpto = tImpto;
	}

	public String getQueryInsert() {		
		return queryInsert;
	}
	
	

}


