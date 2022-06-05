package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class HomePage {

    By logo = By.cssSelector("#nav-logo-sprites");
    By searchBox = By.cssSelector("#twotabsearchtextbox");
    By searchButton = By.cssSelector("#nav-search-submit-button");

    WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public void checkLogo(){
        driver.findElement(logo);
    }

    public void setSearchBox(String product){
        driver.findElement(searchBox).sendKeys(product);
    }

    public void clickSearchButton(){
        driver.findElement(searchButton).click();
    }
}
