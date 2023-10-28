package Cadenas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args){

        List<String> lista = new ArrayList<String>();
        lista.add("Millonarios");
        lista.add("un");
        lista.add("amor");
        lista.add("eterno");

        // Lista original
        System.out.println("Lista: " + lista);

        // Punto #14 - Convertir un ArrayList de cadenas en un Array
        String[] array = lista.toArray(new String[0]);
        System.out.println("El array de cadenas es: " + Arrays.toString(array));

        // Punto #16 - Mostrar el primer elemento de la lista
        System.out.println("El elemento en la primera posición es: " + lista.get(0));

        // Punto #17 - Mostrar el último elemento de la lista
        System.out.println("El elemento en la última posición es: " + lista.get(3));

        // Punto #19 - Cambiar todos los elementos de la lista por "Hola"
        for (int i = 0; i < lista.size(); i++){
            lista.set(i, "Hola");
        }
        System.out.println("Lista nueva: " + lista);
    }
}

