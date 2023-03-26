package Ejercicio3;

public class Algoritmo3 {

    public static String decimalAHexadecimal(int decimal) {
        String caracteresHexadecimales = "0123456789ABCDEF";
        if (decimal == 0) {
            return "0";
        }
        String hexadecimal = "";
        while (decimal > 0) {
            int resto = decimal % 16;
            hexadecimal = caracteresHexadecimales.charAt(resto) + hexadecimal;
            decimal /= 16;
        }
        return hexadecimal;
    }

    public static String decimalABase(int decimal, int base) {
        if (decimal == 0) {
            return "0";
        }
        String resultado = "";
        while (decimal > 0) {
            int resto = decimal % base;
            resultado = resto + resultado;
            decimal /= base;
        }
        return resultado;
    }
    public static void main(String[] args) {

        int decimal = 123458;
        int base = 8;

        String hexadecimal = Algoritmo3.decimalAHexadecimal(decimal);
        String baseB = Algoritmo3.decimalABase(decimal, base);

        System.out.println(decimal + " en hexadecimal es: " + hexadecimal);
        System.out.println(decimal + " en base " + base + " es: " + baseB);
    }
}
