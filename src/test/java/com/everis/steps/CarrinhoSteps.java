package com.everis.steps;

import io.cucumber.java.pt.Quando;
import org.junit.Assert;

import com.everis.pages.CarrinhoPage;

import io.cucumber.java.pt.Entao;

public class
CarrinhoSteps {
	
	@Entao("^o produto \"(.*)\" deve estar presente no carrinho$")
	public void apresentouProdutoEsperadoNoCarrinho(String nomeProduto) {
		CarrinhoPage carrinhoPage = new CarrinhoPage();
		Assert.assertTrue("Deveria ter apresentado o produto [" + nomeProduto + "] no carrinho", 
				carrinhoPage.apresentouProdutoEsperadoNoCarrinho(nomeProduto));
	}

	@Entao("^acessar o checkout$")
	public void deveAcessarOCheckout(){
		CarrinhoPage carrinhoPage = new CarrinhoPage();
		carrinhoPage.deveAcessarOCheckout();
	}

	@Entao("^confirma o endereco de entrega$")
	public void deveConfirmarOEndereco(){
		CarrinhoPage carrinhoPage =new CarrinhoPage();
		carrinhoPage.deveConfirmarOEndereco();
	}

	@Entao("^escolhe a forma de transporte$")
	public void deveConfirmarFormaTransporte(){
		CarrinhoPage carrinhoPage = new CarrinhoPage();
		carrinhoPage.deveConfirmarFormaTransporte();
	}

	@Quando("^o pagamento for confirmado$")
	public void deveConfirmarFormaPagamento(){
		CarrinhoPage carrinhoPage = new CarrinhoPage();
		carrinhoPage.deveConfirmarFormaPagamento();
	}

	@Entao("^deve ser apresentado a mensagem \"(.*)\"")
	public void deveApresentarMensagemFinal(String mensagem){
		CarrinhoPage carrinhoPage = new CarrinhoPage();
		Assert.assertTrue("Deveria ter apresentado a mensagem [ "+ mensagem +" ]",
				carrinhoPage.apresentouAMensagemEsperada(mensagem));
	}


	@Entao("^o produto \"(.*)\" deve possuir a quantidade (.*)$")
	public void oProdutoApresentouQuantidadeEsperada(String nomeProduto, String quantidadeProduto) {
		CarrinhoPage carrinhoPage = new CarrinhoPage();
		Assert.assertTrue("O produto [" + nomeProduto + "] " +
				"deveria ter a quantidade ["+ quantidadeProduto+ "]",
				carrinhoPage.oProdutoApresentouQuantidadeEsperada(nomeProduto, quantidadeProduto));

		};
	}


