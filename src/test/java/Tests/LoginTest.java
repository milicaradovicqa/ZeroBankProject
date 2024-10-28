package Tests;

import Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.openqa.selenium.devtools.v119.page.Page.navigate;

public class LoginTest extends BaseTest {

    @BeforeMethod
    public void pageSetUp(){
        driver.get("http://zero.webappsecurity.com/index.html");
    }

    @Test
    public void userCanLogIn(){
        homePage.clickOnSigninButton();
        loginPage.inputUsername();
        loginPage.inputPassword();
        loginPage.clickOnKeepMeSignedIn();
        loginPage.clickOnSignInButton();
        driver.navigate().to("http://zero.webappsecurity.com/index.html");
        Assert.assertTrue(homePage.getUsernameDropdownMenu().isDisplayed());

    }
    @Test
    public void userCanLogOut(){
        homePage.clickOnSigninButton();
        loginPage.inputUsername();
        loginPage.inputPassword();
        loginPage.clickOnKeepMeSignedIn();
        loginPage.clickOnSignInButton();
        driver.navigate().to("http://zero.webappsecurity.com/index.html");
        homePage.clickOnUsernameDropdownMenu();
        homePage.clickOnLogoutOptionFromDropdownMenu();
        Assert.assertTrue(homePage.getSigninButton().isDisplayed());
    }
    @Test
    public void userCannotLogInWithInvalidUsername() {
        homePage.clickOnSigninButton();
        loginPage.inputInvalidUsername();
        loginPage.inputPassword();
        loginPage.clickOnKeepMeSignedIn();
        loginPage.clickOnSignInButton();
        Assert.assertTrue(loginPage.getLoginAreWrongMessage().isDisplayed());
    }
}
