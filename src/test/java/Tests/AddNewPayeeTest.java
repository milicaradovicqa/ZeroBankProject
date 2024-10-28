package Tests;

import Base.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddNewPayeeTest extends BaseTest {

    @BeforeMethod
    public void pageSetUp() throws InterruptedException {
        driver.get("http://zero.webappsecurity.com/index.html");

        homePage.clickOnSigninButton();
        loginPage.inputUsername();
        loginPage.inputPassword();
        loginPage.clickOnKeepMeSignedIn();
        loginPage.clickOnSignInButton();
        driver.navigate().to("http://zero.webappsecurity.com/index.html");
        homePage.clickOnMoreServicesButton();
        onlineBankingPage.clickOnPayBills();
    }

    @Test
    public void userCanAddNewPayee() throws InterruptedException {
        int n = excelReader.getLastRow("Forms");
        for (int row = 0; row < n; row++) {
            userCanFillFormWithExcelFile(row + 1);

        }
    }

    private void userCanFillFormWithExcelFile(int row) throws InterruptedException {
        String payeeName = excelReader.getStringData("Forms", row, 0);
        String payeeAddress =excelReader.getStringData("Forms", row, 1);
        String account = String.valueOf(excelReader.getIntegerData("Forms", row, 2));
        String payeeDetails =excelReader.getStringData("Forms", row, 3);

        payBillsPage.clickOnAddNewPayeeCard();
        Thread.sleep(1000);
        payBillsPage.inputPayeeName(payeeName);
        payBillsPage.inputPayeeAddress(payeeAddress);
        payBillsPage.inputAccount(account);
        payBillsPage.inputPayeeDetails(payeeDetails);
        payBillsPage.clickOnAddButton();
    }
}

