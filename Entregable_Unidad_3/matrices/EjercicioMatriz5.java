import java.util.Scanner;

public class EjercicioMatriz5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Valor para [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        System.out.print("\nIngrese el número a buscar: ");
        int buscado = scanner.nextInt();
        boolean encontrado = false;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (matriz[i][j] == buscado) {
                    System.out.println("Encontrado en coordenada: [" + i + "][" + j + "]");
                    encontrado = true;
                }
            }
        }

        if (!encontrado) {
            System.out.println("El número no se encuentra en ninguna posición.");
        }
        scanner.close();
    }
}
