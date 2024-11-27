package org.facebook;

import org.facebooklogin.LoginPage;
import org.testng.annotations.Test;

public class LoginTest extends TestBase  {
	LoginPage obj=null;
	@Test
	public void UserBoxtestcase()
	{
		obj=new LoginPage(driver);
		obj.setConfirm();
		obj.setFirstname("aswathi");
		obj.setSurname("sasankan");
		obj.setEmail("aswathi123@gmail.com");
		obj.setPassword("admin123");
	}
	
}
