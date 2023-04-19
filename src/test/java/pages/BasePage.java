package pages;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BasePage {
    private static final Logger LOG = LoggerFactory.getLogger(BasePage.class);
    public static WebDriver driver;

    public static void setUp(){
        LOG.info("Start test");
        System.setProperty("webdriver.chrome.driver", "C://webdrivers/chromedriver112.exe");
        driver= new ChromeDriver();
        String url="https://www.olx.ro/";
        driver.get(url);

        LOG.info("Open browser maximize");
//        driver.manage().window().maximize();
        Dimension dimension = new Dimension(1366, 768);
        driver.manage().window().setSize(dimension);
    }
    public static void tearDown(){
        LOG.info("Close the browser");
        driver.quit();
    }
    public static String returnBAseUrl() {
        return "https://www.olx.ro/";
    }

    public static String getBaseUrl() {
        String baseUrl = returnBAseUrl();
        if (baseUrl != null) {
            return baseUrl.replace("Index.html", "");
        }
        return baseUrl;
    }
}
