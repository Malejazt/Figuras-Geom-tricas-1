/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciafigurasgeometricas;

import java.util.Scanner;
/**
 *
 * @author Gabriel Andres Zapata Morera
 * @author Mary Alejandra Zapata Tellez
 */
public class Menu {
    /**
     * Variables y objetos globales
     */
    private final Scanner leer= new Scanner(System.in);
    int figura,figura1,figura2,figura3;
     double x, y;
     Punto punto1,punto2,punto3,punto4;
     Triangulo triangulo;
     Rectangulo rectangulo;
     Circulo circulo;
    /**
     * Constructor de la clase menu 
     */
    public Menu(){        
        menuSeleccion();                
    }  
    /**
     * Metodo  que selecciona el tipo de figura
     */
    
    private void menuSeleccion(){       
        System.out.println(">------------Bienvenido-------------<");
        System.out.println("Que desea realizar?: ");
        System.out.println("1).Operaciones Con Triangulo\t2).Operaciones Con Circulo\t3).Operaciones Con Rectangulo");
        figura = leer.nextInt();
        eligeFigura();                        
    }
    /**
     * Metodo que segun la figura elegida redirige al siguiene "menu"
     */
    private void eligeFigura(){
        switch(figura){
            case 1:
                operacionesTriangulo();                  
                eligeOperacionTriangulo(); 
                menuSeleccion();
                break;            
            case 2:
                operacionesCirculo(); 
                 eligeOperacionCirculo();
                 menuSeleccion();
                break;                
            case 3:
                operacionesRectangulo();
                eligeOperacionRectangulo();
                menuSeleccion();
                break;                                        
        }                        
    }
    /**
     * Metodo que pide las coordenadas para las respectivas operaciones
     */
     private void operacionesTriangulo(){        
        System.out.println("Digite coordenada x1");
        x = leer.nextDouble();
        System.out.println("Digite coordenada y1");
        y = leer.nextDouble();
        punto1 = new Punto(x, y);
        System.out.println("Digite coordenada x2");
        x = leer.nextDouble();
        System.out.println("Digite coordenada y2");
        y = leer.nextDouble();
        punto2 = new Punto(x, y);
        System.out.println("Digite coordenada x3");
        x = leer.nextDouble();
        System.out.println("Digite coordenada y3");
        y = leer.nextDouble();
        punto3 = new Punto(x, y);
        triangulo = new Triangulo(punto1, punto2, punto3,0,0,0,0,0,0);     
        
    }
   
          /**
     * Metodo que pide las coordenadas para las respectivas operaciones
     */   
    private void operacionesRectangulo(){                
        System.out.println("Digite coordenada x1");
        x = leer.nextDouble();
        System.out.println("Digite coordenada y1");
        y = leer.nextDouble();
        punto1 = new Punto(x, y);
        System.out.println("Digite coordenada x2");
        x = leer.nextDouble();
        System.out.println("Digite coordenaday2");
        y = leer.nextDouble();
        punto2= new Punto(x, y);
        System.out.println("Digite coordenada x3");
        x = leer.nextDouble();
        System.out.println("Digite coordenada y3");
        y = leer.nextDouble();
        punto3 = new Punto(x, y);
        System.out.println("Digite coordenada x4");
        x = leer.nextDouble();
        System.out.println("Digite coordenada y4");
        y = leer.nextDouble();
        punto4 = new Punto(x, y);
        rectangulo = new Rectangulo(punto1, punto2, punto3, punto4,0,0,0,0,0,0);
    }
      /**
     * Metodo que segun la eleccion, efectua las operaciones respectivas al Triangulo
     */    
    private void eligeOperacionTriangulo(){        
            System.out.println("Que desea operacion desea realizar?: ");
            System.out.println("\t1).Hallar Lados  2).Hallar Area  3).Perimetro  4).Tipo de Triangulo  5).Todos  6).Salir al Menu Principal : ");
            figura1 = leer.nextInt();                                
            switch(figura1){            
                case 1:
                    triangulo.darResultadoLado();
                    break;
                case 2:
                    triangulo.darResultadoArea();   
                    break;            
                case 3:
                    triangulo.darPerimetros();
                    break;            
                case 4:
                    triangulo.darTipoTriangulo();
                    break;            
                case 5:
                    triangulo.darTodo();
                    break;            
                case 6:
                    menuSeleccion();
                    break;
            }       
    }
    
       /**
     * Metodo que segun la eleccion, efectua las operaciones respectivas al Rectangulo
     */
    private void eligeOperacionRectangulo(){
        System.out.println("Que desea operacion desea realizar?: ");
        System.out.println("\t1).Hallar Lados  2).Hallar Area  3).Perimetro  4).Todos  5).Salir al Menu Principal : ");
        figura2 = leer.nextInt();                          
        switch(figura2){            
                case 1:
                    rectangulo.darResultadoLado();
                    break;
                case 2:
                     rectangulo.darResultadoArea();
                    break;            
                case 3:
                    rectangulo.darResultadoPerimetro();
                    break;            
                case 4:
                    rectangulo.darTodo();
                    break;            
                case 5:
                    menuSeleccion();
                    break;            
            }        
    }    

     /**
     * Metodo que pide las coordenadas para las respectivas operaciones
     */
    private void operacionesCirculo(){        
        System.out.println("Digite coordenada x1");
        x = leer.nextDouble();
        System.out.println("Digite coordenada y1");
        y = leer.nextDouble();
        punto1 = new Punto(x, y);
        System.out.println("Digite coordenada x2");
        x = leer.nextDouble();
        System.out.println("Digite coordenada y2");
        y = leer.nextDouble();
        punto2 = new Punto(x, y);
 
        circulo= new Circulo (punto1, punto2,0,0,0,0,0,0);            
    }    
     /**
     * Metodo que segun la eleccion, efectua las operaciones respectivas al Circulo
     */    
    private void eligeOperacionCirculo(){        
        System.out.println("Que desea operacion desea realizar?: ");
            System.out.println("\t1).Hallar Radio 2).Hallar Perimetro 3).Hallar diametro   4).Hallar Area 5).Todos    6).Salir al Menu Principal : ");
            figura3 = leer.nextInt();                                
            switch(figura3){            
                case 1:
                    circulo.darRadio();
                    break;
                case 2:
                    circulo.darPerimetro();
                    break;            
                case 3:
                    circulo.darDiametro();
                    break;            
                case 4:
                    circulo.darArea();
                    break;            
                case 5:
                    circulo.darTodo();
                    break;            
                case 6:
                    menuSeleccion();
                    break;
            }
    }
    
    }
    

