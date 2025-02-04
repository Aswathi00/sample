package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AdminLogin {
	WebDriver driver;
	public AdminLogin(WebDriver driver) {
		this.driver=driver;
	}
	//signin function
	
		public void signin() {
			
			WebElement si=driver.findElement(By.xpath("//a[@href='/login']"));
			si.click();	
		}
		public void email(String mail) {
			
		WebElement em=driver.findElement(By.xpath("//input[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputAdornedStart css-1ixds2g']"));
			em.click();
			em.sendKeys(mail);
		}
		public void passwd(String pass) {

		WebElement ps=driver.findElement(By.xpath("//input[@type='password']"));
			ps.click();
			ps.sendKeys(pass);
			
		
	}

		public void login() {
		WebElement lg=driver.findElement(By.xpath("//button[@type='submit']"));
			lg.click();	
		}

}

