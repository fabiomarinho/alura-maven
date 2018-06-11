package br.com.alura.maven;

import static org.junit.Assert.*;

import org.junit.Test;

public class ProdutoTest {

	@Test
	public void test() {
		Produto p = new Produto("Juca", 1.0);
		assertEquals("Juca", p.getNome());
		assertEquals(1.1, p.getPrecoComImposto(),0.000001);
	}

}
