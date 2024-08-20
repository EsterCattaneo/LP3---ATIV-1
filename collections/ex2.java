package exercicios.array.collections;
import java.util.ArrayDeque;
import java.util.Deque;

public class ex2 {

    public static void main(String[] args) {
        // Criando uma fila usando ArrayDeque
        Deque<String> fila = new ArrayDeque<>();

        // Adicionando três elementos à fila (inserir no final)
        fila.add("Elemento 1");
        fila.add("Elemento 2");
        fila.add("Elemento 3");

        // Removendo e exibindo o primeiro elemento inserido (remover do início)
        System.out.println("Removido: " + fila.poll());
    }
}
