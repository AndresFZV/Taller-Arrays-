package ArraysVacios;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Punto #20 - Listas vacíos
        List<Lista> lista = new ArrayList<>();

        Lista lista1 = new Lista();
        Lista lista2 = new Lista();
        Lista lista3 = new Lista();

        lista.add(lista1);
        lista.add(lista2);
        lista.add(lista3);

        // Punto #20 - Verificar si el Array esta lleno o no
        for (Lista listica : lista) {
            if (listica.getVacio()) {
                System.out.println("Los Arrays estan vacios.");
            } else {
                System.out.println("Los Arrays no estan vacios.");
            }
        }
    }
}



