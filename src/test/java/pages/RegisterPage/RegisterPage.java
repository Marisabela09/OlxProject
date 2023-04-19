package pages.RegisterPage;


import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;
import pages.SingInPage.SingInPage;


public class RegisterPage extends BasePage {
    public static final Logger LOG = LoggerFactory.getLogger(SingInPage.class);
    public static RegisterPage instance;
    


    private RegisterPage() {
    }

    public static RegisterPage getInstance() {
        if (instance == null) {
            instance = new RegisterPage();
        }
        return instance;
    }

    public By inputEmailAddress = By.xpath("//input[@type='email']");
    public By Password = By.xpath("//input[@type='password']");
    public static By Checkbox = By.xpath("//div[@role='checkbox']");
    public static By Creeazauncont = By.xpath("//button[@data-testid='register-button']");
    public static By FacebookLogin = By.xpath("//button[@data-testid='facebook-button'])");
    public By AppleLogin = By.xpath("//button[@data-testid='apple-button']");
    public By GoogleLogin = By.xpath("//button[@data-testid='google-button']");

    public static void inputEmailAddress(String email) {
    }

    public static void Password(String password) {

    }

    public static void GoogleLogin() {
    }

    public static void AppleLogin() {
    }

    public static void clickCreeazauncont(String creeazauncont) {
    }


    public void typeInEmailAdress(String emailAdress) {
        LOG.info("Type in Email Adress");
        driver.findElement(inputEmailAddress).sendKeys(emailAdress);
    }

    public void setPassword(String password) {
        LOG.info("Set password");
        driver.findElement(Password).sendKeys(password);
    }

    public static void clickCheckbox() {
        LOG.info("Click the Checkbox");
        driver.findElement(Checkbox).click();
    }

    public static void clickCreeazauncont() {
        LOG.info("Click the Creeazauncont");
        driver.findElement(Creeazauncont).click();
    }

    public static void clickFacebookLogin() {
        LOG.info("Click Facebook Login");
        driver.findElement(FacebookLogin).click();
    }

    public void clickAppleLogin() {
        LOG.info("Click Apple Login");
        driver.findElement(AppleLogin).click();
    }

    public void clickGoogleLogin() {
        LOG.info("Click Google Login");
        driver.findElement(GoogleLogin).click();
    }


}



