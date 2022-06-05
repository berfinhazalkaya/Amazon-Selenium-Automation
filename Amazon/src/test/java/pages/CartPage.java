package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage {

    By checkProduct = By.cssSelector("input[value='Proceed to checkout']");
    By delete = By.cssSelector("input[value='Sil']");
    WebDriver driver;

    public CartPage(WebDriver driver){
        this.driver = driver;
    }

    public void clickDelete() {
        driver.findElement(delete).click();
    }

    public void checkcart() {
        WebElement message = driver.findElement(By.cssSelector("#sc-subtotal-label-activecart"));
        System.out.println(message.getText());
    }

    public void checkProduct() {
        driver.findElement(checkProduct);
    }
}

