package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    WebDriver driver;
    WebElement loginField;
    WebElement passwordField;
    WebElement keepMeSignedInCheckButton;
    WebElement signInButton;
    WebElement forgotYourPasswordLink;
    WebElement loginAreWrongMessage;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getLoginField() {
        return driver.findElement(By.id("user_login"));
    }

    public WebElement getPasswordField() {
        return driver.findElement(By.id("user_password"));
    }

    public WebElement getKeepMeSignedInCheckButton() {
        return driver.findElement(By.id("user_remember_me"));
    }

    public WebElement getSignInButton() {
        return driver.findElement(By.cssSelector(".btn.btn-primary"));
    }

    public WebElement getForgotYourPasswordLink() {
        return driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/a"));
    }

    public WebElement getLoginAreWrongMessage() {
        return driver.findElement(By.cssSelector(".alert.alert-error"));
    }

    public void inputUsername() {
        getLoginField().click();
        getLoginField().sendKeys("username");
    }
    public void inputInvalidUsername(){
        getLoginField().click();
        getLoginField().sendKeys("789#0%");
    }
    public void inputPassword() {
        getPasswordField().click();
        getPasswordField().sendKeys("password");

    }
    public void clickOnKeepMeSignedIn() {
        getKeepMeSignedInCheckButton().click();
    }

    public void clickOnSignInButton() {
        getSignInButton().click();
    }

    public void clickOnForgotYourPassword() {
        getForgotYourPasswordLink().click();
    }
}
