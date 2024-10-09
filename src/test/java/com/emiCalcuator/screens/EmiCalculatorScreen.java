package com.emiCalcuator.screens;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class EmiCalculatorScreen extends BaseScreen{
    public EmiCalculatorScreen(AndroidDriver driver) {
        super(driver);
    }


    public EmiCalculatorScreen fillAmount(int amount){

        WebElement etLoanAmount =getWebElement(By.id("etLoanAmount"));
        etLoanAmount.clear();
        etLoanAmount.sendKeys(String.valueOf(amount));
        return this;

    }

    public EmiCalculatorScreen fillInterestRate(double rate){
        WebElement etInterest=getWebElement(By.id("etInterest"));
        etInterest.clear();
        etInterest.sendKeys(String.valueOf(rate));
        return this;

    }

    public EmiCalculatorScreen fillYear(int year){
        getWebElement(By.id("etYears")).sendKeys(String.valueOf(year));
        return this;

    }

    public EmiCalculatorScreen fillMonth(int month){
        getWebElement(By.id("etMonths")).sendKeys(String.valueOf(month));
        return this;
    }

    public EmiCalculatorScreen fillProcessFee(int fee){
        WebElement etFee=getWebElement(By.id("etFee"));
           etFee.clear();
           etFee.sendKeys(String.valueOf(fee));
        return this;
    }

    public EmiCalculatorScreen tapCalculateBtn(){
        getWebElement(By.id("btnCalculate")).click();
        return this;
    }

    public EmiCalculatorScreen tapResetBtn(){
        getWebElement(By.id("btnReset")).click();
        return this;
    }

    public boolean hasResult(){
        return getWebElements(By.id("layoutTable")).size() > 0;

    }

    public boolean hasDetailBtn(){
        return getWebElements(By.id("btnDetail")).size() > 0;

    }

  //Link up to Detail page
    public EmiDetailScreen tapDetailBtn(){
        getWebElement(By.id("btnDetail")).click();
        waitForElement(By.id("btnDetail"));
        return getInstance(EmiDetailScreen.class);
    }


}
