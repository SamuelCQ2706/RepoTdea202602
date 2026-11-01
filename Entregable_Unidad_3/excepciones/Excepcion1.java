public class Excepcion1 {
    public static void main(String[] args) {
        try {
            int resultado = 10 / 0;
            System.out.println(resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error: División por cero no permitida.");
        }
    }
}
