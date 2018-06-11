package br.com.alura.maven;

public class Produto {
	
	private final String nome;
	private final double preco;
	
	public double getPreco() {
		return preco;
	}

	public Produto(String nome, double preco) {
		super();
		this.nome = nome;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	
	
}