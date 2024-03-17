package br.edu.ifsp.cmp.tads.aula5;

import java.util.ArrayList;
import java.util.List;

public class Exercicio2 { //definição da classe
	
//2 Crie uma lista de strings que represente uma lista de compras.
//Adicione alguns itens à lista e, em seguida, use um loop para imprimir
//todos os items. Finalmente, remova um item da lista e imprima a lista
//novamente para verificar se o item foi removido.
	
public static void main(String[] args) { //método para o programa principal
		
		List<String> compras = new ArrayList<>(); //para adicionar itens na lista do tipo string
		
		compras.add("Maçã"); //adicionando elementos na lista
		compras.add("Banana");
		compras.add("Mamão");
		compras.add("Melancia");
		compras.add("Pão");
		
		for (String itens : compras) { //pegando cada elemento da lista de compras e criando a váriavel itens para guardar o valor dos elementos da lista
			System.out.println(itens);//printar os elementos da lista
		}
		System.out.println("Removendo item: " + compras ); //
		
		compras.remove(1); // removeu o segundo elemento da lista pelo indice da posição
		
		for(String itens : compras) {
			System.out.println(itens);
		}
}
}
