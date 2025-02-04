 package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		
	}

	public void create() {
	
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
	}

	public void firstname(String fname) {
	WebElement fn=driver.findElement(By.xpath("//input[@name='firstname']"));
		fn.click();
		fn.sendKeys(fname);
	}

	public void lastname(String lname) {
		WebElement ln=driver.findElement(By.xpath("//input[@name='lastname']"));
		ln.click();
		ln.sendKeys(lname);
	}

	public void dateofbirth() {
		WebElement day=driver.findElement(By.xpath("//select[@name='birthday_day']//option[@value='15']"));
		day.click();
		WebElement month=driver.findElement(By.xpath("//select[@name='birthday_month']//option[@value='12']"));
		month.click();
		WebElement year=driver.findElement(By.xpath("//select[@name='birthday_year']//option[@value='2000']"));
		year.click();
 		
		
	}

	public void email(String email) {
		WebElement pas=driver.findElement(By.xpath("//input[@name='reg_email__']"));
		pas.click();
		pas.sendKeys(email);
		
	}

	public void gender() {
		
		driver.findElement(By.xpath("//input[@value='1']")).click();
	}


	public void password(String pass) {
		
		WebElement em=driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
		em.click();
		em.sendKeys(pass);
		
	}

	public void signup() {
		
		driver.findElement(By.xpath("//button[@name='websubmit'] ")).click();
	
	}

}
