package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {

    By cartButton = By.cssSelector("#add-to-cart-button");
    By cart = By.cssSelector("div[id='nav-cart-text-container'] span[class='nav-line-1']");

    WebDriver driver;

    public ProductPage(WebDriver driver){
        this.driver = driver;
    }
    public void addCart(){
        driver.findElement(cartButton).click();
    }
    public void clickCart() {
        driver.findElement(cart).click();
    }
}
