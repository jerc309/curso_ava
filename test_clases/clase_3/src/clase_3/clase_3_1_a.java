package clase_3;

import java.util.Scanner;

public class clase_3_1_a {
    public static void main(String args[]) {
        /*
         * a - Dado un String y una letra, que cuente la cantidad de apariciones de la
         * letra en
         * el String
         */
        System.out.println("a-Cantidad de apariciones de la letra en el String\n");

        System.out.println("\tIngrese un String : ");
        Scanner myObj1 = new Scanner(System.in);
        String letras = myObj1.nextLine();

        System.out.println("\tIngrese una letra : ");
        Scanner myObj2 = new Scanner(System.in);
        String letra = myObj2.nextLine();

        int cantidadLetras = letras.length();
        int cantidad = 0;
        for (String s : letras.split("")) {
            if (letra.equals(s)) {
                cantidad++;

            }

        }
        System.out.println("\t El String contiene " + cantidad + " letras " + letra + "\n");

    }
}
