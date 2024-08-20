package exercicios.array.collections;
import java.util.LinkedList;

public class ex5 {

	public static void main(String[] args) {
		LinkedList <String> list = new LinkedList<>();
        list.add("Elemento 1");
        list.add("Elemento 2");
        list.addFirst("Elemento 3");  // Adiciona ao início da lista

        System.out.println(list);  // Exibe a lista: [Element 0, Element A, Element B]
	}

}
