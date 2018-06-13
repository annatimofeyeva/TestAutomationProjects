import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
//import java.util.concurrent.ThreadLocalRandom;
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

        // Add Report Form:

        // "Add report Button"
        WebElement addReportButton = driver.findElement(By.xpath("//span[text() = 'Add Report']"));
        addReportButton.click();

        // Select Radiobutton:

        // button clicked with Xpath
        WebElement lab1RadioBnt = driver.findElement(By.xpath("//label[text() = 'Lab1']"));
        lab1RadioBnt.click();
        Thread.sleep(2000);

        WebElement lab2RadioBnt = driver.findElement(By.xpath("//label[text() = 'Lab2']"));
        lab2RadioBnt.click();
        Thread.sleep(2000);

        WebElement lab3RadioBnt = driver.findElement(By.xpath("//label[text() = 'Lab3']"));
        lab3RadioBnt.click();
        Thread.sleep(2000);

        // Subject Information icon

        WebElement subjectInformatinIcon = driver.findElement(By.xpath("//div[@title='Subject Information']"));
        subjectInformatinIcon.click();
        Thread.sleep(2000);

        // Subject Information Form page:

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

        // Drop Down elements with List
//
//        List<WebElement> countrylist = driver.findElements(By.xpath("//select[@ng-model='wizard.report.country']/option"));
//        for(WebElement country : countrylist) {
//            String countryName = country.getText();
//            Thread.sleep(2000);
//            //System.out.println(country.getText()); -OK
//            //System.out.println(country); - OK
//            if(countryName.equals("Albania")){
//              country.click();
//            System.out.println("OK");
//           }
//        }

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

        // Radio buttons: - work!!!
//        WebElement radioDriver = driver.findElement(By.xpath("//label[text() = 'Driver']"));
//        radioDriver.click();
//        WebElement radioPassenger = driver.findElement(By.xpath("//label[text() = 'Passenger']"));
//        radioPassenger.click();
//        WebElement radioPedestrian = driver.findElement(By.xpath("//label[text() = 'Pedestrian']"));
//        radioPedestrian.click();

//         Radiobutton clicked with isSelected(): does not work!!!
//
//         Store all the elements of same category in the list of WebLements
//
//        List <WebElement> radioButtons = driver.findElements(By.xpath("//label//input[@type='radio']"));
//
//        // Create a boolean variable which will hold the value (True/False)
//
//        boolean bValue = false;
//
//        // This statement will return True, in case of first Radio button is selected
//
//        bValue = radioButtons.get(0).isSelected();
//
//        // This will check that if the bValue is True means if the first radio button is selected
//
//        if(bValue = true){
//
//            // This will select Second radio button, if the first radio button is selected by default
//
//            radioButtons.get(1).click();
//
//        }else{
//
//            // If the first radio button is not selected by default, the first will be selected
//
//            radioButtons.get(0).click();
//
//        }

        // Find the checkbox or radio button element by Name - work!!!

        List<WebElement> oCheckBox = driver.findElements(By.xpath("//label//input[@type='radio']"));

        // This will tell you the number of checkboxes are present

        int iSize = oCheckBox.size();

        // Start the loop from first checkbox to last checkboxe

        for (int i = 0; i < iSize; i++) {

            // Store the checkbox name to the string variable, using 'Value' attribute

            String sValue = oCheckBox.get(i).getAttribute("value");

            // Select the checkbox it the value of the checkbox is same what you are looking for

            if (sValue.equalsIgnoreCase("Passenger")) {

                oCheckBox.get(i).click();

                // This will take the execution out of for loop

                break;

            }
        }

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


        // Next page clicking - works!

//        WebElement nextPageLink = driver.findElement(By.xpath("//a[@ng-click='wizard.go(3)']"));
//        Actions xAct = new Actions(driver);
//        xAct.moveToElement(nextPageLink);
//        xAct.click();
//        xAct.perform();


        WebElement nextPageLink = driver.findElement(By.xpath("//*[@ng-show='wizard.active(2)']//a[@ng-click = 'wizard.go(3)']"));
        nextPageLink.click();
        Thread.sleep(2000);

//        driver.navigate().back();
//        Thread.sleep(1000);
//        driver.navigate().forward();
//        Thread.sleep(1000);


        // Field Interview Card page tests

        // all checkboxes are selected:

//        List<WebElement> els = driver.findElements(By.xpath("//input[@type='checkbox']"));
//        for ( WebElement el : els ) {
//            if ( !el.isSelected() ) {
//                el.click();

//            }
//        }

        List<WebElement> interviewCardcheckbx = driver.findElements(By.xpath("//input[@type='checkbox']"));
        for (WebElement e : interviewCardcheckbx) {
            if (!e.isSelected()) {
                interviewCardcheckbx.get(0).click();
                break;

            }
        }
        WebElement tatoosData = driver.findElement(By.xpath("//input[@name='Tattoos']"));
        tatoosData.sendKeys("Test1");
        WebElement scarsCheck = driver.findElement(By.xpath("//input[@ng-model='wizard.report.scars']"));
        scarsCheck.click();
        WebElement scarsData = driver.findElement(By.xpath("//input[@name='Scars']"));
        scarsData.sendKeys("Test2");
        WebElement needleMarksCheck = driver.findElement(By.xpath("//input[@ng-model='wizard.report.needleMarks']"));
        needleMarksCheck.click();
        WebElement needleMarksData = driver.findElement(By.xpath("//input[@name = 'needleMarks']"));
        needleMarksData.sendKeys("Test3");
        WebElement tracks = driver.findElement(By.xpath("//input[@ng-model='wizard.report.tracks']"));
        tracks.click();
        WebElement tracksData = driver.findElement(By.xpath("//input[@name = 'Tracks']"));
        tracksData.sendKeys("Test4");
        WebElement glasses = driver.findElement(By.xpath("//input[@ng-model='wizard.report.glasses']"));
        glasses.click();
        WebElement glassesData = driver.findElement(By.xpath("//input[@name = 'Glasses']"));
        glassesData.sendKeys("Test5");
        WebElement mustache = driver.findElement(By.xpath("//input[@ng-model='wizard.report.mustache']"));
        mustache.click();
        WebElement mustacheData = driver.findElement(By.xpath("//input[@name = 'Mustache']"));
        mustacheData.sendKeys("Test6");
        WebElement beard = driver.findElement(By.xpath("//input[@ng-model='wizard.report.beard']"));
        beard.click();
        WebElement beardData = driver.findElement(By.xpath("//input[@name = 'Beard']"));
        beardData.sendKeys("Test7");


        WebElement nextPageLink1 = driver.findElement(By.xpath("//a[@ng-click='wizard.go(4)']"));
        nextPageLink1.click();

        // Field Interview Card page

        WebElement socialSecurity = driver.findElement(By.xpath("//input[@name='socialSecurity']"));
        socialSecurity.sendKeys("11111111");
        WebElement driverLicense = driver.findElement(By.xpath("//input[@name='driverLicense']"));
        driverLicense.sendKeys("AAA");

        // Drop down using Select class:
        String stateFirst = "Alabama";
        WebElement newState1 = driver.findElement(By.xpath("//select[@ng-model='wizard.report.dlState']"));
        Select newstateOne = new Select(newState1);
        newstateOne.selectByVisibleText(stateFirst);
        WebElement otherIDNumber = driver.findElement(By.xpath("//input[@name='other-id']"));
        otherIDNumber.sendKeys("AAAAAAAAAA");
        String countrySecond = "United States";
        WebElement stateObject2 = driver.findElement(By.name("otherIdCountry"));
        Select selectCountry = new Select(stateObject2);
        selectCountry.selectByVisibleText(countrySecond);

        // Drop down using Select class:
        String stateSecond = "Washington";
        WebElement newState2 = driver.findElement(By.xpath("//select[@ng-show='showOtherIdStatesDropDown']"));
        Select newstateSecond = new Select(newState2);
        newstateSecond.selectByVisibleText(stateSecond);

        WebElement otherIDType = driver.findElement(By.xpath("//input[@name='other-id-type']"));
        otherIDType.sendKeys("BBBBBBBB");

        WebElement schoolName = driver.findElement(By.xpath("//input[@name='school-name']"));
        schoolName.sendKeys("BHS");
        WebElement schoolAddress = driver.findElement(By.xpath("//input[@name='school-address']"));
        schoolAddress.sendKeys("1st Main street");
        WebElement schoolCity = driver.findElement(By.xpath("//input[@name='school-city']"));
        schoolCity.sendKeys("Bellevue");
        WebElement schoolState = driver.findElement(By.xpath("//select[@ng-model='wizard.report.schoolState']//option[text()='California']"));
        schoolState.click();
        WebElement schoolZip = driver.findElement(By.xpath("//input[@ng-model='wizard.report.schoolZip']"));
        schoolZip.sendKeys("98004");
        WebElement schoolTelephone = driver.findElement(By.xpath("//input[@name='schoolTelephone']"));
        schoolTelephone.sendKeys("4251111111");


        WebElement parentName = driver.findElement(By.xpath("//input[@name='parent-name']"));
        parentName.sendKeys("Steve");
        WebElement parentAddress = driver.findElement(By.xpath("//input[@name='parent-address']"));
        parentAddress.sendKeys("1st Main street");
        WebElement parentCity = driver.findElement(By.xpath("//input[@name='parent-city']"));
        parentCity.sendKeys("Redmond");
        WebElement parentState = driver.findElement(By.xpath("//select[@ng-model='wizard.report.parentState']//option[text()='Hawaii']"));
        parentState.click();
        WebElement parentZip = driver.findElement(By.xpath("//input[@name='parentZip']"));
        parentZip.sendKeys("2345678");
        WebElement parentTelephone = driver.findElement(By.xpath("//input[@name='parentTelephone']"));
        parentTelephone.sendKeys("425444666");

        WebElement subjectOccupation = driver.findElement(By.xpath("//input[@name='occupation']"));
        subjectOccupation.sendKeys("teacher");
        WebElement employersName = driver.findElement(By.xpath("//input[@name='employer-name']"));
        employersName.sendKeys("Seattle University");
        WebElement employersAddress = driver.findElement(By.xpath("//input[@name='employer-address']"));
        employersAddress.sendKeys("1st Main street");
        WebElement employersCity = driver.findElement(By.xpath("//input[@name='employer-city']"));
        employersCity.sendKeys("Seattle");
        WebElement employersState = driver.findElement(By.xpath("//select[@ng-model='wizard.report.employerState']//option[text()='California']"));
        employersState.click();
        WebElement employersZip = driver.findElement(By.xpath("//input[@name='employer-zip']"));
        employersZip.sendKeys("123456");
        WebElement employerTelephone = driver.findElement(By.xpath("//input[@name='employerTelephone']"));
        employerTelephone.sendKeys("34567678");

        WebElement nextPageLink3 = driver.findElement(By.xpath("//*[@ng-show='wizard.active(4)']//a[@ng-click = 'wizard.go(5)']"));
        nextPageLink3.click();
        Thread.sleep(2000);

        // Distribution page
        // isSelected() method is used to know whether the Checkbox is toggled on or off.

//        List<WebElement> options = driver.findElements(By.xpath("//input[@type='checkbox']"));
       List<WebElement> options = driver.findElements(By.xpath("//input[@ng-model='wizard.report.gangUnit']"));
        Random random = new Random();
        int index = random.nextInt(options.size());
        options.get(index).click();

//        List<WebElement> Distributioncheckbx = driver.findElements(By.xpath("//input[@type='checkbox']"));
//        for (WebElement e : Distributioncheckbx ) {
//            if (!e.isSelected()) {
//                Distributioncheckbx.get(0).click();
//                break;
//
//            }
//        }

        WebElement other_distribution = driver.findElement(By.xpath("//input[@ng-model='wizard.report.other']"));
        other_distribution.click();

        WebElement reasonForStop = driver.findElement(By.xpath("//input[@name='reasonForStop']"));
        reasonForStop.sendKeys("Some reason");
        WebElement locationOfStop = driver.findElement(By.xpath("//input[@name='locationOfStop']"));
        locationOfStop.sendKeys("Some location");
        WebElement DispositionOfStop = driver.findElement(By.xpath("//input[@name='dispositionOfStop']"));
        DispositionOfStop.sendKeys("Some disposition");

        WebElement gangName = driver.findElement(By.xpath("//input[@name='gang-name']"));
        gangName.sendKeys("Some gang-name");

        WebElement howLong = driver.findElement(By.xpath("//input[@name='howLong']"));
        howLong.sendKeys("How long");

        WebElement nextPageLink4 = driver.findElement(By.xpath("//*[@ng-show='wizard.active(5)']//a[@ng-click = 'wizard.go(6)']"));
        nextPageLink4.click();
        Thread.sleep(2000);


        //Vechicle

        WebElement vehicleLicense = driver.findElement(By.xpath("//input[@name='vehicleLicense']"));
        vehicleLicense.sendKeys("AAAA");
        WebElement vehicleMake = driver.findElement(By.xpath("//input[@name='vehicleMake']"));
        vehicleMake.sendKeys("BBBB");
        WebElement vehicleModel = driver.findElement(By.xpath("//input[@name='vehicleModel']"));
        vehicleModel.sendKeys("CCCC");
        WebElement vehicleBodystyle = driver.findElement(By.xpath("//input[@name='vehicleBodystyle']"));
        vehicleBodystyle.sendKeys("DDDD");
        WebElement vehicleYear = driver.findElement(By.xpath("//input[@name='vehicleYear']"));
        vehicleYear.sendKeys("2016");
        WebElement vehicleColor = driver.findElement(By.xpath("//input[@name='vehicleColor']"));
        vehicleColor.sendKeys("Red");
        WebElement vehicleState = driver.findElement(By.xpath("//select[@ng-model='wizard.report.vehicleState']//option[@value='AK']"));
        vehicleState.click();
        WebElement vehicleOddities = driver.findElement(By.xpath("//input[@name='vehicleOddities']"));
        vehicleOddities.sendKeys("EEEE");

        WebElement nextPageLink5 = driver.findElement(By.xpath("//*[@ng-show='wizard.active(6)']//a[@ng-click = 'wizard.go(7)']"));
        nextPageLink5.click();
        Thread.sleep(2000);


//        WebElement image = driver.findElement(By.xpath("//button[@ngf-select]"));
//        image.click();
//        Thread.sleep(4000);
//        image.sendKeys("/home/anya/Desktop/Fits1.png");
//        Thread.sleep(4000);


        /*The browser cannot upload a file without an <input> element,
        unless the file is dropped from the desktop. It would be a security breach to be able
        to upload a file by code. So in your case, the<input> is probably created once the user
        has clicked the link. One way to handle this case is to silence the click event, click
        the link and then set the file to the <input>:
        */

        // disable the click event on an `<input>` file
        ((JavascriptExecutor) driver).executeScript(
                "HTMLInputElement.prototype.click = function() {                     " +
                        "  if(this.type !== 'file') HTMLElement.prototype.click.call(this);  " +
                        "};                                                                  ");

        // trigger the upload
        WebElement image = driver.findElement(By.xpath("//button[@ngf-select]"));
        image.click();

// assign the file to the `<input>`
        driver.findElement(By.cssSelector("input[type=file]"))
                .sendKeys("/home/anya/Desktop/Fits1.png");


    } // end of method
} // end of class
