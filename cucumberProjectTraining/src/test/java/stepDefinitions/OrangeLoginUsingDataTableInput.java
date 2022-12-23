package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.datatable.DataTable;

public class OrangeLoginUsingDataTableInput {
	ChromeOptions chromeOptions = new ChromeOptions();
	WebDriver driver;
	
	@Given("you are on login page")
	public void you_are_on_login_page() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(chromeOptions);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	@When("you enter the belo credentials username and password")
	public void you_enter_the_belo_credentials_username_and_password( DataTable dataTable) throws InterruptedException {
		
		List<List<String>> credentials = dataTable.cells(); //will take data table as list and store it in List of string
		String uname=credentials.get(0).get(0);
		String pword=credentials.get(0).get(1);
		System.out.println(uname +pword);
		Thread.sleep(5000);	
	    driver.findElement(By.name("username")).sendKeys(uname);
	    driver.findElement(By.name("password")).sendKeys(pword);
	    
	}
	@When("you click the login button to enter to his profile")
	public void you_click_the_login_button_to_enter_to_his_profile() {
		driver.findElement(By.xpath("//button[@type = 'submit']")).click();
	}
	@Then("you should see his page")
	public void you_should_see_his_page() throws InterruptedException {
		Thread.sleep(5000);
		  boolean loginpage =  driver.findElement(By.xpath("//*[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']")).isDisplayed();
		  if (loginpage) {
			  System.out.println("user got logged in");
	}

	}
}
