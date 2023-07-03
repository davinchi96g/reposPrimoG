package starter.actions;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

import static org.junit.Assert.assertEquals;

public class Action {
    public static void goTo(WebDriver driver, String url) {
        driver.navigate().to(url);
    }
    public static void writeText(WebDriver driver, By textBox, String inputValue) {
        driver.findElement(textBox).clear();
        driver.findElement(textBox).sendKeys(inputValue);
    }
    public static void darTecla(WebDriver driver, By inputOrigen, Keys tecla) {
        driver.findElement(inputOrigen).sendKeys(tecla);

    }
    public static void darClicK(WebDriver driver, By element) {
        driver.findElement(element).click();
    }

    public static void compararTexto(WebDriver driver, By target, String textToCompare) {
        assertEquals("El valor obtenido, no es igual al esperado: " + textToCompare, textToCompare,
                driver.findElement(target).getText());
    }
    public static void esperaDeElemento(WebDriver driver, By target){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(target));
    }
    public static  void esperaImplicita(WebDriver driver) throws InterruptedException {
        driver.wait(1000);
    }
    public static void clickJavaScript(WebDriver driver, By item) {
        WebElement object = driver.findElement(item);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0," + object.getLocation().y + ")");
        object.click();
    }
    }

