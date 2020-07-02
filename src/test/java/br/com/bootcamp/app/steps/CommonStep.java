package br.com.bootcamp.app.steps;

import br.com.bootcamp.settings.BaseTest;
import cucumber.api.java.pt.Dado;

public class CommonStep extends BaseTest {

    @Dado("^que estou no aplicativo \"([^\"]*)\"$")
    public void queEstouNoAplicativo() {
//        initializeMobileApplication();
    }
}
