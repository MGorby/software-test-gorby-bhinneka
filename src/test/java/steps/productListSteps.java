package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pagesObject.ProductListPO;
import tests.TestBase;
import utility.SeleniumHelpers;

public class productListSteps extends TestBase{
    private SeleniumHelpers selenium = new SeleniumHelpers(driver);
    private ProductListPO product = new ProductListPO(driver);

    @And("user click on Computer product")
    public void userClickOnComputerProduct() throws InterruptedException {
        product.clickComputerProduct();
    }

    @And("user check Asus brand filter")
    public void userCheckAsusBrandFilter() throws InterruptedException {
        product.clickAsusCheckBox();
    }

    @And("user set minimal price {string}")
    public void userSetMinimalPrice(String min) throws InterruptedException {
        product.enterMinValue(min);
    }

    @And("user set maximum price {string}")
    public void userSetMaximumPrice(String max) throws InterruptedException {
        product.enterMaxValue(max);
    }

    @And("user choose the product")
    public void userChooseTheProduct() throws InterruptedException {
        product.clickFirstListProduct();
    }
}