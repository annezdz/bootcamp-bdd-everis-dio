package com.everis.steps;

import com.everis.pages.LoginPage;
import com.everis.pages.ResultadoPesquisaPage;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Quando;

public class LoginSteps {

    @Quando("realiza o login {string} {string}")
    public void fazerLogin(String email, String senha){
        LoginPage loginPage = new LoginPage();
        loginPage.fazerLogin(email,senha);
    }
}
