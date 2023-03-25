package Ejercicio1;

/*a) La función bisect (0,n) calcula la raíz cuadrada de 2 mediante el método de bisección
Es decir, encuentra un valor x tal que f(x) = x^2 - N = 0, con un margen de precisión de 1e-6.
Si cambiamos el valor de N, estaríamos calculando la raíz cuadrada de ese nuevo valor N.
Si cambiamos la función f(x), estaríamos calculando la raíz de la ecuación definida por la nueva función.

 */

import java.util.Scanner;

public class Algortimo1 {

    private static final double PREC = 1e-6;

    private static double f(double x, double n) {
        return x*x - n;
    }

    private static double bisect(double min, double max, double n) {
        double med = (min + max) / 2;
        while (max - min >= PREC) {
            med = (min + max) / 2;
            if (f(min, n) * f(med, n) < 0) {
                max = med;
            } else {
                min = med;
            }
        }
        return med;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un valor para N: ");
        double n = sc.nextDouble();
        double raiz = bisect(0, n, n);
        System.out.printf("La raíz cuadrada de %f es aproximadamente %f\n", n, raiz);
    }
}