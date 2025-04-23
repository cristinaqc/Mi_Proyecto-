public class Sumar {
    // Método para sumar dos números y verificar si la suma es par
    public static void sumarYComprobarPar(int numero1, int numero2) {
        int suma = numero1 + numero2; // Realizamos la suma
        boolean esPar = (suma % 2 == 0); // Comprobamos si la suma es par

        // Imprimimos el resultado
        System.out.println("La suma de " + numero1 + " y " + numero2 + " es: " + suma);
        System.out.println("¿La suma es un número par? " + (esPar ? "Sí" : "No"));
    }
}
