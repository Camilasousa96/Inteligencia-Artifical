import java.util.HashSet;
import java.util.Set;

public class ExemploSet {
    public static void main(String[] args) {
        // Criação de uma coleção de Strings
        Set<String> frutas = new HashSet<>(); 
        frutas.add("Maçã");
        frutas.add("Banana");
        frutas.add("Laranja");
        frutas.add("Banana");

        System.out.println("Frutas no conjunto: " + frutas); // Ordem não garantida
    }
}

