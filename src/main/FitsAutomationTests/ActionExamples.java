import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ActionExamples {


    @Test

    public void mouseActions() throws InterruptedException {
        WebDriver driver;
        String baseUrl;
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

//        driver.get("http://artoftesting.com/sampleSiteForSelenium.html");
//
//        //double click the button to lunch the Alert box:
//
//        Actions action = new Actions(driver);
//        WebElement clickButton = driver.findElement(By.xpath("//button[@id='dblClkBtn']"));
//        action.doubleClick(clickButton);
//        Thread.sleep(2000);
//        driver.quit();

        // use Shift button:

        driver.get("http://fits.qauber.com");
        Thread.sleep(2000);
        WebElement inputField = driver.findElement(By.xpath("//input[@id='exampleInputEmail1']"));

        Actions builder = new Actions(driver);
        Action typeInCaps = builder
                .keyDown(inputField, Keys.SHIFT)
                .sendKeys("hello")
                .keyUp(inputField, Keys.SHIFT)
                .build();
        typeInCaps.perform();
        inputField.submit();
   }
}

