package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.Keys;
import starter.actions.Action;
import org.openqa.selenium.By;
public class AmazonHome extends PageObject {
    By searchBar = By.id("twotabsearchtextbox");
    public void irA(String url) {
        Action.goTo(getDriver(), url);
    }
    public void searchProduct(String product) {
        Action.writeText(getDriver(),searchBar,product);
        Action.darTecla(getDriver(),searchBar, Keys.ENTER);
    }
}

