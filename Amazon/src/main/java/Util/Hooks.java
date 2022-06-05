package Util;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

import java.util.Properties;

public class Hooks {

    WebDriver driver ;
    Properties properties;

    @Before
    public void before(){
        String browser = Reporter.getCurrentTestResult().getTestContext().getCurrentXmlTest().getParameter("browser");
        //Bu kod sayesinde before ile birlikte testng'den browser parametresini aldık
        properties = ConfigReader.initialize_Properties();
        driver = DriverFactory.initialize_Driver("Chrome"); // Her teste başlamadan önce Driver'ı kurduk

    }

    @BeforeStep
    public void beforeStep(){
    }

    @AfterStep
    public void afterStep(){
    }

    @After
    public void after(){
    driver.close(); //Testten sonra driver'ı kapat.
    }
}
