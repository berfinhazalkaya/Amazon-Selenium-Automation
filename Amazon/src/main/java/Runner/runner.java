package Runner;


import Util.DriverFactory;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;


@CucumberOptions(
        features = {"src/test/java/Features"},
        glue = {"stepDefinitions", "Util"},
//        tags = "@UrunEkleme", --> Tag bir tagi koşmak istersek
        plugin = {
        "summary", "pretty", "html:Reports/CucumberReport/Reports.html",
        "json:Reports/CucumberReport/Report", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" }
)


public class runner extends AbstractTestNGCucumberTests {

    static WebDriver driver = DriverFactory.getDriver();

    @BeforeSuite
    public void beforeSuit(){
    }

    @BeforeTest()
    public void beforeTest(){
    }

    @BeforeClass()
    public void beforeClass(){
        System.out.println("before class");
    }
    @BeforeMethod()
    public void beforeMethod(){
        System.out.println("before method");
    }

    @BeforeGroups()
    public void beforeGroup(){
        System.out.println("before group");
    }

    @AfterMethod()
    public void afterMethod(){
        System.out.println("after method");
    }

    @AfterClass()
    public void afterClass(){
        System.out.println("after class");
    }

    @AfterTest()
    public void afterTest(){
        System.out.println("after test");
    }

    @AfterSuite()
    public void afterSuite(){
        System.out.println("after suite");
    }

    @AfterGroups()
    public void afterGroup(){
        System.out.println("after group");
    }

}

