package seleniumgluecode;

import io.cucumber.java.After;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {

    public ChromeDriver driver= Hooks.getDriver();




    @Given("Usuario abre navegador y visualiza pantalla de Login")
    public void usuario_abre_navegador_y_visualiza_pantalla_de_login() {
        String tituloActual = "Test Login | Practice Test Automation";
        Assert.assertEquals(tituloActual,driver.getTitle());

    }

    @When("Ingresa user y pass")
    public void ingresaUserYPass() {

        WebElement username = driver.findElement(By.id("username"));
        username.sendKeys("student");

        WebElement pass = driver.findElement(By.id("password"));
        pass.sendKeys("Password123");
    }

    @And("presiona boton Submit")
    public void presiona_boton_submit() {

        WebElement btnSubmit = driver.findElement(By.className("btn"));
        btnSubmit.click();
    }

    @Then("deberia ver el mensaje de bienvenida {string}")
    public void deberia_ver_el_mensaje_de_bienvenida(String string) {
        // 1. Localizar el elemento con Selenium
        String mensajeActual = driver.findElement(By.className("post-title")).getText();
        String mensajeEsperado = "Logged In Successfully";
        Assertions.assertEquals(mensajeEsperado, mensajeActual, "El mensaje de bienvenida no coincide.");
    }














}