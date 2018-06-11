import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.ui.Select;


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

        // Subject Information Form page tests

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
        weight.sendKeys("165.25");
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

        // Select from Drop Down

        String stateName = "Alabama";
        //WebElement state = driver.findElement(By.name("state"));
        WebElement state = driver.findElement(By.xpath("//input[@ng-hide='showStatesDropDown']"));
        Select state2 = new Select(driver.findElement(By.name("state")));
        state2.selectByVisibleText(stateName);

        WebElement zipCode = driver.findElement(By.xpath(" //input[@ng-model='wizard.report.zip']"));
        zipCode.sendKeys("98004");
        WebElement telephone = driver.findElement(By.xpath(" //input[@ng-model='wizard.report.contactTelephone']"));
        telephone.sendKeys("425-111-1111");
        WebElement eMail = driver.findElement(By.xpath(" //input[@ng-model='wizard.report.contactEmail']"));
        eMail.sendKeys("john@john.com");

        // Radio buttons
        WebElement radioDriver = driver.findElement(By.xpath("//label[text() = 'Driver']"));
        radioDriver.click();
        WebElement radioPassenger = driver.findElement(By.xpath("//label[text() = 'Passenger']"));
        radioPassenger.click();
        WebElement radioPedestrian = driver.findElement(By.xpath("//label[text() = 'Pedestrian']"));
        radioPedestrian.click();


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

        // Previous page clicking

//        WebElement previuosPageLink = driver.findElement(By.xpath("//a[@ng-click='wizard.go(1)']"));
//        previuosPageLink.click();


        // Field Interview Card page tests

//
//        if ( !driver.findElement(By.xpath("//input[@ng-model='wizard.report.tattoos']")).isSelected() )
//        {
//            driver.findElement(By.id("idOfTheElement")).click();
//        }

//        List<WebElement> els = driver.findElements(By.xpath("//input[@type='checkbox']"));
//        for ( WebElement el : els ) {
//            if ( !el.isSelected() ) {
//                el.click();
//            }
//        }

        WebElement checkBoxTattoos = driver.findElement(By.xpath("//input[@ng-model='wizard.report.tattoos']"));
        Actions xAct1 = new Actions(driver);
        xAct1.moveToElement(checkBoxTattoos);
        xAct1.click();
        xAct1.perform();

//        WebElement checkBoxScars = driver.findElement(By.xpath("//input[@ng-model='wizard.report.scars']"));
//        Actions xAct2 = new Actions(driver);
//        xAct2.moveToElement(checkBoxScars);
//        xAct2.click();
//        xAct2.perform();

//        WebElement checkBoxNeedleMarks = driver.findElement(By.xpath("//input[@ng-model='wizard.report.needleMarks']"));
//        Actions xAct3 = new Actions(driver);
//        xAct3.moveToElement(checkBoxNeedleMarks);
//        xAct3.click();
//        xAct3.perform();
//
//        WebElement checkBoxTracks = driver.findElement(By.xpath("//input[@ng-model='wizard.report.tracks']"));
//        Actions xAct4 = new Actions(driver);
//        xAct4.moveToElement(checkBoxTracks );
//        xAct4.click();
//        xAct4.perform();
//
//        WebElement checkBoxGlasses = driver.findElement(By.xpath("//input[@ng-model='wizard.report.glasses']"));
//        Actions xAct5 = new Actions(driver);
//        xAct5.moveToElement(checkBoxTracks );
//        xAct5.click();
//        xAct5.perform();
//
//
//        WebElement checkBoxMustache = driver.findElement(By.xpath("//input[@ng-model='wizard.report.mustache']"));
//        Actions xAct6 = new Actions(driver);
//        xAct6.moveToElement(checkBoxTracks );
//        xAct6.click();
//        xAct6.perform();
//
//        WebElement checkBoxBeard = driver.findElement(By.xpath("//input[@ng-model='wizard.report.beard']"));
//        Actions xAct7 = new Actions(driver);
//        xAct7.moveToElement(checkBoxTracks );
//        xAct7.click();
//        xAct7.perform();

        WebElement nextPageLink1 = driver.findElement(By.xpath("//a[@ng-click='wizard.go(4)']"));
        nextPageLink1.click();

    // Field Interview Card page

        WebElement socialSecurity = driver.findElement(By.xpath("//input[@name='socialSecurity']"));
        socialSecurity.sendKeys("11111111");
        WebElement driverLicense = driver.findElement(By.xpath("//input[@name='driverLicense']"));
        driverLicense.sendKeys("AAA");

        // Select from drop down



        //WebElement stateFirst= driver.findEString stateFirst = "Alabama";lement(By.name("state"));
        String stateFirst = "Alabama";
        Select newstate = new Select(driver.findElement(By.xpath("//select[@ng-model='wizard.report.dlState']")));
        newstate.selectByVisibleText(stateFirst);

        WebElement otherIDNumber = driver.findElement(By.xpath("//input[@name='other-id']"));
        otherIDNumber.sendKeys("AAAAAAAAAA");

        //String country2 = "United States";
        //WebElement state = driver.findElement(By.name("state"));
        Select  selectCountry = new Select(driver.findElement(By.name("otherIdCountry")));
        selectCountry.selectByVisibleText("Albania");

        WebElement otherIDType = driver.findElement(By.xpath("//input[@name='other-id-type']"));
        otherIDType.sendKeys("BBBBBBBB");


//        //input[@ng-hide="showStatesDropDown"]
//        String stateSecond = "Albania";
//        Select  selectCountryHiden = new Select(driver.findElement(By.xpath("//select[@ng-hide='showStatesDropDown']")));
//        selectCountryHiden.selectByVisibleText(stateSecond);

        WebElement schoolName = driver.findElement(By.xpath("//input[@name='school-name']"));
        schoolName.sendKeys("BHS");
        WebElement schoolAddress = driver.findElement(By.xpath("//input[@name='school-address']"));
        schoolAddress.sendKeys("1st Main street");
        WebElement schoolCity = driver.findElement(By.xpath("//input[@name='school-city']"));
        schoolCity.sendKeys("Bellevue");

        // state 3
        //WebElement name = driver.findElement(By.xpath(""));

        WebElement schoolZip = driver.findElement(By.xpath("//input[@name='school-zip']"));
        schoolAddress.sendKeys("98004");
        WebElement schoolTelephone = driver.findElement(By.xpath("//input[@name='schoolTelephone']"));
        schoolTelephone.sendKeys("4251111111");

        WebElement parentName = driver.findElement(By.xpath("//input[@name='parent-name']"));
        parentName.sendKeys("Steve");
        WebElement parentAddress = driver.findElement(By.xpath("//input[@name='parent-address']"));
        parentAddress.sendKeys("1st Main street");
        WebElement parentCity = driver.findElement(By.xpath("//input[@name='parent-city']"));
        parentCity.sendKeys("Redmond");

        // state 4
        //WebElement name = driver.findElement(By.xpath(""));

        WebElement parentZip = driver.findElement(By.xpath("//input[@name='parentZip']"));
        parentZip.sendKeys("980025");

        WebElement subjectOccupation = driver.findElement(By.xpath("//input[@name='occupation']"));
        subjectOccupation.sendKeys("teacher");
        WebElement employersName = driver.findElement(By.xpath("//input[@name='employer-name']"));
        employersName.sendKeys("Seattle University");
        WebElement employersAddress = driver.findElement(By.xpath("//input[@name='employer-address']"));
        employersAddress.sendKeys("1st Main street");
        WebElement employersCity = driver.findElement(By.xpath("//input[@name='employer-city']"));
        employersCity.sendKeys("Seattle");

        // state4
        //

        WebElement employersZip = driver.findElement(By.xpath("//input[@name='employer-zip']"));
        employersZip.sendKeys("123456");
        WebElement employerTelephone = driver.findElement(By.xpath("//input[@name='employerTelephone']"));
        employerTelephone.sendKeys("34567678");
        WebElement nextPageLink2 = driver.findElement(By.xpath("//a[@ng-click='wizard.go(5)']"));
        Actions xAct3 = new Actions(driver);
        xAct3.moveToElement(nextPageLink2);
        xAct3.click();
        xAct3.perform();






    } // end of method
} // end of class
