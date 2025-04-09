import java.util.Scanner;

public class MiAppJava {
    public static void main(String[] args) {
        System.out.println("Hello, MiAppJava!");

        // Código adicional: tabla de multiplicar
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int numero = scanner.nextInt();

        System.out.println("Tabla de multiplicar de " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }

        //cálculo de la suma
        int suma = 0;
        for (int i = 1; i <= numero; i++) {
            suma += i; // Sumamos todos los números hasta el indicado
        }
        System.out.println("La suma de todos los números hasta " + numero + " es: " + suma);

        System.out.println("Bye, MiAppJava!");
        scanner.close();
    }
}