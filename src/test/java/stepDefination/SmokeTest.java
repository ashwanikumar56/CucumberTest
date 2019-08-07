package stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SmokeTest 
{
	
	
	
    
	WebDriver driver;
	
	@Given("^Open chrome and start application$")
	public void Open_chrome_and_start_application() throws Throwable 
	{
		
	     System.setProperty("webdriver.chrome.driver", "/home/qainfotech/Downloads/chromedriver");  
	     driver=new ChromeDriver();
	     
	     driver.get("https://s1.demo.opensourcecms.com/wordpress/wp-login.php?loggedout=true");
	}
	
	


	@When("^I enter valid \"([^\"]*)\" and valid \"([^\"]*)\"$")
	public void I_enter_valid_username_and_valid_password(String uname, String pass) throws Throwable 
	{
		
		driver.findElement(By.name("log")).sendKeys(uname);

		driver.findElement(By.name("pwd")).sendKeys(pass);
	}
	
	

	@Then("^user should be able to login successfully$")
	public void user_should_be_able_to_login_successfully() throws Throwable
	{
		driver.findElement(By.name("wp-submit")).click();
	}

}
