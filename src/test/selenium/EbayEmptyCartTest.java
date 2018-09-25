package selenium;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by User on 9/23/2018.
 */
public class EbayEmptyCartTest extends EbayBase {
    private final String CART_ICON_LOCATOR="//i[@id='gh-cart-i']";
    private final String EMPTY_CART_HEADER="//span[contains(text(), \"You don't have any items in your cart\")]";

    @Test
    public void shouldHaveEmptyShoppingCartOnFirstVisit() {
        String mainPage = "https://www.ebay.com/";
        //Go to main page
        wd.get(mainPage);
        //navigate to cart
        wd.findElement(By.xpath(CART_ICON_LOCATOR)).click();
        //verify that cart is empty
        boolean isEmptyCart=wd.findElement(By.xpath(EMPTY_CART_HEADER)).isDisplayed();
        assertThat(isEmptyCart,is(true));

    }

    @Test

    public void ShopByPriceBarWithBlueBoxesIsVisible(){

    }


}
