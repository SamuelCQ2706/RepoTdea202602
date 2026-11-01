import java.util.Scanner;

public class EjercicioVector5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] estudiantes = new String[5];
        double[] notas = new double[5];
        double suma = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Nombre del estudiante " + (i + 1) + ": ");
            estudiantes[i] = scanner.nextLine();
            System.out.print("Nota final de " + estudiantes[i] + ": ");
            notas[i] = Double.parseDouble(scanner.nextLine());
            suma += notas[i];
        }

        double promedio = suma / 5;
        System.out.println("\nPromedio general: " + promedio);
        System.out.println("Estudiantes con nota mayor o igual al promedio:");

        for (int i = 0; i < 5; i++) {
            if (notas[i] >= promedio) {
                System.out.println("- " + estudiantes[i] + " (" + notas[i] + ")");
            }
        }
        scanner.close();
    }
}
