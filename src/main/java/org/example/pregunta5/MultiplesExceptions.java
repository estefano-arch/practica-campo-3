package org.example.pregunta5;
import java.util.Scanner;

class NumeroNegativoException extends Exception {
    public NumeroNegativoException(String mensaje) {
        super(mensaje);
    }
}
public class MultiplesExceptions {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Por favor, ingrese un número: ");
        String entrada = sc.nextLine();

        try {

            int numero = Integer.parseInt(entrada);
            if (numero < 0) {
                throw new NumeroNegativoException("No puede ingresar un número negativo.");
            }

            System.out.println(" Número válido ingresado: " + numero);
        }
        catch (NumberFormatException e) {
            System.out.println(" Error: La entrada no es un número entero válido.");
        }
        catch (NumeroNegativoException e) {
            System.out.println(" Error: " + e.getMessage());
        }

        sc.close();
    }


}
