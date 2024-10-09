package com.emiCalcuator.testcases;

import com.emiCalcuator.common.General;
import com.emiCalcuator.screens.HomeScreen;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomeTest extends BaseTest{
   HomeScreen homeScreen;
@Test
    public void checkAppName(){
        homeScreen=screen.getInstance(HomeScreen.class);
        Assert.assertEquals(General.APP_NAME,homeScreen.getAppname());

    }

    @Test(priority = 1)
    public void checkStartBtn(){
        Assert.assertTrue(homeScreen.hasStartBtn());

    }

    @Test(priority = 2)
    public void checkCompareBtn(){
        Assert.assertTrue(homeScreen.hasCompareBtn());

    }

    @Test(priority = 3)
    public void checkStartBtnText(){
        Assert.assertEquals(homeScreen.getStartBtnText(),"EMI Calculator");

    }


}
