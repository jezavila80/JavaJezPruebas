package javajezpruebas.genericos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javajezpruebas.beans.VentaBean;



/**
* Descripción: [aquí].
* @author jezreel_avila
* @created 19/09/2018 
*/
public class VentasDAO extends DatabaseDAO<VentaBean> {

	// ===========================================================
	// VARIABLES
	// ===========================================================
	
	// ===========================================================
	// CONSTRUCTORES
	// ===========================================================

	// ===========================================================
	// MÉTODOS
	// ===========================================================
	
	public VentasDAO(Connection conn) {
		super(conn); 
    }

    public List<VentaBean> encontrarPor(int tienda, int caja, int ticket, Date fecha, int hora) {
        VentaBean b = null;
        List<VentaBean> l = new ArrayList<VentaBean>();
        String condicion = "";
        PreparedStatement ps = null;
        ResultSet rs = null;

        condicion
                = " WHERE tienda = ?\n"
                + "  AND caja = ?\n"
                + "  AND ticket = ?\n"
                + "  AND fecha = ?\n"
                + "  AND hora = ?\n";

        try {
            l = encontrarTodo(VentaBean.QUERY + condicion, VentaBean.class, tienda, caja, ticket, fecha, hora);
        } catch (SQLException ex) {
            Logger.getLogger(VentasDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return l;
    }
    
//    public boolean crear(VentaBean b) {
//    	QUERY_INSERT = b.getQueryInsert();
//    	PreparedStatement ps = null;
//		try {
//			ps = getConnection().prepareStatement(QUERY_INSERT);
//			ps.setInt(1, b.getTienda());
//			ps.setInt(2, b.getCaja());
//			ps.setInt(3, b.getTicket());
//			ps.setDate(4, b.getFecha());
//			ps.setInt(5, b.getHora());
//			ps.setInt(6, b.getSecuencial());
//			ps.setInt(7, b.getProducto());
//			ps.setInt(8, b.getConcepto());
//			ps.setDouble(9, b.getCantidad());
//			ps.setDouble(10, b.getCantidaddev());
//			ps.setDouble(11, b.getPciovta());
//			ps.setDouble(12, b.getImporte());
//			ps.setInt(13, b.getTipoiva());
//			ps.setDouble(14, b.getTasaiva());
//			ps.setDouble(15, b.getIva());
//			ps.setInt(16, b.gettImpto());
//			ps.setDouble(17, b.getpImpto());
//			ps.setDouble(18, b.getImpuesto());
//			ps.setInt(19, b.getTiposunt());
//			ps.setDouble(20, b.getPsunt());
//			ps.setDouble(21, b.getSuntuario());
//			ps.setInt(22, b.getTipoestatal());
//			ps.setDouble(23, b.getPestatal());
//			ps.setDouble(24, b.getEstatal());
//			ps.setString(25, b.getTipoDscnto());
//			ps.setDouble(26, b.getPdescnto());
//			ps.setDouble(27, b.getDescnto());
//			ps.setString(28, b.getPcionvo());
//			ps.setInt(29, b.getCautoriza());
//			ps.setString(30, b.getNofta());
//			ps.setDouble(31, b.getPcionor());
//			ps.setDouble(32, b.getCosvta());
//			ps.setString(33, b.getAfectado());
//			ps.setDouble(34, b.getDescntocxc());
//			ps.setString(35, b.getcAlfab1());
//			ps.setString(36, b.getcAlfab2());
//			ps.setString(37, b.getcAlfab3());
//			ps.setDouble(38, b.getcNum());
//			ps.setInt(39, b.getcEntero());
//			ps.setDouble(40, b.getFpgc());
//			ps.setInt(41, b.getTipoieps());
//			ps.setDouble(42, b.getTasaieps());
//			ps.setDouble(43, b.getIeps());
//			ps.setString(44, b.getProdanticipo());
//			ps.setInt(45, b.getNumoferta());
//			ps.setDouble(46, b.getImporteptos());
//			ps.setDouble(47, b.getDescntoClteesp());
//			ps.setDouble(48, b.getPdescntoInsen());
//			ps.setDouble(49, b.getMdroOtorgado());
//			ps.setInt(50, b.getLtdprograma());
//			ps.setDouble(51, b.getCadaxpesos());
//			ps.setDouble(52, b.getCantPuntos());
//			ps.setDouble(53, b.getPrecioPunto());
//			ps.setDouble(54, b.getMonedero());
//			ps.setString(55, b.getOrigenptos());
//			ps.setString(56, b.getTmonedero());
//			ps.setDouble(57, b.getPtosOtorgados());
//			ps.setDouble(58, b.getcNum1());
//			ps.setInt(59, b.getcNum2()); //
//			ps.setString(60, b.getcAlfab20());
//			ps.setInt(61, b.getIdsite()); //
//			ps.setDouble(62, b.getCantOferta());
//			ps.setDouble(63, b.getCantPromo());
//			ps.setDouble(64, b.getCantDscnto());
//			ps.setDouble(65, b.getCantNormal());
//			ps.setString(66, b.getNvonofta());
//			ps.setDouble(67, b.getImpoOferta());
//			ps.setDouble(68, b.getImpoPromo());
//			ps.setDouble(69, b.getImpoDscnto());
//			ps.setDouble(70, b.getImpoNormal());
//			ps.setDouble(71, b.getImpoPart());
//			ps.setDouble(72, b.getImpoAux1());
//			ps.setDouble(73, b.getCostoOferta());
//			ps.setDouble(74, b.getCostoPromo());
//			ps.setDouble(75, b.getCostoDscnto());
//			ps.setDouble(76, b.getCostoNormal());
//			ps.setDouble(77, b.getAportOfta());
//			ps.setDouble(78, b.getAportFofta());
//			ps.setDouble(79, b.getAportProm());
//			ps.setDouble(80, b.getAportFprom());
//			ps.setDouble(81, b.getExcConvenio());
//			ps.setDouble(82, b.getExcPromo());
//			ps.setDouble(83, b.getCantOftapart());
//			ps.setDouble(84, b.getCantPrompart());
//			ps.setDouble(85, b.getOriCostos());
//			ps.setDouble(86, b.getAportXconv());
//			ps.setInt(87, b.getLtdnumoferta()); //
//			return ps.executeUpdate() > 0;
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}    	
//    	
//    	return false;
//	}
    
    public boolean crear(VentaBean b) {
        if (super.crear(b, VentaBean.class)) {
            return true;
        }
        return false;
    }
    
    public boolean crear(VentaBean b, Class cls) {
        if (super.crear(b, cls)) {
            return true;
        }
        return false;
    }

}


