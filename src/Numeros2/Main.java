package Numeros2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Punto #18 - Crear un ArrayList con los valores 5, 10 y 15
        List<Numeros> lista = new ArrayList<Numeros>();
        lista.add(new Numeros(5));
        lista.add(new Numeros(10));
        lista.add(new Numeros(15));

        // Punto #11 - Duplicar los elementos de un ArrayList
        int tamano = lista.size();
        for (int i = 0; i < tamano; i++) {
            Numeros original = lista.get(i);
            Numeros duplicado = new Numeros(original.getNumeros() * 2);
            lista.add(duplicado);
        }
        // Punto #11 - Impresión
        System.out.println("Lista duplicada: ");
        for (Numeros numero : lista) {
            System.out.println(numero.getNumeros());
        }

        // Punto #12 - Eliminar todos los elementos de una lista
        lista.clear();
        System.out.println("Elementos de la lista: " + lista);
    }
}
