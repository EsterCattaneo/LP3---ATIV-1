package Aula07iii;
import java.util.ArrayList;
import java.util.Scanner;

public class MaiorMenorValor {

    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite uma lista de números inteiros (digite 'fim' para terminar):");
        
        while (true) {
            System.out.print("Digite um número: ");
            String input = scanner.nextLine();
            
            if (input.equalsIgnoreCase("fim")) {
                break;
            }
            try {
                int numero = Integer.parseInt(input);
                numeros.add(numero);
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Digite um número inteiro.");
            }
        }
        
        if (numeros.isEmpty()) {
            System.out.println("Nenhum número foi inserido.");
        } else {
            int maior = encontrarMaior(numeros);
            int menor = encontrarMenor(numeros);
            
            System.out.println("Maior valor: " + maior);
            System.out.println("Menor valor: " + menor);
        }
        
        scanner.close();
    }

    private static int encontrarMaior(ArrayList<Integer> lista) {
        int maior = lista.get(0);
        for (int numero : lista) {
            if (numero > maior) {
                maior = numero;
            }
        }
        return maior;
    }

    private static int encontrarMenor(ArrayList<Integer> lista) {
        int menor = lista.get(0);
        for (int numero : lista) {
            if (numero < menor) {
                menor = numero;
            }
        }
        return menor;
    }
}
