import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

// created a Class for Login page, so all the Xpaths are stored in one place

public class PomFitsLoginPage {
    WebDriver wb;

    public PomFitsLoginPage(WebDriver wb){
        this.wb = wb;
        PageFactory.initElements(wb, this);
    }

    @FindBy(xpath="//input[@id='exampleInputEmail1']")
    WebElement usernameTextBox;
    @FindBy(xpath="//input[@id='exampleInputPassword1']")
    WebElement passwordTextBox;
    @FindBy(xpath="//button[@type='submit']")
    WebElement loginButton;


    public void typeUserName(String userName){
        usernameTextBox.sendKeys(userName);
    }

    public void typePassword(String password){

        passwordTextBox.sendKeys(password);
    }

    public void clickLoginButton(){

        loginButton.click();
    }
}
