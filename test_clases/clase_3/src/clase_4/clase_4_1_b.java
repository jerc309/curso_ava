package clase_4;

import java.util.Scanner;

public class clase_4_1_b {
    public static void main(String args[]) {
        // 1. Tomando los Ejercicios de la clase anterior
        // b. haga lo mismo, pero solicitando los parámetros de a uno por consola

        System.out.println("ingrese 3 numeros");
        Scanner lectura = new Scanner(System.in);
        int numeros[] = new int[3];
        int numero1 = lectura.nextInt();
        int numero2 = lectura.nextInt();
        int numero3 = lectura.nextInt();

        numeros[0] = numero1;
        numeros[1] = numero2;
        numeros[2] = numero3;

        System.out.println("ingrese A para ordenar de forma Ascendente");
        System.out.println("ingrese D para ordenar de forma Descendente");
        String ascDesc = lectura.next();
        boolean ascendente = true;

        switch (ascDesc) {

            case "> 0":
                ascendente = true;

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
