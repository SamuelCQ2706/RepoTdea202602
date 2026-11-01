import java.util.Random;

public class EjercicioMatriz4 {
    public static void main(String[] args) {
        int n = 4;
        int[][] matriz = new int[n][n];
        Random rand = new Random();
        int sumaDiagonal = 0;

        System.out.println("Matriz generada:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = rand.nextInt(50) + 1;
                System.out.print(matriz[i][j] + "\t");
                if (i == j) {
                    sumaDiagonal += matriz[i][j];
                }
            }
            System.out.println();
        }

        System.out.println("\nSuma de la diagonal principal: " + sumaDiagonal);
    }
}
