package com.ultimateqa.courses.pages;


import com.ultimateqa.courses.utility.Utility;
import org.openqa.selenium.By;

public class SignInPage extends Utility {

    By signinLink = By.partialLinkText("Sign");
    By emailField = By.id("user[email]");
    By passwordField = By.id("user[password]");
    By signInButton = By.xpath("//input[@type='submit']");
    By welcomeText = By.xpath("//h1[@class='page__heading']");

    public void clickOnSigninLink() {
        clickOnElement(signinLink);
    }

    public void enterEmailId(String email) {
        sendTextToElement(emailField, email);
    }

    public void enterPassword(String password) {
        sendTextToElement(passwordField, password);
    }

    public void signInButton() {
        clickOnElement(signInButton);
    }

    public String getWelcomeText() {
        return getTextFromElement(welcomeText);
    }


}
