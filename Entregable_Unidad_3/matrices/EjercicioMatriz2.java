import java.util.Scanner;

public class EjercicioMatriz2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] original = new int[4][4];
        int[][] transpuesta = new int[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Ingrese valor para [" + i + "][" + j + "]: ");
                original[i][j] = scanner.nextInt();
                transpuesta[j][i] = original[i][j];
            }
        }

        System.out.println("\nMatriz Original:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(original[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("\nMatriz Transpuesta:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(transpuesta[i][j] + "\t");
            }
            System.out.println();
        }
        scanner.close();
    }
}
