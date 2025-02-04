package src.amazondemo;

import org.testng.annotations.Test;

import src.amazon.LoginPage;
public class LoginTest extends TestBase {
	LoginPage obj;
	@Test
	public void config()
	{
		obj= new LoginPage(driver);
		obj.search("find");
		obj.click();
	
		
	}

}
