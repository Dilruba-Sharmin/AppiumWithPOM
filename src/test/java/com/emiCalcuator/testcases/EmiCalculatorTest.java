package com.emiCalcuator.testcases;

import com.beust.ah.A;
import com.emiCalcuator.common.General;
import com.emiCalcuator.screens.EmiCalculatorScreen;
import com.emiCalcuator.screens.HomeScreen;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class EmiCalculatorTest extends BaseTest{
    EmiCalculatorScreen calculatorScreen;

    //To understand easily follow this
    @Test(enabled = false)
    public void calculateEmiShouldSucceed(){
        HomeScreen homeScreen=screen.getInstance(HomeScreen.class);
        EmiCalculatorScreen calculatorScreen=homeScreen
                .tapStartBtn()
                .fillAmount(35000)
                .fillInterestRate(9.52)
                .fillYear(2)
                .fillMonth(2)
                .fillProcessFee(2)
                .tapCalculateBtn();
        Assert.assertTrue(calculatorScreen.hasResult());
    }

    //Another way
    @Test(priority=0)
    public void calculateEmiShouldSucceed1(){
        calculatorScreen=screen.getInstance(HomeScreen.class)
                .tapStartBtn()
                .fillAmount(35000)
                .fillInterestRate(9.52)
                .fillYear(2)
                .fillMonth(2)
                .fillProcessFee(2)
                .tapCalculateBtn();
        Assert.assertTrue(calculatorScreen.hasResult());
    }
   @Test(priority = 1)
    public void checkDetailBtn(){
    Assert.assertTrue(calculatorScreen.hasDetailBtn());
    }

    // Using Excel file for amount and rate
    @Test(priority=2,dataProvider = "getDataProviderData",enabled = true)
    public void calculateEmiShouldSucceed2(String amount,String rate){
        calculatorScreen=calculatorScreen
                .fillAmount(Integer.valueOf(amount.replaceAll(".0", "")))
                .fillInterestRate(Double.valueOf(rate))
                .fillYear(2)
                .fillMonth(2)
                .fillProcessFee(2)
                .tapCalculateBtn();
        Assert.assertTrue(calculatorScreen.hasResult());
    }

    @Test(priority = 3)
    public void checkResetBtn(){
        calculatorScreen.tapResetBtn();
        Assert.assertFalse(calculatorScreen.hasResult());
    }


    @DataProvider
    public Object[][] getDataProviderData() {

        return General.getTestData("Sheet1");
    }


}
