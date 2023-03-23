package clase_3;

public class clase_3_1_b {
    public static void main(String args[]) {
        // b. Dados 3 números y un orden (ascendente o decreciente) que ordene los
        // mismos y los retorne en un vector de 3
        System.out.println("\n b-ordenar (ascendente o decreciente) un string ");
        int numeros[] = new int[] { 4, 5, 3 }; // Así se declara un arreglo de enteros
        boolean ascendente = false;
        int primero = 0;
        System.out.println("\n ascendente =" + ascendente);
        System.out.println("\n String =");
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
