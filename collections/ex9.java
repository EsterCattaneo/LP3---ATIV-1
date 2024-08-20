package exercicios.array.collections;
import java.util.ArrayList;
import java.util.List;

public class ex9 {

	public static void main(String[] args) {
		List<String> cores = new ArrayList<>();  // Cria uma lista de Strings
		cores.add("Rosa");  
		cores.add("Amarelo");  
		cores.add("Verde"); 

        System.out.println("Cor no índice 2: " + cores.get(2));  

	}

}
