package PageFactory;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class HomePageLink extends TestBase {

	public HomePageLink() throws IOException {
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="//span[text()='Hello, Sign in']")
	WebElement Account;
	
	public void click() {
		Account.click();
		}
	public String getHomePageTitel() {
		return driver.getTitle();
		}
	
	@FindBy(xpath="//span[text()='Returns']")
	WebElement ReturnLink;
	public void Return() {
		ReturnLink.click();
		}
	
	@FindBy(xpath="span[class='nav-cart-icon nav-sprite']")
	WebElement Cart;
	
	public void Cart() {
		Cart.click();
	}
	
	@FindBy(id="a[id='nav-hamburger-menu']")
	WebElement AllMenuLink;
	
public void AllMenuLink() {
	AllMenuLink.click();
}

}
