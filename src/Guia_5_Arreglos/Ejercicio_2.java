/*
  Realizar un algoritmo que llene un vector de tamaño N con valores
  aleatorios y le pida al usuario un número a buscar en el vector. 
  El programa mostrará dónde se encuentra el numero y si se encuentra repetido

 */
package Guia_5_Arreglos;

import java.util.Scanner;




public class Ejercicio_2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese la dimension vector ");
        int n = leer.nextInt();
        int[] vector=new int[n];
        
        for (int i = 0; i < n; i++) {
            vector[i]= (int) (Math.random()*10);
            
        }
        for (int i = 0; i < n; i++) {
            System.out.print("[" +vector[i]+ "]");
        }
        System.out.println("");
        System.out.println("los indices son:");
        for (int i = 0; i < n; i++) {
            System.out.print("[" +i+ "]");
        }
        System.out.println("");
        System.out.println("Ingrese el numero a buscar dentro del vector");
        int buscado = leer.nextInt();
        int contador=0;
        
        for (int i = 0; i < n; i++) {
            if (buscado==vector[i]) {
                contador++;
            System.out.println("El numero buscado de encuentra en la "
                    + "posicion ["+i+ "]");
            }
            
        } System.out.println("***");
        
            if (contador>1) {
            System.out.println("El numero se repite "+contador+ " veces");
            } 
            
    }
   
}

