package Tests;

import Base.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PayBillsPageTest extends BaseTest {
    @BeforeMethod
    public void pageSetUp(){
        driver.get("http://zero.webappsecurity.com/index.html");
    }
    @Test
    public void userCanAddNewPayee() {
        homePage.clickOnSigninButton();
        loginPage.inputUsername();
        loginPage.inputPassword();
        loginPage.clickOnKeepMeSignedIn();
        loginPage.clickOnSignInButton();
        driver.navigate().to("http://zero.webappsecurity.com/index.html");
        homePage.clickOnMoreServicesButton();
        onlineBankingPage.clickOnPayBills();
        payBillsPage.clickOnAddNewPayeeCard();
        payBillsPage.clickOnPaySavedPayee();
        payBillsPage.clickOnPurchaseForeignCurrencyCard();

    }
}
