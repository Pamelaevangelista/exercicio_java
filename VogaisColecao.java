//Quando precisar verificar a existência de certos elementos dentro de uma
//coleção, é possível fazer isso através do método contains.
import java.util.ArrayList;
import java.util.Collection;

public class VogaisColecao {

    public static void main(String[] args) {
        Collection<String> vogais = new ArrayList<>();
        vogais.add("A");
        vogais.add("E");
        vogais.add("I");
        vogais.add("O");
        vogais.add("U");

        System.out.println("Contém a vogal I ? "+vogais.contains("I"));
        System.out.println("Lista das vogais: "+vogais);

    }
}