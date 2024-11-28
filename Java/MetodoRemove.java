
import java.util.Collection;
import java.util.ArrayList;

public class MetodoRemove {
    public static void main(String[] args) {
        // Criação de uma coleção de Strings
        Collection<Integer> fila = new ArrayList<>(); 
        fila.add(255);
        fila.add(312);
        fila.add(883);
        fila.add(122);
        fila.add(9);

        System.out.println("Valores da fila: " +fila);

        fila.remove(312); // Remove objeto 312

        System.out.println("Valores atualizados da fila:"+fila);
    }
}
