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
public class FPago {
    private short fpago               ;
    private String descripcion         ;
    private String corte               ;
    private short gpo_deposito        ;
    private String habilitado          ;
    private String deposito            ;
    private String credito             ;
    private short gpo_acumula         ;
    private String afectacliente       ;
    private int cliente             ;
    private double tipo_cambio         ;
    private short carac_ref           ;
    private String admite_cambio       ;
    private String req_autoriza        ;
    private double porc_cargo          ;
    private double porc_descto         ;
    private short agrupacion          ;
    private double comision            ;
    private String abre_cajon          ;
    private String certifica           ;
    private short formato_cert        ;
    private String tipo_pagare         ;
    private String cons_limitec        ;
    private String habilitado_caja     ;
    private String tarjetacred         ;
    private String hab_retiro          ;
    private String hab_ingreso         ;
    private String hab_abonocta        ;
    private String tp_alfab20           ;
    private int tp_entero           ;
    private java.sql.Date tp_fechalibre ;
    private short tipofpago           ;
    private String aceptacash          ;
    private String aceptaplan          ;
    private String aceptapgosrv        ;
    private String switcheo            ;
    private String fpapartado          ;
    private String fpremesa            ;
    private String fpvtacata           ;
    private String fpvtaweb            ;
    private short tp_num1             ;
    private String tp_alfab1           ;
    private String tipolote            ;
    private double maxticketfp         ;

    public String getAbre_cajon() {
        return abre_cajon;
    }

    public void setAbre_cajon(String abre_cajon) {
        this.abre_cajon = abre_cajon;
    }

    public String getAceptacash() {
        return aceptacash;
    }

    public void setAceptacash(String aceptacash) {
        this.aceptacash = aceptacash;
    }

    public String getAceptapgosrv() {
        return aceptapgosrv;
    }

    public void setAceptapgosrv(String aceptapgosrv) {
        this.aceptapgosrv = aceptapgosrv;
    }

    public String getAceptaplan() {
        return aceptaplan;
    }

    public void setAceptaplan(String aceptaplan) {
        this.aceptaplan = aceptaplan;
    }

    public String getAdmite_cambio() {
        return admite_cambio;
    }

    public void setAdmite_cambio(String admite_cambio) {
        this.admite_cambio = admite_cambio;
    }

    public String getAfectacliente() {
        return afectacliente;
    }

    public void setAfectacliente(String afectacliente) {
        this.afectacliente = afectacliente;
    }

    public short getAgrupacion() {
        return agrupacion;
    }

    public void setAgrupacion(short agrupacion) {
        this.agrupacion = agrupacion;
    }

    public short getCarac_ref() {
        return carac_ref;
    }

    public void setCarac_ref(short carac_ref) {
        this.carac_ref = carac_ref;
    }

    public String getCertifica() {
        return certifica;
    }

    public void setCertifica(String certifica) {
        this.certifica = certifica;
    }

    public int getCliente() {
        return cliente;
    }

    public void setCliente(int cliente) {
        this.cliente = cliente;
    }

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }

    public String getCons_limitec() {
        return cons_limitec;
    }

    public void setCons_limitec(String cons_limitec) {
        this.cons_limitec = cons_limitec;
    }

    public String getCorte() {
        return corte;
    }

    public void setCorte(String corte) {
        this.corte = corte;
    }

    public String getCredito() {
        return credito;
    }

    public void setCredito(String credito) {
        this.credito = credito;
    }

    public String getDeposito() {
        return deposito;
    }

    public void setDeposito(String deposito) {
        this.deposito = deposito;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public short getFormato_cert() {
        return formato_cert;
    }

    public void setFormato_cert(short formato_cert) {
        this.formato_cert = formato_cert;
    }

    public short getFpago() {
        return fpago;
    }

    public void setFpago(short fpago) {
        this.fpago = fpago;
    }

    public String getFpapartado() {
        return fpapartado;
    }

    public void setFpapartado(String fpapartado) {
        this.fpapartado = fpapartado;
    }

    public String getFpremesa() {
        return fpremesa;
    }

    public void setFpremesa(String fpremesa) {
        this.fpremesa = fpremesa;
    }

    public String getFpvtacata() {
        return fpvtacata;
    }

    public void setFpvtacata(String fpvtacata) {
        this.fpvtacata = fpvtacata;
    }

    public String getFpvtaweb() {
        return fpvtaweb;
    }

    public void setFpvtaweb(String fpvtaweb) {
        this.fpvtaweb = fpvtaweb;
    }

    public short getGpo_acumula() {
        return gpo_acumula;
    }

    public void setGpo_acumula(short gpo_acumula) {
        this.gpo_acumula = gpo_acumula;
    }

    public short getGpo_deposito() {
        return gpo_deposito;
    }

    public void setGpo_deposito(short gpo_deposito) {
        this.gpo_deposito = gpo_deposito;
    }

    public String getHab_abonocta() {
        return hab_abonocta;
    }

    public void setHab_abonocta(String hab_abonocta) {
        this.hab_abonocta = hab_abonocta;
    }

    public String getHab_ingreso() {
        return hab_ingreso;
    }

    public void setHab_ingreso(String hab_ingreso) {
        this.hab_ingreso = hab_ingreso;
    }

    public String getHab_retiro() {
        return hab_retiro;
    }

    public void setHab_retiro(String hab_retiro) {
        this.hab_retiro = hab_retiro;
    }

    public String getHabilitado() {
        return habilitado;
    }

    public void setHabilitado(String habilitado) {
        this.habilitado = habilitado;
    }

    public String getHabilitado_caja() {
        return habilitado_caja;
    }

    public void setHabilitado_caja(String habilitado_caja) {
        this.habilitado_caja = habilitado_caja;
    }

    public double getMaxticketfp() {
        return maxticketfp;
    }

    public void setMaxticketfp(double maxticketfp) {
        this.maxticketfp = maxticketfp;
    }

    public double getPorc_cargo() {
        return porc_cargo;
    }

    public void setPorc_cargo(double porc_cargo) {
        this.porc_cargo = porc_cargo;
    }

    public double getPorc_descto() {
        return porc_descto;
    }

    public void setPorc_descto(double porc_descto) {
        this.porc_descto = porc_descto;
    }

    public String getReq_autoriza() {
        return req_autoriza;
    }

    public void setReq_autoriza(String req_autoriza) {
        this.req_autoriza = req_autoriza;
    }

    public String getSwitcheo() {
        return switcheo;
    }

    public void setSwitcheo(String switcheo) {
        this.switcheo = switcheo;
    }

    public String getTarjetacred() {
        return tarjetacred;
    }

    public void setTarjetacred(String tarjetacred) {
        this.tarjetacred = tarjetacred;
    }

    public double getTipo_cambio() {
        return tipo_cambio;
    }

    public void setTipo_cambio(double tipo_cambio) {
        this.tipo_cambio = tipo_cambio;
    }

    public String getTipo_pagare() {
        return tipo_pagare;
    }

    public void setTipo_pagare(String tipo_pagare) {
        this.tipo_pagare = tipo_pagare;
    }

    public short getTipofpago() {
        return tipofpago;
    }

    public void setTipofpago(short tipofpago) {
        this.tipofpago = tipofpago;
    }

    public String getTipolote() {
        return tipolote;
    }

    public void setTipolote(String tipolote) {
        this.tipolote = tipolote;
    }

    public String getTp_alfab1() {
        return tp_alfab1;
    }

    public void setTp_alfab1(String tp_alfab1) {
        this.tp_alfab1 = tp_alfab1;
    }

    public String getTp_alfab20() {
        return tp_alfab20;
    }

    public void setTp_alfab20(String tp_alfab20) {
        this.tp_alfab20 = tp_alfab20;
    }

    public int getTp_entero() {
        return tp_entero;
    }

    public void setTp_entero(int tp_entero) {
        this.tp_entero = tp_entero;
    }

    public Date getTp_fechalibre() {
        return tp_fechalibre;
    }

    public void setTp_fechalibre(Date tp_fechalibre) {
        this.tp_fechalibre = tp_fechalibre;
    }

    public short getTp_num1() {
        return tp_num1;
    }

    public void setTp_num1(short tp_num1) {
        this.tp_num1 = tp_num1;
    }

    
}
