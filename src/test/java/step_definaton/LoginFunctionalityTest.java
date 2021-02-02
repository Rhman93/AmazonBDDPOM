package step_definaton;



import java.io.IOException;

import org.junit.Assert;



import Base.TestBase;

import PageFactory.LogInPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginFunctionalityTest extends TestBase {
	LogInPage Log;
	public LoginFunctionalityTest() throws IOException {
		super();
		Log=new LogInPage();
		
	}


	
	
	@Given ("^User should be in the homepage$")
	public void User_should_be_in_the_homepage(){
		System.out.println(Log.getHomePageTitel());
	}
	@When ("^user should click on Hello Sign in Account & Lists$")
	public void user_should_click_on_Hello_Signin() {
		Log.ClickSubmet();;
	}
	@Then ("^User should see a Box name Email or Phone Number$")
	public void User_should_see_a_Box_name_Email() {
		
		Assert.assertEquals(Log.getHomePageTitel(), "Amazon Sign-In");
	}
	@And ("^A button name Continue$")
	public void A_button_name_Continue() {
		Assert.assertEquals(Log.getHomePageTitel(), "Amazon Sign-In");
	}
	@When ("^User should put Valied Email Address or Phone number$")
	public void User_should_put_Valied_Email_Address() {
      Log.TypeUsername(prop.getProperty("ValiedEmail"));
	}
	@And ("^User should click on Countinue buttton$")
	public void User_should_click_on_Countinue_buttton() {
		Log.ClickContinue1();;
	}
	@Then ("^User should see a Box name password$")
	public void User_should_see_a_Box_name_password() {
		Assert.assertEquals(Log.getHomePageTitel(), "Amazon Sign-In");
	}
	@And ("^A button name Sign-In$")
	public void A_button_name_SignIn(){
		Assert.assertEquals(Log.getHomePageTitel(), "Amazon Sign-In");
	}
	@When ("^User should put Valied password$")
	public void User_should_put_Valied_password() {
		Log.Typepassword(prop.getProperty("ValiedPassword"));
	}
	@And ("^User should click on Sign-In buttton$")
	public void User_should_click_on_SignIn_buttton() {
	Log.ClickLogIn();
	}
	@Then ("^User should see User  is login in the Account$")
	public void User_should_be_in_his_Account() {
		Assert.assertEquals(Log.getHomePageTitel(), "Amazon Sign-In");
	    
	}
	
	 @When ("User should put InValied password")
	 public void User_should_put_InValied_password() {
		Log.Typepassword(prop.getProperty("InvalidPassword"));
		 
	 }
	 
	 @Then ("User shouldnot loged in the Account")
	 public void User_shouldnot_loged_in_the_Account() {
		 Assert.assertEquals(Log.getHomePageTitel(), "Amazon Sign-In");
		 	
	 }
	
	}
	
	

