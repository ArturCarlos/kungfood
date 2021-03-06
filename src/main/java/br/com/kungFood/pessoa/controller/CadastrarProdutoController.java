package br.com.kungFood.pessoa.controller;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.kungFood.model.ProdutoModel;
import br.com.kungFood.repository.ProdutoRepository;
import br.com.kungFood.usuario.controlle.UsuarioController;
import br.com.kungFood.uteis.Uteis;

@Named(value = "cadastrarProdutoController")
@RequestScoped
public class CadastrarProdutoController {

	@Inject
	ProdutoModel produtoModel;

	@Inject
	UsuarioController usuarioController;

	@Inject
	ProdutoRepository produtoRepository;

	public ProdutoModel getProdutoModel() {
		return produtoModel;
	}

	public void setProdutoModel(ProdutoModel produtoModel) {
		this.produtoModel = produtoModel;
	}

	/**
	 * SALVA UM NOVO REGISTRO VIA INPUT
	 */
	public void SalvarNovoProduto() {

		produtoRepository.SalvarNovoProduto(this.produtoModel);

		this.produtoModel = null;

		Uteis.MensagemInfo("Produto cadastrado com sucesso");

	}

}