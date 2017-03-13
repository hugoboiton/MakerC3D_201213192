package org.compi2.codigo3d.parser;

/**
 *
 * @author esvux
 */
public class ControlC3D {
    
    private static int temp = 0;
    private static String c3d = "";
    private static int etiqueta=0;
    private static String etiquetav;
    private static String etiquetaf;
    
    /**
     * Reinicia las variables estáticas relacionadas con la generación del
     * código de tres direcciones.
     */
    public static void reiniciar(){
        temp = 0;
        c3d = "";
        etiqueta=0;
    }
    
    /**
     * Genera el siguiente temporal.
     * @return El siguiente temporal (t$#)
     */
    public static String generaTemp(){
        return "t$"+temp++;
    }
    public static String generarEtiqueta()
    {
        return "l$"+etiqueta++;
    }
    
    /**
     * Agrega la sentencia que recibe como parámetro a la cadena de código
     * de tres direcciones que se va generando hasta ese momento.
     * @param sentencia Código 3D a agregar
     */
    public static void agregarC3D(String sentencia){
        c3d += sentencia;
    }
    
    /**
     * Devuelve el código 3D generao hasta el momento de su invocación.
     * @return Código 3D generado
     */
    public static String getC3D(){
        return c3d;
    }

    /**
     * @return the etiquetav
     */
    public static String getEtiquetav() {
        return etiquetav;
    }

    /**
     * @param aEtiquetav the etiquetav to set
     */
    public static void setEtiquetav(String aEtiquetav) {
        etiquetav = aEtiquetav;
    }

    /**
     * @return the etiquetaf
     */
    public static String getEtiquetaf() {
        return etiquetaf;
    }

    /**
     * @param aEtiquetaf the etiquetaf to set
     */
    public static void setEtiquetaf(String aEtiquetaf) {
        etiquetaf = aEtiquetaf;
    }
    
}
