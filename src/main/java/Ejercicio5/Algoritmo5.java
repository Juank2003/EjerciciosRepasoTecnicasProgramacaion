package Ejercicio5;
import java.util.function.BiFunction;
import java.util.function.IntBinaryOperator;

public class Algoritmo5 {

    public static int mcdIterativo(int m, int n) {
        while (n != 0) {
            int r = m % n;
            m = n;
            n = r;
        }
        return m;
    }
    public static int mcdRecursivo(int m, int n) {
        if (n == 0) {
            return m;
        } else {
            return mcdRecursivo(n, m % n);
        }
    }

    public static int mcdLambda(int m, int n) {
        IntBinaryOperator f = (a, b) -> b == 0 ? a : mcdLambda(b, a % b);
        return f.applyAsInt(m, n);
    }

    public static void main(String[] args) {
        int m = 48;
        int n = 36;

        int mcd = mcdIterativo(m, n);
        System.out.printf("El MCD de %d y %d (iterativo) es: %d%n", m, n, mcd);

        mcd = mcdRecursivo(m, n);
        System.out.printf("El MCD de %d y %d (recursivo) es: %d%n", m, n, mcd);

        mcd = mcdLambda(m, n);
        System.out.printf("El MCD de %d y %d (lambda) es: %d%n", m, n, mcd);
    }
}

