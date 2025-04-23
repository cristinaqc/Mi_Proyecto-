import java.util.Scanner;

public class MiAppJava {
    public static void main(String[] args) {
        System.out.println("Hello, MiAppJava!");

        // Código para multiplicar
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número para multiplicar: ");
        int numero = scanner.nextInt();

        System.out.println("Tabla de multiplicar de " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }

        // Uso de la clase Sumar
        System.out.print("Introduce el primer número para sumar: ");
        int numero1 = scanner.nextInt();
        System.out.print("Introduce el segundo número para sumar: ");
        int numero2 = scanner.nextInt();

        // Llamada a la función de la clase Sumar
        Sumar.sumarYComprobarPar(numero1, numero2);

        System.out.println("¡Cuenta realizada!");
        scanner.close();
    }
}
