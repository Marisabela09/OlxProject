package test;


import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import pages.BasePage;
import pages.MyAccount.MyAccount;
import pages.RegisterPage.RegisterPage;
import pages.SingInPage.SingInPage;


public class BaseTest {
    public SingInPage singInPage = SingInPage.getInstance();
    public RegisterPage registerPage = RegisterPage.getInstance();
    public MyAccount myAccount = MyAccount.getInstance();



    @BeforeSuite
    public void init(){
        BasePage.setUp();
    }

    @AfterSuite
    public void tearDown(){
        BasePage.tearDown();
    }

}