package br.com.projeto.bean.interfaces;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public interface MobileApplication {

    AndroidDriver<AndroidElement> getDriver();


}
