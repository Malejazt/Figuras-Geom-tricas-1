/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciafigurasgeometricas;
  /**
 *
 * @author Gabriel Andres Zapata Morera
 * @author Mary Alejandra Zapata Tellez
 */

public class Padre {

    /**
     * Atributo que contiene la cordenada x1 y1
     */
    Punto punto1;    
    /**
     * Atributo que contiene la cordenada x2 y2
     */    
    Punto punto2;
    
    /**
     * Atributo que contiene area
     */
    private double area;
    /**
     * Atibuto que contiene el valor de perimetro
     */
    private double perimetro;
    
    /**
     * Atributo que guarda el valor coordenada1x
     */
    private double coordenada1x;
     /**
     * Atributo que guarda el valor coordenada1y
     */
    private double coordenada1y;
     /**
     * Atributo que guarda el valor coordenada2x
     */
    private double coordenada2x;
     /**
     * Atributo que guarda el valor coordenada2y
     */
    private double coordenada2y;

    /**
     * Constructor de la clase padre
     * @param punto1
     * @param punto2
     * @param area
     * @param perimetro
     * @param coordenada1x
     * @param coordenada1y
     * @param coordenada2x
     * @param coordenada2y 
     */
        public Padre(Punto punto1, Punto punto2, double area, double perimetro, double coordenada1x, double coordenada1y, double coordenada2x, double coordenada2y){
        this.punto1 = punto1;
        this.punto2 = punto2;
        this.area = area;
        this.perimetro = perimetro;
        this.coordenada1x = coordenada1x;
        this.coordenada1y = coordenada1y;
        this.coordenada2x = coordenada2x;
        this.coordenada2y = coordenada2y;
    }    

    /**
     * Metodo que retorna el valor de distancia
     * @return distancia
     */
    public double distancia() {
        double auxiliarX = Math.pow(coordenada2x - coordenada1x, 2);
        double auxiliarY = Math.pow(coordenada2y - coordenada1y, 2);        
        double distancia = Math.sqrt(auxiliarX +  auxiliarY);
        return distancia;
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
     * Retorna el valor de area
     * @return area
     */ 
    public double getArea() {
        return area;
    }
     /**
      * Modifica el valor de area
      * @param area 
      */
    public void setArea(double area) {
        this.area = area;
    }
    /**
     * Retorna el valor perimetro
     * @return perimetro
     */
    public double getPerimetro() {
        return perimetro;
    }
    /**
     * Modifica el valor perimetro
     * @param perimetro 
     */
    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }
    /**
     * retorna coordenada1x
     * @return coordenada1x
     */
    public double getCoordenada1x() {
        return coordenada1x;
    }
    /**
     * Modifica el valor coordenada1x
     * @param coordenada1x 
     */
    public void setCoordenada1x(double coordenada1x) {
        this.coordenada1x = coordenada1x;
    }
    /**
     * Retorna coordenada1y
     * @return 
     */
    public double getCoordenada1y() {
        return coordenada1y;
    }
    /**
     * Modifica el valor coordenada1y
     * @param coordenada1y 
     */
    public void setCoordenada1y(double coordenada1y) {
        this.coordenada1y = coordenada1y;
    }
    /**
     * Retorna coordenada2x
     * @return 
     */
    public double getCoordenada2x() {
        return coordenada2x;
    }
    /**
     * Modifica el valor coordenada2x
     * @param coordenada2x 
     */
    public void setCoordenada2x(double coordenada2x) {
        this.coordenada2x = coordenada2x;
    }
    /**
     * Retorna coordenada2y
     * @return 
     */
    public double getCoordenada2y() {
        return coordenada2y;
    }
    /**
     * Modifica el valor coordenada2y
     * @param coordenada2y 
     */
    public void setCoordenada2y(double coordenada2y) {
        this.coordenada2y = coordenada2y;
    }
    
    

}

    

