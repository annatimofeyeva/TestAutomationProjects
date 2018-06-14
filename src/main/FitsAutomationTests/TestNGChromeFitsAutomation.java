import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
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

        // Explicit Wait:

        WebDriverWait wait = new WebDriverWait(driver, 30);

        // specific to an element

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='exampleInputEmail1']")))
                .sendKeys("annatimofeyeva@yandex.ru");

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


   @AfterTest(enabled=false)
    public void closeBroser() {
        driver.quit();
   }
} // end of class

// Xpaths for needle marks
// label[text()='Needle Marks']/..//span[@class='fa fa-check'] - Check box (edited)
// label[text()='Needle Marks']/..//input[@name='needleMarks'] - Text Box (edited)