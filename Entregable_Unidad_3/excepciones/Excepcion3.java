public class Excepcion3 {
    public static void main(String[] args) {
        String texto = "abc";
        try {
            int numero = Integer.parseInt(texto);
            System.out.println(numero);
        } catch (NumberFormatException e) {
            System.out.println("Error: Formato numérico inválido.");
        }
    }
}
