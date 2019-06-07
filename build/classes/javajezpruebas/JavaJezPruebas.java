/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javajezpruebas;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
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
        
//        ArrayList<String> lista = new ArrayList<String>();
//        lista.add("clienteEmpleado = resultadoQuery.valorString(\"clte_empldo\", false);");
//        lista.add("cliente = resultadoQuery.valorLong(\"cliente\", false);");
//        lista.add("rfc = resultadoQuery.valorString(\"rfc\", true);");
//        lista.add("estatus = resultadoQuery.valorString(\"status\", false);");
//        lista.add("titular = resultadoQuery.valorLong(\"titular\", true);");
//        lista.add("clave = resultadoQuery.valorString(\"clave\", true);");
//        lista.add("psubRogados = resultadoQuery.valorString(\"psubrogados\", true);");
//        lista.add("fechaAlta = resultadoQuery.valorDateTime(\"falta\", false);");
//        lista.add("fechaUltCambio = resultadoQuery.valorDateTime(\"fucambio\", true);");
//        lista.add("fechaEstatus = resultadoQuery.valorDateTime(\"fstatus\", false);");
//        lista.add("clienteNombre = resultadoQuery.valorString(\"cnombre\", true);");
//        lista.add("categoria = resultadoQuery.valorString(\"categoria\", false);");
//        lista.add("nombreComercial = resultadoQuery.valorString(\"ncomercial\", true);");
//        lista.add("telefono = resultadoQuery.valorLong(\"telefono\", true);");
//        lista.add("domicilio = resultadoQuery.valorString(\"domicilio\", false);");
//        lista.add("colonia = resultadoQuery.valorString(\"colonia\", true);");
//        lista.add("poblacion = resultadoQuery.valorInt(\"poblacion\", false);");
//        lista.add("codigoPostal = resultadoQuery.valorLong(\"cpostal\", true);");
//        lista.add("tipoCliente = resultadoQuery.valorInt(\"tcliente\", false);");
//        lista.add("local = resultadoQuery.valorString(\"local\", true);");
//        lista.add("grupoSucs = resultadoQuery.valorInt(\"gposucs\", true);");
//        lista.add("saldo = resultadoQuery.valorDecimal(\"saldo\", 2, System.MidpointRounding.AwayFromZero, false);");
//        lista.add("limCredito = resultadoQuery.valorDecimal(\"limcredito\", 2, System.MidpointRounding.AwayFromZero, false);");
//        lista.add("limCompra = resultadoQuery.valorDecimal(\"limcompra\", 2, System.MidpointRounding.AwayFromZero, false);");
//        lista.add("plazo = resultadoQuery.valorInt(\"plazo\", false);");
//        lista.add("plazoEspecial = resultadoQuery.valorInt(\"plazoespecial\", true);");
//        lista.add("fechaUltCompra = resultadoQuery.valorDateTime(\"fucompra\", true);");
//        lista.add("agente = resultadoQuery.valorInt(\"agente\", false);");
//        lista.add("rembarque = resultadoQuery.valorInt(\"rembarque\", true);");
//        lista.add("gpoDscntoMay = resultadoQuery.valorInt(\"gpodscnto_may\", false);");
//        lista.add("gpoDscntoSuc = resultadoQuery.valorInt(\"gpodscnto_suc\", false);");
//        lista.add("tipoPrecio = resultadoQuery.valorString(\"tipoprecio\", false);");
//        lista.add("gpoOfertaMay = resultadoQuery.valorInt(\"gpooferta_may\", false);");
//        lista.add("gpoOfertaSuc = resultadoQuery.valorInt(\"gpooferta_suc\", false);");
//        lista.add("sector = resultadoQuery.valorString(\"sector\", false);");
//        lista.add("tipoCredto = resultadoQuery.valorString(\"tipocredto\", false);");
//        lista.add("efectivo = resultadoQuery.valorString(\"efectivo\", false);");
//        lista.add("sustitutos = resultadoQuery.valorString(\"sustitutos\", false);");
//        lista.add("ssa = resultadoQuery.valorString(\"ssa\", true);");
//        lista.add("concenPagos = resultadoQuery.valorInt(\"concenpgos\", false);");
//        lista.add("fechaUltReDocum = resultadoQuery.valorDateTime(\"furedocum\", true);");
//        lista.add("aplicaOfta = resultadoQuery.valorString(\"aplicaofta\", true);");
//        lista.add("impDesAcf = resultadoQuery.valorString(\"impdesacf\", true);");
//        lista.add("factoPagare = resultadoQuery.valorString(\"factopagare\", true);");
//        lista.add("copago = resultadoQuery.valorString(\"copago\", false);");
//        lista.add("gpoRevelado = resultadoQuery.valorString(\"grevelado\", true);");
//        lista.add("curp = resultadoQuery.valorString(\"curp\", true);");
//        lista.add("municipio = resultadoQuery.valorString(\"municipio\", true);");
//        lista.add("cteReferencia = resultadoQuery.valorLong(\"cte_referencia\", true);");
//        lista.add("cteAlfab1 = resultadoQuery.valorString(\"cte_alfab1\", true);");
//        lista.add("cteNum1 = resultadoQuery.valorInt(\"cte_num1\", true);");
//        lista.add("cteNum2 = resultadoQuery.valorLong(\"cte_num2\", true);");
//        lista.add("cliHsa = resultadoQuery.valorString(\"clihsa\", true);");
//        lista.add("hsaGenerico = resultadoQuery.valorString(\"hsagenerico\", true);");
//        lista.add("institucional = resultadoQuery.valorString(\"institucional\", true);");
//        lista.add("aplTodosProdtos = resultadoQuery.valorString(\"apl_todos_prodtos\", true);");
//        lista.add("tipoLicitacion = resultadoQuery.valorInt(\"tlicitacion\", true);");
//        lista.add("gpoInsen = resultadoQuery.valorInt(\"gpo_insen\", true);");
//        lista.add("gpoClteEsp = resultadoQuery.valorInt(\"gpo_clteesp\", true);");
//        lista.add("cNum1 = resultadoQuery.valorInt(\"c_num1\", true);");
//        lista.add("cNum2 = resultadoQuery.valorInt(\"c_num2\", true);");
//        lista.add("cEnt1 = resultadoQuery.valorLong(\"c_ent1\", true);");
//        lista.add("cEnt2 = resultadoQuery.valorLong(\"c_ent2\", true);");
//        lista.add("cFecha1 = resultadoQuery.valorDateTime(\"c_fecha1\", true);");
//        lista.add("cFecha2 = resultadoQuery.valorDateTime(\"c_fecha2\", true);");
//        lista.add("cAlfab1 = resultadoQuery.valorString(\"c_alfab1\", true);");
//        lista.add("cAlfab2 = resultadoQuery.valorString(\"c_alfab2\", true);");
//        lista.add("ctaCorriente = resultadoQuery.valorString(\"ctacorriente\", true);");
//        lista.add("revDoctos = resultadoQuery.valorString(\"revdoctos\", true);");
//        lista.add("neceDoctos = resultadoQuery.valorString(\"necedoctos\", true);");
//        lista.add("cteReceta = resultadoQuery.valorString(\"ctereceta\", true);");
//        lista.add("tipoDocCobro = resultadoQuery.valorString(\"tdoccobro\", true);");
//        lista.add("tCredito = resultadoQuery.valorInt(\"tcredito\", true);");
//        lista.add("cteForaneo = resultadoQuery.valorString(\"cte_foraneo\", true);");
//        lista.add("cNum3 = resultadoQuery.valorInt(\"c_num3\", true);");
//        lista.add("cNum4 = resultadoQuery.valorLong(\"c_num4\", true);");
//        lista.add("cAlfab3 = resultadoQuery.valorString(\"c_alfab3\", true);");
//        lista.add("cedis = resultadoQuery.valorInt(\"cedis\", true);");
//        lista.add("digVerif = resultadoQuery.valorInt(\"digverif\", true);");
//        lista.add("proveedor = resultadoQuery.valorLong(\"proveedor\", true);");
//        lista.add("cajaAhorro = resultadoQuery.valorString(\"caja_ahorro\", true);");
//        lista.add("ctaTitular = resultadoQuery.valorLong(\"ctatitular\", true);");
//        lista.add("ctasFiliales = resultadoQuery.valorString(\"ctasfiliales\", true);");
//        lista.add("saldoxAfil = resultadoQuery.valorInt(\"saldoxafil\", true);");
//        
//        for (String s : lista) {
//            String ss = s.substring(0, 1);
//            String n1 = "set" + ss.toUpperCase() + s.substring(1);
//            String n2 = n1.replace(" = ", "(");
//            String n3 = n2.replace(");", "));");
//            n3 = n3.replace(".valor", ".get");
//            n3 = n3.replace(", false));", "));");
//            n3 = n3.replace(", true));", "));");
//            System.out.println("" + n3);
//        }
        finals = (int)dd;
        
        Date _fechaHoy = new java.sql.Date(new java.util.Date().getTime());
        Date _fechaQry = new java.sql.Date(_fechaHoy.getYear(), _fechaHoy.getMonth(), _fechaHoy.getDate());
        PreparedStatement ps = null;
//conn.prepareStatement("SELECT producto,zeconomica,sucursal,finicio,plista,pmayoreo," + 
//	            "psucursal,costo,costoprv,costoofta,costoprom FROM precios" + 
//	            " WHERE producto = ? AND (zeconomica = ? OR zeconomica = 0) AND (sucursal = ? OR sucursal = 0) " +
//                "AND finicio <= ? ORDER BY sucursal DESC, zeconomica DESC, finicio DESC LIMIT 1");
        try {
            ps.setDate(1, _fechaQry);
        } catch (SQLException ex) {
            Logger.getLogger(JavaJezPruebas.class.getName()).log(Level.SEVERE, null, ex);
        }

        System.out.println("dd    : " + dd);
        System.out.println("Final : " + finals);
    }
    
}
