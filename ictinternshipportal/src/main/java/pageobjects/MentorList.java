package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MentorList {
	WebDriver driver;
	public MentorList(WebDriver driver) {
		this.driver=driver;
	}
	public void mentor()
	{

		WebElement me=driver.findElement(By.xpath("//a[@href='/mentors']"));
		me.click();
	}
	public void update()
	{
WebElement up=driver.findElement(By.xpath("//button[@class='MuiButtonBase-root MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-colorPrimary MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-colorPrimary update-button css-1ujsas3']"));
		up.click();	
}
	
	public void name(String nname) {
		
WebElement ne=driver.findElement(By.xpath("//input[@aria-invalid='false']"));
		ne.click();
		ne.clear();
		ne.sendKeys(nname);
	}
	public void sub()
 {
	WebElement sb=driver.findElement(By.xpath("//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-colorPrimary MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-colorPrimary submit-button css-1hw9j7s']"));
		sb.click();
		
	}
	public void delet() {
		
		WebElement me=driver.findElement(By.xpath("//a[@href='/mentors']"));
		me.click();	
	}
	public void home() {
		WebElement hm=driver.findElement(By.xpath("//a[@href='/mentors']"));
		hm.click();	
		
	}
	public void logout() {
		WebElement out=driver.findElement(By.xpath("//a[@href='/login']"));
		out.click();	
		
	}
	

	}

