//Para percorrer os elementos de uma coleção de forma prática,usamos a 
//instrução foreach que permite acessar cada item individualmente.

import java.util.Arrays;
import java.util.List;

public class ExemploForEach {
    public static void main(String[] args) {
        //Criação da lista da frutas 
        List<String> frutas = Arrays.asList("Maçã", "Banana", "Laranja");

        // Uso do forEach para imprimir cada fruta 
        frutas.forEach(fruta -> System.out.println(fruta));
    }
}