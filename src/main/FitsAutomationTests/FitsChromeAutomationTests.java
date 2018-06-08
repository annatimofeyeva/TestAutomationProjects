import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import java.util.List;

import java.util.concurrent.TimeUnit;


public class FitsChromeAutomationTests {

    //System.setProperty("webdriver.chrome.driver", "/home/anya/Desktop/chromedriver");
    @Test
    public void FitsChromeAutomationTests() throws InterruptedException {
        WebDriver driver;
        String baseUrl;
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        baseUrl = ("http://fits.qauber.com");
        driver.get(baseUrl);

        // Login
        WebElement emailTextBox = driver.findElement(By.xpath("//input[@id='exampleInputEmail1']"));
        emailTextBox.sendKeys("annatimofeyeva@yandex.ru");

        WebElement passwordTextBox = driver.findElement(By.xpath("//input[@id='exampleInputPassword1']"));
        passwordTextBox.sendKeys("curviuscula2011");

        WebElement loginButton = driver.findElement(By.xpath("//button[text() = 'Login']"));
        Thread.sleep(2000);
        loginButton.click();

        // Add Report Form

        // 1. Click "Add report Button"
        WebElement addReportButton = driver.findElement(By.xpath("//span[text() = 'Add Report']"));
        addReportButton.click();

        //2. Select Radiobutton:

        WebElement lab1RadioBnt = driver.findElement(By.xpath("//label[text() = 'Lab1']"));
        lab1RadioBnt.click();
        Thread.sleep(2000);

        WebElement lab2RadioBnt = driver.findElement(By.xpath("//label[text() = 'Lab2']"));
        lab2RadioBnt.click();
        Thread.sleep(2000);

        WebElement lab3RadioBnt = driver.findElement(By.xpath("//label[text() = 'Lab3']"));
        lab3RadioBnt.click();
        Thread.sleep(2000);

        // click on Subject Information icon

        WebElement subjectInformatinIcon = driver.findElement(By.xpath("//div[@title='Subject Information']"));
        subjectInformatinIcon.click();
        Thread.sleep(2000);



    } // end of method
} // end of class
