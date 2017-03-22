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
public class Circulo extends Padre {
    /**
     * Atributo radio
     */
    private double radio;
    /**
     * Constructor de la clase 
     * @param punto1
     * @param punto2
     * @param area
     * @param perimetro
     * @param coordenada1x
     * @param coordenada1y
     * @param coordenada2x
     * @param coordenada2y 
     */
    public Circulo(Punto punto1, Punto punto2, double area, double perimetro, double coordenada1x, double coordenada1y, double coordenada2x, double coordenada2y) {
        super(punto1, punto2, area, perimetro, coordenada1x, coordenada1y, coordenada2x, coordenada2y);
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
        System.out.println("Diametro" + diametro());
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
     * Metodo que especializa el metodo de distancia
     * @return radio
     */
     private double radio(){
        cambioDatos1();
        radio=super.distancia();
        
        return radio;
    }
     /**
      * Metodo que cambia los datos del metodo radio
      */
         private void cambioDatos1(){
        
        this.setCoordenada2x(this.getPunto2().getX());
        this.setCoordenada1x(this.getPunto1().getX());
        this.setCoordenada2y(this.getPunto2().getY());
        this.setCoordenada1y(this.getPunto1().getY());
    }
      /** 
     * halla y retorna el Area del circulo
     * @return area
     */
    public double area(){
         
        double areas = Math.PI*Math.pow(this.radio(), 2);//formula para hallar el area
        return areas;          
    }
    /**
     * halla y retorna el diametro del circulo
     * @return diametro 
     */
    public double diametro (){         
        double diametroS=this.radio()*2;//formula para hallar el diametro
        return diametroS;          
    }  
    /**
     * halla y retorna el perimetro del circulo
     * @return  perimetro
     */
    public double perimetro (){         
        double perimetro=2*Math.PI*this.radio();//formula para hallar el perimetro
        return perimetro;          
    }  
}
