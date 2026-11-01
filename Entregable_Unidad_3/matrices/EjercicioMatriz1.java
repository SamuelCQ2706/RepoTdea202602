import java.util.Scanner;

public class EjercicioMatriz1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int suma = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Ingrese valor para [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
                suma += matriz[i][j];
            }
        }

        System.out.println("Suma total de los elementos: " + suma);
        scanner.close();
    }
}
