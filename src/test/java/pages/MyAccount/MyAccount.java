package pages.MyAccount;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

public class MyAccount extends BasePage {
    public static final Logger LOG = LoggerFactory.getLogger(MyAccount.class);
    public static MyAccount instance;

    private MyAccount() {
    }

    public static MyAccount getInstance() {
        if (instance == null) {
            instance = new MyAccount();
        }
        return instance;
    }

    private By ContulMeu = By.xpath("//a[@href='https://www.olx.ro/myaccount/']");
    private By Anunturi = By.xpath("//li[@data-testid='tabs-myaccount']");
    private By Mesaje = By.xpath("//li[@data-testid='tabs-messages']");
    private By Plati = By.xpath("//li[@data-testid='tabs-payments']");
    private By Rating = By.xpath("//li[@data-testid='tabs-ratings']");
    private By Curier = By.xpath("//li[@data-testid='tabs-courier']");
    private By Profilulcandidatului = By.xpath("//li[@data-testid='tabs-candidateProfile']");
    private By Setari = By.xpath("//li[@data-testid='tabs-settings']");
    private By Pachete = By.xpath("//li[@data-testid='tabs-business']");
    private By LivrareprinOlx = By.xpath("//li[@data-testid='tabs-delivery']");
    private By Soldcont = By.xpath("//li[@data-cy='wallet-balance']");
    private By Creditedisponibile = By.xpath("//li[@data-cy='promo-points-balance']");
    private By Infosoldcont = By.xpath("////button[@aria-label='Sold cont']");
    private By Adaugacredite = By.xpath("//a[@href='https://www.olx.ro/payment/wallet/topupaccount/']");
    private By Cumparaunpachet = By.xpath("//a[@href='/purchase/packages/?bs=myaccount_buypackage']");

    public void clickContulMeu() {
        LOG.info("Click Contul Meu");
        driver.findElement(ContulMeu).click();
    }

    public void clickAnunturi() {
        LOG.info("Click Anunturi Tab");
        driver.findElement(Anunturi).click();
    }

    public void clickMesaje() {
        LOG.info("Click Mesaje Tab");
        driver.findElement(Mesaje).click();
    }

    public void clickPlati() {
        LOG.info("Click Plati Tab");
        driver.findElement(Plati).click();
    }

    public void clcickRating() {
        LOG.info("Click Rating Tab");
        driver.findElement(Rating).click();
    }

    public void clickCourier() {
        LOG.info("Click Curier Tab");
        driver.findElement(Curier).click();
    }

    public void clickProfilulcandidatului() {
        LOG.info("Click Profilulcandidatului Tab");
        driver.findElement(Profilulcandidatului).click();
    }

    public void clickSetari() {
        LOG.info("Click Setari Tab");
        driver.findElement(Setari).click();
    }

    public void clickPachete() {
        LOG.info("Click Pachete Tab");
        driver.findElement(Pachete).click();

    }

    public void clickLivrareprinOlx() {
        LOG.info("Click LivareprinOlx Tab");
        driver.findElement(LivrareprinOlx).click();
    }

    public boolean isSoldContDisplayed() {
        LOG.info("Verify if 'Soldcont' is displayed");
        return driver.findElement(Soldcont).isDisplayed();
    }

    public boolean isCrediteDisponibileDisplayed() {
        LOG.info("Verify if 'Creditedisponibile' is displayed");
        return driver.findElement(Creditedisponibile).isDisplayed();
    }

    public boolean isInfosoldcontDisplayed() {
        LOG.info("Verify if 'Infosoldcont' is displayed");
        return driver.findElement(Infosoldcont).isDisplayed();
    }

    public void clickAdaugacredite() {
        LOG.info("Click Adaugacredite Tab");
        driver.findElement(Adaugacredite).click();
    }

    public void clickCumparaunpachet() {
        LOG.info("Click Cumparaunpachet Tab");
        driver.findElement(Cumparaunpachet).click();
    }


}







