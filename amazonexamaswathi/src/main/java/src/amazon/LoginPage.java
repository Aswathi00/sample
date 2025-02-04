package src.amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	WebDriver driver;
	public LoginPage( WebDriver driver) {
		this.driver=driver;
		
	}
	public void search(String find) {
		
		  WebElement ss=driver.findElement(By.id("//input[@id='captchacharacters']"));
		  ss.click();
		  ss.sendKeys(find);
	
	}
	public void click()
	{
		driver.findElement(By.id("//button[@class='a-button-text']")).click();
	}
	
}
