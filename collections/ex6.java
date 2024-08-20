package exercicios.array.collections;
import java.util.ArrayList;
import java.util.List;

public class ex6 {

	public static void main(String[] args) {
		List<String> items = new ArrayList<>();
        items.add("Item 1");
        items.add("Item 2");

        for (String item : items) {
            System.out.println(item);
        }

	}

}
