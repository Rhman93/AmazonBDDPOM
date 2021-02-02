package Base;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class TestBase {
	public Properties prop;
	public WebDriver driver;
	
public TestBase () throws IOException{
	prop=new Properties();
FileInputStream Fis=new FileInputStream("/Users/ahmedshuily/"
		+ "eclipse-workspace/Aug20Batch BDD POM/src/main/java/Property/Config.Properties");
	prop.load(Fis);
	}

public void initialization() {
	
	System.setProperty("webdriver.chrome.driver", "/Users/ahmedshuily/Desktop/untitled folder/chromedriver");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get(prop.getProperty("url"));
	driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
}
public void tearDown () {
	driver.close();
}
}
