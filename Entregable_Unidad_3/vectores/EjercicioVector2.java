import java.util.Scanner;

public class EjercicioVector2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numeros = new double[8];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese el número decimal " + (i + 1) + ": ");
            numeros[i] = scanner.nextDouble();
        }

        double mayor = numeros[0];
        double menor = numeros[0];
        int posMayor = 0;
        int posMenor = 0;

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
                posMayor = i;
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
                posMenor = i;
            }
        }

        System.out.println("Mayor: " + mayor + " en el índice " + posMayor);
        System.out.println("Menor: " + menor + " en el índice " + posMenor);
        scanner.close();
    }
}
