package stepDefinitions;

import Util.DriverFactory;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.CartPage;

public class CartPageSteps {

    WebDriver driver = DriverFactory.getDriver();
    CartPage cartPage = new CartPage(driver);

    @When("Urun sepetten cikarilir")
    public void urunSepettenCikarilir() {
        cartPage.clickDelete();
    }

    @Then("urunun yoklugu kontrol edilir")
    public void urununYokluguKontrolEdilir() {
        cartPage.checkcart();
    }

    @Then("urunun varlıgı kontrol edilir")
    public void urununVarlıgıKontrolEdilir() {
        cartPage.checkProduct();
    }
}
