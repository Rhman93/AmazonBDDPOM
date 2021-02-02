package PageFactory;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class SearchProductBox extends TestBase{

	public SearchProductBox() throws IOException {
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(id="twotabsearchtextbox")
	WebElement SearchBox;
	
	public void searchBox() {
		SearchBox.sendKeys("Apple Weach");
	}
	@FindBy(id="nav-search-submit-button")
	WebElement ClickGo;
	
	public void Click() {
		ClickGo.click();
	}
	@FindBy(xpath="//span[text()='New Apple Watch SE (GPS, 40mm) "
			+ "- Gold Aluminum Case with Pink Sand Sport Band']")
	WebElement SelectProduct;
	public void SelectProduct() {
		SelectProduct.click();
		
	}
	@FindBy(id="add-to-cart-button")
	WebElement AddCart;
	public void AddCart() {
		AddCart.click();
	}
	
	
	public String GetHomePageTitel() {
		return driver.getTitle();
	}


}
