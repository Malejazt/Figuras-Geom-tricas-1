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
public class Triangulo extends Padre{
    /**
     * Atributo de la variable punto3
     */
    Punto punto3;
    /**
     * Atributo perimetro
     */
    private double perimetro; 
    /**
     * Constructor de la clase
     * @param punto1
     * @param punto2
     * @param punto3
     * @param area
     * @param perimetro
     * @param coordenada1x
     * @param coordenada1y
     * @param coordenada2x
     * @param coordenada2y 
     */
    public Triangulo(Punto punto1, Punto punto2, Punto punto3,double area, double perimetro, double coordenada1x, double coordenada1y, double coordenada2x, double coordenada2y) {
        super(punto1, punto2, area, perimetro, coordenada1x, coordenada1y, coordenada2x, coordenada2y);
        this.punto3=punto3;
    }
    
    /**
     * Variables 
     */
    double lado;
      /**
     * Metodo que envia la impresion del perimetro al menu principal
     */
    public void darPerimetros(){        
        System.out.println("Perimetro: " + darPerimetro());                                
    }
    /**
     * Metodo que envia la impresion del area al menu principal
     */
    public void darResultadoArea(){
        System.out.println("Area: " + darArea());
    }
   /**
     * Metodo que envia la impresion de los lados al menu principal
     */
    public void darResultadoLado(){
        System.out.println("Lado1: " + darLado1());
        System.out.println("Lado2: " + darLado2());
        System.out.println("Lado3: " + darLado3());                
    }
       /**
     * Metodo que envia la impresion de todos los datos al menu principal
     */
    public void darTodo(){
        darResultadoLado();
        darPerimetros();
        darResultadoArea();
        darTipoTriangulo();
        
    }     
     /**
     * Retorma longitud de lado AB
     * @return lado
     */    
    private double darLado1(){
        cambioDatos1();
        lado=super.distancia();
      /**
     * Retorma longitud de lado BC
     * @return lado
     */    
        return lado;
    }
    /**
     * Retorma longitud de lado BC
     * @return lado
     */   
    private double darLado2(){
        cambioDatos2();
        lado=super.distancia();
        
        return lado;
    }
          /**
     * Retorma longitud de lado CA
     * @return lado
     */   
    private double darLado3(){
        cambioDatos3();
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
        this.setCoordenada2x(this.getPunto1().getX());
        this.setCoordenada2y(this.getPunto1().getY());
        this.setCoordenada1y(this.getPunto3().getY());
        
    }
    
    /**
     * 
     * Metodo que retorna el perimetro
     * @return Perimetro
     */
     private double darPerimetro() {        
         
       super.setPerimetro( darLado1() + darLado2() + darLado3());
       this.perimetro=super.getPerimetro();
       return this.perimetro;
    }  
     
      /**
     * Metodo que retorna el area de un trianguo
     * @return area
     */
    private double darArea() {
        double semiperimetro = darPerimetro()/ 2;
        double lado1 = semiperimetro - darLado1();
        double lado2 = semiperimetro - darLado2();
        double lado3 = semiperimetro - darLado3();        
        double area =  Math.sqrt((semiperimetro * lado1 * lado2 * lado3));
        return area;
    }           
    /**
     * Metodo que calcula el tipo de triangulo segun sus lados
     */
    public void darTipoTriangulo(){        
        if((this.darLado1()  ==this.darLado2())&&(this.darLado2()==this.darLado3())&&(this.darLado3()==this.darLado1())){            
            System.out.println("Equilatero");                                    
        }else if (((this.darLado1()==this.darLado2())&&(this.darLado2()==this.darLado3())&&(this.darLado3()!=this.darLado1()))||(this.darLado1()==this.darLado3())&&(this.darLado3()==this.darLado2())&&(this.darLado2()!=this.darLado1())){
            System.out.println("Isosceles");                                             
        }else if((darLado1()!=darLado2())&&(darLado2()!=darLado3())&&(darLado3()!=darLado1())){
            System.out.println("Escaleno");                                             
        }   
        
                                                   
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
    
    
    
}
