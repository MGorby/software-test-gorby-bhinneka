package pagesObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import utility.SeleniumHelpers;

public class DetailPagePO {

    WebDriver driver;
    SeleniumHelpers selenium;

    public DetailPagePO(WebDriver driver) {
        this.driver = driver;
        selenium = new SeleniumHelpers(driver);
        // This initElements method will create all WebElements
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10), this);
    }

    @FindBy(css = "#__next .css-ujyk5r .col.css-1oykcnm div div:nth-child(3) div button")
    private WebElement plusButton;

    @FindBy(css = "#__next .css-iwxgco.enfpb2q2 button.css-1t6w53m")
    private WebElement addToCartButton;

    @FindBy(css = "#__next .css-vbd6bd div .css-1ggscc .css-9vi8jg")
    private WebElement continueToCartButton;

    @FindBy(css = "#__next .css-rrb1x6.enfpb2q18 > div > div > div > div > div > div > a > div:nth-child(1) > img")
    private WebElement productPict;

    @FindBy(css = "#__next .row.content-wrapper.css-2imjyh .col.css-1oykcnm div h1")
    private WebElement productName;

    @FindBy(css = "#__next .col.css-1oykcnm div:nth-child(4) h4")
    private WebElement productUnitePrice;

    @FindBy(css = "#__next .col.css-1oykcnm div div:nth-child(7) input")
    private  WebElement productAmount;

    @FindBy(css = "#__next .css-ujyk5r .css-e7eik2.enfpb2q32 .css-8shgtf.enfpb2q34 p")
    private WebElement totalPrice;


    /**
     * Click on Plus button to add the amount of product
     *
     * @throws InterruptedException
     */
    public void addProductAmount() throws InterruptedException {
        selenium.clickOn(plusButton);
    }

    /**
     * Click on Add to cart button
     *
     * @throws InterruptedException
     */
    public void clickAddToCart() throws InterruptedException {
        selenium.clickOn(addToCartButton);
    }

    /**
     * Continue to cart page
     *
     * @throws InterruptedException
     */
    public void clickContinueToCart() throws InterruptedException {
        selenium.waitInCaseElementClickable(continueToCartButton,3);
        selenium.clickOn(continueToCartButton);
    }

    /**
     * Check element is displayed
     *
     * @return status true / false
     */
    public boolean isProductPictDisplayed() {
        return selenium.waitInCaseElementVisible(productPict, 2) != null;
    }

    public boolean isProductNameDisplayed(){
        return selenium.waitInCaseElementVisible(productName, 2) !=null;
    }

    public boolean isUnitPriceDisplayed(){
        return selenium.waitInCaseElementVisible(productUnitePrice, 2) !=null;
    }

    public boolean isProductAmountDisplayed(){
        return selenium.waitInCaseElementVisible(productAmount, 2) !=null;
    }

    public boolean isTotalPriceDisplayed(){
        return selenium.waitInCaseElementVisible(totalPrice, 2) !=null;
    }
}
