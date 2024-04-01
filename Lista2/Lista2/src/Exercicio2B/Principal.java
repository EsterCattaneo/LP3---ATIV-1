package Exercicio2B;

public class Principal {
	public static void main(String[] args) {
		Estudante ester = new Estudante("Ester", 19, 7);
		boolean situacao = ester.aprovado();
		if(situacao) {
			System.out.print("Aluna foi aprovada!");
		}
		else {
			System.out.print("Aluno foi reprovado!");
		}
	}
}
