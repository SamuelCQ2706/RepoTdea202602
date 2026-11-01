public class Excepcion2 {
    public static void main(String[] args) {
        int[] arreglo = {1, 2, 3};
        try {
            System.out.println(arreglo[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Índice fuera de los límites del arreglo.");
        }
    }
}
