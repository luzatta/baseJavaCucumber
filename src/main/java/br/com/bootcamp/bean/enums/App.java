package br.com.bootcamp.bean.enums;

import br.com.bootcamp.bean.interfaces.MobileApplication;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobilePlatform;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.IOException;
import java.util.Scanner;

public enum App implements MobileApplication {

    SANTANDER {
        @Override
        public AndroidDriver<AndroidElement> getDriver() {
            return getDriver("com.santander.app",
                    "com.santander.app.homenaologada.presentation.HomeActivity");
        }
    };

    private AndroidDriver<AndroidElement> driver;

    public AndroidDriver<AndroidElement> getDriver(String appPackage, String appActivity) {
        try {
            driver = new AndroidDriver<>(getCapabilities(appPackage, appActivity));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return driver;
    }

    private DesiredCapabilities getCapabilities(String appPackage, String appActivity) throws IOException{
        Scanner scanner = new Scanner(Runtime.getRuntime()
                .exec(new String[]{"/bin/bash", "-l", "-c", "adb get-serialno"}).getInputStream());
        String deviceSerialNumber = (scanner != null && scanner.hasNext()) ? scanner.next() : "";
        scanner.close();
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "Galaxy");
        capabilities.setCapability("platformName", MobilePlatform.ANDROID);
        capabilities.setCapability("device", "Android");
        capabilities.setCapability("udid", deviceSerialNumber);
        capabilities.setCapability("appPackage", appPackage);
        capabilities.setCapability("appActivity", appActivity);
        capabilities.setCapability("autoGrantPermissions", true);
        capabilities.setCapability("newCommandTimeout", 120);
        capabilities.setCapability("automationName", "uiautomator2");
        capabilities.setCapability("systemPort", 8205);
        return capabilities;
    }
}
