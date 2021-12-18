package Steps;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.*;
import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.chrome.ChromeDriver;



public class MyStepdefs {

    WebDriver driver;

    @Given("Abrir el navegador")
    public void abrirElNavegador() {

        driver = new ChromeDriver();
        driver.get("https://www.google.cl");
        driver.manage().window().maximize();

    }

    @When("Escribir Ripley en el buscador")
    public void escribirRipleyEnElBuscador() throws InterruptedException {
        driver.findElement(By.xpath("//input[@title='Buscar']")).sendKeys("Ripley");
        Thread.sleep(1000);
    }

    @And("Apretar Buscar")
    public void apretarBuscar() {
        driver.findElement(By.xpath("//input[@class='gNO89b']")).click();

    }

    @And("Seleccionar la pagina de ripley")
    public void seleccionarLaPaginaDeRipley() {
        driver.findElement(By.xpath("//*[contains(@class,'yuRUbf')]")).click();
    }

    @And("Apretar el Buscador")
    public void apretarElBuscador() throws InterruptedException {
        driver.findElement(By.xpath("//*[contains(@type,'search')]")).sendKeys("Telefono");
        Thread.sleep(1000);
    }

    @And("escribir telefono")
    public void escribirTelefono() {
        driver.findElement(By.xpath("//*[contains(@type,'search')]")).sendKeys(Keys.ENTER);
    }

    @And("Bajar al final de la pagina")
    public void bajarAlFinalDeLaPagina() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,6800)");
        Thread.sleep(1000);

    }


    @And("Seleccionar el producto")
    public void seleccionarElProducto() throws InterruptedException {

        driver.findElement(By.xpath("//*[contains(@class,'catalog-product-details__name') and contains(text(),'MOTOROLA G60S 128GB AZUL')]")).click();
        Thread.sleep(3000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,400)");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[contains(@id,'buy-button')]")).click();
        Thread.sleep(2000);

    }

    @And("ir al carrito de compras")
    public void irAlCarritoDeCompras() throws InterruptedException {
        driver.findElement(By.xpath("//*[contains(@class,'svg-icon svg-icon-bolsa_compras') and contains(@title,'bolsa_compras')]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[contains(@class,'btn btn-ripley') and contains(text(),'Ir a la bolsa')]")).click();
    }

    @Then("Ir a pagar el Producto")
    public void irAPagarElProducto() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[contains(@class,'btn btn-ripley btn-block hidden-xs')]")).click();


    }
}
