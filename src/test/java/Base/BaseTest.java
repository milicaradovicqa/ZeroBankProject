package Base;

import Pages.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.logging.Log;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.IOException;

public class BaseTest {

    public WebDriver driver;
    public HomePage homePage;
    public LoginPage loginPage;
    public OnlineBankingPage onlineBankingPage;
    public FeedbackPage feedbackPage;
    public ForgottenPasswordPage forgottenPasswordPage;
    public PayBillsPage payBillsPage;
    public HelpTopicsPage helpTopicsPage;
    public OnlineStatementsPage onlineStatementsPage;
    public TransferFundsPage transferFundsPage;
    public ExcelReader excelReader;


    @BeforeClass
    public void setUp() throws IOException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        excelReader = new ExcelReader("PayeeData.xlsx");
        homePage = new HomePage(driver);
        loginPage = new LoginPage(driver);
        onlineBankingPage = new OnlineBankingPage(driver);
        feedbackPage = new FeedbackPage(driver);
        forgottenPasswordPage = new ForgottenPasswordPage(driver);
        payBillsPage = new PayBillsPage(driver);
        helpTopicsPage = new HelpTopicsPage(driver);
        onlineStatementsPage = new OnlineStatementsPage(driver);
        transferFundsPage = new TransferFundsPage(driver);
    }
    @AfterClass
    public void tearDown() {
        driver.manage().deleteAllCookies();
        driver.quit();
    }
}
