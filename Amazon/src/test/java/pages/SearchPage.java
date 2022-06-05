package pages;

import Util.ElementHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchPage {

    By appleButton = By.cssSelector("div:nth-child(4) > ul:nth-child(2) > li:nth-child(3) > span:nth-child(1) > a:nth-child(1) > span:nth-child(2)");
    By ikinciSayfaButon = By.cssSelector("a[aria-label='2 sayfasına git']");
    By cerez = By.cssSelector(".a-button-input.celwidget");
    By product = By.xpath("//span[text () = 'Apple MWYR2ZM/A iPhone 11 Pro Silikon Telefon Kılıfı, Alaskan Blue' ]");

    WebDriver driver;


    public SearchPage(WebDriver driver){
        this.driver = driver;
    }

    public void clickCerez() {
        driver.findElement(cerez).click();
    }

    public void clickApple(String product) {
        driver.findElement(appleButton).click();
    }

    public void clickIkinciSayfa(int a) {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0 , 3000);");
        driver.findElement(ikinciSayfaButon).click();
    }

    public void clickProduct() {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0 , 2500);");
        driver.findElement(product).click();
    }




}
