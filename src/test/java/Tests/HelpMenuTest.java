package Tests;

import Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HelpMenuTest extends BaseTest {

    @BeforeMethod
    public void pageSetUp(){
        driver.get("http://zero.webappsecurity.com/index.html");
    }
    @Test
    public void userCanNavigateThruHelpMenu(){
        homePage.clickOnSigninButton();
        loginPage.inputUsername();
        loginPage.inputPassword();
        loginPage.clickOnKeepMeSignedIn();
        loginPage.clickOnSignInButton();
        driver.navigate().to("http://zero.webappsecurity.com/index.html");
        homePage.clickOnSettingsDropDownMenu();
        homePage.clickOnHelpMenu();

        helpTopicsPage.clickOnFirstQuestion();
        helpTopicsPage.clickOnSecondQuestion();
        String ActualMessage = "How do I transfer funds?";
        String ExpectedMessage = "How do I transfer funds?";
        Assert.assertEquals(ActualMessage, ExpectedMessage);
        helpTopicsPage.clickOnThirdQuestion();
        String ActualMessage2 = "How do I pay bills?";
        String ExpectedMessage2 = "How do I pay bills?";
        Assert.assertEquals(ActualMessage2, ExpectedMessage2);
    }
}
