package test.MyAccount;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MyAccount.MyAccount;
import test.BaseTest;

import static pages.BasePage.driver;
import static pages.BasePage.getBaseUrl;


public class MyAccountTest extends BaseTest {
    private static final Logger LOG = LoggerFactory.getLogger(MyAccountTest.class);
    private String newUrl = getBaseUrl() + "d/myaccount/waiting/";

    @Test
    public void register() {
        driver.get(newUrl);

        LOG.info("Click ContulMeu Tab");
        myAccount.clickContulMeu();

        LOG.info("Click Anunturi");
        myAccount.clickAnunturi();

        LOG.info("Click Mesaje");
        myAccount.clickMesaje();

        LOG.info("Click Plati");
        myAccount.clickPlati();

        LOG.info("Click Rating");
        myAccount.clcickRating();

        LOG.info("Click Curier");
        myAccount.clickCourier();

        LOG.info("Click Profilulcandidatului");
        myAccount.clickProfilulcandidatului();

        LOG.info("Click Setari");
        myAccount.clickSetari();

        LOG.info("Click Livrare");
        myAccount.clickLivrareprinOlx();

        LOG.info("Sold Cont is displayed");
        Assert.assertTrue(MyAccount.getInstance().isSoldContDisplayed(), "Sold cont is displayed");

        LOG.info("Credite disponibile tab is displayed");
        Assert.assertTrue(MyAccount.getInstance().isCrediteDisponibileDisplayed(), "Credite disponibile is displayed");

        LOG.info("Sold cont Box is displayed");
        Assert.assertTrue(MyAccount.getInstance().isSoldContDisplayed(), "Sold cont box is displayed");

        LOG.info("Click Pachete");
        myAccount.clickPachete();

        LOG.info("Click Adaugacredite");
        myAccount.clickAdaugacredite();

        LOG.info("Click Cumparaunpachet");
        myAccount.clickCumparaunpachet();






    }


}
