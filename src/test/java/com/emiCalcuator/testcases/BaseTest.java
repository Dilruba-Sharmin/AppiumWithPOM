package com.emiCalcuator.testcases;

import com.emiCalcuator.screens.BaseScreen;
import com.emiCalcuator.screens.Screen;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseTest {
    AndroidDriver driver;
    Screen screen;

    @BeforeClass
    public void launchApp(){
        DesiredCapabilities capabilities=new DesiredCapabilities();
        capabilities.setCapability("udid", "288c9cf5");
        capabilities.setCapability("platformVersion", "11");
        capabilities.setCapability("appPackage", "com.continuum.emi.calculator");
        capabilities.setCapability("appActivity", "com.finance.emicalci.activity.Splash_screnn");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("automationName", "UiAutomator2");

        try {
            driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
            screen=new BaseScreen(driver);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }


    @AfterClass
    public void tearDown(){
        driver.quit();

    }
    public AndroidDriver getWebDriver(){
        return driver;
    }
}
