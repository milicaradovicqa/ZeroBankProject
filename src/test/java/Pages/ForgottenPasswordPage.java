package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ForgottenPasswordPage {

    WebDriver driver;
    WebElement emailField;
    WebElement sendPasswordButton;
    WebElement passwordWillBeSentMessage;

    public ForgottenPasswordPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getEmailField() {
        return driver.findElement(By.id("user_email"));
    }

    public WebElement getSendPasswordButton() {
        return driver.findElement(By.cssSelector(".btn.btn-primary"));
    }

    public WebElement getPasswordWillBeSentMessage() {
        return driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/text()"));
    }

    public void inputEmail() {
        getEmailField().clear();
        getEmailField().sendKeys("milica786598@gmail.com");
    }
    public void clickOnSendPasswordButton() {
        getSendPasswordButton().click();
    }
}
