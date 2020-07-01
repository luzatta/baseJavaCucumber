package br.com.projeto.app.steps;

import br.com.projeto.commons.BaseTest;
import cucumber.api.java.pt.Dado;

public class CommonStep extends BaseTest {

    @Dado("^que estou no aplicativo \"([^\"]*)\"$")
    public void queEstouNoAplicativo() {
//        initializeMobileApplication();
    }
}
