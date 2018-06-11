package br.com.alura.maven;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		Produto produto = new Produto("Bala Xita", 0.5);
		System.out.println("O nome da bala que eu gosto é " + produto.getNome());
	}
}
