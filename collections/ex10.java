package exercicios.array.collections;
import java.util.LinkedHashSet;
import java.util.Set;

public class ex10 {

	public static void main(String[] args) {
		Set<String> frutas = new LinkedHashSet<>();  // Cria um conjunto de Strings com ordem de inserção preservada
		frutas.add("Banana");  
		frutas.add("Mamão"); 
		frutas.add("Melancia"); 
		frutas.add("Mamão");  

        System.out.println(frutas);
	}

}
