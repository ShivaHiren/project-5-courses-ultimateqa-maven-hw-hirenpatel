package com.ultimateqa.courses.pages;


import com.ultimateqa.courses.utility.Utility;
import org.openqa.selenium.By;

public class ProductPage extends Utility {

    By emailField = By.id("user[email]");
    By passwordField = By.name("user[password]");


    public void enterEmailId(String email) {
        sendTextToElement(emailField, email);
    }

    public void enterPassword(String password) {

        sendTextToElement(passwordField, password);
    }

}
