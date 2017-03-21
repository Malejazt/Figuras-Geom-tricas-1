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
public class Circulo extends Figura_Geometrica {
    
    /**
     * Guarda el radio del Circulo
     */
    private double radio;
    /**
     * Constructor de la clase
     * @param punto1
     * @param punto2
     * @param punto3 
     */
    public Circulo(Punto punto1, Punto punto2, Punto punto3) {
        super(punto1, punto2, punto3);
    }
    
    /**
     * metodo que envia la impresion del radio al menu
     */
    public void darRadio(){ 
        System.out.println("Radio: " + radio());        
    }
    /**
     * Metodo que envia la impresion del area al menu
     */
    public void darArea(){        
        System.out.println("Area: " + area());
    }
    /**
     * Metodo que envia la impresion del diametro al menu
     */
    public void darDiametro(){        
        System.out.println("Perimetro" + diametro());
    }
    /**
     * Metodo que envia la impresion del perimetro al menu
     */
    public void darPerimetro(){
         System.out.println("Perimetro" + perimetro ());    
    }    
    /**
     *metodo que envia la impresion de todo al menu principal 
     *
     */
    public void darTodo(){
        darRadio();
        darPerimetro();
        darDiametro();
        darArea();
        
    }          
    /**
     * Halla y retorna el radio del circulo
     * @return  radio
     */
    private double radio(){
        double auxiliarX1 = Math.pow(punto2.getX() - punto1.getX(), 2);
        double auxiliarY1 = Math.pow(punto2.getY() - punto1.getY(), 2);
        
        double distancia1 = Math.sqrt(auxiliarX1 +  auxiliarY1);
        
        double auxiliarX2 = Math.pow(punto3.getX() - punto2.getX(), 2);
        double auxiliarY2 = Math.pow(punto3.getY() - punto2.getY(), 2);
        
        double distancia2 = Math.sqrt(auxiliarX2 +  auxiliarY2);
        
        double auxiliarX3 = Math.pow(punto1.getX() - punto3.getX(), 2);
        double auxiliarY3 = Math.pow(punto1.getY() - punto3.getY(), 2);
        
        double distancia3 = Math.sqrt(auxiliarX3 +  auxiliarY3);
        
        double divisor=Math.sqrt((distancia1+distancia2+distancia3)+(distancia2+distancia3-distancia1)+(distancia3+distancia1-distancia2)+(distancia1+distancia2-distancia3));
        this.radio=(distancia1*distancia2*distancia3)/divisor;
        return this.radio;
    }
    /** 
     * halla y retorna el Area del circulo
     * @return area
     */
    public double area(){
         
        double areas = Math.PI*Math.pow(this.radio(), 2);
        return areas;   
       
    }
    /**
     * halla y retorna el diametro del circulo
     * @return diametro 
     */
    public double diametro (){         
        double diametroS=this.radio()*2;
        return diametroS;          
    }  
    /**
     * halla y retorna el perimetro del circulo
     * @return  perimetro
     */
    public double perimetro (){         
        double perimetro=2*Math.PI*this.radio();
        return perimetro;          
    }  
}
