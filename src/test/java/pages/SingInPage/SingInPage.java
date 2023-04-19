package pages.SingInPage;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

public class SingInPage extends BasePage {
    public static final Logger LOG = LoggerFactory.getLogger(SingInPage.class);
    public static SingInPage instance;

    private SingInPage() {
    }

    public static SingInPage getInstance() {
        if (instance == null) {
            instance = new SingInPage();
        }
        return instance;
    }


    private By logo = By.id("headerLogo");
    private By singInButton = By.id("Contul tău");
    private By MesajButton = By.id("Mesaje");
    private By FavoriteItem = By.id("data-icon=star");
    private By Adaugaanuntnou = By.id("postNewAdLink");
    private By SearchBar = By.id("headerSearch");
    private By LocationBar = By.id("cityField");
    private By CautaacumButton = By.id("homepage_button_search");
    private By Categoriiprincipale = By.id("maincategories-list");


    public boolean isLogoDisplayed() {
        LOG.info("Verify if Logo is displayed");
        return driver.findElement(logo).isDisplayed();

    }

    public boolean issingInButtonDisplayed() {
        LOG.info("Verfy if 'Contul tău'button is displayed");
        return driver.findElement(singInButton).isDisplayed();
    }
    public void clickSignInButton() {
        LOG.info("Click 'sign in' button");
        driver.findElement(singInButton).click();
    }

    public boolean isbuttonMesajeDisplayed() {
        LOG.info("Verify if Mesaje button is displayed ");
        return driver.findElement(MesajButton).isDisplayed();
    }

    public boolean isFavoriteItemDisplayed() {
        LOG.info("Verify if Favorite Item is displayed ");
        return driver.findElement(FavoriteItem).isDisplayed();
    }

    public boolean ispostNewAdLinkDisplayed() {
        LOG.info("Verify if Adaugaanuntnou button is displayed");
        return driver.findElement(Adaugaanuntnou).isDisplayed();
    }

    public boolean isSearchBarDisplayed() {
        LOG.info("Verify if headerSearch is displayed");
        return driver.findElement(SearchBar).isDisplayed();
    }

    public boolean isLocationBarDisplayed() {
        LOG.info("Verify if LocationBar is displayed");
        return driver.findElement(LocationBar).isDisplayed();
    }

    public boolean isCautaacumButtonDisplayed() {
        LOG.info("Verify if CautaacumButton is displayed");
        return driver.findElement(CautaacumButton).isDisplayed();
    }

    public boolean isCategoriiprincipaleDisplayed() {
        LOG.info("Verify if Categoriiprincipale is displayed");
        return driver.findElement(Categoriiprincipale).isDisplayed();
    }


}