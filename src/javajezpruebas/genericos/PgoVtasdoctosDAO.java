package javajezpruebas.genericos;import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javajezpruebas.beans.PgoVtaDoctoBean;

/**
* Descripción: [aquí].
* @author jezreel_avila
* @created 20/09/2018 
*/
public class PgoVtasdoctosDAO extends DatabaseDAO<PgoVtaDoctoBean>{

	// ===========================================================
	// VARIABLES
	// ===========================================================

	// ===========================================================
	// CONSTRUCTORES
	// ===========================================================
	
	protected PgoVtasdoctosDAO(Connection conn) {
		super(conn);
	}

	// ===========================================================
	// MÉTODOS
	// ===========================================================
	
	public boolean crear(PgoVtaDoctoBean b) {
		QUERY_INSERT = b.getQueryInsert();
		PreparedStatement ps = null;
		try {
			ps = getConnection().prepareStatement(QUERY_INSERT);
			ps.setInt(1, b.getTienda());
			ps.setInt(2, b.getCaja());
			ps.setInt(3, (int)b.getTicket());
			ps.setDate(4, b.getFecha());
			ps.setInt(5, b.getHora());
			ps.setInt(6, b.getFormaPago());
			ps.setInt(7, b.getGpoDocto());
			ps.setInt(8, b.getConcepto());
			ps.setString(9, b.getRecolectado());
			ps.setString(10, b.getEstatus());
			ps.setString(11, b.getDocSerie());
			ps.setInt(12, (int)b.getDocumento());
			ps.setInt(13, (int)b.getCliente());
			ps.setInt(14, (int)b.getCtaAdicional());
			ps.setString(15, b.getnReceta());
			ps.setInt(16, b.getnDoctos());
			ps.setDouble(17, b.getImporte());
			ps.setString(18, b.getReferencia());
			ps.setDouble(19, b.getCveCorte());
			ps.setDouble(20, b.getValijaId());
			ps.setInt(21, b.getcNum1());
			ps.setInt(22, b.getcNum2());
			ps.setDouble(23, b.getcNum3());
			ps.setString(24, b.getcAlfab20());
			ps.setDouble(25, b.getTicketRecol());
			ps.setString(26, b.getRefReceta());
			ps.setDate(27, b.getFechaCancela());
			ps.setString(28, b.getEsCupon());
			ps.setInt(29, b.getFormato());
			ps.setLong(30, b.getIdAfiliado());
			ps.setString(31, b.getAfiliado());
			ps.setInt(32, b.getSaldoxAfil());
			ps.setString(33, b.getClave());
			ps.setDate(34, b.getFechaConsulta());
			ps.setString(35, b.getBeneficiario());
			ps.setString(36, b.getAutReceta());
			return ps.executeUpdate() > 0;
		} catch (SQLException e) {
			e.printStackTrace();
		}	
		return false;
	}

}


