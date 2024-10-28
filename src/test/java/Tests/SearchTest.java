package Tests;

import Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SearchTest extends BaseTest {
    @BeforeMethod
    public void pageSetUp() {
        driver.get("http://zero.webappsecurity.com/index.html");

        homePage.clickOnSigninButton();
        loginPage.inputUsername();
        loginPage.inputPassword();
        loginPage.clickOnKeepMeSignedIn();
        loginPage.clickOnSignInButton();
        driver.navigate().to("http://zero.webappsecurity.com/index.html");

    }
    @Test
    public void searchResultIsShownAfterUserSearchForAnItem1(){

        homePage.inputSearchItem1();
        String ActualMessage = "Banking";
        String ExpectedMessage = "Banking";
        Assert.assertEquals(ActualMessage, ExpectedMessage);

    }
    @Test
    public void searchResultIsShownAfterUserSearchForAnItem2(){
        homePage.inputSearchItem2();
        String ActualMessage = "Credit";
        String ExpectedMessage = "Credit";
        Assert.assertEquals(ActualMessage, ExpectedMessage);

    }
    @Test
    public void searchResultIsShownAfterUserSearchForAnItem3(){
        homePage.inputSearchItem3();
        String ActualMessage = "Access";
        String ExpectedMessage = "Access";
        Assert.assertEquals(ActualMessage, ExpectedMessage);

    }


}
