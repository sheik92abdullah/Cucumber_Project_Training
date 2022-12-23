package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeLoginUsingDataviaDataTable {
	
	ChromeOptions chromeoptions = new ChromeOptions();
	WebDriver driver;

	@Given("the user lands in Login page")
	public void the_user_lands_in_login_page() {
	    WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver(chromeoptions);
	    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	@When("the user is trying to login with his username {string} and {string}")
	public void the_user_is_trying_to_login_with_his_username_and(String uname, String pword) throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.name("username")).sendKeys(uname);
		driver.findElement(By.name("password")).sendKeys(pword);
	}
	@When("clicked the login button in the webpage")
	public void clicked_the_login_button_in_the_webpage() {
		driver.findElement(By.xpath("//button[@type = 'submit']")).click();
	}
	@Then("the user can able to login sucessfully")
	public void the_user_can_able_to_login_sucessfully() throws InterruptedException {
		Thread.sleep(5000);
		  boolean loginpage =  driver.findElement(By.xpath("//*[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']")).isDisplayed();
		  if (loginpage) {
			  System.out.println("user got logged in");
	}

}
}
