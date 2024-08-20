package exercicios.array.collections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class ex7 {

	public static void main(String[] args) {
		List<String> items = new ArrayList<>();
        items.add("Melancia");
        items.add("Amora");
        items.add("Kiwi");

        Collections.sort(items);  // Ordena a lista
        System.out.println(items);  // Exibe a lista ordenada
	}

}
