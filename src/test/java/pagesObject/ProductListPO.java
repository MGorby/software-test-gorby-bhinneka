package pagesObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import utility.SeleniumHelpers;

public class ProductListPO {

    WebDriver driver;
    SeleniumHelpers selenium;

    public ProductListPO(WebDriver driver) {
        this.driver = driver;
        selenium = new SeleniumHelpers(driver);
        // This initElements method will create all WebElements
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10), this);
    }

    @FindBy(css = "#__next > div:nth-child(3) > div:nth-child(4) > div > div > div.css-lr4l63 > div:nth-child(2) > a")
    private WebElement computerProduct;

    @FindBy(xpath = "(//label[@class='css-1y28mi8'])[1]")
    private WebElement asusCheckbox;

    @FindBy(xpath = "(//input[@data-testid='input'])[3]")
    private WebElement minPrice;

    @FindBy(xpath = "(//input[@data-testid='input'])[4]")
    private WebElement maxPrice;

    @FindBy(css = "#__next .css-79elbk.e1uu5jkk0 .css-1reb8g2.e1uu5jkk5 > div:nth-child(1) > div > a")
    private WebElement firstListProduct;

    /**
     * Click on Computer
     *
     * @throws InterruptedException
     */
    public void clickComputerProduct() throws InterruptedException {
        selenium.clickOn(computerProduct);
    }

    /**
     * Click on Asus Checkbox
     * @throws InterruptedException
     */
    public void clickAsusCheckBox() throws InterruptedException {
        selenium.clickOn(asusCheckbox);
    }

    /**
     * Enter minimum price
     */
    public void enterMinValue(String minimum) throws InterruptedException {
        selenium.clearTextField(minPrice);
        selenium.enterText(minPrice, minimum, false);
        selenium.clickOn(maxPrice);
        selenium.waitInCaseElementVisible(maxPrice, 2);
    }

    /**
     * Enter maximum price
     */
    public void enterMaxValue(String maximum) throws InterruptedException {
        selenium.clearTextField(maxPrice);
        selenium.enterText(maxPrice, maximum, false);
        selenium.clickOn(minPrice);
        selenium.waitInCaseElementVisible(firstListProduct, 2);
    }

    /**
     * Click on product list
     * @throws InterruptedException
     */
    public void clickFirstListProduct() throws InterruptedException {
        selenium.clickOn(firstListProduct);
    }
}
