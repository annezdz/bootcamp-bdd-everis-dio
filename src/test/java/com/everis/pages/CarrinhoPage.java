package com.everis.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.everis.util.Hooks;

public class CarrinhoPage extends BasePage {

	@FindBy(xpath = "//*[text()='Proceed to checkout']")
	protected WebElement botaoCheckout;

	@FindBy(xpath = "//*[text()='Proceed to checkout']")
	protected WebElement botaoConfirmaEndereco;

	@FindBy(xpath = "//*[@id = 'uniform-cgv'][@class = 'checker']")
	protected WebElement botaoConfirmaTermos;

	@FindBy(xpath = "//*[@name = 'processCarrier']" +
			"[@class = 'button btn btn-default standard-checkout button-medium']")
	protected WebElement botaoConfirmaTransporte;


	public CarrinhoPage() {
		PageFactory.initElements(Hooks.getDriver(), this);
	}
	
	public boolean apresentouProdutoEsperadoNoCarrinho(String nomeProduto) {
		boolean apresentouProdutoEsperadoNoCarrinho = isElementDisplayed(By.xpath("//*[contains(@class,'cart_item')]//a[text()='" + nomeProduto + "']"));
		if (apresentouProdutoEsperadoNoCarrinho) {
			log("Apresentou o produto [" + nomeProduto + "] no carrinho conforme esperado.");
			return true;
		}
		logFail("Deveria ter apresentado o produto [" + nomeProduto + "] no carrinho.");
		return false;
	}

    public boolean oProdutoApresentouQuantidadeEsperada(String nomeProduto, String quantidadeProdutoEsperada) {
		WebElement quantidadeProduto = driver.findElement(By.xpath
				("//*[text()='"+ nomeProduto + "']//ancestor::*[contains(@class,'cart_item')]" +
						"//*[contains(@class, 'cart_quantity_input')]"));
		boolean oProdutoApresentouQuantidadeEsperada =
				quantidadeProdutoEsperada.equals(quantidadeProduto.getAttribute("value"));
		if(oProdutoApresentouQuantidadeEsperada){
			log("Apresentou a quantidade de produto conforme esperado");
			return true;
		}
		logFail("Não apresentou a quantidade de produto esperada");
		return false;
    }

    public void deveAcessarOCheckout() {
		botaoCheckout.click();
		log("Acessou o checkout");
    }

	public void deveConfirmarOEndereco() {
		botaoConfirmaEndereco.click();
		log(" Confirmou o endereco");
	}

	public void deveConfirmarFormaTransporte() {
		botaoConfirmaTermos.click();
		botaoConfirmaTransporte.click();
	}
}