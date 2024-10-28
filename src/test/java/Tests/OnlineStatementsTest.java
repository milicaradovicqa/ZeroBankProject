package Tests;

import Base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class OnlineStatementsTest extends BaseTest {

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
        onlineBankingPage.clickOnOnlineStatements();

    }

    @Test
    public void userCanCheckStatements() throws InterruptedException {

        By account = By.id("os_accountId");
        selectDropDownValue(account, "index", "1");

        Thread.sleep(3000);
        onlineStatementsPage.clickOnStatement2011();
        onlineStatementsPage.clickOnStatement2010();
        onlineStatementsPage.clickOnStatement2009();
        onlineStatementsPage.clickOnStatement2012();
        onlineStatementsPage.clickOnStatementPDF2012();

        Thread.sleep(3000);
        selectDropDownValue(account, "index", "3");
        onlineStatementsPage.clickOnStatement2011();
        onlineStatementsPage.clickOnStatementPDF2011();

        Thread.sleep(3000);
        selectDropDownValue(account, "index", "4");
        onlineStatementsPage.clickOnStatement2010();
        onlineStatementsPage.clickOnStatementPDF2010();

        Thread.sleep(3000);
        selectDropDownValue(account, "index", "5");
        onlineStatementsPage.clickOnStatement2009();
        onlineStatementsPage.clickOnStatementPDF2009();

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
