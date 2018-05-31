import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebElement;


public class FireFoxAutomation {

    public static void main(String[] args) throws
            InterruptedException  {
        // https://github.com/mozilla/geckodriver/releases -

        WebDriver driver;
        System.setProperty("webdriver.gecko.driver", "/home/anya/Desktop/geckodriver");
        driver = new FirefoxDriver();

        /*Waits : Implicit waits: several attempts to find elements during the time period
         * Only after this - throw ElementNotFoundExeption
         *
         * Implicit waits:
         * - pageLoads: driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
         * - scripts processing: driver.manage().timeouts().setSctiptTimeout(10, TimeUnit.SECOND);
         */

        // Explicit Waits: code, which  is waiting to some event before starting to do the script.
		/* bad practice: Thread.sleep(1000) - so the time might be not enough
		 * good practice: WebDriverWait and ExpectedConditions:
		 *
		 *
		 * WebDriver driver = new FirefoxDriver();
           driver.get("http://some_url");
           WebElement dynamicElement = (new WebDriverWait(driver, 10))
           .until(ExpectedConditions.presenceOfElementLocated(By.id("dynamicElement_id")));

		 * скрипт будет ждать элемента с id = dynamicElement_id 10 секунд,
		 * но продолжит выполнение только когда элемент будет найден
		 */

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // implicit waits for FF openings
        driver.manage().window().maximize();
        String baseURL = "https://www.google.com/";
        driver.get(baseURL);
        driver.findElement(By.id("lst-ib")).sendKeys("Shasta");
        driver.findElement(By.name("btnK")).click();
        driver.navigate().back();
        driver.findElement(By.linkText("Gmail")).click();
        Thread.sleep(3000);
        driver.navigate().back();
        driver.findElement(By.partialLinkText("Stor")).click();
        driver.navigate().back();

        // use css selectors practice


        driver.findElement(By.cssSelector ("#lst-ib")).sendKeys("Holospora");

        //driver.findElement(By.cssSelector())

//		driver.findElement(By.id("." > li:nth-
//				 child(1)")).click();"













    }
    }
