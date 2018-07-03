import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;


public class PomFitsLoginTest {

    WebDriver driver;

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
    public void test1() throws InterruptedException {

        String emailLogin = "annatimofeyeva@yandex.ru";
        String password = "curviuscula2011";
        Thread.sleep(4000);
        PomFitsLoginPage loginPage = new PomFitsLoginPage(driver);
        loginPage.typeUserName(emailLogin);
        loginPage.typePassword(password);
        loginPage.clickLoginButton();
        Thread.sleep(5000);
    }


//    @AfterTest(enabled = false)
//    public void closeBrowser() {
//        driver.quit();
//    }

}
