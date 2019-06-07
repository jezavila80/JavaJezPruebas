package javajezpruebas.beans;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import javajezpruebas.genericos.Creable;

/**
 * Clase PgoVentaBean {Inserte una descripción aqui}.
 * 
 * @author jezreel_avila
 * @created 28/09/2018
 */
public class SadVentaBean extends VentaBean implements Creable {
    
    public static final String TABLA = "sad_ventas";

    public static final String QUERY =
        "SELECT \n" +
        "  tienda, caja, pedido, ticket, fecha, hora, secuencial, producto, concepto, cantidad, cantidaddev, pciovta, importe, tipoiva,\n" +
        "  tasaiva, iva, t_impto, p_impto, impuesto, tiposunt, psunt, suntuario, tipoestatal, pestatal, estatal, tipo_dscnto,\n" +
        "  pdescnto, descnto, pcionvo, cautoriza, nofta, pcionor, cosvta, afectado, descntocxc, c_alfab1, c_alfab2, c_alfab3,\n" +
        "  c_num, c_entero, fpgc, tipoieps, tasaieps, ieps, prodanticipo, numoferta, importeptos, descnto_clteesp, pdescnto_insen,\n" +
        "  mdro_otorgado, ltdprograma, cadaxpesos, cant_puntos, precio_punto, monedero, origenptos, tmonedero, ptos_otorgados,\n" +
        "  c_num1, c_num2, c_alfab20, idsite, cant_oferta, cant_promo, cant_dscnto, cant_normal, nvonofta, impo_oferta, impo_promo,\n" +
        "  impo_dscnto, impo_normal, impo_part, impo_aux1, costo_oferta, costo_promo, costo_dscnto, costo_normal, aport_ofta,\n" +
        "  aport_fofta, aport_prom, aport_fprom, exc_convenio, exc_promo, cant_oftapart, cant_prompart, ori_costos, aport_xconv,\n" +
        "  ltdnumoferta\n" +
        "FROM ventas";
    
    public final String queryInsert = 
    		"INSERT INTO sad_ventas (pedido,tienda,caja,ticket,fecha,hora,secuencial,producto,concepto,cantidad,cantidaddev, \n" + 
    		"pciovta,importe,tipoiva,tasaiva,iva,t_impto,p_impto,impuesto,tiposunt,psunt, \n" + 
    		"suntuario,tipoestatal,pestatal,estatal,tipo_dscnto,pdescnto,descnto,pcionvo,cautoriza,nofta, \n" + 
    		"pcionor,cosvta,afectado,descntocxc,c_alfab1,c_alfab2,c_alfab3,c_num,c_entero,fpgc, \n" + 
    		"tipoieps,tasaieps,ieps,prodanticipo,numoferta,importeptos,descnto_clteesp,pdescnto_insen,mdro_otorgado,ltdprograma, \n" + 
    		"cadaxpesos,cant_puntos,precio_punto,monedero,origenptos,tmonedero,ptos_otorgados,c_num1,c_num2,c_alfab20, \n" + 
    		"idsite,cant_oferta,cant_promo,cant_dscnto,cant_normal,nvonofta,impo_oferta,impo_promo,impo_dscnto,impo_normal, \n" + 
    		"impo_part,impo_aux1,costo_oferta,costo_promo,costo_dscnto,costo_normal,aport_ofta,aport_fofta,aport_prom,aport_fprom, \n" + 
    		"exc_convenio,exc_promo,cant_oftapart,cant_prompart,ori_costos,aport_xconv,ltdnumoferta) values (?,?,?,?,?,?,?,?,"
            + "?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,"
            + "?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);";

    public int pedido;

    public SadVentaBean() {
        super();
    }
    
    public SadVentaBean(int tienda, int caja, int ticket, Date fecha, int hora, int secuencial, int producto) {
        this.tienda = tienda;
        this.caja = caja;
        this.ticket = ticket;
        this.fecha = fecha;
        this.hora = hora;
        this.secuencial = secuencial;
        this.producto = producto;
    }
    
    public SadVentaBean(ResultSet resultSet) {
        super(resultSet);
    }
    
    public void datosResultadoQuery(ResultSet resultSet) throws SQLException {
        pedido = resultSet.getInt("pedido");
        super.datosResultadoQuery(resultSet);
    }
    
    public String getQueryInsert() {
        return queryInsert /*"INSERT INTO sad_ventas (pedido,tienda,caja,ticket,fecha,hora,secuencial,producto,concepto,cantidad,cantidaddev, \n" + 
    		"pciovta,importe,tipoiva,tasaiva,iva,t_impto,p_impto,impuesto,tiposunt,psunt, \n" + 
    		"suntuario,tipoestatal,pestatal,estatal,tipo_dscnto,pdescnto,descnto,pcionvo,cautoriza,nofta, \n" + 
    		"pcionor,cosvta,afectado,descntocxc,c_alfab1,c_alfab2,c_alfab3,c_num,c_entero,fpgc, \n" + 
    		"tipoieps,tasaieps,ieps,prodanticipo,numoferta,importeptos,descnto_clteesp,pdescnto_insen,mdro_otorgado,ltdprograma, \n" + 
    		"cadaxpesos,cant_puntos,precio_punto,monedero,origenptos,tmonedero,ptos_otorgados,c_num1,c_num2,c_alfab20, \n" + 
    		"idsite,cant_oferta,cant_promo,cant_dscnto,cant_normal,nvonofta,impo_oferta,impo_promo,impo_dscnto,impo_normal, \n" + 
    		"impo_part,impo_aux1,costo_oferta,costo_promo,costo_dscnto,costo_normal,aport_ofta,aport_fofta,aport_prom,aport_fprom, \n" + 
    		"exc_convenio,exc_promo,cant_oftapart,cant_prompart,ori_costos,aport_xconv,ltdnumoferta) values (?,?,?,?,?,?,?,?,"
            + "?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,"
            + "?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);"*/;
    }
    
}
