
package practicacampo_yazmin;


import java.util.ArrayList;

public class Ejercicio3 {
    public static void main(String[] args) {
        // Crear una lista  de tipo String para almacenar nombres
        ArrayList<String> nombres = new ArrayList<>();
        
        // Agregar elementos a la lista
        nombres.add("Yazmin");
        nombres.add("Juan");
        nombres.add("Pepe");
        nombres.add("Carmen");
        nombres.add("Maria");
        
        // Mostrar lista completa
        System.out.println("Lista de nombres");
        for (int i = 0; i < nombres.size(); i++) {
            System.out.println(nombres.get(i));
        }
        
        // Eliminar un elemento de la lista
        nombres.remove(2);
        
        // Mostrar lista actualizada después de eliminar
        System.out.println("\nNueva lista de nombres");
        for (int i = 0; i < nombres.size(); i++) {
            System.out.println(nombres.get(i));
        }
    }
}
