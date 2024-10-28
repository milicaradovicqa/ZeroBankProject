package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PayBillsPage {
    WebDriver driver;
    WebElement payeeDropDownList;
    WebElement accountDropDownList;
    WebElement amountInDollarsField;
    WebElement dateField;
    WebElement descriptionField;
    WebElement payButton;
    WebElement paySavedPayeeCard;

    //--------------------------------------------
    WebElement addNewPayeeCard;
    WebElement payeeNameField;
    WebElement payeeAddressField;
    WebElement accountField;
    WebElement payeeDetailsField;
    WebElement addButton;

    //--------------------------------------------
    WebElement purchaseForeignCurrencyCard;
    WebElement currencyDropDownList;
    WebElement amountNoCurrencyField;
    WebElement radioButtonUSD;
    WebElement radioButtonSelectedCurrency;
    WebElement calculateCostsButton;
    WebElement purchaseButton;

    public PayBillsPage(WebDriver driver) {
        this.driver = driver;
    }
    //------------------------------------------------------
    public WebElement getPaySavedPayeeCard() {
        return driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div/div/div[2]/ul/li[1]/a"));
    }
    public WebElement getPayeeDropDownList() {
        return driver.findElement(By.id("sp_payee"));
    }

    public WebElement getAccountDropDownList() {
        return driver.findElement(By.id("sp_account"));

    }

    public WebElement getAmountInDollarsField() {
        return driver.findElement(By.id("sp_amount"));
    }

    public WebElement getDateField() {
        return driver.findElement(By.id("sp_date"));
    }

    public WebElement getDescriptionField() {
        return driver.findElement(By.id("sp_description"));

    }

    public WebElement getPayButton() {
        return driver.findElement(By.id("pay_saved_payees"));
    }


    //-------------------------------------------------------
    public WebElement getAddNewPayeeCard() {
        return driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div/div/div[2]/ul/li[2]/a"));
    }

    public WebElement getPayeeNameField() {
        return driver.findElement(By.id("np_new_payee_name"));
    }

    public WebElement getPayeeAddressField() {
        return driver.findElement(By.id("np_new_payee_address"));
    }

    public WebElement getAccountField() {
        return driver.findElement(By.id("np_new_payee_account"));
    }

    public WebElement getPayeeDetailsField() {
        return driver.findElement(By.id("np_new_payee_details"));
    }

    public WebElement getAddButton() {
        return driver.findElement(By.id("add_new_payee"));
    }
    //-------------------------------------------------------------
    public WebElement getPurchaseForeignCurrencyCard() {
        return driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div/div/div[2]/ul/li[3]/a"));
    }

    public WebElement getCurrencyDropDownList() {
        return driver.findElement(By.id("pc_currency"));
    }

    public WebElement getAmountNoCurrencyField() {
        return driver.findElement(By.id("pc_amount"));
    }

    public WebElement getRadioButtonUSD() {
        return driver.findElement(By.id("pc_inDollars_true"));
    }

    public WebElement getRadioButtonSelectedCurrency() {
        return driver.findElement(By.id("pc_inDollars_false"));
    }

    public WebElement getCalculateCostsButton() {
        return driver.findElement(By.id("pc_calculate_costs"));
    }

    public WebElement getPurchaseButton() {
        return driver.findElement(By.id("purchase_cash"));
    }

    public void clickOnPayeeDropDownList() {
        getPayeeDropDownList().click();
    }
    public void clickOnAccountDropDownList() {
        getAccountDropDownList().click();
    }
    public void inputAmountInDolars() {
        getAmountInDollarsField().sendKeys("900");
    }
    public void clickOnDateField() {
        getDateField().click();
    }
    public void inputDescriptionField() {
        getDescriptionField().sendKeys("savings");
    }
    public void clickOnPayButton() {
        getPayButton().click();
    }
    public void clickOnPaySavedPayee() {
        getPaySavedPayeeCard().click();
    }
    //---------------------------------------------------

    public void clickOnAddNewPayeeCard() {
        getAddNewPayeeCard().click();
    }
    public void inputPayeeName (String payeeName) {
        getPayeeNameField().clear();
        getPayeeNameField().sendKeys(payeeName);
    }
    public void inputPayeeAddress (String payeeAddress) {
        getPayeeAddressField().clear();
        getPayeeAddressField().sendKeys(payeeAddress);
    }
    public void inputAccount (String account) {
        getAccountField().clear();
        getAccountField().sendKeys(account);
    }
    public void inputPayeeDetails (String payeeDetails){
        getPayeeDetailsField().clear();
        getPayeeDetailsField().sendKeys(payeeDetails);
    }
    public void clickOnAddButton() {
        getAddButton().click();
    }
    //----------------------------------------------------

    public void clickOnPurchaseForeignCurrencyCard() {
        getPurchaseForeignCurrencyCard().click();
    }
    public void clickOnCurrencyDropDownList() {
        getCurrencyDropDownList().click();
    }
    public void inputAmountWithoutCurrency() {
        getAmountNoCurrencyField().sendKeys("900");
    }
    public void clickOnRadioButtonUSD() {
        getRadioButtonUSD().click();
    }
    public void clickOnRadioButtonSelectedCurrency() {
        getRadioButtonSelectedCurrency().click();
    }
    public void clickOnCalculateCostButton() {
        getCalculateCostsButton().click();
    }
    public void clickOnPurchaseButton() {
        getPurchaseButton().click();
    }

}

