package Exercicio2B;

public class Estudante {
	private String nome;
	private int idade;
	private double nota;
	
	Estudante(String nome, int idade, double nota){
		this.nome = nome;
		this.idade = idade;
		this.nota = nota;
	}
	
	public Estudante () {
		
	}
	public Estudante (String nome) {
		this.nome = nome;
		
	}
	public Estudante (String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
		
	}
	public boolean aprovado() {
		if(nota > 10) {
			System.out.print("Nota inválida\n");
		}
		else if(nota > 7) {
			return true;
		}
		else {
			return false;
		}
	}

}
