package test.RegisterTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import pages.RegisterPage.RegisterPage;
import test.BaseTest;

import static pages.BasePage.driver;
import static pages.BasePage.getBaseUrl;


public class RegisterTest extends BaseTest {
    private static final Logger LOG = LoggerFactory.getLogger(RegisterTest.class);
    private String newUrl = getBaseUrl() + "https://ro.login.olx.com/register?client_id=4bh4dq5tm2nagb44lqierru41m&code_challenge=Xg9YlBm9i5vt8Y4_EO3jaE1w_--KHM-C4iZVDh9WCP0&code_challenge_method=S256&redirect_uri=https%3A%2F%2Fwww.olx.ro%2Fcont%2Fcallback%2F&st=eyJzbCI6IjE4NGU1ZTUxMDE0eDU3ZmUxYmIiLCJzIjoiMTg3OWE5NjAwOGV4NGJmZWRjNzciLCJjYyI6MX0%3D&state=eyJyZWZlcnJlciI6Imh0dHBzOlwvXC93d3cub2x4LnJvXC9teWFjY291bnRcLyJ9";

    @Test
    public void register() {
        driver.get(newUrl);


        String EmailAdress = "danielamarisabela.puca@gmail.com";
        String Password = "Daniela1234";


        LOG.info("Type Email adress");
        RegisterPage.inputEmailAddress(EmailAdress);
        LOG.info("Type password");
        RegisterPage.Password(Password);
        
        LOG.info("Click Creeazauncont");
        RegisterPage.clickCreeazauncont("Creeazauncont");
        LOG.info("Click Checkbox Button ");
        RegisterPage.clickCheckbox();
        LOG.info("Click Facebook Login");
        RegisterPage.clickFacebookLogin();
        LOG.info("Click Google Login");
        RegisterPage.GoogleLogin();
        LOG.info("Click Apple Login");
        RegisterPage.AppleLogin();


    }


}









