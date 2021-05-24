package com.everis.pages;

import com.everis.util.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage{

    @FindBy(xpath = ("//*[@name = 'email'][@class = 'is_required validate account_input form-control']"))
    protected WebElement campoEmail;

    //$x("//*[@name = 'email'][@class = 'is_required validate account_input form-control']")

    @FindBy(id = ("//*[@id='passwd']"))
    protected WebElement campoSenha;

    @FindBy(className = "icol-lock-left")
    protected WebElement botaoLogin;

    public LoginPage() {
        PageFactory.initElements(Hooks.getDriver(), this);
    }


    //private BasePage base;

    public void fazerLogin(String email, String senha) {

        campoEmail.sendKeys(email);
        campoSenha.sendKeys(senha);
//        base.preencheCampoPorId("email","everisbootcamp@qabeginner.com");
//        base.preencheCampoPorId("passwd", "QA@everis213");
        waitElement(botaoLogin,20).click();
//        log("Realizou o login");
    }
}
