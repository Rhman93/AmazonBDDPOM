package step_definaton;


import java.io.IOException;

import org.junit.Assert;



import Base.TestBase;
import PageFactory.HomePageLink;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageLinkFunctionalityTest extends TestBase {
	
	HomePageLink hp;
	public HomePageLinkFunctionalityTest() throws IOException {
		super();
		hp=new HomePageLink();
	}

	@Given ("^User is in the homepage$")
	public void User_is_in_the_homepage(){
		System.out.println(hp.getHomePageTitel());
	}

	@When("User should click to the SignIn link")
	public void user_should_click_to_the_sign_in_link() {
		hp.click();
		
	}

	@Then("User should be in the SignIn Page")
	public void user_should_be_in_the_sign_in_page() {
		Assert.assertEquals(hp.getHomePageTitel(), "Amazon Sign-In");
		
	}

	@When("User should click to the Return&Order Link")
	public void user_should_click_to_the_return_order_link() {
		hp.Return();
	}

	@Then("User should be in the Return&Order Page")
	public void user_should_be_in_the_return_order_page() {
		
		Assert.assertEquals(hp.getHomePageTitel(), "Amazon Sign-In");
	}

	@When("User should click to the Cart link")
	public void user_should_click_to_the_cart_link() {
		hp.Cart();
	}
	@Then("User should be in the Cart Page")
	public void user_should_be_in_the_cart_page() {
			
	Assert.assertEquals(hp.getHomePageTitel(), "Amazon.com Shopping Cart");
		
	}

	@When("User should click to the ALL Manu link")
	public void user_should_click_to_the_all_manu_link() {
		hp.AllMenuLink();
	}

	@Then("User Should see all link of the page")
	public void user_should_see_all_link_of_the_page() {
		
		
		Assert.assertEquals(hp.getHomePageTitel(),"Amazon.com: Online Shopping "
				+ "for Electronics, Apparel, Computers, Books, DVDs & more");
	
}
	
}
