package exercicios.array.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ex12 {

    public static void main(String[] args) {
        // Criando uma lista de números inteiros
        List<Integer> numbers = new ArrayList<>();

        // Adicionando números inteiros à lista
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        // Obtendo um iterador para a lista
        Iterator<Integer> iterator = numbers.iterator();

        // Percorrendo a lista e exibindo cada número
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
