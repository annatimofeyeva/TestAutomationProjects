import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestNGChromeFitsAutomation {

    private ChromeDriver driver;

    @BeforeTest
    public void openBrowser() {


        WebDriver driver;
        String baseUrl;
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        baseUrl = ("http://fits.qauber.com");
        driver.get(baseUrl);
        System.out.println("Hello");
    }

    @Test
    public void login() throws InterruptedException {
        System.out.println("Hi");

        WebElement emailTextBox = driver.findElement(By.xpath("//input[@id='exampleInputEmail1']"));
        emailTextBox.sendKeys("annatimofeyeva@yandex.ru");
        WebElement passwordTextBox = driver.findElement(By.xpath("//input[@id='exampleInputPassword1']"));
        passwordTextBox.sendKeys("curviuscula2011");
        WebElement loginButton = driver.findElement(By.xpath("//button[text() = 'Login']"));
        Thread.sleep(2000);
        loginButton.click();

    }
}
