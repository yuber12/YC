package javabasico;

import data.OperadoresAritmeticos;
import data.OperadoresLogicos;
import java.util.Scanner;

public class JavaBasico {

    public static void main(String[] args) {
        System.out.println("=======Java Basico=======");
        System.out.println("Yuberli Cristhian");
        System.out.println("=========================");
        System.out.println("==========Menu==========");
        System.out.println("1.- Operadores Logicos");
        System.out.println("2.- Operadores Aritmeticos");
        System.out.println("3.- Operadores De Comparacion");
        System.out.println("4.- Tipos de Datos");
        System.out.println("5.- Condicionales");
        System.out.println("6.- Bucles");
        System.out.println("7.- Excepciones");
        System.out.println("8.- Arrays");
        System.out.println("9.- Listas");
        System.out.println("10.- Mapa De Valores");
        
        Scanner sc = new Scanner(System.in);
        
        int opcion = sc.nextInt();
        
        System.out.println("La opcion selccionada es: "+opcion);
        
       boolean salir = true;
       
       while(salir){
           
           
           
           switch(opcion){
               case 1:
                   OperadoresLogicos ol = new OperadoresLogicos();
                   ol.principal();
                   break;
               case 2:
                   OperadoresAritmeticos oa = new OperadoresAritmeticos();
                   oa.sumar(4,7);
               case 3:
               case 4:
               case 5:
               case 6:
               case 7:
               case 8:
               case 9:
               case 10:
               case 0:
               default:
                   System.out.println("Opcion no encontrada, Intente Nuevamente");
                        
           }
           salir = false;
       }
               
               
               
 }
    
}
