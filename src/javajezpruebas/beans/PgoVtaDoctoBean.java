package javajezpruebas.beans;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;

import javajezpruebas.genericos.Creable;

/**
* Descripción: [aquí].
* @author jezreel_avila
* @created 17/09/2018 
*/
public class PgoVtaDoctoBean extends Bean implements Creable {
	
	public static final String TABLA = "pgo_vtasdoctos";

    public static final String QUERY =
        "SELECT tienda,caja,ticket,fecha,hora,fpago,gpodocto,concepto,recolectado,status," +
        "dserie,documento,cliente,cta_adicional,nreceta,ndoctos,importe,referencia,cvecorte," +
        "valija_id,c_num1,c_num2,c_num3,c_alfab20,ticketrecol,refreceta,fcancela,escupon," +
        "formato,idafiliado,afiliado,saldoxafil,clave,fconsulta,beneficiario,autreceta " +
        "FROM pgo_vtasdoctos";
    
    public final String queryInsert = 
    		"INSERT INTO pgo_vtasdoctos (tienda,caja,ticket,fecha,hora,fpago,gpodocto,concepto,recolectado,status, \n" + 
    		"dserie,documento,cliente,cta_adicional,nreceta,ndoctos,importe,referencia,cvecorte,valija_id, \n" + 
    		"c_num1,c_num2,c_num3,c_alfab20,ticketrecol,refreceta,fcancela,escupon,formato,idafiliado, \n" + 
    		"afiliado,saldoxafil,clave,fconsulta,beneficiario,autreceta) values (?,?,?,?,?, \n" + 
    		"?,?,?,?,?,?,?,?,?,?, \n" + 
    		"?,?,?,?,?,?,?,?,?,?, \n" + 
    		"?,?,?,?,?,?,?,?,?,?, \n" + 
    		"?);";

	// ===========================================================
	// VARIABLES
	// ===========================================================
    
    private int tienda;
    private int caja;
    private long ticket;
    private Date fecha;
    private int hora;
    private int formaPago;
    private int gpoDocto;
    private int concepto;
    private String recolectado;
    private String estatus;
    private String docSerie;
    private long documento;
    private long cliente;
    private long ctaAdicional;
    private String nReceta;
    private int nDoctos;
    private double importe;
    private String referencia;
    private double cveCorte;
    private long valijaId;
    private int cNum1;
    private int cNum2;
    private long cNum3;
    private String cAlfab20;
    private long ticketRecol;
    private String refReceta;
    private Date fechaCancela;
    private String esCupon;
    private int formato;
    private long idAfiliado;
    private String afiliado;
    private int saldoxAfil;
    private String clave;
    private Date fechaConsulta;
    private String beneficiario;
    private String autReceta;

	// ===========================================================
	// CONSTRUCTORES
	// ===========================================================
    
    public PgoVtaDoctoBean() {    	
    }
    
    public PgoVtaDoctoBean(ResultSet resultSet) {
    	try {
        	if (resultSet == null || !resultSet.next()) {
        		return;
        	}
			datosResultadoQuery(resultSet);
		} catch (SQLException e) {
			e.printStackTrace();
		}
    }

	// ===========================================================
	// MÉTODOS
	// ===========================================================
    
    public void datosResultadoQuery(ResultSet resultSet) throws SQLException {
        tienda = resultSet.getInt("tienda");
        caja = resultSet.getInt("caja");
        ticket = resultSet.getLong("ticket");
        fecha = resultSet.getDate("fecha");
        hora = resultSet.getInt("hora");
        formaPago = resultSet.getInt("fpago");
        gpoDocto = resultSet.getInt("gpodocto");
        concepto = resultSet.getInt("concepto");
        recolectado = resultSet.getString("recolectado");
        estatus = resultSet.getString("status");
        docSerie = resultSet.getString("dserie");
        documento = resultSet.getLong("documento");
        cliente = resultSet.getLong("cliente");
        ctaAdicional = resultSet.getLong("cta_adicional");
        nReceta = resultSet.getString("nreceta");
        nDoctos = resultSet.getInt("ndoctos");
        importe = Redondea(resultSet.getDouble("importe"), 2);
        referencia = resultSet.getString("referencia");
        cveCorte = Redondea(resultSet.getDouble("cvecorte"), 2);
        valijaId = resultSet.getLong("valija_id");
        cNum1 = resultSet.getInt("c_num1");
        cNum2 = resultSet.getInt("c_num2");
        cNum3 = resultSet.getLong("c_num3");
        cAlfab20 = resultSet.getString("c_alfab20");
        ticketRecol = resultSet.getLong("ticketrecol");
        refReceta = resultSet.getString("refreceta");
        fechaCancela = resultSet.getDate("fcancela");
        esCupon = resultSet.getString("escupon");
        formato = resultSet.getInt("formato");
        idAfiliado = resultSet.getLong("idafiliado");
        afiliado = resultSet.getString("afiliado");
        saldoxAfil = resultSet.getInt("saldoxafil");
        clave = resultSet.getString("clave");
        fechaConsulta = resultSet.getDate("fconsulta");
        beneficiario = resultSet.getString("beneficiario");
        autReceta = resultSet.getString("autreceta");
    }
    
    public int getTienda() {
		return tienda;
	}

	public void setTienda(int tienda) {
		this.tienda = tienda;
	}

	public int getCaja() {
		return caja;
	}

	public void setCaja(int caja) {
		this.caja = caja;
	}

	public long getTicket() {
		return ticket;
	}

	public void setTicket(long ticket) {
		this.ticket = ticket;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}

	public int getFormaPago() {
		return formaPago;
	}

	public void setFormaPago(int formaPago) {
		this.formaPago = formaPago;
	}

	public int getGpoDocto() {
		return gpoDocto;
	}

	public void setGpoDocto(int gpoDocto) {
		this.gpoDocto = gpoDocto;
	}

	public int getConcepto() {
		return concepto;
	}

	public void setConcepto(int concepto) {
		this.concepto = concepto;
	}

	public String getRecolectado() {
		return recolectado;
	}

	public void setRecolectado(String recolectado) {
		this.recolectado = recolectado;
	}

	public String getEstatus() {
		return estatus;
	}

	public void setEstatus(String estatus) {
		this.estatus = estatus;
	}

	public String getDocSerie() {
		return docSerie;
	}

	public void setDocSerie(String docSerie) {
		this.docSerie = docSerie;
	}

	public long getDocumento() {
		return documento;
	}

	public void setDocumento(long documento) {
		this.documento = documento;
	}

	public long getCliente() {
		return cliente;
	}

	public void setCliente(long cliente) {
		this.cliente = cliente;
	}

	public long getCtaAdicional() {
		return ctaAdicional;
	}

	public void setCtaAdicional(long ctaAdicional) {
		this.ctaAdicional = ctaAdicional;
	}

	public String getnReceta() {
		return nReceta;
	}

	public void setnReceta(String nReceta) {
		this.nReceta = nReceta;
	}

	public int getnDoctos() {
		return nDoctos;
	}

	public void setnDoctos(int nDoctos) {
		this.nDoctos = nDoctos;
	}

	public double getImporte() {
		return importe;
	}

	public void setImporte(double importe) {
		this.importe = importe;
	}

	public String getReferencia() {
		return referencia;
	}

	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}

	public double getCveCorte() {
		return cveCorte;
	}

	public void setCveCorte(double cveCorte) {
		this.cveCorte = cveCorte;
	}

	public long getValijaId() {
		return valijaId;
	}

	public void setValijaId(long valijaId) {
		this.valijaId = valijaId;
	}

	public int getcNum1() {
		return cNum1;
	}

	public void setcNum1(int cNum1) {
		this.cNum1 = cNum1;
	}

	public int getcNum2() {
		return cNum2;
	}

	public void setcNum2(int cNum2) {
		this.cNum2 = cNum2;
	}

	public long getcNum3() {
		return cNum3;
	}

	public void setcNum3(long cNum3) {
		this.cNum3 = cNum3;
	}

	public String getcAlfab20() {
		return cAlfab20;
	}

	public void setcAlfab20(String cAlfab20) {
		this.cAlfab20 = cAlfab20;
	}

	public long getTicketRecol() {
		return ticketRecol;
	}

	public void setTicketRecol(long ticketRecol) {
		this.ticketRecol = ticketRecol;
	}

	public String getRefReceta() {
		return refReceta;
	}

	public void setRefReceta(String refReceta) {
		this.refReceta = refReceta;
	}

	public Date getFechaCancela() {
		return fechaCancela;
	}

	public void setFechaCancela(Date fechaCancela) {
		this.fechaCancela = fechaCancela;
	}

	public String getEsCupon() {
		return esCupon;
	}

	public void setEsCupon(String esCupon) {
		this.esCupon = esCupon;
	}

	public int getFormato() {
		return formato;
	}

	public void setFormato(int formato) {
		this.formato = formato;
	}

	public long getIdAfiliado() {
		return idAfiliado;
	}

	public void setIdAfiliado(long idAfiliado) {
		this.idAfiliado = idAfiliado;
	}

	public String getAfiliado() {
		return afiliado;
	}

	public void setAfiliado(String afiliado) {
		this.afiliado = afiliado;
	}

	public int getSaldoxAfil() {
		return saldoxAfil;
	}

	public void setSaldoxAfil(int saldoxAfil) {
		this.saldoxAfil = saldoxAfil;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public Date getFechaConsulta() {
		return fechaConsulta;
	}

	public void setFechaConsulta(Date fechaConsulta) {
		this.fechaConsulta = fechaConsulta;
	}

	public String getBeneficiario() {
		return beneficiario;
	}

	public void setBeneficiario(String beneficiario) {
		this.beneficiario = beneficiario;
	}

	public String getAutReceta() {
		return autReceta;
	}

	public void setAutReceta(String autReceta) {
		this.autReceta = autReceta;
	}

	public String getQueryInsert() {
		return queryInsert;
	}
    

}


