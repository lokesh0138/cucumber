package Stepdefination;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import sample.cucumber.base;
import sample.cucumber.facebook_object;

public class stepdefinations extends base{
	
	public WebDriver driver;
	
	 @Given("^Verify whether user landed to \"([^\"]*)\"$")
	    public void verify_whether_user_landed_to_something(String strArg1) throws Throwable {
		 driver=initilize();
			driver.get(strArg1);
	    }

	    @When("^user enter userid and Password$")
	    public void user_enter_userid_and_password() throws Throwable {
	    	facebook_object fb=new facebook_object(driver);
	    fb.user().sendKeys("lokesh");
	    	fb.pass().sendKeys("lok1234");
	    }
	    

	    @Then("^Login should be successful$")
	    public void login_should_be_successful() throws Throwable {
	    	facebook_object fb=new facebook_object(driver);
	    	fb.submit().click();
	    }

	    @And("^Click on login button$")
	    public void click_on_login_button() throws Throwable {
	    	
	     
	    }

	    @And("^navigate to next page$")
	    public void navigate_to_next_page() throws Throwable {
	      
	    }


}
