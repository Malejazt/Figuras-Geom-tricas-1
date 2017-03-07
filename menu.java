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
public class menu {
    
     public void menus(){
         menu sr = new menu();
             
        
        Scanner opciones = new Scanner(System.in);
        short opcion,opcionT;
        
        System.out.println("ﾂｿCon que figura desea trabajar?");
        System.out.println("Digite 1 si es Triangulo");
        System.out.println("Digite 2 si es Circulo");
        System.out.println("Digite 3 si es Rectangulo");
        opcion = opciones.nextShort();
        
        switch(opcion){
            case 1:
                Triangulo menu1 = new  Triangulo();
                
                System.out.println("Ha elegido triangulo, ﾂｿQue desea Realizar?");   
                System.out.println("1: Lados, 2: Area, 3: Tipo, 4: Perimetro, 5: Todos, 6:Menu Principal");
                opcionT = opciones.nextShort();
                
                switch(opcionT){
                    case 1:
                        menu1.lados();
                        break;
                    case 2:
                        menu1.area();
                        break;
                    case 3:
                        menu1.tipo();
                        break;    
                    case 4:
                        menu1.perimetro();
                        break;    
                    case 5:
                        menu1.lados();
                        menu1.area();
                        menu1.tipo();
                        menu1.perimetro();
                        break;   
                    case 6:
                        sr.menus();
                        break;
                }
                break;
                
            case 2:
                
                Circulo menu2 = new  Circulo();
                
                System.out.println("Ha elegido circulo, ﾂｿQue desea Realizar?");   
                System.out.println("1: Area, 2: Posicion, 3: Diametro, 4: Perimetro, 5: Todos, 6:Menu Principal");
                opcionT = opciones.nextShort();
                
                switch(opcionT){
                    case 1:
                        menu2.area();
                        break;
                    case 2:
                        menu2.posicion();
                        break;
                    case 3:
                        menu2.diametro();
                        break;    
                    case 4:
                        menu2.perimetro();
                        break;    
                    case 5:
                        menu2.area();
                        menu2.posicion();
                        menu2.diametro();
                        menu2.perimetro();
                        break;   
                    case 6:
                        sr.menus();
                        break;
                }
                break; 
            
            case 3:
                
                Rectangulo menu3 = new  Rectangulo();
                
                System.out.println("Ha elegido rectangulo, ﾂｿQue desea Realizar?");   
                System.out.println("1: Perimetro, 2: Area, 3: Lados, 4: Todos, 5: Menu Principal");
                opcionT = opciones.nextShort();
                
                switch(opcionT){
                    case 1:
                        menu3.Perimetro();
                        break;
                    case 2:
                        menu3.Area();
                        break;
                    case 3:
                        menu3.Lados();
                        break;    
                    case 4:
                        menu3.Perimetro();
                        menu3.Area();
                        menu3.Lados();
                        break;    
                    case 5:
                        sr.menus();
                        break;   
                   
                }
                break;
                
        }
        
        
    }
}

