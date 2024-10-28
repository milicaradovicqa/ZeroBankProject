package Tests;

import Base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class PaySavedPayeeTest extends BaseTest {

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
    }

    @Test
    public void userCanMakePayment() {

        By payee = By.id("sp_payee");
        By account = By.id("sp_account");

        selectDropDownValue(payee, "index", "3");
        selectDropDownValue(account, "index", "5");

        payBillsPage.inputAmountInDolars();

        // Calendar
        payBillsPage.clickOnDateField();
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.className("ui-datepicker-calendar")));


        while (true) {
            String month = driver.findElement(By.className("ui-datepicker-month")).getText();
            String year = driver.findElement(By.className("ui-datepicker-year")).getText();
            if (month.equals("December") && year.equals("2023")) {
                break;
            }
            driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[1]")).click();
        }

        driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[3]/td[6]/a")).click();


        payBillsPage.inputDescriptionField();

        payBillsPage.clickOnPayButton();

        String actualTitle = driver.findElement((By.id("alert_content"))).getText();
        String expectedTitle = "The payment was successfully submitted.";
        Assert.assertEquals(expectedTitle, actualTitle);

    }
    public WebElement getElementForDropDown (By locator) {
        return driver.findElement(locator);
    }
        public void selectDropDownValue (By locator, String type, String value){
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
