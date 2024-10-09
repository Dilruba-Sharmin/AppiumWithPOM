package com.emiCalcuator.testcases;

import com.emiCalcuator.screens.EmiCalculatorScreen;
import com.emiCalcuator.screens.EmiDetailScreen;
import com.emiCalcuator.screens.HomeScreen;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EmiDetailTest extends BaseTest{
   EmiDetailScreen emiDetailScreen;

    @Test(priority=0)
    public void checkDetailResult() {
        emiDetailScreen = screen.getInstance(HomeScreen.class)
                        .tapStartBtn()
                       .fillAmount(35000)
                       .fillInterestRate(9.52)
                       .fillYear(2)
                       .fillMonth(2)
                      .fillProcessFee(2)
                      .tapCalculateBtn()
                      .tapDetailBtn();
        Assert.assertTrue(emiDetailScreen.hasResultDetail());
    }

    @Test(priority = 1)
    public void checkBackBtn(){
        EmiCalculatorScreen calculatorScreen=emiDetailScreen
                                            .tapBackBtn();
        Assert.assertTrue(calculatorScreen.hasResult());


    }

}
