package stepDefinitions;

import Util.DriverFactory;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.ProductPage;

public class ProductPageSteps {

    WebDriver driver = DriverFactory.getDriver();
    ProductPage productPage = new ProductPage(driver);

    @When("Sepete ekleye tiklanir")
    public void sepeteEkleyeTiklanir() {
        productPage.addCart();
    }


    @When("Sepete gidilir")
    public void sepeteGidilir() {
        productPage.clickCart();
    }
}
