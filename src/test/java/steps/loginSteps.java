package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pagesObject.LoginPO;
import tests.TestBase;
import utility.SeleniumHelpers;

public class loginSteps extends TestBase{
    private SeleniumHelpers selenium = new SeleniumHelpers(driver);
    private LoginPO login = new LoginPO(driver);

    @And("user fill email {string}")
    public void userFillEmail(String email) throws InterruptedException {
        login.enterEmail(email);
        login.clickNextButton();
    }

    @And("user fill password {string}")
    public void userFillPassword(String password) {
        login.enterPassword(password);
    }

    @And("user click on Sign in button")
    public void userClickOnSignInButton() throws InterruptedException {
        login.clickSignInButton();
    }
}