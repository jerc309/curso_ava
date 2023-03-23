package clase_4;

import java.util.Scanner;

public class clase_4_1_c {
    public static void main(String args[]) {
        // 1. Tomando los Ejercicios de la clase anterior
        // a. haga un main, donde por parámetro ponga 3 números y una letra que
        // represente ascendente o descendente y los muestre ordenados por tal criterio
        System.out.println(
                "ingrese 3 numeros separados por \",\" y la letra \"A\" o \"D\" para ordenar de forma Ascendente o Descendente");
        Scanner lectura = new Scanner(System.in);
        String stringEntrada = lectura.next();
        String[] arrayEntrada = stringEntrada.split(",");
        boolean ascendente = true;
        String ascDesc;
        int[] numeros = new int[3];
        System.out.println(arrayEntrada.length);
        if (arrayEntrada.length == 4) {
            int numero1 = Integer.parseInt(arrayEntrada[0]);
            int numero2 = Integer.parseInt(arrayEntrada[1]);
            int numero3 = Integer.parseInt(arrayEntrada[2]);
            numeros[0] = numero1;
            numeros[1] = numero2;
            numeros[2] = numero3;

            ascDesc = arrayEntrada[3];

        } else {
            System.out.println("ingrese 3 numeros");
            Scanner lectura2 = new Scanner(System.in);
            int numero1 = lectura2.nextInt();
            int numero2 = lectura2.nextInt();
            int numero3 = lectura2.nextInt();

            numeros[0] = numero1;
            numeros[1] = numero2;
            numeros[2] = numero3;

            System.out.println("ingrese A para ordenar de forma Ascendente");
            System.out.println("ingrese D para ordenar de forma Descendente");
            ascDesc = lectura2.next();

        }

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