package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OnlineStatementsPage {

    WebDriver driver;
    WebElement statement2012;
    WebElement statement2011;
    WebElement statement2010;
    WebElement getStatement2009;
    WebElement statementPDF2012;
    WebElement statementPDF2011;
    WebElement statementPDF2010;
    WebElement statementPDF2009;

    public OnlineStatementsPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getStatement2012() {
        return driver.findElement(By.xpath("//*[@id=\"online_statements_for_account\"]/div/div/div[2]/ul/li[1]/a"));
    }

    public WebElement getStatement2011() {
        return driver.findElement(By.xpath("//*[@id=\"online_statements_for_account\"]/div/div/div[2]/ul/li[2]/a"));
    }

    public WebElement getStatement2010() {
        return driver.findElement(By.xpath("//*[@id=\"online_statements_for_account\"]/div/div/div[2]/ul/li[3]/a"));
    }

    public WebElement getStatement2009() {
        return driver.findElement(By.xpath("//*[@id=\"online_statements_for_account\"]/div/div/div[2]/ul/li[4]/a"));
    }

    public WebElement getStatementPDF2012() {
        return driver.findElement(By.xpath("//*[@id=\"os_2012\"]/table/tbody/tr/td[1]/a"));
    }

    public WebElement getStatementPDF2011() {
        return driver.findElement(By.xpath("//*[@id=\"os_2011\"]/table/tbody/tr[1]/td[1]/a"));
    }

    public WebElement getStatementPDF2010() {
        return driver.findElement(By.xpath("//*[@id=\"os_2010\"]/table/tbody/tr[1]/td[1]/a"));
    }

    public WebElement getStatementPDF2009() {
        return driver.findElement(By.xpath("//*[@id=\"os_2009\"]/table/tbody/tr[1]/td[1]/a"));
    }

    public void clickOnStatement2012(){
        getStatement2012().click();
    }
    public void clickOnStatementPDF2012(){
        getStatementPDF2012().click();
    }
    public void clickOnStatement2011(){
        getStatement2011().click();
    }
    public void clickOnStatement2010(){
        getStatement2010().click();
    }
    public void clickOnStatement2009(){
        getStatement2009().click();
    }
    public void clickOnStatementPDF2011(){
        getStatementPDF2011().click();
    }
    public void clickOnStatementPDF2010(){
        getStatementPDF2010().click();
    }
    public void clickOnStatementPDF2009(){
        getStatementPDF2009().click();
    }

}
