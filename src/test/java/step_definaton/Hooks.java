package step_definaton;

import java.io.IOException;

import Base.TestBase;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends TestBase{
	
	public Hooks() throws IOException {
		super();
		
	}

	@Before
	public void LoadBrowser() {
		initialization();
	}
	
	@After
	 public void CloseBrowser() {
		tearDown ();
	 }
}
