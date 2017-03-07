/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurasgeometricas;

import java.util.Scanner;

/**
 * @author Gabriel
 * @author Alejandra
 */
public class Circulo {
    Scanner datos = new Scanner(System.in);
    public void area(){
     float radio;  
     System.out.println("Digite el radio de la circunferencia"); 
     radio = datos.nextFloat();
     float Area=3.14f*(radio*radio);
     System.out.println("el Area es"+Area);    
       
    }
     public void posicion(){
        
        
    }
    public void diametro(){
     float radio;  
     System.out.println("Digite el radio de la circunferencia"); 
     radio = datos.nextFloat();
     float diametro=radio*2;
     System.out.println("el diametro es"+diametro);   
    }
    public void perimetro(){
     float radio;  
     System.out.println("Digite el radio de la circunferencia"); 
     radio = datos.nextFloat();
     float perimetro=2*3.14f*radio;
     System.out.println("el perimetro es"+perimetro);   
    }

    
}
