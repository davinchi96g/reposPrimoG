package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import starter.actions.Action;

public class ProductResult extends PageObject {

    By Page = By.xpath("(//a[@class='s-pagination-item s-pagination-button'])[1]");
    By producto = By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[3]");
    public void selectPage(String page) {
        //Action.darClicK(getDriver(),By.linkText(String.format("%s",page)));
        Action.darClicK(getDriver(),Page);
        Action.darClicK(getDriver(),producto);

    }

    public void selectProduct(String product) {
        //Action.darClicK(getDriver(),By.xpath(String.format("//div[@class='s-main-slot s-result-list s-search-results sg-row']//div[@data-index='%s']",product)));
        //Action.clickJavaScript(getDriver(),producto);
    }
}
