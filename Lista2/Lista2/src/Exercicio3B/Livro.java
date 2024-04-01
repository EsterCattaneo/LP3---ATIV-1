package Exercicio3B;

public class Livro {
	private String autor;
	private int anoPublicacao;
	private String titulo;
	
	public Livro(String autor, int anoPubicacao, String titulo) {
		this.autor = autor;
		this.anoPublicacao = anoPublicacao;
		this.titulo = titulo;
	}
	
	public void imprimirDetalhes() {
		
	}
	public void setAutor(String autor) {
		this.autor = autor;
		
	}
	public String getAutor() {
		return autor;
	}
	public void setAnoPublicacao(String anoPublicacao)
	{
		this.anoPublicacao = anoPublicacao;
	}
	public int getAnoPublicacao() {
		return anoPublicacao;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getTitulo() {
		return titulo;
	}
	public void imprimirDetalhes() {
		System.out.println("Titulo: " + getTitulo());
		System.out.println("Autor: " + getAutor());
		System.out.println("Ano Publicação: " + getAnoPublicacao());
		
	}
}
