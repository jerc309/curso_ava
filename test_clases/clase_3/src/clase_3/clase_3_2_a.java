package clase_3;

public class clase_3_2_a {
    public static void main(String args[]) {
        // Genere una clase que tenga los métodos para realizar la codificación y
        // decodificación
        // de un string, dado un número de desplazamiento.
        // ● Por ejemplo, con desplazo de 1:
        // “hola que tal” -> “ipmbarvfaubm”
        // h -> i
        // o -> p
        // En el ejemplo estoy usando este abecedario: "abcdefghijklmnñopqrstuvwxyz "
        System.out.println("2-a Codificar con desplazamiento de 1");
        String texto = "hola que tal";
        System.out.println("\tTexto a codificar: " + "\t\"" + texto + "\"");
        String arrayTexto[] = texto.split("");
        String arrayCode[] = new String[arrayTexto.length];
        String abcdedario = " abcdefghijklmnñopqrstuvwxyz";
        String array[] = abcdedario.split("");
        int contador = 0;
        for (int y = 0; y < arrayTexto.length; y++) {
            for (int x = 0; x < array.length; x++) {
                String yy = arrayTexto[y];
                String xx = array[x];
                if (yy.equals(xx)) {
                    if (yy.equals("z")) {
                        arrayCode[contador] = "z";
                        contador++;

                    } else {
                        arrayCode[contador] = array[x + 1];
                        contador++;
                    }

                }

            }

        }
        String codificado = "";
        for (int z = 0; z < arrayCode.length; z++) {
            codificado = codificado + String.valueOf(arrayCode[z]);

        }
        System.out.println("\tTexto Codificado: \t" + codificado);
        // Decodificando
        String texto2 = codificado;
        System.out.println("\tTexto a Decodificar: " + "\t\"" + texto2 + "\"");
        String arrayTexto2[] = texto2.split("");
        String arrayCode2[] = new String[arrayTexto2.length];
        String array2[] = abcdedario.split("");
        int contador2 = 0;
        for (int y = 0; y < arrayTexto2.length; y++) {
            for (int x = 0; x < array2.length; x++) {
                String yy = arrayTexto2[y];
                String xx = array2[x];
                if (yy.equals(xx)) {
                    if (yy.equals("z")) {
                        arrayCode2[contador2] = "z";
                        contador2++;

                    } else {
                        arrayCode2[contador2] = array2[x - 1];
                        contador2++;
                    }

                }

            }

        }
        String decodificado = "";
        for (int z = 0; z < arrayCode2.length; z++) {
            decodificado = decodificado + String.valueOf(arrayCode2[z]);

        }
        System.out.println("\tTexto Decodificado: \t" + decodificado);

    }

}
