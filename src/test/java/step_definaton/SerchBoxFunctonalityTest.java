package step_definaton;
import java.io.IOException;

import org.junit.Assert;

import Base.TestBase;

import PageFactory.SearchProductBox;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class SerchBoxFunctonalityTest extends TestBase{
	
	SearchProductBox Ser;
	
	public SerchBoxFunctonalityTest() throws IOException {
		super();
		Ser=new SearchProductBox();
		
	}
	@Given ("User is already in the homepage")
	public void User_is_already_in_the_homepage() {
		System.out.println(Ser.GetHomePageTitel());
		
	}
	@When("User able to Type desire product on Search box")
	public void user_able_to_type_desire_product_on_search_box() {
		
		Ser.searchBox();;
	}

	@And("User shouold click on the submit button")
	public void user_shouold_click_on_the_submit_button() {
		
	Ser.Click();;
	}

	
	@Then("User should see the desire product")
	public void user_should_see_the_desire_product() {
	
		Assert.assertEquals(Ser.GetHomePageTitel(), "Amazon.com : apple watch");
	    
	}
	

	@When("User should Select desier product")
	public void user_should_select_desier_product() {
		Ser.SelectProduct();;
	}

	@When("User should click Add to Cart button")
	public void user_should_click_add_to_cart_button() {
		Ser.AddCart();;
	}

	@Then("User should see the desire product Added")
	public void user_should_see_the_desire_product_added() {
		
		Assert.assertEquals(Ser.GetHomePageTitel(), "Amazon.com: New Apple Watch "
				+ "SE (GPS, 40mm) - Gold Aluminum Case with Pink Sand Sport Band");
		
	}
	
	

}
