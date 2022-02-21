package pagesObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import utility.SeleniumHelpers;

public class CartPagePO {

    WebDriver driver;
    SeleniumHelpers selenium;

    public CartPagePO(WebDriver driver) {
        this.driver = driver;
        selenium = new SeleniumHelpers(driver);
        // This initElements method will create all WebElements
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10), this);
    }

    @FindBy(css = "#__next .css-y490my.etma6yr6  div:nth-child(1) > div > button")
    private WebElement minusCartButton;

    @FindBy(css = "#__next .block .css-p8bxtj.e1lsoz2m4  button")
    private WebElement deleteCartButton;

    @FindBy(css = "#__next .css-vbd6bd .css-1ggscc .css-1awmzl8")
    private WebElement confirmDeleteButton;

    @FindBy(css = "#__next .css-f46lxa > div:nth-child(2)  .css-1c6lmah > a > img")
    private WebElement backToHomepageButton;

    /**
     * Click on Sign In button
     *
     * @throws InterruptedException
     */
    public void clickMinusCart() throws InterruptedException {
        selenium.clickOn(minusCartButton);
    }

    /**
     * Click on delete cart list
     *
     * @throws InterruptedException
     */
    public void clickDeleteCartList() throws InterruptedException {
        selenium.clickOn(deleteCartButton);
        selenium.waitInCaseElementClickable(confirmDeleteButton, 2);
        selenium.clickOn(confirmDeleteButton);
    }

    /**
     * Back to Homepage
     *
     * @throws InterruptedException
     */
    public void clickBacktoHome() throws InterruptedException {
        selenium.clickOn(backToHomepageButton);
    }
}
