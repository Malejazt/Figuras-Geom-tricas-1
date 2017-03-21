/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia.figuras.geometricas;
/**
 * @author Gabriel Andres Zapata Morera
 * @author Mary Alejandra Zapata Tellez
 */
public class Rectangulo extends Figura_Geometrica{
    /**
     * atributo que contiene coordenadas x4,y4 
     */
    private Punto punto4;
    /**
     * Constructor de la clase
     * @param punto1
     * @param punto2
     * @param punto3
     * @param punto4 
     */
    public Rectangulo(Punto punto1, Punto punto2, Punto punto3,Punto punto4) {
        super(punto1, punto2, punto3);
        this.punto4 = punto4;
    }  
    /**
    * Retorna verdadero si es un RectanguloFalso contrario
    * @return  boolean true/false
    */
    private boolean isRectangulo() {                
        if(((darLado1()==darLado2())&&(darLado2()==darLado3())&&(darLado3()==darLado4())&&(darLado4()==darLado1())) || (((darLado1()==darLado3())&&(darLado2()==darLado4()))&&(darLado1()!=darLado2()))){    
           return true;
        }else  
            return false;                 
    }        
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
     * Metod que envia la impresion de todos los datos al menu principal
     */
    public void darTodo(){
        darResultadoLado();
        darResultadoArea();
        darResultadoPerimetro();
    }        
    /**
     * Retorna longitud de lado AB
     * @return lado1
     */
    private double darLado1(){
        double auxiliarX = Math.pow(punto2.getX() - punto1.getX(), 2);
        double auxiliarY = Math.pow(punto2.getY() - punto1.getY(), 2);
        
        double lado1 = Math.sqrt(auxiliarX +  auxiliarY);
        return lado1;
    }
    
    /**
     * Retorna longitud de lado BC
     * @return lado2
     */
    private double darLado2(){
        double auxiliarX = Math.pow(punto3.getX() - punto2.getX(), 2);
        double auxiliarY = Math.pow(punto3.getY() - punto2.getY(), 2);
        
       double lado2 = Math.sqrt(auxiliarX +  auxiliarY);
        return lado2;
    }
    
    /**
     * Retorna longitud de lado CD
     * @return lado3
     */
    private double darLado3(){
        double auxiliarX = Math.pow(punto3.getX() - this.punto4.getX(), 2);
        double auxiliarY = Math.pow(punto3.getY() - this.punto4.getY(), 2);
        
        double lado3= Math.sqrt(auxiliarX +  auxiliarY);
        return lado3;
    }
    /**
     * Retorna longitud de lado DA
     * @return lado4
     */
    private double darLado4(){        
        double auxiliarX = Math.pow(punto1.getX() - this.punto4.getX(), 2);
        double auxiliarY = Math.pow(punto1.getY() - this.punto4.getY(), 2);
        
        double lado4 = Math.sqrt(auxiliarX +  auxiliarY);
        return lado4;
        
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
     * Retorna punto 4
     * @return punto4
     */
    public Punto getPunto4() {
        return punto4;
    }
    /**
     * Modifica el punto4
     * @param punto4 
     */
    public void setPunto4(Punto punto4) {
        this.punto4 = punto4;
    }
    

  
    
    
}
