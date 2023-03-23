/*Utilizando la sentencia while, imprima todos los números entre 2 variables “a”
y “b”. Su código puede arrancar (por ejemplo):
int numeroInicio = 5;
int numeroFin = 14;
// Se deberían mostrar los números:
5,6,7,8,9,10,11,12,13,14 */
package CLASE1;
import java.util.Scanner;
public class ejercicio_1_clase_1 {
    public static void main(String args[]) {
        System.out.println("Ejercicaio 1-");
        int numeroInicio = 5;
        int numeroFin = 14;
        int numeroPar = 0;
        System.out.println("a-Numeros entre " + numeroInicio + " y " + numeroFin);
        while (numeroInicio<=numeroFin) {
            System.out.println("Numero= " + numeroInicio);
            numeroInicio= numeroInicio +1;

        }
        // b. A lo anterior, solo muestre los números pares
        numeroInicio = 5;
        numeroFin = 14;
        numeroPar = 0;
        System.out.println("b-Numeros pares entre " + numeroInicio + " y " + numeroFin); 
        while (numeroInicio<=numeroFin) {
            numeroPar= numeroInicio%2;
            if (numeroPar==0) {
                System.out.println("Numero= " + numeroInicio);               
            }
            numeroInicio= numeroInicio +1;
        }
        // c. A lo anterior, con una variable extra, elija si se deben mostrar los números
        // pares o impares
        Scanner lectura = new Scanner (System.in);
        numeroInicio = 5;
        numeroFin = 14;
        numeroPar = 0;
        System.out.println("c-Ingrese: ");
        System.out.println("-\"a\" para mostrar los numeros pares ");
        System.out.println("-\"b\" para mostrar los numeros inpares ");
        System.out.println("entre los numeros " + numeroInicio + " y " + numeroFin + ":" ); 
        String tipo = lectura.next();
        char tipos  = tipo.charAt(0);
        while (numeroInicio<=numeroFin) {
            numeroPar= numeroInicio%2;
            if (numeroPar==0 && tipos=='a') {
                System.out.println("Numero= " + numeroInicio);               
            }
            if (numeroPar==1 && tipos=='b') {
                System.out.println("Numero= " + numeroInicio);               
            }
            numeroInicio= numeroInicio +1;
        }
        // d. Utilizando la sentencia for, hacer lo mismo que en (b) pero invirtiendo el orden
        numeroInicio = 5;
        numeroFin = 14;
        System.out.println("d-Numeros pares entre " + numeroFin + " y " + numeroInicio);
        for(int otroNum=numeroFin;otroNum>=numeroInicio;otroNum--){
            numeroPar= numeroFin%2;
            if (numeroPar==0) {
                System.out.println("Numero= " + numeroFin);               
            }
            numeroFin= numeroFin -1;
        }
}
            
}

