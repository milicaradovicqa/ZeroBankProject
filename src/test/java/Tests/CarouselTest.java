package Tests;

import Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CarouselTest extends BaseTest {

    @BeforeMethod
    public void pageSetUp() {
        driver.get("http://zero.webappsecurity.com/index.html");
    }
    @Test
    public void CarouselOnRightSideIsWorking() {
        homePage.clickOnCarouselRightArrowButton();
        Assert.assertTrue(homePage.getCurrentPictureOfCarousel().isDisplayed());
    }
    @Test
    public void CarouselOnLeftSideIsWorking() {
        homePage.clickOnCarouselLeftArrowButton();
        Assert.assertTrue(homePage.getCurrentPictureOfCarousel().isDisplayed());

    }

}
