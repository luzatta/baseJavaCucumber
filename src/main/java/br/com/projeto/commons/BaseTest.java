package br.com.projeto.commons;

import br.com.projeto.bean.interfaces.MobileApplication;
import br.com.projeto.bean.interfaces.WebApplication;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseTest {

    protected static WebDriver webDriver;
    protected static AndroidDriver driver;
    protected static WebDriverWait wait;

    protected void initializeWebApplication(WebApplication webApplication){
        webDriver = webApplication.getDriver();
        webDriver.manage().window().fullscreen();
        wait = new WebDriverWait(webDriver, 15);
    }

    protected void initializeMobileApplication(MobileApplication mobileApplication) {
        driver = mobileApplication.getDriver();
        wait = new WebDriverWait(driver, 15);
    }

    protected static void closeWeb() {
        webDriver.quit();
    }
}
