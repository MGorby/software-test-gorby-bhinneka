package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pagesObject.CartPagePO;
import tests.TestBase;
import utility.SeleniumHelpers;

public class cartPageSteps extends TestBase{
    private SeleniumHelpers selenium = new SeleniumHelpers(driver);
    private CartPagePO cart = new CartPagePO(driver);

    @And("user click on minus button on cart page")
    public void userClickOnMinusButtonOnCartPage() throws InterruptedException {
        cart.clickMinusCart();
    }

    @Then("user click on delete cart")
    public void userClickOnDeleteCart() throws InterruptedException {
        cart.clickDeleteCartList();
    }

    @And("user back to homepage")
    public void userBackToHomepage() throws InterruptedException {
        cart.clickBacktoHome();
    }
}