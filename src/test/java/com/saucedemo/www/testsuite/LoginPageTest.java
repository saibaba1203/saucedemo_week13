package com.saucedemo.www.testsuite;

import com.saucedemo.www.pages.LoginPage;
import com.saucedemo.www.pages.ProductDisplayPage;
import com.saucedemo.www.testbase.TestBase;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LoginPageTest extends TestBase {
LoginPage loginPage = new LoginPage();
ProductDisplayPage productDisplayPage = new ProductDisplayPage();

@Test
    public void userSholdLoginSuccessfullyWithValid(){
     loginPage.enterUserName();
     loginPage.enterPassword();
     loginPage.clickonloginbutton();
    String expectedMessage = "PRODUCTS";
    String actualMessage = getTextFromElement(By.xpath("//span[contains(text(),'Products')]"));
    Assert.assertEquals("Products text is not displayed", expectedMessage, actualMessage);
}
@Test
    public void verifyThatSixProductsAreDisplayedOnPage(){
    productDisplayPage.enterUserName();
    productDisplayPage.enterPassword();
    productDisplayPage.clickonloginbutton();
    String expectedMessage = "PRODUCTS";
    String actualMessage = getTextFromElement(By.xpath("//span[contains(text(),'Products')]"));
    Assert.assertEquals("Products text is not displayed", expectedMessage, actualMessage);
}


}
