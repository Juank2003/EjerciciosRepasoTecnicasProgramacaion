package Ejercicio4;

public class Algoritmo4 {
    public static boolean palindromoRecursivo(String cadena) {
        if (cadena.length() == 0 || cadena.length() == 1) {
            return true;
        }
        if (cadena.charAt(0) == cadena.charAt(cadena.length() - 1)) {
            return palindromoRecursivo(cadena.substring(1, cadena.length() - 1));
        }
        else {
            return false;
        }
    }

    public static boolean palindromoIterativo(String cadena) {
        int i = 0;
        int j = cadena.length() - 1;
        while (i < j) {
            if (cadena.charAt(i) != cadena.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        String palabra1 = "DABALEARROZALAZORRAELABAD";
        String palabra2 = "MUNDO";
        System.out.println("Forma iterativa:");
        System.out.println(palabra1 + " es palíndromo: " + palindromoIterativo(palabra1));
        System.out.println(palabra2 + " es palíndromo: " + palindromoIterativo(palabra2));

        System.out.println("Forma recursiva:");
        System.out.println(palabra1 + " es palíndromo: " + palindromoRecursivo(palabra1));
        System.out.println(palabra2 + " es palíndromo: " + palindromoRecursivo(palabra2));
    }
}
