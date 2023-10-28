package Nombres;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Nombres> lista = new ArrayList<Nombres>();
        lista.add(new Nombres("John"));
        lista.add(new Nombres("Juan"));
        lista.add(new Nombres("Stiven"));
        lista.add(new Nombres("Andres"));
        lista.add(new Nombres("Santiago"));
        lista.add(new Nombres("Amerika"));
        lista.add(new Nombres("David"));
        lista.add(new Nombres("Steban"));

        // Lista de nombres iniciales
        System.out.print("Lista original: ");
        for (Nombres nombres : lista) {
            System.out.print(nombres.getNombre() + ", ");
        }
        System.out.println();

        // Punto #6 - Cambiar el segundo nombre por "Ana"
        for (Nombres segundo : lista) {
            if (segundo.getNombre().equals("Juan")) {
                segundo.setNombre("Ana");
            }
        }
        // Punto #6 - Impresión del segundo nombre
        System.out.print("Lista con Ana: ");
        for (Nombres nombre : lista) {
            System.out.print(nombre.getNombre() + ", ");
        }
        System.out.println();

        // Punto #7 - Eliminar el primer nombre
        if(!lista.isEmpty()){
            lista.remove(0);
        }
        // Punto #7 - Lista actualizada
        System.out.print("Lista sin el primer nombre: ");
        for (Nombres nombre : lista) {
            System.out.print(nombre.getNombre() + ", ");
        }
        System.out.println();
      
        // Punto #9 - Verificar si el nombre "Carlos" se encuentra en la lista
        boolean verificar = false;
        for (Nombres veri : lista){
            if(veri.getNombre().equals("Carlos")){
                verificar = true;
                break;
            }
        }
        if(verificar){
            System.out.println("El nombre de Carlos si esta en la lista");
        }else{
            System.out.println("El nombre de Carlos no esta en la lista");
        }

        // Punto #13 - Añadir el nombre "Pedro" en la segunda posición
        for (Nombres segundo : lista) {
            if (segundo.getNombre().equals("Stiven")) {
                segundo.setNombre("Pedro");
            }
        }
        // Punto #13 - Impresión del segundo nombre
        System.out.print("Lista con Pedro: ");
        for (Nombres nombre : lista) {
            System.out.print(nombre.getNombre() + ", ");
        }
        System.out.println();

        // Punto #15 - Ordenar la lista alfabeticamente
        Collections.sort(lista, new Comparator<Nombres>() {
            @Override
            public int compare(Nombres nombre1, Nombres nombre2){
                return nombre1.getNombre().compareTo(nombre2.getNombre());
            }
        });
        // Punto #15 - Lista organizada alfabeticamente
        System.out.println("Lista organizada alfabeticamente: ");
        for (Nombres alfabeto : lista) {
            System.out.println(alfabeto.getNombre());
        }
    }
}

