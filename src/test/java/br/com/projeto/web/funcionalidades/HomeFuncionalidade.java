package br.com.projeto.web.funcionalidades;


import br.com.projeto.commons.BaseTest;
import br.com.projeto.web.pages.HomePage;

public class HomeFuncionalidade extends BaseTest {

    private HomePage homePage;

    public HomeFuncionalidade(){
        this.homePage = new HomePage(webDriver);

    }

    public void start(){
        System.out.println("Testando nossa execucao");
    }
}
