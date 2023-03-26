package Ejercicio2;

/* La llamada a la función f(x,2) muestra todos los factores primos del número x.
El nombre más adecuado para la función f podría ser "imprimirFactoresPrimos".
 */

import java.util.function.IntConsumer;
import java.util.function.IntUnaryOperator;

public class Algoritmo2 {
    public static void imprimirFactoresPrimosIterativo(int num) {
        int div = 2;
        while (num > 1) {
            if (num % div == 0) {
                System.out.println(div);
                num /= div;
            } else {
                div++;
            }
        }
    }
    public static void imprimirFactoresPrimosLambda(int num) {
        IntConsumer imprimir = div -> {
            int auxNum = 0;
            while (auxNum % div == 0) {
                System.out.println(div);
                auxNum /= div;
            }
        };
        IntUnaryOperator siguienteDiv = div -> div == 2 ? 3 : div + 2;
        int div = 2;
        int auxNum = num; // Creamos una variable auxiliar para no modificar num directamente
        while (auxNum > 1) {
            if (auxNum % div == 0) {
                imprimir.accept(div);
                auxNum /= div;
            } else {
                div = siguienteDiv.applyAsInt(div);
            }
        }
    }
    public static void main(String[] args) {
        int num = 4;
        System.out.println("Factores primos de " + num + " utilizando el método iterativo:");
        Algoritmo2.imprimirFactoresPrimosIterativo(num);
        System.out.println("Factores primos de " + num + " utilizando el método lambda:");
        Algoritmo2.imprimirFactoresPrimosLambda(num);
    }
}
