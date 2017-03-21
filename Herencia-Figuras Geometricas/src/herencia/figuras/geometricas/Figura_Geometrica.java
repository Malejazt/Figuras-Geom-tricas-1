/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia.figuras.geometricas;    

/**
 *
 * @author Gabriel Andres Zapata Morera
 * @author Mary Alejandra Zapata Tellez
 */
public class Figura_Geometrica {
    /**
     * Atributo que contiene la cordenada x1 y1
     */
    Punto punto1;    
    /**
     * Atributo que contiene la cordenada x2 y2
     */    
    Punto punto2;
    /**
     * Atributo que contiene la cordenada x3 y3
     */        
    Punto punto3;    
    /**
     * Constructor de la clase
     * @param punto1
     * @param punto2
     * @param punto3 
     */
    public Figura_Geometrica(Punto punto1, Punto punto2, Punto punto3) {
        this.punto1 = punto1;
        this.punto2 = punto2;
        this.punto3 = punto3;
    }    
    /**
     * Retorna el valor Punto1
     * @return punto1
     */
    
    public Punto getPunto1() {
        return punto1;
    }
    /**
     * Modifica el valor punto1
     * @param punto1 
     */
    public void setPunto1(Punto punto1) {
        this.punto1 = punto1;
    }
    /**
     * Retorna el valor Punto2
     * @return punto2
     */
    public Punto getPunto2() {
        return punto2;
    }
    /**
     * Modifica el valor punto2
     * @param punto2
     */
    
    public void setPunto2(Punto punto2) {
        this.punto2 = punto2;
    }
   /**
     * Retorna el valor Punto3
     * @return  punto3
     */
    public Punto getPunto3() {
        return punto3;
    }
    /**
     * Modifica el valor punto3
     * @param punto3
     */
    
    public void setPunto3(Punto punto3) {
        this.punto3 = punto3;
    }
    
    
    
    
    
    
}
