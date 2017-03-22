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
public class Rectangulo extends Padre {
    /**
     * Atributo de la variable punto3
     */
    Punto punto3;
    /**
     * Atributo de la variable punto4
     */
    Punto punto4;
    
    /**
     * constructor de clase
     * @param punto1
     * @param punto2
     * @param punto3
     * @param punto4
     * @param area
     * @param perimetro
     * @param coordenada1x
     * @param coordenada1y
     * @param coordenada2x
     * @param coordenada2y 
     */

    public Rectangulo( Punto punto1, Punto punto2,Punto punto3, Punto punto4, double area, double perimetro, double coordenada1x, double coordenada1y, double coordenada2x, double coordenada2y) {
        super(punto1, punto2, area, perimetro, coordenada1x, coordenada1y, coordenada2x, coordenada2y);
        this.punto3 = punto3;
        this.punto4 = punto4;
    }
    double lado;
    
      /**
     * Metodo que envia la impresion de los lados al menu principal
     */
    public void darResultadoLado(){
        System.out.println("Lado1: " + darLado1());
        System.out.println("Lado2: " + darLado2());
        System.out.println("Lado3: " + darLado3());                
        System.out.println("Lado4: " + darLado4());                   
    }
    /**
     * Metodo que envia la impresion del Area menu principal
     */
    public void darResultadoArea(){
        System.out.println("Area: " + darArea());  
    }
    /**
     * Metodo que envia la impresion del Perimetro al menu principal
     */
    public void darResultadoPerimetro(){
        System.out.println("Perimetro: " + darPerimetro());         
    }
    /**
     * Metodo que envia la impresion de todos los datos al menu principal
     */
    public void darTodo(){
        darResultadoLado();
        darResultadoArea();
        darResultadoPerimetro();
    }   
     /**
     * Metodo que especializa el metodo de distancia1
     * @return lado
     */
    private double darLado1(){
        cambioDatos1();
        lado=super.distancia();
        
        return lado;
    }
        /**
     * Metodo que especializa el metodo de distancia2
     * @return lado
     */
    private double darLado2(){
        cambioDatos2();
        lado=super.distancia();
        
        return lado;
    }
        /**
     * Metodo que especializa el metodo de distancia3
     * @return lado
     */
    private double darLado3(){
        cambioDatos3();
        lado=super.distancia();
        
        return lado;
    }
        /**
     * Metodo que especializa el metodo de distancia4
     * @return lado
     */
        private double darLado4(){
        cambioDatos4();
        lado=super.distancia();
        
        return lado;
    }
       /**
      * Metodo que cambia los datos del metodo darlado1
      */
    private void cambioDatos1(){
        
        this.setCoordenada2x(this.getPunto2().getX());
        this.setCoordenada1x(this.getPunto1().getX());
        this.setCoordenada2y(this.getPunto2().getY());
        this.setCoordenada1y(this.getPunto1().getY());
    }
           /**
      * Metodo que cambia los datos del metodo darlado2
      */
    private void cambioDatos2(){
        
        this.setCoordenada1x(this.getPunto2().getX());
        this.setCoordenada2x(this.getPunto3().getX());
        this.setCoordenada2y(this.getPunto3().getY());
        this.setCoordenada1y(this.getPunto2().getY());
        
    }
           /**
      * Metodo que cambia los datos del metodo darlado3
      */
    private void cambioDatos3(){
        
        this.setCoordenada1x(this.getPunto3().getX());
        this.setCoordenada2x(this.getPunto4().getX());
        this.setCoordenada2y(this.getPunto4().getY());
        this.setCoordenada1y(this.getPunto3().getY());
        
    }
           /**
      * Metodo que cambia los datos del metodo darlado4
      */
        private void cambioDatos4(){
        
        this.setCoordenada1x(this.getPunto4().getX());
        this.setCoordenada2x(this.getPunto1().getX());
        this.setCoordenada2y(this.getPunto1().getY());
        this.setCoordenada1y(this.getPunto4().getY());
        
    }
      /**
     * metodo que halla y retorna el area del rectangulo
     * @return area
     */
    private double darArea() {   
        
        if((darLado1()==darLado2())&&(darLado2()==darLado3())&&(darLado3()==darLado4())&&(darLado4()==darLado1())){
            double area =  darLado1() + darLado2()+ darLado3() + darLado4();
            return area;
        }else {
            double area =  darLado1() * darLado2();
            return area;
        }                 
    }   
     /**
     * 
     * Metodo que retorna el perimetro
     * @return Perimetro
     */
    private double darPerimetro() {        
       double perimetro; 
       perimetro = 2*( darLado1() + darLado2() );
        return perimetro;
    }   
  /**
   * Retorna el valor punto3
   * @return punto3
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
    /**
     * Retorna el valor punto4
     * @return punto4
     */
    public Punto getPunto4() {
        return punto4;
    }
    /**
     * Modifica el valor punto4
     * @param punto4 
     */
    public void setPunto4(Punto punto4) {
        this.punto4 = punto4;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
}
