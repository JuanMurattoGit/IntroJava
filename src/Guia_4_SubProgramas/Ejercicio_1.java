package Guia_4_SubProgramas;

import java.util.Scanner;

public class Ejercicio_1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese 2 numeros enteros");
        int num1, num2;
        num1 = leer.nextInt();
        num2 = leer.nextInt();

        System.out.println("Elija una opcion"
                + "\n1.SUMAR "
                + "\n2.RESTAR "
                + "\n3.MULTIPLICAR ");

        int opcion = leer.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("La suma de los num es " + funcSuma(num1, num2));
                break;
            case 2:
                System.out.println("La resta de los num es " + funcRest(num1, num2));
                break;
            case 3:
                System.out.println("La mult de los numeros es " + funcMult(num1, num2));
                break;
            default:
                System.out.println("La opcion no es correcta");
        }
    }

    public static int funcSuma(int num1, int num2) {
        return num1 + num2;
    }

    public static int funcRest(int num1, int num2) {
        return num1 - num2;
    }

    public static int funcMult(int num1, int num2) {
        return num1 * num2;
    }
}
