package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pagesObject.HomepagePO;
import tests.TestBase;
import utility.SeleniumHelpers;

public class homepageSteps extends TestBase{
    private SeleniumHelpers selenium = new SeleniumHelpers(driver);
    private HomepagePO home = new HomepagePO(driver);

    @Given("user navigates to {string}")
    public void userNavigatesToMamikosHomepage(String url) {
        selenium.navigateToPage(url);
    }

    @And("user dismiss notification pop up")
    public void userDismissNotificationPopUp() throws InterruptedException {
        home.clickAllowNotif();
    }

    @When("user click on Login button")
    public void userClickOnLoginButton() throws InterruptedException {
        home.clickLoginButton();
    }

    @And("user search for {string}")
    public void userSearchFor(String keyword) {
        home.searchKeyword(keyword);
    }

    @And("user select the top result")
    public void userSelectTheTopResult() throws InterruptedException {
        home.clickTheTopResult();
    }

    @And("user click on Tech and Comms category")
    public void userClickOnTechAndCommsCategory() throws InterruptedException {
        home.clickTechAndComms();
    }

    @And("user search select flash sale product")
    public void userSearchSelectFlashSaleProduct() throws InterruptedException {
        home.clickFSProduct1();
    }

    @And("user select another flash sale product")
    public void userSelectAnotherFlashSaleProduct() throws InterruptedException {
        home.clickFSProduct2();
    }
}