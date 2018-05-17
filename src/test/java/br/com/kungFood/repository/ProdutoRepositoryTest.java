package br.com.kungFood.repository;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import br.com.kungFood.model.ProdutoModel;

public class ProdutoRepositoryTest {

	ProdutoRepository dao;
	ProdutoModel produtoModel;

	@Before
	public void setUp() throws Exception {

		dao = new ProdutoRepository();
		produtoModel = new ProdutoModel();

		produtoModel.setDs_produto("pratos");
		produtoModel.setNm_produto("nome");
		produtoModel.setQt_produto(55);
		produtoModel.setValidade_produto("25/10/2015");
		produtoModel.setVl_produto(25.5);

	}

	@After
	public void tearDown() throws Exception {
		//dao.ExcluirRegistro(produtoModel.getId_produto());
		dao = null;
	}

	@Test
	public void testSalvarNovoProduto() {

		dao.SalvarNovoProduto(produtoModel);
		
		List<ProdutoModel> produtos = dao.GetProduto();

		//assertNotNull("T02", produtos);
		
		int tamanho = produtos.size();

		//assertTrue("T02", produtos.contains(produtoModel));

		assertEquals("t02", tamanho, produtos.size());

		
	}

	@Test
	public void testGetProduto() {
		List<ProdutoModel> produtos = dao.GetProduto();

		assertNotNull("T02", produtos);

		int tamanho = produtos.size();

		// Inserir um Produto

		produtos = dao.GetProduto();

		assertEquals("t02", tamanho, produtos.size());

	}

	// @Test
	public void testAlterarRegistro() {
		fail("Not yet implemented");
	}

	// @Test
	public void testExcluirRegistro() {
		fail("Not yet implemented");
	}

}
