package Guia_4_SubProgramas;



import java.util.Scanner;


public class Ejercicio_3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de Euros");
        int euro = leer.nextInt();
        System.out.println("Ingrese como texto a que moneda desea convertir"
                + "\nUNO.Libras"
                + "\nDOS.Pesos"
                + "\nTRES.Yenes");
        int cambio = leer.nextInt();
        tipoCambio(euro, cambio);

    }

    public static void tipoCambio(double eu, int conver) {
        double cambio = 0;

        switch (conver) {
            case 1:
                cambio=eu * 0.86;
                System.out.println(eu + " €, equivalen a " + cambio + " Libras");
                break;
            case 2:
                cambio = eu * 1.28611;
                System.out.println(eu + " €, equivalen a " + cambio + " Pesos");
                break;
            case 3:
                cambio = eu * 129.852;
                System.out.println(eu + " €, equivalen a " + cambio + " Yenes");
                break;
            default:
                System.out.println("La opcion seleccionada es incorrecta");
        }
    }
}
