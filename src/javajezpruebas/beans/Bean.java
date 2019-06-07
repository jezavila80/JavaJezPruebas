package javajezpruebas.beans;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
* Descripción: [aquí].
* @author jezreel_avila
* @date 10/09/2018 
*/
public abstract class Bean {

	// ===========================================================
	// VARIABLES
	// ===========================================================

	// ===========================================================
	// CONSTRUCTORES
	// ===========================================================
    
    public Bean() {
        
    }
    public Bean(ResultSet resultSet) {
        try {
            if (resultSet == null || !resultSet.next()) {
                return;
            }
            datosResultadoQuery(resultSet);
        } catch (SQLException ex) {
            Logger.getLogger(Bean.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

	// ===========================================================
	// MÉTODOS
	// ===========================================================

	public double Redondea(double numero, int decimales){
        try{
            if(Double.isNaN(numero)) {
                numero = 0;
            }

            java.math.BigDecimal redondeo
                    = new java.math.BigDecimal(numero).setScale(decimales, java.math.RoundingMode.HALF_UP);

            return redondeo.doubleValue();
        } catch (Exception ex){
            return 0;
        }
    }
	
	public abstract void datosResultadoQuery(ResultSet resultSet) throws SQLException;
	

}


