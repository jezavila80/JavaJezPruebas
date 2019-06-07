package javajezpruebas.genericos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javajezpruebas.beans.PgoFpagosBean;


/**
* Descripción: [aquí].
* @author jezreel_avila
* @created 20/09/2018 
*/
public class PgoFpagosDAO extends DatabaseDAO<PgoFpagosBean> {


	// ===========================================================
	// VARIABLES
	// ===========================================================

	// ===========================================================
	// CONSTRUCTORES
	// ===========================================================
	
	public PgoFpagosDAO(Connection conn) {
		super(conn);
	}

	// ===========================================================
	// MÉTODOS
	// ===========================================================
	
	public boolean crear(PgoFpagosBean b) {
		QUERY_INSERT = b.getQueryInsert();
		PreparedStatement ps = null;
		try {
			ps = getConnection().prepareStatement(b.getQueryInsert());
			ps.setInt(1, b.getTienda());
			ps.setInt(2, b.getCaja());
			ps.setInt(3, b.getTicket());
			ps.setDate(4, b.getFecha());
			ps.setInt(5, b.getHora());
			ps.setInt(6, b.getFpago());
			ps.setDouble(7, b.getImporte().doubleValue());
			ps.setString(8, b.getReferencia());
			ps.setDouble(9, b.getTipo_cambio().doubleValue());
			ps.setString(10, b.getAfectado());
			ps.setInt(11, b.getAutorizacion());
			ps.setInt(12, b.getConceptori());
			ps.setInt(13, b.getSecuencial());
			ps.setInt(14, b.getAuttarjeta());
			ps.setString(15, b.getFp_alfab20());
			ps.setInt(16, b.getFp_entero());
			ps.setString(17, b.getTarjeta());
			ps.setString(18, b.getAutcodigo());
			ps.setString(19, b.getDoc());
			ps.setString(20, b.getForzada());
			ps.setInt(21, b.getTipotarjeta());
			ps.setInt(22, b.getTipoautoriza());
			ps.setInt(23, b.getPlanpago());
			ps.setInt(24, b.getNmeses());
			ps.setInt(25, b.getEquivfpago());
			ps.setDouble(26, b.getEquivimporte().doubleValue());
			ps.setInt(27, b.getRefertrans());
			ps.setString(28, b.getSivale());
			ps.setString(29, b.getFp_alfab10());
			ps.setInt(30, b.getFp_num1());
			ps.setDouble(31, b.getFp_num2().doubleValue());
			ps.setDouble(32, b.getFp_num3().doubleValue());
			ps.setDouble(33, b.getImpoPtos());
			ps.setInt(34, b.getAutoriza());
			ps.setInt(35, b.getIdBanco());
			ps.setInt(36, b.getNumMesesInt());
			return ps.executeUpdate() > 0;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

}


