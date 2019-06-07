package javajezpruebas.genericos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javajezpruebas.beans.Pagos;

/**
 * Descripción: [aquí].
 *
 * @author jezreel_avila
 * @created 20/09/2018
 */
public class PagosDAO extends DatabaseDAO<Pagos> {

    // ===========================================================
    // VARIABLES
    // ===========================================================
    // ===========================================================
    // CONSTRUCTORES
    // ===========================================================
    public PagosDAO(Connection conn) {
        super(conn);
    }

    // ===========================================================
    // MÉTODOS
    // ===========================================================
    public boolean crear(Pagos b) {
        QUERY_INSERT = b.queryInsert;
        PreparedStatement ps = null;
        try {
            ps = getConnection().prepareStatement(QUERY_INSERT);
            ps.setInt(1, b.getTienda());
            ps.setInt(2, b.getCaja());
            ps.setInt(3, b.getTicket());
            ps.setDate(4, b.getFecha());
            ps.setInt(5, b.getHora());
            ps.setInt(6, b.getSecpago());
            ps.setInt(7, b.getCajero());
            ps.setString(8, b.getClte_empldo());
            ps.setInt(9, b.getCliente());
            ps.setString(10, b.getTarjeta());
            ps.setInt(11, b.getCltipo());
            ps.setString(12, b.getEmp_prefijo());
            ps.setString(13, b.getEmp_codigo());
            ps.setInt(14, b.getConcepto());
            ps.setString(15, b.getSfactura());
            ps.setInt(16, b.getNfactura());
            ps.setDouble(17, b.getImporte().doubleValue());
            ps.setString(18, b.getAfectado());
            ps.setInt(19, b.getCorte());
            ps.setInt(20, b.getFin_dia());
            ps.setInt(21, b.getTicketoriginal());
            ps.setInt(22, b.getAutoriza());
            ps.setString(23, b.getDuda());
            ps.setInt(24, b.getDeposito());
            ps.setString(25, b.getSpagare());
            ps.setInt(26, b.getNpagare());
            ps.setString(27, b.getCopago());
            ps.setInt(28, b.getCajaoriginal());
            ps.setString(29, b.getC_alfab());
            ps.setDouble(30, b.getC_num().doubleValue());
            ps.setInt(31, b.getC_entero());
            ps.setInt(32, b.getHsa());
            ps.setInt(33, b.getClientefg());
            ps.setString(34, b.getLlavefg());
            ps.setInt(35, b.getTipotrans());
            ps.setString(36, b.getRetirocash());
            ps.setInt(37, b.getPedidosad());
            ps.setInt(38, b.getApartado());
            ps.setString(39, b.getNumremesa());
            ps.setString(40, b.getReferencia());
            ps.setString(41, b.getC_alfab10());
            ps.setString(42, b.getC_alfab20());
            ps.setInt(43, b.getC_num1());
            ps.setInt(44, b.getC_num2());
            ps.setDouble(45, b.getC_num3().doubleValue());
            ps.setDouble(46, b.getC_num4().doubleValue());
            ps.setInt(47, b.getLtdidtrans());
            ps.setInt(48, b.getLtdlote());
            ps.setInt(49, b.getTcondescto());
            ps.setString(50, b.getLtdreferencia());
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

}
