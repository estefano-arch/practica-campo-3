
package pregunta5;

// ExcepcionesMultiples.java
import java.util.Scanner;

// Excepción personalizada
class NumeroNegativoException extends Exception {
    public NumeroNegativoException(String mensaje) {
        super(mensaje);
    }
}

public class ExcepcionesMultiples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Ingrese un número entero: ");
            String entrada = sc.nextLine();

            int numero = Integer.parseInt(entrada); // Puede lanzar NumberFormatException

            if (numero < 0) {
                throw new NumeroNegativoException("Error: el número no puede ser negativo.");
            }

            System.out.println("Número ingresado correctamente: " + numero);

        } catch (NumberFormatException e) {
            System.out.println("Error: debe ingresar un valor numérico.");
        } catch (NumeroNegativoException e) {
            System.out.println(e.getMessage());
        }
    }
}
