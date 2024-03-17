package br.edu.ifsp.cmp.tads.aula5;

import br.edu.ifsp.cmp.tads.ex3.Arvore;
import br.edu.ifsp.cmp.tads.ex3.Flor;
import br.edu.ifsp.cmp.tads.ex3.Planta;

//3- Crie uma classe Planta com um método fotossintese(). Em seguida, crie
//duas classes, Flor e Arvore que herdam de Planta e sobrescrevem o
//metodo fotossintese().

public class Exercicio3 {
	public static void main(String[] args) {
		
		Arvore arvore = new Arvore();
		Planta planta = new Planta();
		Flor flor = new Flor();
		
		flor.fotossintese();
		arvore.fotossintese();
		planta.fotossintese();
	}

}
