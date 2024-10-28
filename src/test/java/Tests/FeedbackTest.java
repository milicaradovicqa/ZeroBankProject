package Tests;

import Base.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FeedbackTest extends BaseTest {

    @BeforeMethod
    public void pageSetUp(){
        driver.get("http://zero.webappsecurity.com/index.html");
    }

    @Test
    public void userCanSentFeedback(){
        homePage.clickOnSigninButton();
        loginPage.inputUsername();
        loginPage.inputPassword();
        loginPage.clickOnKeepMeSignedIn();
        loginPage.clickOnSignInButton();
        driver.navigate().to("http://zero.webappsecurity.com/index.html");
        homePage.clickOnFeedbackButton();

        feedbackPage.inputName();
        feedbackPage.inputEmail();
        feedbackPage.inputSubject();
        feedbackPage.inputComment();
        feedbackPage.clickOnSendMessageButton();
        String actualTitle = driver.findElement((By.cssSelector(".offset3.span6"))).getText();
        String expectedTitle = "Feedback\nThank you for your comments, Milica. They will be reviewed by our Customer Service staff and given the full attention that they deserve.";
        Assert.assertEquals(expectedTitle, actualTitle);
    }
    @Test
    public void userCanClearTheComment(){
        homePage.clickOnSigninButton();
        loginPage.inputUsername();
        loginPage.inputPassword();
        loginPage.clickOnKeepMeSignedIn();
        loginPage.clickOnSignInButton();
        driver.navigate().to("http://zero.webappsecurity.com/index.html");
        homePage.clickOnFeedbackButton();

        feedbackPage.inputName();
        feedbackPage.inputEmail();
        feedbackPage.inputSubject();
        feedbackPage.inputComment();
        feedbackPage.clickOnClearButton();
    }
}
