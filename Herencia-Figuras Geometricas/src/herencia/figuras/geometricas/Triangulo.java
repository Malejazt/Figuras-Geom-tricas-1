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
public class Triangulo extends Figura_Geometrica{        
    /**
     * Guarda el perimetro del triangulo
     */
    private double perimetro;    
    int is;
    /**
     * Constructor de la clase
     * @param punto1
     * @param punto2
     * @param punto3 
     */
    public Triangulo(Punto punto1, Punto punto2, Punto punto3) {
        super(punto1, punto2, punto3);
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
     * Metodo que envia la impresion del perimetro al menu principal
     */
    public void darPerimetro(){        
        System.out.println("Perimetro: " + darPermietro());                                
    }
    /**
     * Metodo que envia la impresion del area al menu principal
     */
    public void darResultadoArea(){
        System.out.println("Area: " + darArea());
    }
    /**
     *metodo que envia la impresion de todo al menu principal 
     *
     */
    public void darTodo(){
        darResultadoLado();
        darPerimetro();
        darResultadoArea();
    }                   
    /**
     * Retorna verdadero si es un triangulo Falso contrario
     * @return boolean true/false
     */
    public int isTriangulo() {        
        if((this.punto1==this.punto2)||(this.punto2==this.punto3)||(this.punto3==this.punto1)){  
            is=1;
            return is;
        }else{    
            is=0;
            return is;
        }        
    }    
    
    /**
     * Retorma longitud de lado AB
     * @return lado
     */    
    private double darLado1(){
        double auxiliarX = Math.pow(punto2.getX() - punto1.getX(), 2);
        double auxiliarY = Math.pow(punto2.getY() - punto1.getY(), 2);        
        double lado = Math.sqrt(auxiliarX +  auxiliarY);
        return lado;
    }    
    /**
     * Retorma longitud de lado BC
     * @return lado
     */
    private double darLado2(){
        double auxiliarX = Math.pow(punto3.getX() - punto2.getX(), 2);
        double auxiliarY = Math.pow(punto3.getY() - punto2.getY(), 2);        
        double lado = Math.sqrt(auxiliarX +  auxiliarY);
        return lado;
    }    
    /**
     * Retorma longitud de lado CA
     * @return lado
     */
    private double darLado3(){
        double auxiliarX = Math.pow(punto1.getX() - punto3.getX(), 2);
        double auxiliarY = Math.pow(punto1.getY() - punto3.getY(), 2);        
        double lado = Math.sqrt(auxiliarX +  auxiliarY);
        return lado;
    }
    /**
     * 
     * Metodo que retorna el perimetro del triangulo
     * @return this.perimetro
     */
    private double darPermietro() {        
        this.perimetro =  darLado1() + darLado2() + darLado3();
        return this.perimetro;
    }
    /**
     * Metodo que retorna el area de un trianguo
     * @return area
     */
    private double darArea() {
        double semiperimetro = this.perimetro / 2;
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
        if((darLado1()==darLado2())&&(darLado2()==darLado3())&&(darLado3()==darLado1())){            
            System.out.println("Equilatero");                                    
        }else if (((darLado1()==darLado2())&&(darLado2()==darLado3())&&(darLado3()!=darLado1()))||(darLado1()==darLado3())&&(darLado3()==darLado2())&&(darLado2()!=darLado1())){
            System.out.println("Isosceles");                                             
        }else if((darLado1()!=darLado2())&&(darLado2()!=darLado3())&&(darLado3()!=darLado1())){
            System.out.println("Escaleno");                                             
        }                        
    }        
}
