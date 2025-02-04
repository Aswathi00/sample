package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HomePage {
		WebDriver driver;
		public HomePage(WebDriver driver) {
			this.driver=driver;
		}
		public void verifyelement() throws InterruptedException {
			// TODO Auto-generated method stub
			
			Thread.sleep(1000);
			boolean isDisplayed=driver.findElement(By.xpath("//img[@src='/static/media/homeimage.b8e88c90be67b07eac3b.png']")).isDisplayed();
			
			if (isDisplayed) {
				System.out.println("ICTAKinternship portal design is displayed.");
				
			} else {
		        System.out.println("ICTAKinternship portal design is not displayed");
			}
		//Verify login is displayed
		
			boolean isDisplayed1=driver.findElement(By.xpath("//a[@href='/login']")).isDisplayed();
			
			if (isDisplayed1) {
				System.out.println("Login is displayed.");
				
			} else {
		        System.out.println("Login is not displayed");
			}
			
	
	

		/*public void click() {
			driver.findElement(By.xpath("//a[@href='/add']")).click();
			
		}
		public void name(String uname) throws InterruptedException {
			Thread.sleep(1000);
			WebElement un=driver.findElement(By.xpath("//input[@id=':r0:']"));
				un.click();
				un.sendKeys(uname);
				un.sendKeys(Keys.RETURN);
			
		}
		public void batch() throws InterruptedException {
			
			WebElement bt=driver.findElement(By.xpath("/html/body/div/div[2]/form/div/div[2]/div/div/div"));
			bt.click();
			Select select=new Select(bt);
			select.selectByVisibleText("KKEM March CSA");
			//bt.sendKeys(bach);
			Thread.sleep(1000);
			bt.sendKeys(Keys.ENTER);
		}
		public void email(String emil) {
			WebElement em=driver.findElement(By.xpath("//input[@name='Email']"));
			em.click();
			em.sendKeys(emil);
		}
		public void sublink(String link) {
			WebElement ln=driver.findElement(By.xpath("//input[@name='SubmissionLink']"));
			ln.click();
			ln.sendKeys(link);	 
			
		}
		public void submit() {
			driver.findElement(By.xpath("//button[@type='button']")).click();
			
		}*/
		
		

}
}
