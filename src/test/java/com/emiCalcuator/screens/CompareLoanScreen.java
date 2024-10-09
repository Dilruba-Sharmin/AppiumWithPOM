package com.emiCalcuator.screens;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CompareLoanScreen extends BaseScreen{
    public CompareLoanScreen(AndroidDriver driver) {
        super(driver);
    }

    public boolean isCompareLoanScreen() {
        return getWebElements(By.id("fragment_container")).size() > 0;
    }

    public CompareLoanScreen fillLoan1Amount(int amount) {
        getWebElement(By.id("etLoanAmount1")).sendKeys(String.valueOf(amount));
        return this;
    }

    public CompareLoanScreen fillInterest1(int interest) {
        getWebElement(By.id("etInterest1")).sendKeys(String.valueOf(interest));

        return this;
    }

    public CompareLoanScreen fillMonth(int month) {
        WebElement etPeriod1 = getWebElement(By.id("etPeriod1"));
        etPeriod1.clear();
        etPeriod1.sendKeys(String.valueOf(month));
        return this;
    }

    public CompareLoanScreen fillLoan2Amount(int amount) {
        WebElement etLoanAmount2 = getWebElement(By.id("etLoanAmount2"));
        etLoanAmount2.clear();
        etLoanAmount2.sendKeys(String.valueOf(amount));
        return this;
    }

    public CompareLoanScreen fillInterest2(int interest) {
        WebElement etInterest2 = getWebElement(By.id("etInterest2"));
        etInterest2.clear();
        etInterest2.sendKeys(String.valueOf(interest));
        return this;
    }

    public CompareLoanScreen fillMonth2(int month) {
        WebElement etPeriod2 = getWebElement(By.id("etPeriod2"));
        etPeriod2.clear();
        etPeriod2.sendKeys(String.valueOf(month));
        return this;
    }

    public boolean hasResultLayout() {
        return getWebElements(By.id("layoutTable")).size() > 0;
    }

    public CompareLoanScreen tapCalculateBtn() {
        getWebElement(By.id("btnCalculate")).click();
        return this;
    }

    public CompareLoanScreen tapResetBtn() {
        getWebElement(By.id("btnReset")).click();
        return this;
    }
}


