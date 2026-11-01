import java.util.Scanner;

public class EjercicioVector4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] paises = {"Colombia", "Argentina", "Brasil", "Perú", "Chile", "México", "España", "Francia", "Italia", "Alemania"};

        System.out.print("Ingrese el país a buscar: ");
        String buscado = scanner.nextLine();

        int indice = -1;
        for (int i = 0; i < paises.length; i++) {
            if (paises[i].equalsIgnoreCase(buscado)) {
                indice = i;
                break;
            }
        }

        if (indice != -1) {
            System.out.println("El país " + buscado + " se encuentra en el índice " + indice);
        } else {
            System.out.println("El país " + buscado + " no se encuentra en el arreglo.");
        }
        scanner.close();
    }
}
