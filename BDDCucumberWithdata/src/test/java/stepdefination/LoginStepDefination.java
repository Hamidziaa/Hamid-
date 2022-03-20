package stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginStepDefination {

	WebDriver driver;
	@Given("Open browser")
	
	
	public void open_browser() {
		  WebDriverManager.firefoxdriver().setup();
		  driver=new FirefoxDriver();
	}

	@Then("Enter url {string}")
	public void enter_url(String url) {
		driver.get(url);
	}

	@Then("Enter valid username {string}")
	public void enter_valid_username(String name) {
		WebElement username =driver.findElement(By.xpath("//*[@name='txtUsername']"));
		  username.sendKeys(name);
	}

	@Then("enter valid password {string}")
	public void enter_valid_password(String string) {
		 WebElement password = driver.findElement(By.xpath("//*[@name='txtPassword']"));
		  password.sendKeys(string);
	
	}

	@And("click login")
	public void click_login() {
		 WebElement login = driver.findElement(By.xpath("//*[@name='Submit']"));
		 login.click();
	
	}

}
