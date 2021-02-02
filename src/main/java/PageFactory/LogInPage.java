package PageFactory;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class LogInPage extends TestBase {

	public LogInPage() throws IOException {
	
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[text()='Hello, Sign in']")
	WebElement Account;
	
	public void ClickSubmet() {
		Account.click();
	}
	
	
	@FindBy(id="ap_email")
	WebElement UsernameText;
	
	public void TypeUsername(String Username) {
		UsernameText.sendKeys(Username);
	}
	
	@FindBy(id="continue")
	WebElement Continue1;
	
	public void ClickContinue1() {
		Continue1.click();
	}
	
	@FindBy(id="ap_password")
	WebElement PasswordText;
	
	public void Typepassword(String Password) {
		PasswordText.sendKeys(Password);
	}
	
	
	@FindBy(id="signInSubmit")
	WebElement Submet;
	
	public void ClickLogIn() {
		Submet.click();
	}
	@FindBy(id="ap_password")	
	WebElement InvaliedPasswordText;
	public void InvaliedPasswordText(String Password) {
		InvaliedPasswordText.sendKeys(Password);
	}
	
	
	public String getHomePageTitel() {
    return  driver.getTitle();
	}

}
