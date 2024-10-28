package Tests;

import Base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ShowTransactionsTest extends BaseTest {
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
        onlineBankingPage.clickOnAccountActivity();
    }

    @Test
    public void userCanSeeTransactions() {
        By account = By.id("aa_accountId");
        selectDropDownValue(account, "index", "1");
        selectDropDownValue(account, "index", "2");
        selectDropDownValue(account, "index", "3");
        selectDropDownValue(account, "index", "4");
        selectDropDownValue(account, "index", "5");
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
