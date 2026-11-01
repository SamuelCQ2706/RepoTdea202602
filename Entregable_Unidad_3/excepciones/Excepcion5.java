import java.util.InputMismatchException;
import java.util.Scanner;

public class Excepcion5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Ingrese un número entero: ");
            int num = scanner.nextInt();
            System.out.println("Número ingresado: " + num);
        } catch (InputMismatchException e) {
            System.out.println("Error: El dato ingresado no corresponde a un número entero.");
        } finally {
            scanner.close();
        }
    }
}
