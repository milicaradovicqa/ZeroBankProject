package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HelpTopicsPage {

    WebDriver driver;
    WebElement question1;
    WebElement question2;
    WebElement question3;

    public HelpTopicsPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getQuestion1() {
        return driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div[2]/div[1]/ol/li[1]/a"));
    }

    public WebElement getQuestion2() {
        return driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div[2]/div[1]/ol/li[2]/a"));
    }

    public WebElement getQuestion3() {
        return driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div[2]/div[1]/ol/li[3]/a"));
    }
    public void clickOnFirstQuestion(){
        getQuestion1().click();
    }
    public void clickOnSecondQuestion(){
        getQuestion2().click();
    }
    public void clickOnThirdQuestion(){
        getQuestion3().click();
    }
}
