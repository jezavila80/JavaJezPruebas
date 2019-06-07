/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javajezpruebas;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javajezpruebas.beans.SadVentaBean;
import javajezpruebas.beans.VentaBean;
import javajezpruebas.genericos.VentasDAO;

/**
 *
 * @author jezreel_avila
 */
public class JavaTestsGenericos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        VentasDAO vd = new VentasDAO(null);
        VentaBean v = new VentaBean(8, 3, 27, new Date(new java.util.Date().getTime()), 321, 1, 442);
        SadVentaBean sv = new SadVentaBean();
        sv.setTienda(8);
        sv.setCaja(3);
        sv.setTicket(27);
        sv.setHora(321);
        //vd.crear(v);
        java.sql.Date fecha;
        try {
            fecha = new java.sql.Date(new SimpleDateFormat("yyyy-MM-dd").parse("2018-09-24").getTime());
            //v = new VentaBean(8, 3, 27, fecha, 321, 1, 442);
            v = new VentaBean(8, 3, 27, fecha, 321, 1, 588504);
            v.setCantidad(3);
            /*ArrayList<VentaBean> li = (ArrayList<VentaBean>)vd.encontrarPor(8,3,27,fecha,321);
            for (VentaBean ventaBean : li) {
                System.out.println("Venta: " + ventaBean.getProducto());
            }*/
            vd.crear(sv, SadVentaBean.class);
            //vd.crear(v, VentaBean.class);
        } catch (ParseException ex) {
            Logger.getLogger(JavaTestsGenericos.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            
        }
        
    }
    
}
