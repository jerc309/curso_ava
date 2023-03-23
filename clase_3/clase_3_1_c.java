package clase_3;

import java.nio.file.FileSystemAlreadyExistsException;

public class clase_3_1_c {

    public static void main(String args[]) {
        // dado un vector de números, y un número X, que sume todos los números > X y
        // retorne el resultado
        System.out.println("C- Dado un vector sume los numeros > a X");

        int vector[] = new int[] { 2, 5, 6, 7, 5, 4, 3, 5, 4, 5 };
        int x = 5;
        int acumulador = 0;

        for (int i : vector) {
            if (i > x) {
                acumulador = acumulador + i;
                System.out.println(i);
            }
        }
        System.out.println("\t La sumatoria de todos los valores es: " + acumulador);

    }

}
