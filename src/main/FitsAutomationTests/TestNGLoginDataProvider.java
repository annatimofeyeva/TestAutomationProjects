import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class TestNGLoginDataProvider {

    // Data Driven Approach


    @Test(dataProvider = "giveUserNameAndPasswords")

    public void login(String userName, String password) throws InterruptedException {
        WebDriver driver;
        String baseUrl;
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        baseUrl = ("http://fits.qauber.com");
        driver.get(baseUrl);
        WebElement userEmail = driver.findElement(By.xpath("//input[@id='exampleInputEmail1']"));
        Thread.sleep(2000);
        userEmail.sendKeys(userName);
        WebElement userPassword = driver.findElement(By.xpath("//input[@id='exampleInputPassword1']"));
        Thread.sleep(2000);
        userPassword.sendKeys(password);
        WebElement loginButton = driver.findElement(By.xpath("//button[text() = 'Login']"));
        loginButton.click();
    }

    @DataProvider

    public Object[][] giveUserNameAndPasswords() throws Exception {
        Object[][] testObjectArray = {{"annatimofeyeva@yandex.ru", "curviuscula2011"},
                //{"yagna@elephant-tamers.com", "2345"}
        };
        return testObjectArray;
    }

} // end of class

//    @Test
//
//    public void Login() throws InterruptedException {
//        WebDriverWait wait = new WebDriverWait(driver, 30);
//
//        List<WebElement> elements = driver.findElements(By.xpath("//input"));
//
//        elements.get(0).sendKeys("annatimofeyeva@yandex.ru");
//        Thread.sleep(2000);
//        elements.get(1).sendKeys("curviuscula2011");
//        Thread.sleep(2000);
//
//        WebElement loginButton = driver.findElement(By.xpath("//button[text() = 'Login']"));
//        loginButton.click();
// }


// end of class
