package selenium;

import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import selenium.pageobjects.EbayComPageObject;

/**
 * Created by User on 9/23/2018.
 */
public class EbayTest {

    private static WebDriver wd;
    EbayComPageObject ebayPage;

    @BeforeAll
    public static void setUp() {
        String pathToChromeDriver = "C://Users//User//Downloads//programms//chromedriver_win32//chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",pathToChromeDriver);
        wd = new ChromeDriver();
        wd.manage().deleteAllCookies();
    }

    @BeforeEach
    public void setUpForEach() {
        ebayPage = new EbayComPageObject(wd);
    }

    @Test

    public void shopByPriceForLeatherBags(){
        ebayPage.goToMainPage().inputSearchCriteriaIntoSearchField("Leather bags");
        ebayPage.selectAuctionItems();

    }

    @Test
    public void shouldShowBestPricesWhenSelectAuctionAfterSelectingItemsInAdditionalCategory() throws InterruptedException {
        ebayPage.goToMainPage()
                .selectItemsInAdditionalCategoryForCategory("iPhone", "Electronics");
        Assertions.assertTrue(ebayPage.getPageTitle().contains("iPhone"),
                String.format("Page title contains doesn't %s subcategory name","iPhone"));
    }

    @AfterAll
    public static void tearDown() {
        wd.quit();
    }


}
