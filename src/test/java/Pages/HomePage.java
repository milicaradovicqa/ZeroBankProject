package Pages;

import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.openqa.selenium.Keys.ENTER;

public class HomePage {

    WebDriver driver;

    WebElement homeButton;
    WebElement searchField;
    WebElement signinButton;
    WebElement onlineBankingButton;
    WebElement feedbackButton;
    WebElement moreServicesButton;
    WebElement checkingAccountActivityButton;
    WebElement transferFundsButton;
    WebElement myMoneyMapButton;
    WebElement onlineStatements;

    WebElement carouselRightArrowButton;
    WebElement carouselLeftArrowButton;
    WebElement usernameDropdownMenu;
    WebElement logoutOptionFromDropdownMenu;
    WebElement currentPictureOfCarousel;
    WebElement settingsDropdownMenu;
    WebElement helpMenu;
  


    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getHomeButton() {
        return driver.findElement(By.id("homeMenu"));
    }

    public WebElement getSearchField() {
        return driver.findElement(By.id("searchTerm"));
    }

    public WebElement getSigninButton() {
        return driver.findElement(By.id("signin_button"));
    }

    public WebElement getOnlineBankingButton() {
        return driver.findElement(By.id("onlineBankingMenu"));
    }

    public WebElement getFeedbackButton() {
        return driver.findElement(By.id("feedback"));
    }

    public WebElement getMoreServicesButton() {
        return driver.findElement(By.id("online-banking"));
    }

    public WebElement getCheckingAccountActivityButton() {
        return driver.findElement(By.id("account_activity_link"));
    }

    public WebElement getTransferFundsButton() {
        return driver.findElement(By.id("transfer_funds_link"));
    }

    public WebElement getMyMoneyMapButton() {
        return driver.findElement(By.id("money_map_link"));
    }

    public WebElement getCarouselRightArrowButton() {
        return driver.findElement(By.xpath("//*[@id=\"carousel\"]/a[2]"));
    }

    public WebElement getCarouselLeftArrowButton() {
        return driver.findElement(By.xpath("//*[@id=\"carousel\"]/a[1]"));
    }

    public WebElement getUsernameDropdownMenu() {
        return driver.findElement(By.xpath("//*[@id=\"settingsBox\"]/ul/li[3]/a"));
    }

    public WebElement getLogoutOptionFromDropdownMenu() {
        return driver.findElement(By.id("logout_link"));
    }
    

    public WebElement getCurrentPictureOfCarousel() {
        return driver.findElement(By.cssSelector(".item.active"));
    }

    public WebElement getSettingsDropdownMenu() {
        return driver.findElement(By.className("dropdown-toggle"));
    }

    public WebElement getHelpMenu() {
        return driver.findElement(By.id("help_link"));
    }


    public void clickOnHomeButton(){
        getHomeButton().click();
    }
    public void clickOnSigninButton(){
        getSigninButton().click();
    }
    public void clickOnOnlineBankingButton() {
        getOnlineBankingButton().click();
    }
    public void clickOnFeedbackButton() {
        getFeedbackButton().click();
    }
    public void clickOnMoreServicesButton() {
        getMoreServicesButton().click();
    }
    public void clickOnCheckingAccountActivityButton() {
        getCheckingAccountActivityButton().click();
    }
    public void clickOnTransferFundsButton(){
        getTransferFundsButton().click();
    }
    public void clickOnMyMoneyMapButton(){
        getMyMoneyMapButton().click();
    }
    public void clickOnCarouselRightArrowButton(){
        getCarouselRightArrowButton().click();
    }
    public void clickOnCarouselLeftArrowButton(){
        getCarouselLeftArrowButton().click();
    }
    public void clickOnUsernameDropdownMenu() {
        getUsernameDropdownMenu().click();
    }
    public void clickOnLogoutOptionFromDropdownMenu() {
        getLogoutOptionFromDropdownMenu().click();
    }
    public void clickOnSettingsDropDownMenu(){
        getSettingsDropdownMenu().click();
    }
    public void clickOnHelpMenu(){
        getHelpMenu().click();
    }

    public void clickOnSearchBar(){
        getSearchField().click();
    }
    public void inputSearchItem1(){
        getSearchField().clear();
        getSearchField().sendKeys("banking");
        getSearchField().sendKeys(ENTER);
    }
    public void inputSearchItem2(){
        getSearchField().clear();
        getSearchField().sendKeys("credit");
        getSearchField().sendKeys(ENTER);

    }
    public void inputSearchItem3(){
        getSearchField().clear();
        getSearchField().sendKeys("access");
        getSearchField().sendKeys(ENTER);

    }

}
