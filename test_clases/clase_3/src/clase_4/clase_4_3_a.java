package clase_4;

import java.lang.reflect.Array;
import java.util.Scanner;

public class clase_4_3_a {
    public static void main(String args[]) {
        // 3. Tome el ejercicio B de la clase 3 y que por parámetro se pueda elegir si
        // es una
        // codificación o decodificación, el valor del desplazo, y 2 archivos, uno para
        // la entrada y
        // otro para la salida. Que por pantalla solo indique si terminó o no
        // correctamente, los
        // resultados deben estar en el archivo de salida

        System.out.println("Ingrese Texto a Codificar:");
        String textoACodificar = pedirDatoString();

        System.out.println("Ingrese:\n" + "\tC-Para Codificar\n" + "\tD-Para Decodificar\n");
        String tipoDecodificacion = pedirDatoString();

        System.out.println("Ingrese:\n" + "\tDesplazamiento: 1 o 2 para la cantidad de desplaxamiento");
        int cantidadDesplazamiento = Integer.parseInt(pedirDatoString());

        System.out
                .println("Texto Codificado: "
                        + codificadorDesplazamientoDos(textoACodificar, cantidadDesplazamiento, tipoDecodificacion));

    }

    private static String codificadorDesplazamientoDos(String textoParaCodificar, int desplazamiento,
            String tipoDeCodificacion) {
        System.out.println("desplazamiento " + desplazamiento + " texto a codificar " + textoParaCodificar);
        String arrayTexto[] = textoParaCodificar.split("");
        String arrayCode[] = new String[arrayTexto.length];
        String arrayAbecedario[] = " abcdefghijklmnñopqrstuvwxyz".split("");
        int contador = 0;
        for (int y = 0; y < arrayTexto.length; y++) {
            for (int x = 0; x < arrayAbecedario.length - 1; x++) {
                String yy = arrayTexto[y];
                String xx = arrayAbecedario[x];
                if (yy.equals(xx)) {
                    if (yy.equals("y") | yy.equals("z")) {
                        if (yy.equals("y") | desplazamiento == 2) {
                            arrayCode[contador] = "y";
                            contador++;
                        }
                        if (yy.equals("z") | desplazamiento > 0) {
                            arrayCode[contador] = "z";
                            contador++;
                        }
                    } else {
                        if ("C".equals(tipoDeCodificacion)) {
                            arrayCode[contador] = arrayAbecedario[x + desplazamiento];
                            contador++;
                        } else {
                            if (yy.equals("a") | yy.equals(" ")) {
                                if (yy.equals("a") & desplazamiento == 2) {
                                    arrayCode[contador] = "a";
                                    contador++;
                                }
                                if (yy.equals(" ") & desplazamiento > 0) {
                                    arrayCode[contador] = "u";
                                    contador++;
                                }
                            } else {
                                arrayCode[contador] = arrayAbecedario[x - desplazamiento];
                                contador++;
                            }
                        }

                    }
                }
            }

        }

        String textoCodificado = "";
        for (int z = 0; z < arrayCode.length; z++) {
            textoCodificado = textoCodificado + String.valueOf(arrayCode[z]);
        }
        return textoCodificado;
    }

    private static String pedirDatoString() {
        Scanner lectura = new Scanner(System.in);
        String stringEntrada = lectura.nextLine();
        return stringEntrada;
    }

}