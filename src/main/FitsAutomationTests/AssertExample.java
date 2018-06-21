import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class AssertExample {

    private static WebDriver driver;

    @BeforeTest
    public void openBrowser() {

        String baseUrl;
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        baseUrl = ("http://fits.qauber.com");
        driver.get(baseUrl);
    }

    @Test

    public void f() {

        driver.get("http://www.store.demoqa.com");

        // Here driver will try to find out My Account link on the application

        WebElement myAccount = driver.findElement(By.xpath(".//*[@id='account']/a"));

        //Test will only continue, if the below statement is true

        //This is to check whether the link is displayed or not

        Assert.assertTrue(myAccount.isDisplayed());

        //My Account will be clicked only if the above condition is true

        myAccount.click();

    }
}