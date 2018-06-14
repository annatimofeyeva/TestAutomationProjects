import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class AlertExample {

    WebDriver driver;

    @BeforeTest
    public void openBrowser() throws InterruptedException {

        String baseUrl;
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        baseUrl = ("https://www.w3schools.com/Jsref/tryit.asp?filename=tryjsref_alert");
        driver.get(baseUrl);
        Thread.sleep(4000);
    }

    @Test
    public void alert() throws InterruptedException {

        System.out.println("Hi");

        WebDriverWait wait = new WebDriverWait(driver, 110);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@onclick='myFunction()']"))).click();

        //WebElement alertClickButton = driver.findElement(By.xpath("/html/body/button"));
        //Thread.sleep(3000);


        // Only one Alerts allows on the page
        // Pop - up could be many

        Alert alert = driver.switchTo().alert(); // Alert Object

        alert.dismiss();
        String str = alert.getText();

        if (str.equals("Hello! I am an alert box!")) {
            alert.accept();
        }
    }
}

