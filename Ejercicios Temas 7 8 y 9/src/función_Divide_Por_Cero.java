// Crea una función DividePorCero. Esta, debe generar una excepción ("throws") a su llamante del tipo ArithmeticException
// que será capturada por su llamante (desde "main", por ejemplo). Si se dispara la excepción, mostraremos el mensaje "Esto
// no puede hacerse". Finalmente, mostraremos en cualquier caso: "Demo de código".

public class función_Divide_Por_Cero {
    public static void divideporcero() throws ArithmeticException {
        throw new ArithmeticException("No se puede dividir por cero");
    }

    public static void main(String[] args){
        try {
            divideporcero();
        } catch (ArithmeticException e) {
            System.out.println("Esto no se puede hacerse");
        } finally {
            System.out.println("Demo de código");
        }
    }
}
