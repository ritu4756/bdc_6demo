package ritucucumber;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;






public class demo1 {
	WebDriver driver;
	@Given("application is launched by guest user")
	public void application_is_launched_by_guest_user() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		 driver=drivers.configureDriver("chrome");
			driver.manage().window().maximize();
			driver.get("http://10.232.237.143:443/TestMeApp");
		//System.out.println("code for launch");
	}

	@When("user clicks on sign in link available")
	public void user_clicks_on_sign_in_link_available() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		 driver.findElement(By.xpath("//a[@href='RegisterUser.htm']")).click();
		
		//System.out.println("code for click");
	}

	@When("provides the required data in the form")
	public void provides_the_required_data_in_the_form() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		 driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("ritu10");
		    driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("ritu");
		    driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("bn");
		    driver.findElement(By.xpath("//input[@id='password']")).sendKeys("12345");
		    driver.findElement(By.xpath("//input[@id='pass_confirmation']")).sendKeys("12345");
		    driver.findElement(By.xpath("//label[@class='form-control input-lg']")).sendKeys("Female");

		     driver.findElement(By.xpath("//input[@value='Female']")).click();
		      
		    driver.findElement(By.xpath("//input[@id='emailAddress']")).sendKeys("ritu@gmail.com");
		    driver.findElement(By.xpath("//input[@id='mobileNumber']")).sendKeys("1234567891");
		    driver.findElement(By.className("ui-datepicker-trigger")).click();
		     Select mon=new Select(driver.findElement(By.className("ui-datepicker-month")));
		     mon.selectByVisibleText("Aug");
		     Select year=new Select(driver.findElement(By.className("ui-datepicker-year")));
		     year.selectByValue("1997");
		     driver.findElement(By.linkText("13")).click();
		    driver.findElement(By.xpath("//textarea[@id='address']")).sendKeys("asdfghghg");
		    Select sqn=new Select(driver.findElement(By.xpath("//select[@id='securityQuestion']")));
		    sqn.selectByVisibleText("What is your Birth Place?");
		    driver.findElement(By.xpath("//input[@id='answer']")).sendKeys("bangalore");
		    
		    //Thread.sleep(4000);
		//System.out.println("code for data");
	}

	@Then("user submits the data")
	public void user_submits_the_data() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//input[@value='Register']")).click();
		//System.out.println("code for submit");
	}

	@Then("verifies for the account creation")
	public void verifies_for_the_account_creation() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		//System.out.println("code for verification");
		
	}

}
