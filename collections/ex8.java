package exercicios.array.collections;

import java.util.ArrayList;
import java.util.Collection;

public class ex8 {
    public static void main(String[] args) {
        // Criando uma coleção de números inteiros usando ArrayList
        Collection<Integer> numbers = new ArrayList<>();

        // Adicionando cinco números inteiros à coleção
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        // Exibindo o número total de elementos na coleção
        System.out.println("Total de números: " + numbers.size());
    }
}
