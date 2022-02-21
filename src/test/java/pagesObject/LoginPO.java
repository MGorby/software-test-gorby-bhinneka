package pagesObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import utility.SeleniumHelpers;

public class LoginPO {

    WebDriver driver;
    SeleniumHelpers selenium;

    public LoginPO(WebDriver driver) {
        this.driver = driver;
        selenium = new SeleniumHelpers(driver);
        // This initElements method will create all WebElements
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10), this);
    }

    @FindBy(css = "#email")
    private WebElement emailForm;

    @FindBy(css = "#next")
    private WebElement nextButton;

    @FindBy(css = "#password")
    private WebElement passwordForm;

    @FindBy(css = "#root .bt-split-screen__form form button")
    private WebElement signInButton;


    /**
     * Enter Text in Email
     * @param word is text we want to search
     */
    public void enterEmail(String word) {
        selenium.enterText(emailForm, word, false);
    }

    /**
     * Click on Next button
     *
     * @throws InterruptedException
     */
    public void clickNextButton() throws InterruptedException {
        selenium.clickOn(nextButton);
    }

    /**
     * Enter Text in Password
     * @param word is text we want to search
     */
    public void enterPassword(String word) {
        selenium.enterText(passwordForm, word, false);
    }

    /**
     * Click on Sign In button
     *
     * @throws InterruptedException
     */
    public void clickSignInButton() throws InterruptedException {
        selenium.clickOn(signInButton);
    }
}
