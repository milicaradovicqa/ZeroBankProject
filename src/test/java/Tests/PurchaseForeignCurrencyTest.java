package Tests;

import Base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PurchaseForeignCurrencyTest extends BaseTest {

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
        onlineBankingPage.clickOnPayBills();
        payBillsPage.clickOnPurchaseForeignCurrencyCard();
    }
    @Test
    public void userCanPurchaseForeignCurrency() throws InterruptedException {

        Thread.sleep(3000);
        By currency = By.id("pc_currency");
        selectDropDownValue(currency, "index", "3");

        payBillsPage.inputAmountWithoutCurrency();
        payBillsPage.clickOnRadioButtonUSD();
        payBillsPage.clickOnCalculateCostButton();
        payBillsPage.clickOnPurchaseButton();

        String actualTitle = driver.findElement((By.id("alert_content"))).getText();
        String expectedTitle = "Foreign currency cash was successfully purchased.";
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
