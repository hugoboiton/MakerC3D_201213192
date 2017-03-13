package org.compi2.codigo3d.parser;

/**
 * Clase sencilla para sintetizar información entre producciones.
 * Cuenta con un único atributo de tipo String, pero pueden agregársele
 * los atributos que se consideren necesarios.
 * @author esvux
 */
public class NodoC3D {
    private String cad;
    private String etv;
    private String etf;
    public NodoC3D(String cad) {
        this.cad = cad;
        this.etf="";
        this.etv="";
    }
    
    public String getCad(){
        return cad;
    }

    /**
     * @return the etv
     */
    public String getEtv() {
        return etv;
    }

    /**
     * @param etv the etv to set
     */
    public void setEtv(String etv) {
        this.etv = etv;
    }

    /**
     * @return the etf
     */
    public String getEtf() {
        return etf;
    }

    /**
     * @param etf the etf to set
     */
    public void setEtf(String etf) {
        this.etf = etf;
    }
        
}
