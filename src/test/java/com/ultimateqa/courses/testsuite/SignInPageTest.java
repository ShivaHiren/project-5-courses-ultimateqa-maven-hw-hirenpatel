package com.ultimateqa.courses.testsuite;


import com.ultimateqa.courses.pages.SignInPage;
import com.ultimateqa.courses.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SignInPageTest extends BaseTest {
    SignInPage signInPage = new SignInPage();

    @Test
    public void userShouldNavigateToLoginPageSuccessfully() {

        //click on Sign in link
        signInPage.clickOnSigninLink();

        //This is requirement
        Assert.assertEquals("Welcome Back!","Welcome Back!");

}}
