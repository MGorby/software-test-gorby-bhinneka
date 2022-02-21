package steps;

import io.cucumber.java.en.And;
import org.testng.Assert;
import pagesObject.DetailPagePO;
import tests.TestBase;
import utility.SeleniumHelpers;

public class detailPageSteps extends TestBase{
    private SeleniumHelpers selenium = new SeleniumHelpers(driver);
    private DetailPagePO detail = new DetailPagePO(driver);

    @And("user click add the amount of the product")
    public void userClickAddTheAmountOfTheProduct() throws InterruptedException {
        detail.addProductAmount();
    }

    @And("user click on Add to Cart button")
    public void userClickOnAddToCartButton() throws InterruptedException {
        detail.clickAddToCart();
    }

    @And("user click on Continue to Cart button")
    public void userClickOnContinueToCartButton() throws InterruptedException {
        detail.clickContinueToCart();
    }

    @And("user see product information")
    public void userSeeProductInformation() {
        Assert.assertTrue(detail.isProductPictDisplayed(), "Product pict is not displayed");
        Assert.assertTrue(detail.isProductNameDisplayed(), "Product name is not displayed");
        Assert.assertTrue(detail.isUnitPriceDisplayed(), "Unit price is not displayed");
        Assert.assertTrue(detail.isProductAmountDisplayed(), "The amount of product is not displayed");
        Assert.assertTrue(detail.isTotalPriceDisplayed(), "Total price is not displayed");
    }

}