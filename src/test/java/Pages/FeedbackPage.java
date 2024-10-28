package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FeedbackPage {

    WebDriver driver;
    WebElement yourNameField;
    WebElement yourEmailAddressField;
    WebElement subjectField;
    WebElement commentField;
    WebElement sendMessageButton;
    WebElement clearButton;

    public FeedbackPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getYourNameField() {
        return driver.findElement(By.id("name"));
    }

    public WebElement getYourEmailAddressField() {
        return driver.findElement(By.id("email"));
    }

    public WebElement getSubjectField() {
        return driver.findElement(By.id("subject"));
    }

    public WebElement getCommentField() {
        return driver.findElement(By.id("comment"));
    }

    public WebElement getSendMessageButton() {
        return driver.findElement(By.cssSelector(".btn-signin.btn.btn-primary"));
    }

    public WebElement getClearButton() {
        return driver.findElement(By.className("btn"));
    }

    public void inputName(){
        getYourNameField().clear();
        getYourNameField().sendKeys("Milica");
    }
    public void inputEmail(){
        getYourEmailAddressField().clear();
        getYourEmailAddressField().sendKeys("milica@gm.com");
    }
    public void inputSubject(){
        getSubjectField().clear();
        getSubjectField().sendKeys("question");
    }
    public void inputComment(){
        getCommentField().clear();
        getCommentField().sendKeys("I need help to open bank account. Best regards. Milica");
    }
    public void clickOnSendMessageButton(){
        getSendMessageButton().click();
    }
    public void clickOnClearButton(){
        getClearButton().click();
    }
}
