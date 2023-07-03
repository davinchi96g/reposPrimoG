package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import starter.actions.Action;

public class ProductBuy extends PageObject {

    By listQuantity = By.xpath("(//li[@class='a-dropdown-item'])[3]");
    By dropDownList = By.xpath("(//span[@data-action='a-dropdown-button'])[1]");

    By disponible = By.cssSelector("div#availability");
    public void buyQuantity(String cantidad, String validateText) {
        Action.darClicK(getDriver(),dropDownList);
        Action.darClicK(getDriver(),listQuantity);
        Action.esperaDeElemento(getDriver(),disponible);
        Action.compararTexto(getDriver(),disponible,validateText);
    }
}
