package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TransferFundsPage {
    WebDriver driver;
    WebElement amount;
    WebElement description;
    WebElement continueButton;
    WebElement submitButton;

    public TransferFundsPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getAmount() {
        return driver.findElement(By.id("tf_amount"));
    }

    public WebElement getContinueButton() {
        return driver.findElement(By.id("btn_submit"));
    }

    public WebElement getDescription() {
        return driver.findElement(By.id("tf_description"));
    }

    public WebElement getSubmitButton() {
        return driver.findElement(By.id("btn_submit"));
    }

    public void inputAmount(){
        getAmount().sendKeys("1500");
    }
    public void inputDescription(){
        getDescription().sendKeys("to my savings account");
    }
    public void clickOnContinueButton(){
        getContinueButton().click();
    }
    public void clickOnSubmitButton(){
        getSubmitButton().click();
    }
}
