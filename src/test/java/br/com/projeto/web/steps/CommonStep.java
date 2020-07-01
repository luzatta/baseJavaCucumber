package br.com.projeto.web.steps;

import br.com.projeto.web.funcionalidades.HomeFuncionalidade;
import br.com.projeto.web.pages.HomePage;
import cucumber.api.java.pt.Dado;

public class CommonStep {

    private HomeFuncionalidade homeFuncionalidade = new HomeFuncionalidade();

    @Dado("^que estou no site \"([^\"]*)\"$")
    public void queEstouNoSite(String site) {
        homeFuncionalidade.start();
    }




}
