public class Excepcion4 {
    public static void main(String[] args) {
        String cadena = null;
        try {
            System.out.println(cadena.length());
        } catch (NullPointerException e) {
            System.out.println("Error: Referencia nula.");
        }
    }
}
