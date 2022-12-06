package com.ultimateqa.courses.testsuite;

import com.ultimateqa.courses.pages.ProductPage;
import com.ultimateqa.courses.pages.SignInPage;
import com.ultimateqa.courses.testbase.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProductPageTest extends BaseTest {
    SignInPage signInPage = new SignInPage();
    ProductPage productPage = new ProductPage();


    @Test
    public void verifyThatSixProductsAreDisplayedOnPage() {

        //click on Sign in link
        signInPage.clickOnSigninLink();

        //click on username
        productPage.enterEmailId("Jhon1234@gmail.com");

        //Enter password
        productPage.enterPassword("password122");


        //click on login button
        signInPage.signInButton();

        //This is requirement
        Assert.assertEquals("Invalid email or password.", "Invalid email or password.");

    }
}
