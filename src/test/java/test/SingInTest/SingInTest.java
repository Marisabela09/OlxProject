package test.SingInTest;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SingInPage.SingInPage;
import test.BaseTest;
import test.RegisterTest.RegisterTest;


class SignInTest extends BaseTest {

    private static final Logger LOG = LoggerFactory.getLogger(RegisterTest.class);


    @Test
    public void checkIfLogoIsDisplayed() {

        LOG.info("Verify if logo is displayed");
        Assert.assertTrue(SingInPage.instance.isLogoDisplayed(), "Logo is displayed");

        LOG.info("Verify if singInButton is displayed");
        Assert.assertTrue(SingInPage.instance.isLogoDisplayed(), "SingInButton is displayed");

        LOG.info("Verify if MesajButton is displayed ");
        Assert.assertTrue(SingInPage.instance.isLogoDisplayed(), "MesajButton is displayed");

        LOG.info("Verify if FavoriteItem is displayed");
        Assert.assertTrue(SingInPage.instance.isLogoDisplayed(), "FavoriteItem is diplayed");

        LOG.info("Verify if AdaugaanuntnouButton is displayed");
        Assert.assertTrue(SingInPage.instance.isLogoDisplayed(), "Adaugaanuntnou is displayed");

        LOG.info("Verify if SearchBar is displayed");
        Assert.assertTrue(SingInPage.instance.isLogoDisplayed(), "SearchBar is displayed");

        LOG.info("Verify if LocationBar is displayed");
        Assert.assertTrue(SingInPage.instance.isLogoDisplayed(), "LocationBar is displayed");

        LOG.info("Verify if CautaacumButton is displayed");
        Assert.assertTrue(SingInPage.instance.isLogoDisplayed(), "CautaacumButton is displayed");

        LOG.info("Verify if Categoriiprincipale is displayed");
        Assert.assertTrue(SingInPage.instance.isLogoDisplayed(), "Categoriiprincipale is displayed");


    }
}

