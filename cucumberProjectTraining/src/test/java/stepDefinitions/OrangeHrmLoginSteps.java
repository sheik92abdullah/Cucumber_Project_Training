package stepDefinitions;

import java.sql.DriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHrmLoginSteps {
	
    ChromeOptions chromeOptions = new ChromeOptions();
    WebDriver driver;

	@Given("user is on login page")
	public void user_is_on_login_page() {
		// Write code here that turns the phrase above into concrete actions
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(chromeOptions);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    
	}
	@When("user enters a valid username {string} and password {string}")
	public void user_enters_a_valid_username_and_password(String uname, String pword) throws InterruptedException {
	    
		Thread.sleep(5000);
	    driver.findElement(By.name("username")).sendKeys(uname);
	    driver.findElement(By.name("password")).sendKeys(pword);
	}
	@When("click the login button")
	public void click_the_login_button() {
	  
		driver.findElement(By.xpath("//button[@type = 'submit']")).click();
	}
	@Then("the user should be navigate to homepage")
	public void the_user_should_be_navigate_to_homepage() throws InterruptedException {
		Thread.sleep(5000);
	  boolean loginpage =  driver.findElement(By.xpath("//*[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']")).isDisplayed();
	  if (loginpage) {
		  System.out.println("user got logged in");
	  }
	}

	}

