import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestNGChromeFitsAutomation {

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

    @Test (groups= {"functional", "UI"} )
    public void testLogin() throws InterruptedException {
        WebElement emailTextBox = driver.findElement(By.xpath("//input[@id='exampleInputEmail1']"));
        emailTextBox.sendKeys("annatimofeyeva@yandex.ru");
        WebElement passwordTextBox = driver.findElement(By.xpath("//input[@id='exampleInputPassword1']"));
        passwordTextBox.sendKeys("curviuscula2011");
        WebElement loginButton = driver.findElement(By.xpath("//button[text() = 'Login']"));
        Thread.sleep(2000);
        loginButton.click();
    }

    @Test(dependsOnMethods = {"testLogin"}, groups={"functional", "UI"}, description = "This is a test for adding new report", enabled = false)
    public void addReport() {


    }

    @Test(dependsOnMethods = {"addReport","testLogin"}, groups={"functional", "UI"}, enabled = false)
    public void searchReport() {

    }


   @AfterTest
    public void closeBroser() {
        driver.quit();
   }
} // end of class
