package selenium;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by User on 9/23/2018.
 */
public class EbayBase {

    static WebDriver wd;


    @BeforeAll
    public static void setUp() {
        String pathToChromeDriver = "C://Users//User//Downloads//programms//chromedriver_win32//chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",pathToChromeDriver);
        wd = new ChromeDriver();
        wd.manage().deleteAllCookies();
    }


    @AfterAll
    public static void tearDown() {
        wd.quit();
    }

}
