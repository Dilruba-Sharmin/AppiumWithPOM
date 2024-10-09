package com.emiCalcuator.screens;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class EmiDetailScreen extends BaseScreen{

    public EmiDetailScreen(AndroidDriver driver) {
        super(driver);
    }

    public boolean hasResultDetail(){
        return getWebElements(By.id("layoutDetailContainer")).size() > 0;
    }
    //back to Emi calculator page
    
    public EmiCalculatorScreen tapBackBtn(){
        getWebElement(By.id("actionMenuBack")).click();
        waitForElement(By.id("actionMenuBack"));
        return getInstance(EmiCalculatorScreen.class);
    }
}
