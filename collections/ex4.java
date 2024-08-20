package exercicios.array.collections;
import java.util.Stack;

public class ex4 {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();
        stack.push("Element 1");
        stack.push("Element 2");
        stack.push("Element 3");

        System.out.println("Top of the stack: " + stack.peek());  // Exibe o topo da pilha: "Element 3"
        System.out.println("Popped from stack: " + stack.pop());  // Remove e exibe "Element 3"
	}

}
