package StepDefinition;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {
	
	WebDriver driver;

	@Given("Abrir Chrome")
	public void abrir_Chrome() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("En este paso abre el navegador chrome");
	    System.setProperty("webdriver.chrome.driver","C:\\Users\\donpa\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:8080/ReservaHora/index.jsp");
	    
	  //throw new cucumber.api.PendingException();
	}

	@When("ingresa Username {string} y Password {string}")
	public void ingresa_Username_y_Password(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("En este paso ingresa las credenciales de usuario");
		System.out.println("En este paso ingresa usuario y contraseña en la pagina login");
	
		driver.findElement(By.id("nombreUsuario")).sendKeys(string);
		driver.findElement(By.id("password")).sendKeys(string2);
		
		//throw new cucumber.api.PendingException();
	}

	@Then("inicia sesion")
	public void inicia_sesion() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("En este paso inicia sesion con los datos ingresados desde nuestro archivo MyTest.feature");
		driver.findElement(By.id("accion")).click();
		//throw new cucumber.api.PendingException();
	}
}
