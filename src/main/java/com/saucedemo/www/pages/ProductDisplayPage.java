package com.saucedemo.www.pages;

import com.saucedemo.www.utility.Utility;
import org.openqa.selenium.By;

public class ProductDisplayPage extends Utility {
    By username = (By.xpath("//input[@id='user-name']"));
    By password = (By.xpath("//input[@id='password']"));
    By loginbutton = (By.xpath("//input[@id='login-button']"));

    public void enterUserName(){
        sendTextToElement(username,"standard_user");
    }

    public void enterPassword(){
        sendTextToElement(password,"secret_sauce");

    }
    public void clickonloginbutton(){
        clickOnElement(loginbutton);
    }

}

