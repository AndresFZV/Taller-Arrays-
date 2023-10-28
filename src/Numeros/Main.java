package Numeros;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<Numeros> lista = new ArrayList<Numeros>();
        lista.add(new Numeros(1));
        lista.add(new Numeros(2));
        lista.add(new Numeros(3));
        lista.add(new Numeros(4));
        lista.add(new Numeros(5));
        lista.add(new Numeros(6));
        lista.add(new Numeros(7));
        lista.add(new Numeros(8));
        lista.add(new Numeros(9));
        lista.add(new Numeros(10));

        // Punto #10 - Lista original
        System.out.print("Lista original: ");
        for (Numeros numero : lista) {
            System.out.print(numero.getNumeros() + " ");
        }
        System.out.println();

        // Punto #3 - Encontrar el número mayor e imprimirlo
        int mayor = 0;
        for(int i = 0; i < lista.size(); i++){
            if(lista.get(i).getNumeros() >= mayor) {
                mayor = lista.get(i).getNumeros();
            }
        }
        System.out.println("El número mayor es: " + mayor);

        // Punto #5 - Mostrar el tercer elemento de la lista
        System.out.println("El tercer número de la lista es: " + lista.get(2).getNumeros());

        // Punto #4 - Eliminar todos los números pares
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getNumeros() % 2 == 0) {
                lista.remove(i);
                i--;
            }
        }
        // Punto #4 - Impresión de la lista final
        System.out.print("Lista impar: ");
        for(Numeros numero : lista){
            System.out.print(numero.getNumeros() + " ");
        }
        System.out.println();
    }
}

