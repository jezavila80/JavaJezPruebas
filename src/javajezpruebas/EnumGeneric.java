/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javajezpruebas;

/**
 *
 * @author jezreel_avila
 */
public enum EnumGeneric {
    NORMAL("NORMAL"),
    MEDIO("MEDIO"),
    AVANZADO("AVANZADO"),
    EXPERTO("EXPERTO");
    
    private String generic;
    private EnumGeneric(String generic) {
        this.generic = generic;
    }
    public String getString() {
        return generic;
    }
}
