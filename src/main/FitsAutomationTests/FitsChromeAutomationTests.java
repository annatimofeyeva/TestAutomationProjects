import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
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

        // Entering data for the Subject Information Form

        WebElement caseId = driver.findElement(By.xpath("//input[@ng-model = 'wizard.report.caseNumber']"));
        caseId.sendKeys("11111");
        WebElement suspectType = driver.findElement(By.xpath("//select[@ng-model='wizard.report.suspectType']//option[@value = 'Victim']"));
        suspectType.click();
        WebElement lastName = driver.findElement(By.xpath("//input[@ng-model = 'wizard.report.lastName']"));
        lastName.sendKeys("Smith");
        WebElement firstName = driver.findElement(By.xpath("//input[@ng-model = 'wizard.report.firstName']"));
        firstName.sendKeys("John");
        WebElement middleName = driver.findElement(By.xpath("//input[@ng-model = 'wizard.report.middleName']"));
        middleName.sendKeys("S");
        WebElement nickName = driver.findElement(By.xpath("//input[@ng-model = 'wizard.report.nickname']"));
        nickName.sendKeys("NNN");
        WebElement DOB = driver.findElement(By.xpath("//input[@ng-model = 'wizard.report.dob']"));
        DOB.sendKeys("11/23/1990");
        WebElement age = driver.findElement(By.xpath("//input[@ng-model = 'wizard.report.age']"));
        age.sendKeys("28");
        WebElement sex = driver.findElement(By.xpath(" //select[@ng-model = 'wizard.report.sex']//option[text() = 'M']"));
        sex.click();
        WebElement race = driver.findElement(By.xpath(" //select[@ng-model = 'wizard.report.race']//option[@value = 'Alaskan Native']"));
        race.click();
        WebElement height = driver.findElement(By.xpath("//input[@ng-model = 'wizard.report.height']"));
        height.sendKeys("5.7");
        WebElement weight = driver.findElement(By.xpath(" //input[@ng-model = 'wizard.report.weight']"));
        weight.sendKeys("165");
        WebElement build = driver.findElement(By.xpath("//select[@ng-model = 'wizard.report.build']//option[@value = 'M']"));
        build.click();
        WebElement hairColor = driver.findElement(By.xpath(" //select[@ng-model = 'wizard.report.hairColor']//option[@value = 'BLK']"));
        hairColor.click();
        WebElement hairLength = driver.findElement(By.xpath("//select[@ng-model = 'wizard.report.hairLength']//option[@value = 'Short']"));
        hairLength.click();
        WebElement hairStyle = driver.findElement(By.xpath("//select[@ng-model = 'wizard.report.hairStyle']//option[@value = 'Curly']"));
        hairStyle.click();
        WebElement eyeColor = driver.findElement(By.xpath("//select[@ng-model = 'wizard.report.eyeColor']//option[@value = 'BLU']"));
        eyeColor.click();
        WebElement complexion = driver.findElement(By.xpath("//select[@ng-model = 'wizard.report.complexion']//option[@value =    'Medium']"));
        complexion.click();
        WebElement teeth = driver.findElement(By.xpath("//select[@ng-model = 'wizard.report.teeth']//option[@value = 'Gold']"));
        teeth.click();
        WebElement handPreference = driver.findElement(By.xpath("//select[@ng-model = 'wizard.report.handPreference']//option[@value = 'Left']"));
        handPreference.click();
        WebElement primaryLanguage = driver.findElement(By.xpath("//input[@ng-model = 'wizard.report.primaryLanguage']"));
        primaryLanguage.sendKeys("English");
        WebElement streetAddress = driver.findElement(By.xpath(" //input[@ng-model = 'wizard.report.streetAddress']"));
        streetAddress.sendKeys("1st Main street");
        WebElement country = driver.findElement(By.xpath(" //select[@ng-model='wizard.report.country']//option[text() = 'United States']"));
        country.click();
        WebElement city = driver.findElement(By.xpath("//input[@ng-model='wizard.report.city']"));
        city.sendKeys("Seattle");

        // ????????????? Question for Yagna

        //org.openqa.selenium.WebDriverException: unknown error: cannot focus element
        /**
         * in real application we need to type - sendKeys()
         * when we run - it shows drop down with SELECT values;
         * in HTML - there exist both input and select tags
         */

//        WebElement state = driver.findElement(By.xpath("//input[@ng-hide = 'showStatesDropDown']"));
//        state.sendKeys("Washington");

        //input[@ng-hide = 'showStatesDropDown']
        //option[text() = 'Alabama']
        ////select[@ng-show='showStatesDropDown']//option[@value='AL']

        WebElement zipCode = driver.findElement(By.xpath(" //input[@ng-model='wizard.report.zip']"));
        zipCode.sendKeys("98004");
        WebElement telephone = driver.findElement(By.xpath(" //input[@ng-model='wizard.report.contactTelephone']"));
        telephone.sendKeys("425-111-1111");
        WebElement eMail = driver.findElement(By.xpath(" //input[@ng-model='wizard.report.contactEmail']"));
        eMail.sendKeys("john@john.com");

        // Radio buttons
        WebElement radioPassenger = driver.findElement(By.xpath("//label[text() = 'Passenger']"));
        radioPassenger.click();


        // Next page link clicking

        //org.openqa.selenium.ElementNotVisibleException:
        // Element is not currently visible and so may not be interacted with

        /*
        For some browsers it happens that once mouse hover action is performed, but the menu
        list disappear quickly before Selenium identify the next sub menu item. In that case
        it is better to use perform() action on the main menu to hold the menu list till the
        time Selenium identify the sub menu item and click on it.

        WebElement someElement = driver.findElement(By.xpath("//a[@ng-click='wizard.go(3)']"));
        Actions xAct = new Actions(driver);
        xAct.moveToElement(someElement);
        xAct.click();
        xAct.perform();
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        */

        WebElement nextPageLink = driver.findElement(By.xpath("//a[@ng-click='wizard.go(3)']"));
        Actions xAct = new Actions(driver);
        xAct.moveToElement(nextPageLink);
        xAct.click();
        xAct.perform();

        // Previous page

//        WebElement previuosPageLink = driver.findElement(By.xpath("//a[@ng-click='wizard.go(1)']"));
//        previuosPageLink.click();


    } // end of method
} // end of class
