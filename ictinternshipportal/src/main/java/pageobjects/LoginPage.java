package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
		WebDriver driver;
		public LoginPage(WebDriver driver) {
			this.driver=driver;
		}
		public void setLog() {
			
			WebElement logg=driver.findElement(By.xpath("//a[@href='/login']"));
			logg.click();	
		}

		public void setUsername(String  username) {
			WebElement uname=driver.findElement(By.xpath("//input[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputAdornedStart css-1ixds2g']"));
			uname.click();
			uname.sendKeys(username);
			
		}

		public void setPasswrd(String password) {
			WebElement pass=driver.findElement(By.xpath("//input[@type='password']"));
			pass.click();
			pass.sendKeys(password);
			
		}

		public void login() {
			WebElement log=driver.findElement(By.xpath("//button[@type='submit']"));
			log.click();
			
		}
		/*public void setButton() {
			
			WebElement log=driver.findElement(By.xpath("//button[@type='button']"));
			log.click();
		}
		public void setView() {
			WebElement log=driver.findElement(By.xpath("//a[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-colorPrimary MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-colorPrimary css-1hw9j7s']"));
			log.click();
			
		}*/





	
}

