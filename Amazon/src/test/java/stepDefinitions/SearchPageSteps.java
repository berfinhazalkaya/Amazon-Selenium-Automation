package stepDefinitions;

import Util.DriverFactory;
import io.cucumber.java.en.When;
import pages.SearchPage;

public class SearchPageSteps {

    SearchPage searchPage = new SearchPage(DriverFactory.getDriver());


    @When("cerezleri kabul ete tiklanir")
    public void cerezleriKabulEteTiklanir() {
        searchPage.clickCerez();
    }

    @When("Markalardan {string} secilir")
    public void markalardanAppleSecilir(String product) {
        searchPage.clickApple(product);
    }

    @When("{int}. sayfaya gidilir")
    public void ikinciSayfayaGidilir(int a) {
        searchPage.clickIkinciSayfa(a);
    }

    @When("{string} telefon kilifi secilir")
    public void telefonKilifiSecilir(String arg0) {
        searchPage.clickProduct();
    }

}
