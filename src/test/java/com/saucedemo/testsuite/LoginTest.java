package com.saucedemo.testsuite;

import com.saucedemo.pages.LoginPage;
import com.saucedemo.pages.ProductPage;
import com.saucedemo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    LoginPage loginpage = new LoginPage();

    ProductPage productPage = new ProductPage();

    @Test
    public void verifyUserShouldSuccessfullyWithValidCredentials(){
        loginpage.enterUsername("standard_user");
        loginpage.enterPassword("secret_sauce");
        loginpage.clickOnLoginButton();
        Assert.assertEquals(productPage.getProductText(),"Products");

    }

}
