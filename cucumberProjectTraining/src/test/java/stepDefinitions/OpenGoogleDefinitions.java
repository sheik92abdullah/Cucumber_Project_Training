package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenGoogleDefinitions {
	
	ChromeOptions chromeOptions = new ChromeOptions();
	WebDriver driver;
	
	@Given("user is entering Google.com")
	public void user_is_entering_google_co_in() {
	    // Write code here that turns the phrase above into concrete actions
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver(chromeOptions);
		 driver.get("http://www.google.com");
	}
	@When("user is typing the search term {string}")
	public void user_is_typing_the_search_term(String searchTerm) {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.name("q")).sendKeys(searchTerm);
	}
	@When("press the enterkey")
	public void press_the_enterkey() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
	}
	@Then("user should see the search result {string}")
	public void user_should_see_the_search_result(String name) {
	    // Write code here that turns the phrase above into concrete actions
	    boolean status=driver.findElement(By.partialLinkText(name)).isDisplayed();
	    if(status) {
	    	System.out.println("Result displayed");
	    }
}
}
