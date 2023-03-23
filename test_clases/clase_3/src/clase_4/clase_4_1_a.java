package clase_4;

import java.util.Scanner;

public class clase_4_1_a {
    public static void main(String args[]) {
        // 1. Tomando los Ejercicios de la clase anterior
        // a. haga un main, donde por parámetro ponga 3 números y una letra que
        // represente ascendente o descendente y los muestre ordenados por tal criterio
        System.out.println(
                "ingrese 3 numeros separados por \",\" y la letra \"A\" o \"D\" para ordenar de forma Ascendente o Descendente");
        Scanner lectura = new Scanner(System.in);
        String stringEntrada = lectura.next();
        String[] arrayEntrada = stringEntrada.split(",");
        int numero1 = Integer.parseInt(arrayEntrada[0]);
        int numero2 = Integer.parseInt(arrayEntrada[1]);
        int numero3 = Integer.parseInt(arrayEntrada[2]);
        int[] numeros = new int[3];
        numeros[0] = numero1;
        numeros[1] = numero2;
        numeros[2] = numero3;

        String ascDesc = arrayEntrada[3];
        boolean ascendente = true;

        switch (ascDesc) {
            case "A":
                ascendente = true;

                break;
            case "D":
                ascendente = false;

                break;

        }
        int primero = 0;

        for (int s = 0; s <= numeros.length - 1; s++) {
            System.out.println("\t" + numeros[s]);
        }
        // Decendente
        for (int c = 0; c < numeros.length - 1; c++) {

            // A>B
            if (numeros[0] >= numeros[1]) {
                if (ascendente == true) {
                    primero = numeros[0];
                    numeros[0] = numeros[1];
                    numeros[1] = primero;
                    // B>C
                    if (numeros[1] > numeros[2]) {
                        primero = numeros[2];
                        numeros[2] = numeros[1];
                        numeros[1] = primero;
                    }

                } else {
                    if (ascendente != true) {
                        if (numeros[2] >= numeros[1]) {
                            primero = numeros[1];
                            numeros[1] = numeros[2];
                            numeros[2] = primero;
                            if (numeros[1] >= numeros[0]) {
                                primero = numeros[0];
                                numeros[0] = numeros[1];
                                numeros[1] = primero;
                            }
                        }
                    }

                }
            } else {
                // A<B
                if (ascendente == true) {
                    // B>C
                    if (numeros[1] > numeros[2]) {
                        primero = numeros[2];
                        numeros[2] = numeros[1];
                        numeros[1] = primero;
                    }

                } else {
                    if (ascendente != true) {
                        primero = numeros[0];
                        numeros[0] = numeros[1];
                        numeros[1] = primero;
                        if (numeros[2] >= numeros[1]) {
                            primero = numeros[1];
                            numeros[1] = numeros[2];
                            numeros[2] = primero;
                            if (numeros[1] >= numeros[0]) {
                                primero = numeros[0];
                                numeros[0] = numeros[1];
                                numeros[1] = primero;
                            }
                        }
                    }

                }

            }

        }
        System.out.println("String ordenado");
        for (int c : numeros) {
            System.out.println("\t" + c);
        }

    }
}