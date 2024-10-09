package com.emiCalcuator.screens;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class HomeScreen extends BaseScreen{
    private By startBtn=By.id("btnStart");

    public HomeScreen(AndroidDriver driver) {
        super(driver);
    }

    public String getAppname() {
        waitForElement(By.id("appName"));
        return getWebElement(By.id("appName")).getText().trim();
    }

    public EmiCalculatorScreen tapStartBtn(){
        waitForElement(startBtn);
        getWebElement(startBtn).click();
        return getInstance(EmiCalculatorScreen.class);

    }

    public void tapCompareBtn(){
        getWebElement(By.id("btnCompare")).click();

    }

    public boolean hasStartBtn(){
        waitForElement(startBtn);
        return getWebElements(startBtn).size()> 0;

    }
    public String getStartBtnText(){
        return getWebElement(startBtn).getText().trim();

    }

    public boolean hasCompareBtn(){
        return getWebElements(By.id("btnCompare")).size()> 0;

    }

    public CompareLoanScreen tapOnCompareLoanBtn(){
        waitForElement(By.id("btnCompare"));
        getWebElement(By.id("btnCompare")).click();
        waitForElement(By.id("etLoanAmount1"));
        return getInstance(CompareLoanScreen.class);

    }

}
