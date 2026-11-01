import java.util.Scanner;

public class EjercicioMatriz3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][4];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Valor para [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        System.out.println("\nSuma por Filas:");
        for (int i = 0; i < 3; i++) {
            int sumaFila = 0;
            for (int j = 0; j < 4; j++) {
                sumaFila += matriz[i][j];
            }
            System.out.println("Fila " + i + ": " + sumaFila);
        }

        System.out.println("\nSuma por Columnas:");
        for (int j = 0; j < 4; j++) {
            int sumaCol = 0;
            for (int i = 0; i < 3; i++) {
                sumaCol += matriz[i][j];
            }
            System.out.println("Columna " + j + ": " + sumaCol);
        }
        scanner.close();
    }
}
