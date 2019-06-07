package javajezpruebas.beans;
import java.sql.Date;
import java.math.BigDecimal;

public class Pagos {
	
	public static final String TABLA = "pagos";
	
	public static final String QUERY =
	    "SELECT \n" +
	    "  tienda, caja, ticket, fecha, hora, secpago, cajero, clte_empldo, cliente, tarjeta, cltipo, emp_prefijo, emp_codigo,\n" +
	    "  concepto, sfactura, nfactura, importe, afectado, corte, fin_dia, ticketoriginal, autoriza, duda, deposito, spagare,\n" +
	    "  npagare, copago, cajaoriginal, c_alfab, c_num, c_entero, hsa, clientefg, llavefg, tipotrans, retirocash, pedidosad,\n" +
	    "  apartado, numremesa, referencia, c_alfab10, c_alfab20, c_num1, c_num2, c_num3, c_num4, ltdidtrans, ltdlote, tcondescto,\n" +
	    "  ltdreferencia\n" +
	    "FROM pagos";
	
	public final String queryInsert = 
			"INSERT INTO pagos (tienda,caja,ticket,fecha,hora,secpago,cajero,clte_empldo,cliente,tarjeta, \n" + 
			"cltipo,emp_prefijo,emp_codigo,concepto,sfactura,nfactura,importe,afectado,corte,fin_dia, \n" + 
			"ticketoriginal,autoriza,duda,deposito,spagare,npagare,copago,cajaoriginal,c_alfab,c_num, \n" + 
			"c_entero,hsa,clientefg,llavefg,tipotrans,retirocash,pedidosad,apartado,numremesa,referencia, \n" + 
			"c_alfab10,c_alfab20,c_num1,c_num2,c_num3,c_num4,ltdidtrans,ltdlote,tcondescto,ltdreferencia) values (?, \n" + 
			"?,?,?,?,?,?,?,?,?,?, \n" + 
			"?,?,?,?,?,?,?,?,?,?, \n" + 
			"?,?,?,?,?,?,?,?,?,?, \n" + 
			"?,?,?,?,?,?,?,?,?,?, \n" + 
			"?);";

  private Short      tienda; //	smallint
  private Short      caja; //	smallint
  private Integer    ticket; //	int
  private Date       fecha; //	date
  private Short      hora;  //	smallint
  private Integer    secpago; //	int
  private Integer    cajero; //	int
  private String     clte_empldo; //	char
  private Integer    cliente; //	int
  private String     tarjeta; //	char
  private Short      cltipo; //	smallint
  private String     emp_prefijo; //	char
  private String     emp_codigo; //	char
  private Short      concepto; //	smallint
  private String     sfactura; //	char
  private Integer    nfactura; //	int
  private BigDecimal importe; //	decimal
  private String     afectado; //	char
  private Integer    corte; //	int
  private Integer    fin_dia; //	int
  private Integer    ticketoriginal;  //	int
  private Integer    autoriza;  //	int
  private String     duda;  //	char
  private Integer    deposito;  //	int
  private String     spagare;  //	char
  private Integer    npagare;  //	int
  private String     copago;  //	char
  private Short      cajaoriginal;  //	smallint
  private String     c_alfab;  //	char
  private BigDecimal c_num;  //	decimal
  private Integer    c_entero;  //	int
  private Short      hsa;  //	smallint
  private Integer    clientefg;  //	int
  private String      llavefg;  //	char
  private Short       tipotrans;  //	smallint
  private String      retirocash;  //	char
  private Integer     pedidosad;  //	int
  private Integer     apartado;  //	int
  private String      numremesa;  //	char
  private String      referencia;  //	char
  private String      c_alfab10;    //	char
  private String      c_alfab20; //	char
  private Integer     c_num1;  //	int
  private Short       c_num2;  //	smallint
  private BigDecimal  c_num3; //	decimal
  private BigDecimal  c_num4;  //	decimal
  private int ltdidtrans;
  private int ltdlote;
  private int tcondescto;
  private String ltdreferencia;

  public Pagos(){

  }

  public String getAfectado() {
       return afectado;
   }

   public void setAfectado(String afectado) {
       this.afectado = afectado;
   }

   public Integer getApartado() {
       return apartado;
   }

   public void setApartado(Integer apartado) {
       this.apartado = apartado;
   }

   public Integer getAutoriza() {
       return autoriza;
   }

   public void setAutoriza(Integer autoriza) {
       this.autoriza = autoriza;
   }

   public String getC_alfab() {
       return c_alfab;
   }

   public void setC_alfab(String c_alfab) {
       this.c_alfab = c_alfab;
   }

   public String getC_alfab10() {
       return c_alfab10;
   }

   public void setC_alfab10(String c_alfab10) {
       this.c_alfab10 = c_alfab10;
   }

   public String getC_alfab20() {
       return c_alfab20;
   }

   public void setC_alfab20(String c_alfab20) {
       this.c_alfab20 = c_alfab20;
   }

   public Integer getC_entero() {
       return c_entero;
   }

   public void setC_entero(Integer c_entero) {
       this.c_entero = c_entero;
   }

   public BigDecimal getC_num() {
       return c_num;
   }

   public void setC_num(BigDecimal c_num) {
       this.c_num = c_num;
   }

   public Integer getC_num1() {
       return c_num1;
   }

   public void setC_num1(Integer c_num1) {
       this.c_num1 = c_num1;
   }

   public Short getC_num2() {
       return c_num2;
   }

   public void setC_num2(Short c_num2) {
       this.c_num2 = c_num2;
   }

   public BigDecimal getC_num3() {
       return c_num3;
   }

   public void setC_num3(BigDecimal c_num3) {
       this.c_num3 = c_num3;
   }

   public BigDecimal getC_num4() {
       return c_num4;
   }

   public void setC_num4(BigDecimal c_num4) {
       this.c_num4 = c_num4;
   }

   public Short getCaja() {
       return caja;
   }

   public void setCaja(Short caja) {
       this.caja = caja;
   }

   public Short getCajaoriginal() {
       return cajaoriginal;
   }

   public void setCajaoriginal(Short cajaoriginal) {
       this.cajaoriginal = cajaoriginal;
   }

   public Integer getCajero() {
       return cajero;
   }

   public void setCajero(Integer cajero) {
       this.cajero = cajero;
   }

   public Integer getCliente() {
       return cliente;
   }

   public void setCliente(Integer cliente) {
       this.cliente = cliente;
   }

   public Integer getClientefg() {
       return clientefg;
   }

   public void setClientefg(Integer clientefg) {
       this.clientefg = clientefg;
   }

   public String getClte_empldo() {
       return clte_empldo;
   }

   public void setClte_empldo(String clte_empldo) {
       this.clte_empldo = clte_empldo;
   }

   public Short getCltipo() {
       return cltipo;
   }

   public void setCltipo(Short cltipo) {
       this.cltipo = cltipo;
   }

   public Short getConcepto() {
       return concepto;
   }

   public void setConcepto(Short concepto) {
       this.concepto = concepto;
   }

   public String getCopago() {
       return copago;
   }

   public void setCopago(String copago) {
       this.copago = copago;
   }

   public Integer getCorte() {
       return corte;
   }

   public void setCorte(Integer corte) {
       this.corte = corte;
   }

   public Integer getDeposito() {
       return deposito;
   }

   public void setDeposito(Integer deposito) {
       this.deposito = deposito;
   }

   public String getDuda() {
       return duda;
   }

   public void setDuda(String duda) {
       this.duda = duda;
   }

   public String getEmp_codigo() {
       return emp_codigo;
   }

   public void setEmp_codigo(String emp_codigo) {
       this.emp_codigo = emp_codigo;
   }

   public String getEmp_prefijo() {
       return emp_prefijo;
   }

   public void setEmp_prefijo(String emp_prefijo) {
       this.emp_prefijo = emp_prefijo;
   }

   public Date getFecha() {
       return fecha;
   }

   public void setFecha(Date fecha) {
       this.fecha = fecha;
   }

   public Integer getFin_dia() {
       return fin_dia;
   }

   public void setFin_dia(Integer fin_dia) {
       this.fin_dia = fin_dia;
   }

   public Short getHora() {
       return hora;
   }

   public void setHora(Short hora) {
       this.hora = hora;
   }

   public Short getHsa() {
       return hsa;
   }

   public void setHsa(Short hsa) {
       this.hsa = hsa;
   }

   public BigDecimal getImporte() {
       return importe;
   }

   public void setImporte(BigDecimal importe) {
       this.importe = importe;
   }

   public String getLlavefg() {
       return llavefg;
   }

   public void setLlavefg(String llavefg) {
       this.llavefg = llavefg;
   }

   public Integer getNfactura() {
       return nfactura;
   }

   public void setNfactura(Integer nfactura) {
       this.nfactura = nfactura;
   }

   public Integer getNpagare() {
       return npagare;
   }

   public void setNpagare(Integer npagare) {
       this.npagare = npagare;
   }

   public String getNumremesa() {
       return numremesa;
   }

   public void setNumremesa(String numremesa) {
       this.numremesa = numremesa;
   }

   public Integer getPedidosad() {
       return pedidosad;
   }

   public void setPedidosad(Integer pedidosad) {
       this.pedidosad = pedidosad;
   }

   public String getReferencia() {
       return referencia;
   }

   public void setReferencia(String referencia) {
       this.referencia = referencia;
   }

   public String getRetirocash() {
       return retirocash;
   }

   public void setRetirocash(String retirocash) {
       this.retirocash = retirocash;
   }

   public Integer getSecpago() {
       return secpago;
   }

   public void setSecpago(Integer secpago) {
       this.secpago = secpago;
   }

   public String getSfactura() {
       return sfactura;
   }

   public void setSfactura(String sfactura) {
       this.sfactura = sfactura;
   }

   public String getSpagare() {
       return spagare;
   }

   public void setSpagare(String spagare) {
       this.spagare = spagare;
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

   public Integer getTicketoriginal() {
       return ticketoriginal;
   }

   public void setTicketoriginal(Integer ticketoriginal) {
       this.ticketoriginal = ticketoriginal;
   }

   public Short getTienda() {
       return tienda;
   }

   public void setTienda(Short tienda) {
       this.tienda = tienda;
   }

   public Short getTipotrans() {
       return tipotrans;
   }

   public void setTipotrans(Short tipotrans) {
       this.tipotrans = tipotrans;
   }

	public int getLtdidtrans() {
		return ltdidtrans;
	}
	
	public void setLtdidtrans(int ltdidtrans) {
		this.ltdidtrans = ltdidtrans;
	}
	
	public int getLtdlote() {
		return ltdlote;
	}
	
	public void setLtdlote(int ltdlote) {
		this.ltdlote = ltdlote;
	}
	
	public int getTcondescto() {
		return tcondescto;
	}
	
	public void setTcondescto(int tcondescto) {
		this.tcondescto = tcondescto;
	}
	
	public String getLtdreferencia() {
		return ltdreferencia;
	}
	
	public void setLtdreferencia(String ltdreferencia) {
		this.ltdreferencia = ltdreferencia;
	}
   
   


}
