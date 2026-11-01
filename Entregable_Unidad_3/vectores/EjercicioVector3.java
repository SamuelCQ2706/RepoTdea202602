import java.util.Scanner;

public class EjercicioVector3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vector = new int[6];

        for (int i = 0; i < vector.length; i++) {
            System.out.print("Ingrese el elemento " + (i + 1) + ": ");
            vector[i] = scanner.nextInt();
        }

        for (int i = 0; i < vector.length / 2; i++) {
            int aux = vector[i];
            vector[i] = vector[vector.length - 1 - i];
            vector[vector.length - 1 - i] = aux;
        }

        System.out.print("Vector invertido: ");
        for (int num : vector) {
            System.out.print(num + " ");
        }
        System.out.println();
        scanner.close();
    }
}
