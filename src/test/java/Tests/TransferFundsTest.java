package Tests;

import Base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TransferFundsTest extends BaseTest {
    @BeforeMethod
    public void pageSetUp() {
        driver.get("http://zero.webappsecurity.com/index.html");

        homePage.clickOnSigninButton();
        loginPage.inputUsername();
        loginPage.inputPassword();
        loginPage.clickOnKeepMeSignedIn();
        loginPage.clickOnSignInButton();
        driver.navigate().to("http://zero.webappsecurity.com/index.html");
        homePage.clickOnMoreServicesButton();
        onlineBankingPage.clickOnTransferFunds();
    }
    @Test
    public void userCanTransferMoneyAndMakePayments(){
        By fromAccount = By.id("tf_fromAccountId");
        By toAccount = By.id("tf_toAccountId");
        selectDropDownValue(fromAccount, "index", "1");
        selectDropDownValue(toAccount, "index", "1");

        transferFundsPage.inputAmount();
        transferFundsPage.inputDescription();
        transferFundsPage.clickOnContinueButton();
        transferFundsPage.clickOnSubmitButton();

        String actualTitle = driver.findElement((By.cssSelector(".alert.alert-success"))).getText();
        String expectedTitle = "You successfully submitted your transaction.";
        Assert.assertEquals(expectedTitle, actualTitle);

    }

    public WebElement getElementForDropDown(By locator) {
        return driver.findElement(locator);
    }

    public void selectDropDownValue(By locator, String type, String value) {
        Select select = new Select(getElementForDropDown(locator));

        switch (type) {
            case "index":
                select.selectByIndex(Integer.parseInt(value));
                break;
            case "value":
                select.selectByVisibleText(value);
                break;
            case "visibletext":
                select.selectByVisibleText(value);
            default:
                break;
        }
    }

}
