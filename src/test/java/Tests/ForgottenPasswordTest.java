package Tests;

import Base.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ForgottenPasswordTest extends BaseTest {

    @BeforeMethod
    public void pageSetUp() {
        driver.get("http://zero.webappsecurity.com/index.html");
    }

    @Test
    public void userCanSendRequestForNewPassword() {
        homePage.clickOnSigninButton();
        loginPage.clickOnForgotYourPassword();
        forgottenPasswordPage.inputEmail();
        forgottenPasswordPage.clickOnSendPasswordButton();

        String actualTitle = driver.findElement((By.cssSelector(".offset3.span6"))).getText();
        String expectedTitle = "Forgotten Password\nYour password will be sent to the following email: milica786598@gmail.com";
        Assert.assertEquals(expectedTitle, actualTitle);
    }
}
