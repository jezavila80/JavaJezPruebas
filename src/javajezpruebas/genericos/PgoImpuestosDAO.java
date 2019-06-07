package javajezpruebas.genericos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javajezpruebas.beans.PgoImpuestosBean;


/**
* Descripción: [aquí].
* @author jezreel_avila
* @created 20/09/2018 
*/
public class PgoImpuestosDAO extends DatabaseDAO<PgoImpuestosBean> {

	protected PgoImpuestosDAO(Connection conn) {
		super(conn);
	}

	// ===========================================================
	// VARIABLES
	// ===========================================================

	// ===========================================================
	// CONSTRUCTORES
	// ===========================================================

	// ===========================================================
	// MÉTODOS
	// ===========================================================
	
	public boolean crear(PgoImpuestosBean b) {
		QUERY_INSERT = b.getQueryInsert();
		PreparedStatement ps = null;
		try {
			ps = getConnection().prepareStatement(QUERY_INSERT);
			ps.setInt(1, b.getTienda());
			ps.setInt(2, b.getCaja());
			ps.setInt(3, b.getTicket());
			ps.setDate(4, b.getFecha());
			ps.setInt(5, b.getHora());
			ps.setInt(6, b.getTipo());
			ps.setInt(7, b.gettImpto());
			ps.setDouble(8, b.getpImpto());
			ps.setDouble(9, b.getImpuesto());
			ps.setDouble(10, b.getVenta());
			return ps.executeUpdate() > 0;
		} catch (SQLException e) {
			e.printStackTrace();
		}		
		return false;
	}

}


