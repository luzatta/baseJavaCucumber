package br.com.bootcamp.web.steps;

import br.com.bootcamp.web.funcionalidades.HomeFuncionalidade;
import cucumber.api.java.pt.Dado;

public class CommonStep {

    private HomeFuncionalidade homeFuncionalidade = new HomeFuncionalidade();

    @Dado("^que estou no site \"([^\"]*)\"$")
    public void queEstouNoSite(String site) {
        homeFuncionalidade.start();
    }




}
