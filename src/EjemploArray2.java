import java.util.ArrayList;

public class EjemploArray2 { // Punto #2 - Ejemplo de isEmpty
    public static void main(String[] args) {
        
        ArrayList<String> lista = new ArrayList<>();
        
        // Punto #8 - Verificar si un ArrayList esta vacío
        if (lista.isEmpty()) {
            System.out.println("El ArrayList está vacío.");
        } else {
            System.out.println("El ArrayList tiene elementos.");
        }
        
        lista.add("Muñeca");
        lista.add("Carro");
        lista.add("Balón");

        System.out.println("Lista: " + lista);
       
        // Punto #8 - Verificar si un ArrayList esta vacío
        if (lista.isEmpty()) {
            System.out.println("El ArrayList está vacío.");
        } else {
            System.out.println("El ArrayList tiene elementos.");
        }
    }
}
