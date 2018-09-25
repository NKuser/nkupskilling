package selenium.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.time.Duration;
import java.util.List;

/**
 * Created by User on 9/23/2018.
 */
public class EbayComPageObject extends BasePageObject {

    private final String SEARCH_BUTTON="//input[@id='gh-btn']";
    private final String SEARCH_FIELD="//input[@id='gh-ac']";
    private final String AUCTION_BUTTON="//a[@title='Auction']";
    private final String SHOP_BY_PRICE="//a[@class='search-guidance__text-item-link']";
    private String mainPage = "https://www.ebay.com/";

    public EbayComPageObject(WebDriver webDriver) {
        super(webDriver);
    }

    public EbayComPageObject goToMainPage() {
        webDriver.get(mainPage);
        return this;
    }
    public String getPageTitle() {
        return webDriver.getTitle();
    }
    public void inputSearchCriteriaIntoSearchField(String searchCriteria){
        webDriver.findElement(By.xpath(SEARCH_FIELD)).sendKeys(searchCriteria);
        webDriver.findElement(By.xpath(SEARCH_BUTTON)).click();
    }

    public void selectAuctionItems(){
        webDriver.findElement(By.xpath(AUCTION_BUTTON)).click();
        //findElementWithWait(AUCTION_BUTTON);
    }

//    public EbayComPageObject getPricesButtons() {
//        List<WebElement> pricesButtons = webDriver.findElements(By.xpath(SHOP_BY_PRICE));
//
//        for (WebElement button : pricesButtons) {
//            button.getText();
//        }
//        return ;
//    }

    public EbayComPageObject selectItemsInAdditionalCategoryForCategory(String subCategory,
                                                                        String category) {
        Actions builder = new Actions(webDriver);
        String xpathSelCat =
                String.format("//td[@role ='listitem']/a[contains(text(),'Electronics')]",category);
        String xpathSelSubCat = String.format("//a[@title='Electronics - iPhone']",subCategory);
        builder.moveToElement(findElementWithWait(By.xpath(xpathSelCat)))
                .pause(Duration.ofSeconds(2))
                .moveToElement(findElementWithWait(By.xpath(xpathSelSubCat)))
                .click()
                .build()
                .perform();
        return this;
    }



}
