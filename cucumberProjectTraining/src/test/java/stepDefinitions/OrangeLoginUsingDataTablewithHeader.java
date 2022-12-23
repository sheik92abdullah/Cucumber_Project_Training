package stepDefinitions;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
public class OrangeLoginUsingDataTablewithHeader {

	ChromeOptions chromeOptions = new ChromeOptions();
	WebDriver driver;

	@Given("user deployed on login page to login the webpage")
	public void user_deployed_on_login_page_to_login_the_webpage() {
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver(chromeOptions);
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	@When("enter credentials username, password with the below table")
	public void enter_credentials_username_password_with_the_below_table(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
	 List<Map<String, String>> keyValuePair = dataTable.asMaps(String.class,String.class);
	 String uname = keyValuePair.get(0).get("userName");
	 String pword = keyValuePair.get(0).get("passWord");
	 Thread.sleep(10000);	
	 driver.findElement(By.name("username")).sendKeys(uname);
	 driver.findElement(By.name("password")).sendKeys(pword);
	}
	@When("click the login to navigate to your profile")
	public void click_the_login_to_navigate_to_your_profile() {
		driver.findElement(By.xpath("//button[@type = 'submit']")).click();
	}
	@Then("your page should get displayed")
	public void your_page_should_get_displayed() throws InterruptedException {
		Thread.sleep(5000);
		  boolean loginpage =  driver.findElement(By.xpath("//*[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']")).isDisplayed();
		  if (loginpage) {
			  System.out.println("user got logged in");
	
	}

	}
}
