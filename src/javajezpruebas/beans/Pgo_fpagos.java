package javajezpruebas.beans;
import java.sql.Date;
import java.math.BigDecimal;

public class Pgo_fpagos {

  private Short tienda;
  private Short caja;
  private Integer ticket;
  private Date    fecha;
  private Short   hora;
  private Short   fpago;
  private BigDecimal importe;
  private String    referencia;
  private BigDecimal tipo_cambio;
  private String afectado;
  private Integer autorizacion; //	int
  private Short conceptori; //	smallint
  private Short secuencial; //	smallint
  private Integer auttarjeta; //	int
  private String fp_alfab20; //	char
  private Integer fp_entero; //	int
  private String tarjeta; //	char
  private String autcodigo; //	char
  private String doc; //	char
  private String forzada; //	char
  private Short tipotarjeta; //	smallint
  private Short tipoautoriza; //	smallint
  private Short planpago;	//smallint
  private Short nmeses; //	smallint
  private Short equivfpago; //	smallint
  private BigDecimal equivimporte; //	decimal
  private Integer refertrans; //	int
  private String sivale; //	char
  private String fp_alfab10; //	char
  private Short fp_num1; //	smallint
  private BigDecimal fp_num2; //	decimal
  private BigDecimal fp_num3; //	decimal
  private Short      autoriza;

  public Pgo_fpagos(){

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

   public Integer getAutorizacion() {
       return autorizacion;
   }

   public void setAutorizacion(Integer autorizacion) {
       this.autorizacion = autorizacion;
   }

   public Integer getAuttarjeta() {
       return auttarjeta;
   }

   public void setAuttarjeta(Integer auttarjeta) {
       this.auttarjeta = auttarjeta;
   }

   public Short getCaja() {
       return caja;
   }

   public void setCaja(Short caja) {
       this.caja = caja;
   }

   public Short getConceptori() {
       return conceptori;
   }

   public void setConceptori(Short conceptori) {
       this.conceptori = conceptori;
   }

   public String getDoc() {
       return doc;
   }

   public void setDoc(String doc) {
       this.doc = doc;
   }

   public Short getEquivfpago() {
       return equivfpago;
   }

   public void setEquivfpago(Short equivfpago) {
       this.equivfpago = equivfpago;
   }

   public BigDecimal getEquivimporte() {
       return equivimporte;
   }

   public void setEquivimporte(BigDecimal equivimporte) {
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

   public Integer getFp_entero() {
       return fp_entero;
   }

   public void setFp_entero(Integer fp_entero) {
       this.fp_entero = fp_entero;
   }

   public Short getFp_num1() {
       return fp_num1;
   }

   public void setFp_num1(Short fp_num1) {
       this.fp_num1 = fp_num1;
   }

   public BigDecimal getFp_num2() {
       return fp_num2;
   }

   public void setFp_num2(BigDecimal fp_num2) {
       this.fp_num2 = fp_num2;
   }

   public BigDecimal getFp_num3() {
       return fp_num3;
   }

   public void setFp_num3(BigDecimal fp_num3) {
       this.fp_num3 = fp_num3;
   }

   public Short getFpago() {
       return fpago;
   }

   public void setFpago(Short fpago) {
       this.fpago = fpago;
   }

   public Short getHora() {
       return hora;
   }

   public void setHora(Short hora) {
       this.hora = hora;
   }

   public BigDecimal getImporte() {
       return importe;
   }

   public void setImporte(BigDecimal importe) {
       this.importe = importe;
   }

   public Short getNmeses() {
       return nmeses;
   }

   public void setNmeses(Short nmeses) {
       this.nmeses = nmeses;
   }

   public Short getPlanpago() {
       return planpago;
   }

   public void setPlanpago(Short planpago) {
       this.planpago = planpago;
   }

   public String getReferencia() {
       return referencia;
   }

   public void setReferencia(String referencia) {
       this.referencia = referencia;
   }

   public Integer getRefertrans() {
       return refertrans;
   }

   public void setRefertrans(Integer refertrans) {
       this.refertrans = refertrans;
   }

   public Short getSecuencial() {
       return secuencial;
   }

   public void setSecuencial(Short secuencial) {
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

   public Integer getTicket() {
       return ticket;
   }

   public void setTicket(Integer ticket) {
       this.ticket = ticket;
   }

   public Short getTienda() {
       return tienda;
   }

   public void setTienda(Short tienda) {
       this.tienda = tienda;
   }

   public BigDecimal getTipo_cambio() {
       return tipo_cambio;
   }

   public void setTipo_cambio(BigDecimal tipo_cambio) {
       this.tipo_cambio = tipo_cambio;
   }

   public Short getTipoautoriza() {
       return tipoautoriza;
   }

   public void setTipoautoriza(Short tipoautoriza) {
       this.tipoautoriza = tipoautoriza;
   }

   public Short getTipotarjeta() {
       return tipotarjeta;
   }

   public void setTipotarjeta(Short tipotarjeta) {
       this.tipotarjeta = tipotarjeta;
   }

   public Short getAutoriza(){
     return autoriza;
   }

   public void setAutoriza( Short autoriza ){
     this.autoriza = autoriza;
   }




}
