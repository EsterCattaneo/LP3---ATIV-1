package exercicios.array.collections;
import java.util.Arrays;

public class ex1 {

    public static void main(String[] args) {
        String[] flores = {"Tulipas", "Rosas", "Margaridas", "Girassóis"};

        // Ordena o array
        Arrays.sort(flores);

        // Exibe o array ordenado
        System.out.println("Array ordenado:");
        for (String flor : flores) {
            System.out.println(flor);
        }

        // Busca binária pelo elemento "Tulipas"
        int index = Arrays.binarySearch(flores, "Tulipas");

        // Exibe o índice de "Tulipas"
        System.out.println("Index de Tulipas (ordem alfabética): " + index);
    }
}
