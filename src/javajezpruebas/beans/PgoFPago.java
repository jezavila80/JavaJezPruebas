/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package javajezpruebas.beans;

import java.sql.Date;

/**
 *
 * @author ahipolito
 */
public class PgoFPago {
    private short tienda              ;
    private short caja                ;
    private int ticket              ;
    private java.sql.Date fecha        ;
    private short hora                ;
    private short fpago               ;
    private double importe             ;
    private String referencia          ;
    private double tipo_cambio        ;
    private String afectado            ;
    private int autorizacion        ;
    private short conceptori          ;
    private short secuencial          ;
    private int auttarjeta          ;
    private String fp_alfab20          ;
    private int fp_entero           ;
    private String tarjeta             ;
    private String autcodigo           ;
    private String doc                 ;
    private String forzada             ;
    private short tipotarjeta         ;
    private short tipoautoriza        ;
    private short planpago            ;
    private short nmeses              ;
    private short equivfpago          ;
    private double equivimporte        ;
    private int refertrans          ;
    private String sivale              ;
    private String fp_alfab10         ;
    private short fp_num1             ;
    private double fp_num2             ;
    private double fp_num3             ;
    private double impoptos            ;
    private short autoriza            ;
    private FPago   Fpago;

    public FPago getFPago() {
        return Fpago;
    }

    public void setFPago(FPago Fpago) {
        this.Fpago = Fpago;
    }

    public String getAfectado() {
        return afectado;
    }

    public void setAfectado(String afectado) {
        this.afectado = afectado;
    }

    public String getAutcodigo() {
        return autcodigo;
    }

    public void setAutcodigo(String autcodigo) {
        this.autcodigo = autcodigo;
    }

    public short getAutoriza() {
        return autoriza;
    }

    public void setAutoriza(short autoriza) {
        this.autoriza = autoriza;
    }

    public int getAutorizacion() {
        return autorizacion;
    }

    public void setAutorizacion(int autorizacion) {
        this.autorizacion = autorizacion;
    }

    public int getAuttarjeta() {
        return auttarjeta;
    }

    public void setAuttarjeta(int auttarjeta) {
        this.auttarjeta = auttarjeta;
    }

    public short getCaja() {
        return caja;
    }

    public void setCaja(short caja) {
        this.caja = caja;
    }

    public short getConceptori() {
        return conceptori;
    }

    public void setConceptori(short conceptori) {
        this.conceptori = conceptori;
    }

    public String getDoc() {
        return doc;
    }

    public void setDoc(String doc) {
        this.doc = doc;
    }

    public short getEquivfpago() {
        return equivfpago;
    }

    public void setEquivfpago(short equivfpago) {
        this.equivfpago = equivfpago;
    }

    public double getEquivimporte() {
        return equivimporte;
    }

    public void setEquivimporte(double equivimporte) {
        this.equivimporte = equivimporte;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getForzada() {
        return forzada;
    }

    public void setForzada(String forzada) {
        this.forzada = forzada;
    }

    public String getFp_alfab10() {
        return fp_alfab10;
    }

    public void setFp_alfab10(String fp_alfab10) {
        this.fp_alfab10 = fp_alfab10;
    }

    public String getFp_alfab20() {
        return fp_alfab20;
    }

    public void setFp_alfab20(String fp_alfab20) {
        this.fp_alfab20 = fp_alfab20;
    }

    public int getFp_entero() {
        return fp_entero;
    }

    public void setFp_entero(int fp_entero) {
        this.fp_entero = fp_entero;
    }

    public short getFp_num1() {
        return fp_num1;
    }

    public void setFp_num1(short fp_num1) {
        this.fp_num1 = fp_num1;
    }

    public double getFp_num2() {
        return fp_num2;
    }

    public void setFp_num2(double fp_num2) {
        this.fp_num2 = fp_num2;
    }

    public double getFp_num3() {
        return fp_num3;
    }

    public void setFp_num3(double fp_num3) {
        this.fp_num3 = fp_num3;
    }

    public short getFpago() {
        return fpago;
    }

    public void setFpago(short fpago) {
        this.fpago = fpago;
    }

    public short getHora() {
        return hora;
    }

    public void setHora(short hora) {
        this.hora = hora;
    }

    public double getImpoptos() {
        return impoptos;
    }

    public void setImpoptos(double impoptos) {
        this.impoptos = impoptos;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public short getNmeses() {
        return nmeses;
    }

    public void setNmeses(short nmeses) {
        this.nmeses = nmeses;
    }

    public short getPlanpago() {
        return planpago;
    }

    public void setPlanpago(short planpago) {
        this.planpago = planpago;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public int getRefertrans() {
        return refertrans;
    }

    public void setRefertrans(int refertrans) {
        this.refertrans = refertrans;
    }

    public short getSecuencial() {
        return secuencial;
    }

    public void setSecuencial(short secuencial) {
        this.secuencial = secuencial;
    }

    public String getSivale() {
        return sivale;
    }

    public void setSivale(String sivale) {
        this.sivale = sivale;
    }

    public String getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(String tarjeta) {
        this.tarjeta = tarjeta;
    }

    public int getTicket() {
        return ticket;
    }

    public void setTicket(int ticket) {
        this.ticket = ticket;
    }

    public short getTienda() {
        return tienda;
    }

    public void setTienda(short tienda) {
        this.tienda = tienda;
    }

    public double getTipo_cambio() {
        return tipo_cambio;
    }

    public void setTipo_cambio(double tipo_cambio) {
        this.tipo_cambio = tipo_cambio;
    }

    public short getTipoautoriza() {
        return tipoautoriza;
    }

    public void setTipoautoriza(short tipoautoriza) {
        this.tipoautoriza = tipoautoriza;
    }

    public short getTipotarjeta() {
        return tipotarjeta;
    }

    public void setTipotarjeta(short tipotarjeta) {
        this.tipotarjeta = tipotarjeta;
    }


}
