package demopage;

import org.testng.annotations.Test;

import pages.LoginPage;

public class LoginTest extends TestBase {
	LoginPage obj;
	@Test
	public void config()
	{
		obj= new LoginPage(driver);
		obj.create();
		obj.firstname(prop.getProperty("fname"));
		obj.lastname(prop.getProperty("lname"));
		obj.dateofbirth();
		obj.gender();  
		obj.email(prop.getProperty("email"));
		obj.password(prop.getProperty("pass"));
		obj.signup();
		
	}
	

}
