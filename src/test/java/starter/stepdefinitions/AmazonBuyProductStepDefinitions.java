package starter.stepdefinitions;
import io.cucumber.java.en.*;
import starter.pages.AmazonHome;
import starter.pages.ProductBuy;
import starter.pages.ProductResult;


public class AmazonBuyProductStepDefinitions {
    AmazonHome amazonHome;
    ProductResult productResult;
    ProductBuy productBuy;

    @Given("el usuario navega en {string}")
    public void navigateTo(String url) {
        amazonHome.irA(url);
    }
    @When("busca el artículo {string}")
    public void searchProduct(String product) {
        amazonHome.searchProduct(product);

    }
    @And("navega a la pagina {string} de los resultados de busqueda obtenidos")
    public void navigatePage(String page) {
        productResult.selectPage(page);

    }
    @And("selecciona el {string} ítem de los resultados")
    public void selectObject(String product) {
        productResult.selectProduct(product);
    }
    @Then("agrega al carrito más de {string} unidades del tercer ítem si esta {string} para compra")
    public void validarCantidad(String cantidad,String validationText ){
        productBuy.buyQuantity(cantidad,validationText);
    }
}
