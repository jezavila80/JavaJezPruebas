package javajezpruebas.beans;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;

import javajezpruebas.genericos.Creable;

/**
* Descripción: [aquí].
* @author jezreel_avila
* @created 18/09/2018 
*/
@SuppressWarnings("unused")
public class VentaBean extends Bean implements Creable {
	
	public static final String TABLA = "ventas";

    public static final String QUERY =
        "SELECT \n" +
        "  tienda, caja, ticket, fecha, hora, secuencial, producto, concepto, cantidad, cantidaddev, pciovta, importe, tipoiva,\n" +
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
    		"INSERT INTO ventas (tienda,caja,ticket,fecha,hora,secuencial,producto,concepto,cantidad,cantidaddev, \n" + 
    		"pciovta,importe,tipoiva,tasaiva,iva,t_impto,p_impto,impuesto,tiposunt,psunt, \n" + 
    		"suntuario,tipoestatal,pestatal,estatal,tipo_dscnto,pdescnto,descnto,pcionvo,cautoriza,nofta, \n" + 
    		"pcionor,cosvta,afectado,descntocxc,c_alfab1,c_alfab2,c_alfab3,c_num,c_entero,fpgc, \n" + 
    		"tipoieps,tasaieps,ieps,prodanticipo,numoferta,importeptos,descnto_clteesp,pdescnto_insen,mdro_otorgado,ltdprograma, \n" + 
    		"cadaxpesos,cant_puntos,precio_punto,monedero,origenptos,tmonedero,ptos_otorgados,c_num1,c_num2,c_alfab20, \n" + 
    		"idsite,cant_oferta,cant_promo,cant_dscnto,cant_normal,nvonofta,impo_oferta,impo_promo,impo_dscnto,impo_normal, \n" + 
    		"impo_part,impo_aux1,costo_oferta,costo_promo,costo_dscnto,costo_normal,aport_ofta,aport_fofta,aport_prom,aport_fprom, \n" + 
    		"exc_convenio,exc_promo,cant_oftapart,cant_prompart,ori_costos,aport_xconv,ltdnumoferta) values (?,?,?,?, " + 
    		"?,?,?,?,?,?,?,?,?,?, " + 
    		"?,?,?,?,?,?,?,?,?,?, " + 
    		"?,?,?,?,?,?,?,?,?,?, " + 
    		"?,?,?,?,?,?,?,?,?,?, " + 
    		"?,?,?,?,?,?,?,?,?,?, " + 
    		"?,?,?,?,?,?,?,?,?,?, " + 
    		"?,?,?,?,?,?,?,?,?,?, " + 
    		"?,?,?,?,?,?,?,?,?,?, " + 
    		"?,?,?);";

	// ===========================================================
	// VARIABLES
	// ===========================================================
    
    protected int tienda;
    protected int caja;
    protected int ticket;
    protected Date fecha;
    protected int hora;
    protected int secuencial;
    protected int producto;
    protected int concepto;
    protected double cantidad;
    protected double cantidaddev;
    protected double pciovta;
    protected double importe;
    protected int tipoiva;
    protected double tasaiva;
    protected double iva;
    protected int tImpto;
    protected double pImpto;
    protected double impuesto;
    protected int tiposunt;
    protected double psunt;
    protected double suntuario;
    protected int tipoestatal;
    protected double pestatal;
    protected double estatal;
    protected String tipoDscnto;
    protected double pdescnto;
    protected double descnto;
    protected String pcionvo;
    protected int cautoriza;
    protected String nofta;
    protected double pcionor;
    protected double cosvta;
    protected String afectado;
    protected double descntocxc;
    protected String cAlfab1;
    protected String cAlfab2;
    protected String cAlfab3;
    protected double cNum;
    protected int cEntero;
    protected double fpgc;
    protected int tipoieps;
    protected double tasaieps;
    protected double ieps;
    protected String prodanticipo;
    protected int numoferta;
    protected double importeptos;
    protected double descntoClteesp;
    protected double pdescntoInsen;
    protected double mdroOtorgado;
    protected int ltdprograma;
    protected double cadaxpesos;
    protected double cantPuntos;
    protected double precioPunto;
    protected double monedero;
    protected String origenptos;
    protected String tmonedero;
    protected double ptosOtorgados;
    protected double cNum1;
    protected int cNum2;
    protected String cAlfab20;
    protected int idsite;
    protected double cantOferta;
    protected double cantPromo;
    protected double cantDscnto;
    protected double cantNormal;
    protected String nvonofta;
    protected double impoOferta;
    protected double impoPromo;
    protected double impoDscnto;
    protected double impoNormal;
    protected double impoPart;
    protected double impoAux1;
    protected double costoOferta;
    protected double costoPromo;
    protected double costoDscnto;
    protected double costoNormal;
    protected double aportOfta;
    protected double aportFofta;
    protected double aportProm;
    protected double aportFprom;
    protected double excConvenio;
    protected double excPromo;
    protected double cantOftapart;
    protected double cantPrompart;
    protected int oriCostos;
    protected double aportXconv;
    protected int ltdnumoferta;
    
	// ===========================================================
	// CONSTRUCTORES
	// ===========================================================
    
    public VentaBean() {
        
    }
    
    public VentaBean(int tienda, int caja, int ticket, Date fecha, int hora, int secuencial, int producto) {
        this.tienda = tienda;
        this.caja = caja;
        this.ticket = ticket;
        this.fecha = fecha;
        this.hora = hora;
        this.secuencial = secuencial;
        this.producto = producto;
    }
    
    public VentaBean(ResultSet resultSet) {
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
    
        @Override
    public void datosResultadoQuery(ResultSet resultSet) throws SQLException {
        tienda = resultSet.getInt("tienda");
        caja = resultSet.getInt("caja");
        ticket = resultSet.getInt("ticket");
        fecha = resultSet.getDate("fecha");
        hora = resultSet.getInt("hora");
        secuencial = resultSet.getInt("secuencial");
        producto = resultSet.getInt("producto");
        concepto = resultSet.getInt("concepto");
        cantidad = Redondea(resultSet.getDouble("cantidad"), 2);
        cantidaddev = Redondea(resultSet.getDouble("cantidaddev"), 2);
        pciovta = Redondea(resultSet.getDouble("pciovta"), 2);
        importe = Redondea(resultSet.getDouble("importe"), 2);
        tipoiva = resultSet.getInt("tipoiva");
        tasaiva = Redondea(resultSet.getDouble("tasaiva"), 2);
        iva = Redondea(resultSet.getDouble("iva"), 2);
        tImpto = resultSet.getInt("t_impto");
        pImpto = Redondea(resultSet.getDouble("p_impto"), 2);
        impuesto = Redondea(resultSet.getDouble("impuesto"), 2);
        tiposunt = resultSet.getInt("tiposunt");
        psunt = Redondea(resultSet.getDouble("psunt"), 2);
        suntuario = Redondea(resultSet.getDouble("suntuario"), 2);
        tipoestatal = resultSet.getInt("tipoestatal");
        pestatal = Redondea(resultSet.getDouble("pestatal"), 2);
        estatal = Redondea(resultSet.getDouble("estatal"), 2);
        tipoDscnto = resultSet.getString("tipo_dscnto" ).trim();
        pdescnto = Redondea(resultSet.getDouble("pdescnto"), 2);
        descnto = Redondea(resultSet.getDouble("descnto"), 2);
        pcionvo = resultSet.getString("pcionvo" ).trim();
        cautoriza = resultSet.getInt("cautoriza");
        nofta = resultSet.getString("nofta" ).trim();
        pcionor = Redondea(resultSet.getDouble("pcionor"), 2);
        cosvta = Redondea(resultSet.getDouble("cosvta"), 2);
        afectado = resultSet.getString("afectado" ).trim();
        descntocxc = Redondea(resultSet.getDouble("descntocxc"), 2);
        cAlfab1 = resultSet.getString("c_alfab1" ).trim();
        cAlfab2 = resultSet.getString("c_alfab2" ).trim();
        cAlfab3 = resultSet.getString("c_alfab3" ).trim();
        cNum = Redondea(resultSet.getDouble("c_num"), 2);
        cEntero = resultSet.getInt("c_entero");
        fpgc = Redondea(resultSet.getDouble("fpgc"), 2);
        tipoieps = resultSet.getInt("tipoieps");
        tasaieps = Redondea(resultSet.getDouble("tasaieps"), 2);
        ieps = Redondea(resultSet.getDouble("ieps"), 2);
        prodanticipo = resultSet.getString("prodanticipo" ).trim();
        numoferta = resultSet.getInt("numoferta");
        importeptos = Redondea(resultSet.getDouble("importeptos"), 2);
        descntoClteesp = Redondea(resultSet.getDouble("descnto_clteesp"), 2);
        pdescntoInsen = Redondea(resultSet.getDouble("pdescnto_insen"), 2);
        mdroOtorgado = Redondea(resultSet.getDouble("mdro_otorgado"), 2);
        ltdprograma = resultSet.getInt("ltdprograma");
        cadaxpesos = Redondea(resultSet.getDouble("cadaxpesos"), 2);
        cantPuntos = Redondea(resultSet.getDouble("cant_puntos"), 2);
        precioPunto = Redondea(resultSet.getDouble("precio_punto"), 2);
        monedero = Redondea(resultSet.getDouble("monedero"), 2);
        origenptos = resultSet.getString("origenptos" ).trim();
        tmonedero = resultSet.getString("tmonedero" ).trim();
        ptosOtorgados = Redondea(resultSet.getDouble("ptos_otorgados"), 2);
        cNum1 = Redondea(resultSet.getDouble("c_num1"), 2);
        cNum2 = resultSet.getInt("c_num2");
        cAlfab20 = resultSet.getString("c_alfab20" ).trim();
        idsite = resultSet.getInt("idsite");
        cantOferta = Redondea(resultSet.getDouble("cant_oferta"), 2);
        cantPromo = Redondea(resultSet.getDouble("cant_promo"), 2);
        cantDscnto = Redondea(resultSet.getDouble("cant_dscnto"), 2);
        cantNormal = Redondea(resultSet.getDouble("cant_normal"), 2);
        nvonofta = resultSet.getString("nvonofta" ).trim();
        impoOferta = Redondea(resultSet.getDouble("impo_oferta"), 2);
        impoPromo = Redondea(resultSet.getDouble("impo_promo"), 2);
        impoDscnto = Redondea(resultSet.getDouble("impo_dscnto"), 2);
        impoNormal = Redondea(resultSet.getDouble("impo_normal"), 2);
        impoPart = Redondea(resultSet.getDouble("impo_part"), 2);
        impoAux1 = Redondea(resultSet.getDouble("impo_aux1"), 2);
        costoOferta = Redondea(resultSet.getDouble("costo_oferta"), 2);
        costoPromo = Redondea(resultSet.getDouble("costo_promo"), 2);
        costoDscnto = Redondea(resultSet.getDouble("costo_dscnto"), 2);
        costoNormal = Redondea(resultSet.getDouble("costo_normal"), 2);
        aportOfta = Redondea(resultSet.getDouble("aport_ofta"), 2);
        aportFofta = Redondea(resultSet.getDouble("aport_fofta"), 2);
        aportProm = Redondea(resultSet.getDouble("aport_prom"), 2);
        aportFprom = Redondea(resultSet.getDouble("aport_fprom"), 2);
        excConvenio = Redondea(resultSet.getDouble("exc_convenio"), 2);
        excPromo = Redondea(resultSet.getDouble("exc_promo"), 2);
        cantOftapart = Redondea(resultSet.getDouble("cant_oftapart"), 2);
        cantPrompart = Redondea(resultSet.getDouble("cant_prompart"), 2);
        oriCostos = resultSet.getInt("ori_costos");
        aportXconv = Redondea(resultSet.getDouble("aport_xconv"), 2);
        ltdnumoferta = resultSet.getInt("ltdnumoferta");
    }

    public int getTienda() {
		return tienda;
	}

	public int getCaja() {
		return caja;
	}

	public int getTicket() {
		return ticket;
	}

	public Date getFecha() {
		return fecha;
	}

	public int getHora() {
		return hora;
	}

	public int getSecuencial() {
		return secuencial;
	}

	public int getProducto() {
		return producto;
	}

	public void setTienda(int tienda) {
		this.tienda = tienda;
	}

	public void setCaja(int caja) {
		this.caja = caja;
	}

	public void setTicket(int ticket) {
		this.ticket = ticket;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}

	public void setSecuencial(int secuencial) {
		this.secuencial = secuencial;
	}

	public void setProducto(int producto) {
		this.producto = producto;
	}

	public int getConcepto() {
		return concepto;
	}

	public void setConcepto(int concepto) {
		this.concepto = concepto;
	}

	public double getCantidad() {
		return cantidad;
	}

	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}

	public double getCantidaddev() {
		return cantidaddev;
	}

	public void setCantidaddev(double cantidaddev) {
		this.cantidaddev = cantidaddev;
	}

	public double getPciovta() {
		return pciovta;
	}

	public void setPciovta(double pciovta) {
		this.pciovta = pciovta;
	}

	public double getImporte() {
		return importe;
	}

	public void setImporte(double importe) {
		this.importe = importe;
	}

	public int getTipoiva() {
		return tipoiva;
	}

	public void setTipoiva(int tipoiva) {
		this.tipoiva = tipoiva;
	}

	public double getTasaiva() {
		return tasaiva;
	}

	public void setTasaiva(double tasaiva) {
		this.tasaiva = tasaiva;
	}

	public double getIva() {
		return iva;
	}

	public void setIva(double iva) {
		this.iva = iva;
	}

	public int gettImpto() {
		return tImpto;
	}

	public void settImpto(int tImpto) {
		this.tImpto = tImpto;
	}

	public double getpImpto() {
		return pImpto;
	}

	public void setpImpto(double pImpto) {
		this.pImpto = pImpto;
	}

	public double getImpuesto() {
		return impuesto;
	}

	public void setImpuesto(double impuesto) {
		this.impuesto = impuesto;
	}

	public int getTiposunt() {
		return tiposunt;
	}

	public void setTiposunt(int tiposunt) {
		this.tiposunt = tiposunt;
	}

	public double getPsunt() {
		return psunt;
	}

	public void setPsunt(double psunt) {
		this.psunt = psunt;
	}

	public double getSuntuario() {
		return suntuario;
	}

	public void setSuntuario(double suntuario) {
		this.suntuario = suntuario;
	}

	public int getTipoestatal() {
		return tipoestatal;
	}

	public void setTipoestatal(int tipoestatal) {
		this.tipoestatal = tipoestatal;
	}

	public double getPestatal() {
		return pestatal;
	}

	public void setPestatal(double pestatal) {
		this.pestatal = pestatal;
	}

	public double getEstatal() {
		return estatal;
	}

	public void setEstatal(double estatal) {
		this.estatal = estatal;
	}

	public String getTipoDscnto() {
		return tipoDscnto;
	}

	public void setTipoDscnto(String tipoDscnto) {
		this.tipoDscnto = tipoDscnto;
	}

	public double getPdescnto() {
		return pdescnto;
	}

	public void setPdescnto(double pdescnto) {
		this.pdescnto = pdescnto;
	}

	public double getDescnto() {
		return descnto;
	}

	public void setDescnto(double descnto) {
		this.descnto = descnto;
	}

	public String getPcionvo() {
		return pcionvo;
	}

	public void setPcionvo(String pcionvo) {
		this.pcionvo = pcionvo;
	}

	public int getCautoriza() {
		return cautoriza;
	}

	public void setCautoriza(int cautoriza) {
		this.cautoriza = cautoriza;
	}

	public String getNofta() {
            return nofta == null? "" : nofta;
	}

	public void setNofta(String nofta) {
		this.nofta = nofta;
	}

	public double getPcionor() {
		return pcionor;
	}

	public void setPcionor(double pcionor) {
		this.pcionor = pcionor;
	}

	public double getCosvta() {
		return cosvta;
	}

	public void setCosvta(double cosvta) {
		this.cosvta = cosvta;
	}

	public String getAfectado() {
		return afectado;
	}

	public void setAfectado(String afectado) {
		this.afectado = afectado;
	}

	public double getDescntocxc() {
		return descntocxc;
	}

	public void setDescntocxc(double descntocxc) {
		this.descntocxc = descntocxc;
	}

	public String getcAlfab1() {
		return cAlfab1;
	}

	public void setcAlfab1(String cAlfab1) {
		this.cAlfab1 = cAlfab1;
	}

	public String getcAlfab2() {
		return cAlfab2;
	}

	public void setcAlfab2(String cAlfab2) {
		this.cAlfab2 = cAlfab2;
	}

	public String getcAlfab3() {
		return cAlfab3;
	}

	public void setcAlfab3(String cAlfab3) {
		this.cAlfab3 = cAlfab3;
	}

	public double getcNum() {
		return cNum;
	}

	public void setcNum(double cNum) {
		this.cNum = cNum;
	}

	public int getcEntero() {
		return cEntero;
	}

	public void setcEntero(int cEntero) {
		this.cEntero = cEntero;
	}

	public double getFpgc() {
		return fpgc;
	}

	public void setFpgc(double fpgc) {
		this.fpgc = fpgc;
	}

	public int getTipoieps() {
		return tipoieps;
	}

	public void setTipoieps(int tipoieps) {
		this.tipoieps = tipoieps;
	}

	public double getTasaieps() {
		return tasaieps;
	}

	public void setTasaieps(double tasaieps) {
		this.tasaieps = tasaieps;
	}

	public double getIeps() {
		return ieps;
	}

	public void setIeps(double ieps) {
		this.ieps = ieps;
	}

	public String getProdanticipo() {
		return prodanticipo;
	}

	public void setProdanticipo(String prodanticipo) {
		this.prodanticipo = prodanticipo;
	}

	public int getNumoferta() {
		return numoferta;
	}

	public void setNumoferta(int numoferta) {
		this.numoferta = numoferta;
	}

	public double getImporteptos() {
		return importeptos;
	}

	public void setImporteptos(double importeptos) {
		this.importeptos = importeptos;
	}

	public double getDescntoClteesp() {
		return descntoClteesp;
	}

	public void setDescntoClteesp(double descntoClteesp) {
		this.descntoClteesp = descntoClteesp;
	}

	public double getPdescntoInsen() {
		return pdescntoInsen;
	}

	public void setPdescntoInsen(double pdescntoInsen) {
		this.pdescntoInsen = pdescntoInsen;
	}

	public double getMdroOtorgado() {
		return mdroOtorgado;
	}

	public void setMdroOtorgado(double mdroOtorgado) {
		this.mdroOtorgado = mdroOtorgado;
	}

	public int getLtdprograma() {
		return ltdprograma;
	}

	public void setLtdprograma(int ltdprograma) {
		this.ltdprograma = ltdprograma;
	}

	public double getCadaxpesos() {
		return cadaxpesos;
	}

	public void setCadaxpesos(double cadaxpesos) {
		this.cadaxpesos = cadaxpesos;
	}

	public double getCantPuntos() {
		return cantPuntos;
	}

	public void setCantPuntos(double cantPuntos) {
		this.cantPuntos = cantPuntos;
	}

	public double getPrecioPunto() {
		return precioPunto;
	}

	public void setPrecioPunto(double precioPunto) {
		this.precioPunto = precioPunto;
	}

	public double getMonedero() {
		return monedero;
	}

	public void setMonedero(double monedero) {
		this.monedero = monedero;
	}

	public String getOrigenptos() {
		return origenptos;
	}

	public void setOrigenptos(String origenptos) {
		this.origenptos = origenptos;
	}

	public String getTmonedero() {
		return tmonedero;
	}

	public void setTmonedero(String tmonedero) {
		this.tmonedero = tmonedero;
	}

	public double getPtosOtorgados() {
		return ptosOtorgados;
	}

	public void setPtosOtorgados(double ptosOtorgados) {
		this.ptosOtorgados = ptosOtorgados;
	}

	public double getcNum1() {
		return cNum1;
	}

	public void setcNum1(double cNum1) {
		this.cNum1 = cNum1;
	}

	public int getcNum2() {
		return cNum2;
	}

	public void setcNum2(int cNum2) {
		this.cNum2 = cNum2;
	}

	public String getcAlfab20() {
		return cAlfab20;
	}

	public void setcAlfab20(String cAlfab20) {
		this.cAlfab20 = cAlfab20;
	}

	public int getIdsite() {
		return idsite;
	}

	public void setIdsite(int idsite) {
		this.idsite = idsite;
	}

	public double getCantOferta() {
		return cantOferta;
	}

	public void setCantOferta(double cantOferta) {
		this.cantOferta = cantOferta;
	}

	public double getCantPromo() {
		return cantPromo;
	}

	public void setCantPromo(double cantPromo) {
		this.cantPromo = cantPromo;
	}

	public double getCantDscnto() {
		return cantDscnto;
	}

	public void setCantDscnto(double cantDscnto) {
		this.cantDscnto = cantDscnto;
	}

	public double getCantNormal() {
		return cantNormal;
	}

	public void setCantNormal(double cantNormal) {
		this.cantNormal = cantNormal;
	}

	public String getNvonofta() {
		return nvonofta;
	}

	public void setNvonofta(String nvonofta) {
		this.nvonofta = nvonofta;
	}

	public double getImpoOferta() {
		return impoOferta;
	}

	public void setImpoOferta(double impoOferta) {
		this.impoOferta = impoOferta;
	}

	public double getImpoPromo() {
		return impoPromo;
	}

	public void setImpoPromo(double impoPromo) {
		this.impoPromo = impoPromo;
	}

	public double getImpoDscnto() {
		return impoDscnto;
	}

	public void setImpoDscnto(double impoDscnto) {
		this.impoDscnto = impoDscnto;
	}

	public double getImpoNormal() {
		return impoNormal;
	}

	public void setImpoNormal(double impoNormal) {
		this.impoNormal = impoNormal;
	}

	public double getImpoPart() {
		return impoPart;
	}

	public void setImpoPart(double impoPart) {
		this.impoPart = impoPart;
	}

	public double getImpoAux1() {
		return impoAux1;
	}

	public void setImpoAux1(double impoAux1) {
		this.impoAux1 = impoAux1;
	}

	public double getCostoOferta() {
		return costoOferta;
	}

	public void setCostoOferta(double costoOferta) {
		this.costoOferta = costoOferta;
	}

	public double getCostoPromo() {
		return costoPromo;
	}

	public void setCostoPromo(double costoPromo) {
		this.costoPromo = costoPromo;
	}

	public double getCostoDscnto() {
		return costoDscnto;
	}

	public void setCostoDscnto(double costoDscnto) {
		this.costoDscnto = costoDscnto;
	}

	public double getCostoNormal() {
		return costoNormal;
	}

	public void setCostoNormal(double costoNormal) {
		this.costoNormal = costoNormal;
	}

	public double getAportOfta() {
		return aportOfta;
	}

	public void setAportOfta(double aportOfta) {
		this.aportOfta = aportOfta;
	}

	public double getAportFofta() {
		return aportFofta;
	}

	public void setAportFofta(double aportFofta) {
		this.aportFofta = aportFofta;
	}

	public double getAportProm() {
		return aportProm;
	}

	public void setAportProm(double aportProm) {
		this.aportProm = aportProm;
	}

	public double getAportFprom() {
		return aportFprom;
	}

	public void setAportFprom(double aportFprom) {
		this.aportFprom = aportFprom;
	}

	public double getExcConvenio() {
		return excConvenio;
	}

	public void setExcConvenio(double excConvenio) {
		this.excConvenio = excConvenio;
	}

	public double getExcPromo() {
		return excPromo;
	}

	public void setExcPromo(double excPromo) {
		this.excPromo = excPromo;
	}

	public double getCantOftapart() {
		return cantOftapart;
	}

	public void setCantOftapart(double cantOftapart) {
		this.cantOftapart = cantOftapart;
	}

	public double getCantPrompart() {
		return cantPrompart;
	}

	public void setCantPrompart(double cantPrompart) {
		this.cantPrompart = cantPrompart;
	}

	public int getOriCostos() {
		return oriCostos;
	}

	public void setOriCostos(int oriCostos) {
		this.oriCostos = oriCostos;
	}

	public double getAportXconv() {
		return aportXconv;
	}

	public void setAportXconv(double aportXconv) {
		this.aportXconv = aportXconv;
	}

	public int getLtdnumoferta() {
		return ltdnumoferta;
	}

	public void setLtdnumoferta(int ltdnumoferta) {
		this.ltdnumoferta = ltdnumoferta;
	}

	public String getQueryInsert() {
		return queryInsert;
	}
	
    
}


