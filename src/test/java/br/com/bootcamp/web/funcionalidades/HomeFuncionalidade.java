package br.com.bootcamp.web.funcionalidades;


import br.com.bootcamp.bean.commons.SeleniumRobot;
import br.com.bootcamp.settings.BaseTest;
import br.com.bootcamp.web.pages.HomePage;

public class HomeFuncionalidade extends BaseTest {

    private HomePage homePage;

    public HomeFuncionalidade(){
        this.homePage = new HomePage(webDriver);

    }

    public void start(){
        System.out.println("Testando nossa execucao");
    }
}
