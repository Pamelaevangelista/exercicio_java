//Iterator: Um Iterator é uma interface que permite percorrer uma coleção
//de forma sequencial sem expor sua estrutura interna.

import java.util.ArrayList;
import java.util.Iterator;

public class ExemploInterator {

    public static void main(String[] args) {
        ArrayList<String> frutas = new ArrayList<>();
        frutas.add("Maçã");
        frutas.add("Banana");

        Iterator<String> iterator = frutas.iterator();

        while (iterator.hasNext()) {
            String fruta = iterator.next();
            System.out.println(fruta);
        }
    }
}