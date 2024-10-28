package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OnlineBankingPage {

    WebDriver driver;
    WebElement payBills;
    WebElement onlineStatements;
    WebElement accountActivity;
    WebElement transferFunds;

    public OnlineBankingPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getPayBills() {
        return driver.findElement(By.id("pay_bills_link"));
    }
    public WebElement getOnlineStatements() {
        return driver.findElement(By.id("online_statements_link"));
    }

    public WebElement getAccountActivity() {
        return driver.findElement(By.id("account_activity_link"));
    }

    public WebElement getTransferFunds() {
        return driver.findElement(By.id("transfer_funds_link"));
    }

    public void clickOnPayBills(){
        getPayBills().click();
    }
    public void clickOnOnlineStatements(){
        getOnlineStatements().click();
    }
    public void clickOnAccountActivity(){
        getAccountActivity().click();
    }
    public void clickOnTransferFunds(){
        getTransferFunds().click();
    }
}
