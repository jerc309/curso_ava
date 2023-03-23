package clase_4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class clase_4_2 {

    public static void main(String args[]) throws IOException {
        // 2. Haga una main donde por parámetro envíe la ruta de un archivo. Ese archivo
        // debe
        // contener números. El programa debe escribir por consola la suma de esos
        // números
        // a. Al programa anterior agreguele un parámetro para que la operación pueda
        // ser
        // suma o multiplicación
        String archivo = "C:\\Users\\johann\\Downloads\\ejercicio4_2.txt";
        Path pathToFile = Paths.get(archivo);
        System.out.println("Path: " + archivo);
        int sumatoria = 0;
        boolean suma = false;
        String operacion = "";
        for (String linea : Files.readAllLines(pathToFile)) {
            System.out.println(linea);
            if (suma = true) {
                sumatoria = sumatoria + Integer.parseInt(linea);

            } else {
                sumatoria = sumatoria * Integer.parseInt(linea);

            }

        }
        if (suma = true) {
            System.out.println("La sumatoria es :" + sumatoria);
        } else {
            System.out.println("La multiplicaion es :" + sumatoria);
        }
    }
}
