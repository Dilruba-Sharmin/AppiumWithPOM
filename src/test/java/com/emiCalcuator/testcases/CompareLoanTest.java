package com.emiCalcuator.testcases;

import com.emiCalcuator.screens.CompareLoanScreen;
import com.emiCalcuator.screens.HomeScreen;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CompareLoanTest extends BaseTest{

    CompareLoanScreen compareLoanScreen;

    @Test(priority = 0)
    public void compareLoansShouldSucceed() {
        compareLoanScreen = screen.getInstance(HomeScreen.class)
                .tapOnCompareLoanBtn()
                .fillLoan1Amount(500000)
                .fillInterest1(9)
                .fillMonth(12)
                .fillLoan2Amount(500000)
                .fillInterest2(10)
                .fillMonth2(12)
                .tapCalculateBtn();
        Assert.assertTrue(compareLoanScreen.hasResultLayout());

    }

    @Test(priority = 1)
    public void resetCompareLoansShouldSucceed() {
        compareLoanScreen = compareLoanScreen
                .tapResetBtn();
        Assert.assertFalse(compareLoanScreen.hasResultLayout());
    }
}


