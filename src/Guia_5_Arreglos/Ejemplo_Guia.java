package Guia_5_Arreglos;

public class Ejemplo_Guia {

    public static void main(String[] args) {
        //Voy a crear un Vector de 5 elemento que contiene enteros//
        int[] vector = new int[5];

        //Creo una matriz con dimensión 3x3 que
        // solo pueda alojar cadenas
        String[][] matriz = new String[3][3];

        int[] cantidad = new int[5];

        //asigno valores al vector mediante un for
        for (int i = 0; i < 5; i++) {
            cantidad[i] = i + 10;
        }

        // muestro por pantalla la asgnacion mediante otro for
        /*for (int j = 0; j < 5; j++) {
                System.out.println("[" +cantidad[i]+ "[");
                System.out.println("");
               
            }
             
        } System.out.println("*");*/
        // Asigno valores mediante el For
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = "A";
            }

        }
        // Muestro la matriz
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                System.out.print("[" + matriz[i][j] + "]");

            }
            System.out.println("");
        }

    }
}
