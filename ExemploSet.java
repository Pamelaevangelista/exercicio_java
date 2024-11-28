//Um Set é uma coleção que não permite elementos duplicados.
//Ele é usado quando você deseja garantir que cada elemento seja único e
//não garante ordem específica

import java.util.HashSet;
import java.util.Set;

public class ExemploSet {

    public static void main(String[] args) {
        Set<String> frutas = new HashSet<>();
        frutas.add("Maçã");
        frutas.add("Banana");
        frutas.add("Laranja");
        frutas.add("Banana"); // Duplicata ignorada

        System.out.println("Frutas no conjunto: " + frutas); // Ordem não garantida
    }
}