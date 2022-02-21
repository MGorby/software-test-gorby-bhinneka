package pagesObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import utility.SeleniumHelpers;

public class HomepagePO {

    WebDriver driver;
    SeleniumHelpers selenium;

    public HomepagePO(WebDriver driver) {
        this.driver = driver;
        selenium = new SeleniumHelpers(driver);
        // This initElements method will create all WebElements
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10), this);
    }

    @FindBy(css = "#onesignal-slidedown-allow-button")
    private WebElement allowNotifButton;

    @FindBy(css = "#__next .css-f46lxa header .css-70qvj9 button span")
    private WebElement loginButton;

    @FindBy(css = "#__next #searchProduct input")
    private WebElement searchBox;

    @FindBy(css = "#searchProduct > div.css-yhj6ev > div:nth-child(2) > div")
    private WebElement topSearchResult;

    @FindBy(css = "#__next div:nth-child(3) > div > div > div.css-lr4l63 > div:nth-child(8) > a")
    private WebElement techAndCommsCategory;

    @FindBy(css = "#__next > div:nth-child(3) > div:nth-child(5) > div > div > div.product-carousel.css-15xrkku > div > div > div.slick-list > div > div:nth-child(10) > div > div > a")
    private WebElement fsProduct1;

    @FindBy(css = "#__next > div:nth-child(3) > div:nth-child(5) > div > div > div.product-carousel.css-15xrkku > div > div > div.slick-list > div > div:nth-child(11) > div > div > a")
    private WebElement fsProduct2;

    /**
     * Click on Sign In button
     *
     * @throws InterruptedException
     */
    public void clickAllowNotif() throws InterruptedException {
        selenium.clickOn(allowNotifButton);
    }

    /**
     * Click on Sign Up button
     *
     * @throws InterruptedException
     */
    public void clickLoginButton() throws InterruptedException {
        selenium.clickOn(loginButton);
    }

    /**
     * Enter Keyword in searchbox
     */
    public void searchKeyword(String keyword) {
        selenium.enterText(searchBox, keyword, false);
    }

    /**
     * Click the top result of the search
     * @throws InterruptedException
     */
    public void clickTheTopResult() throws InterruptedException {
        selenium.waitInCaseElementVisible(topSearchResult, 2);
        selenium.clickOn(topSearchResult);
    }

    /**
     * Click on Sign In button
     *
     * @throws InterruptedException
     */
    public void clickTechAndComms() throws InterruptedException {
        selenium.clickOn(techAndCommsCategory);
    }

    /**
     * Choose one of the flash sale product
     */
    public void clickFSProduct1() throws InterruptedException {
        selenium.clickOn(fsProduct1);
    }

    /**
     * Choose another of the flash sale product
     */
    public void clickFSProduct2() throws InterruptedException {
        selenium.clickOn(fsProduct2);
    }
}
