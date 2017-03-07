/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurasgeometricas;

import java.util.Scanner;



/**
 *
 * @author Gabriel
 * @author Alejandra
 */ 

public class Triangulo {
    Scanner datos = new Scanner(System.in);
    
   
    public void tipo(){
            float aX,aY,bX,bY,cX,cY;
       float distanciaAB,distanciaBC,distanciaAC;
            System.out.println("Ingrese los datos:");
            System.out.println("Coordenadas A:X ");
            aX = datos.nextFloat();
            System.out.println("Coordenadas A:Y ");
            aY = datos.nextFloat();
             System.out.println("Coordenadas B:X ");
            bX = datos.nextFloat();
            System.out.println("Coordenadas B:Y ");
            bY = datos.nextFloat();
            System.out.println("Coordenadas C:X ");
            cX = datos.nextFloat();
            System.out.println("Coordenadas C:Y ");
            cY = datos.nextFloat();
             float pot1=((bY-aY)*(bY-aY));
        float pot2=((bX-aX)*(bX-aX)); 
        float sumaA=pot1+pot2;
        float pot3=((cY-bY)*(cY-bY));
        float pot4=((cX-bX)*(cX-bX)); 
        float sumaB=pot3+pot4;
        float pot5=((aY-cY)*(aY-cY));
        float pot6=((aX-cX)*(aX-cX)); 
        float sumaC=pot5+pot6;
        distanciaAB=(float) (double) Math.sqrt(sumaA);
        distanciaBC=(float) (double) Math.sqrt(sumaB);
        distanciaAC=(float) (double) Math.sqrt(sumaC);
        if ((distanciaAB==distanciaBC)&&(distanciaBC==distanciaAC)){
        System.out.println("Es equilatero");    
        }
        if (((distanciaAB==distanciaBC)&&(distanciaAB!=distanciaAC))||((distanciaBC==distanciaAC)&&(distanciaBC!=distanciaAB))||((distanciaAC==distanciaAB)&&(distanciaAC!=distanciaBC))){
        System.out.println("Es isosceles");    
        }
         if ((distanciaAB!=distanciaBC)&&(distanciaAB!=distanciaAC)&&(distanciaBC!=distanciaAC)){
        System.out.println("Es escaleno");    
        }
    }
    public void area(){
     float aX,aY,bX,bY,cX,cY,areaT;
            System.out.println("Ingrese los datos:");
            System.out.println("Coordenadas A:X ");
            aX = datos.nextShort();
            System.out.println("Coordenadas A:Y ");
            aY = datos.nextShort();
             System.out.println("Coordenadas B:X ");
            bX = datos.nextShort();
            System.out.println("Coordenadas B:Y ");
            bY = datos.nextShort();
            System.out.println("Coordenadas C:X ");
            cX = datos.nextShort();
            System.out.println("Coordenadas C:Y ");
            cY = datos.nextShort();
            
            areaT=(((aX*bY)+(bX*cY)+(cX*aY))-((aX*cY)+(cX*bY)+(bX*aY)))/2;
            System.out.println("El area es: "+areaT+"u^2");
    }
    public void lados(){
        float aX,aY,bX,bY,cX,cY;
       float distanciaAB,distanciaBC,distanciaAC;
            System.out.println("Ingrese los datos:");
            System.out.println("Coordenadas A:X ");
            aX = datos.nextFloat();
            System.out.println("Coordenadas A:Y ");
            aY = datos.nextFloat();
             System.out.println("Coordenadas B:X ");
            bX = datos.nextFloat();
            System.out.println("Coordenadas B:Y ");
            bY = datos.nextFloat();
            System.out.println("Coordenadas C:X ");
            cX = datos.nextFloat();
            System.out.println("Coordenadas C:Y ");
            cY = datos.nextFloat();
             float pot1=((bY-aY)*(bY-aY));
        float pot2=((bX-aX)*(bX-aX)); 
        float sumaA=pot1+pot2;
        float pot3=((cY-bY)*(cY-bY));
        float pot4=((cX-bX)*(cX-bX)); 
        float sumaB=pot3+pot4;
        float pot5=((aY-cY)*(aY-cY));
        float pot6=((aX-cX)*(aX-cX)); 
        float sumaC=pot5+pot6;
        distanciaAB=(float) (double) Math.sqrt(sumaA);
        distanciaBC=(float) (double) Math.sqrt(sumaB);
        distanciaAC=(float) (double) Math.sqrt(sumaC);
        System.out.println("El ladoA es: "+distanciaAB);
        System.out.println("El ladoB es: "+distanciaBC);
        System.out.println("El ladoC es: "+distanciaAC);
    }
    public void perimetro(){
        float aX,aY,bX,bY,cX,cY;
       float distanciaAB,distanciaBC,distanciaAC;
            System.out.println("Ingrese los datos:");
            System.out.println("Coordenadas A:X ");
            aX = datos.nextFloat();
            System.out.println("Coordenadas A:Y ");
            aY = datos.nextFloat();
             System.out.println("Coordenadas B:X ");
            bX = datos.nextFloat();
            System.out.println("Coordenadas B:Y ");
            bY = datos.nextFloat();
            System.out.println("Coordenadas C:X ");
            cX = datos.nextFloat();
            System.out.println("Coordenadas C:Y ");
            cY = datos.nextFloat();
        float pot1=((bY-aY)*(bY-aY));
        float pot2=((bX-aX)*(bX-aX)); 
        float sumaA=pot1+pot2;
        float pot3=((cY-bY)*(cY-bY));
        float pot4=((cX-bX)*(cX-bX)); 
        float sumaB=pot3+pot4;
        float pot5=((aY-cY)*(aY-cY));
        float pot6=((aX-cX)*(aX-cX)); 
        float sumaC=pot5+pot6;
        distanciaAB=(float) (double) Math.sqrt(sumaA);
        distanciaBC=(float) (double) Math.sqrt(sumaB);
        distanciaAC=(float) (double) Math.sqrt(sumaC);
        
        float perimetro=distanciaAB+distanciaBC+distanciaAC;
        System.out.println("El perimetro es: "+perimetro);
    }

    
}
