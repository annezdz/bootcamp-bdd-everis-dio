package com.everis.pages;

import com.everis.util.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage{

    @FindBy(xpath = ("//*[@name = 'email'][@class = 'is_required validate account_input form-control']"))
    protected WebElement campoEmail;

    @FindBy(xpath = ("//*[@name = 'passwd'][@class = 'is_required validate account_input form-control']"))
    protected WebElement campoSenha;

    @FindBy(xpath = ("//*[@name = 'SubmitLogin'][@class = 'button btn btn-default button-medium']"))
    protected WebElement botaoLogin;

    public LoginPage() {
        PageFactory.initElements(Hooks.getDriver(), this);
    }

    public void fazerLogin(String email, String senha) {

        campoEmail.sendKeys(email);
        campoSenha.sendKeys(senha);
        waitElement(botaoLogin,10).click();
        log("Realizou o login");
    }
}
