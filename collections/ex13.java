package exercicios.array.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// Classe Produto que implementa Comparable para ordenar por preço
class Produto implements Comparable<Produto> {
    String nome;
    double preco;

    Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public int compareTo(Produto outro) {
        return Double.compare(this.preco, outro.preco);  // Ordena por preço
    }

    @Override
    public String toString() {
        return nome + " - " + preco;
    }
}

// Comparator para ordenar produtos por nome
class NomeComparator implements Comparator<Produto> {
    @Override
    public int compare(Produto p1, Produto p2) {
        return p1.nome.compareTo(p2.nome);  // Compara os nomes para ordenar os produtos
    }
}

public class ex13 {

    public static void main(String[] args) {
        // Criando uma lista de produtos
        List<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto("Produto A", 30.50));
        produtos.add(new Produto("Produto C", 25.75));
        produtos.add(new Produto("Produto B", 40.20));

        // Ordenando a lista de produtos por preço
        Collections.sort(produtos);
        System.out.println("Produtos ordenados por preço:");
        System.out.println(produtos);

        // Ordenando a lista de produtos por nome
        Collections.sort(produtos, new NomeComparator());
        System.out.println("\nProdutos ordenados por nome:");
        System.out.println(produtos);
    }
}
