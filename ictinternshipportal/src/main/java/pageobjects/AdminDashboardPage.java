package pageobjects;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AdminDashboardPage {
	WebDriver driver;
	public AdminDashboardPage(WebDriver driver) {
		this.driver=driver;
	}
	public void mentors()
	{
		WebElement mm=driver.findElement(By.xpath("//a[@class='MuiButtonBase-root MuiButton-root MuiButton-text MuiButton-textInherit MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-colorInherit MuiButton-root MuiButton-text MuiButton-textInherit MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-colorInherit nav-item nav-link css-b7766g']"));
		mm.click();	
	}
	public void projects()
	{
	WebElement pp=driver.findElement(By.xpath("//a[@href='/project']"));
	pp.click();
	}
	public void editproject(String tedit)
	{
		WebElement ed=driver.findElement(By.xpath("//button[@class='MuiButtonBase-root MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeSmall MuiButton-textSizeSmall MuiButton-colorPrimary MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeSmall MuiButton-textSizeSmall MuiButton-colorPrimary css-1rtnrqa']"));
		ed.click();
		WebElement tedt=driver.findElement(By.xpath("//input[@class='MuiInputBase-input MuiOutlinedInput-input css-1x5jdmq']"));
		tedt.clear();
		tedt.sendKeys(tedit);
		WebElement tsa=driver.findElement(By.xpath("//button[text()='Save']"));
		tsa.click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		 Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		 alert.dismiss();
		

			}
	public void saveproject() throws InterruptedException
	{
		WebElement sv=driver.findElement(By.xpath("//button[@class='MuiButtonBase-root MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeSmall MuiButton-textSizeSmall MuiButton-colorPrimary MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeSmall MuiButton-textSizeSmall MuiButton-colorPrimary css-1rtnrqa']"));
		sv.click();
		Thread.sleep(1000);
		
}
	
	public void mentorform()
	{

		WebElement fm=driver.findElement(By.xpath("//a[@href='/addmentor']"));
		fm.click();
	}
	public void name(String nme)
	{
		WebElement nm=driver.findElement(By.xpath("//input[@type='text']"));
		nm.click();
		nm.sendKeys(nme);
	}

	public void mail(String mal) {

		WebElement ml=driver.findElement(By.xpath("//input[@name='Email']"));
		ml.click();
		ml.sendKeys(mal);
	}

	public void phone(String phn) {
		WebElement ph=driver.findElement(By.xpath("//input[@name='PhoneNumber']"));
		ph.click();
		ph.sendKeys(phn);
		
	}

	public void paswd(String psw) throws InterruptedException {
		WebElement pw=driver.findElement(By.xpath("//input[@type='password']"));
		pw.click();
		pw.sendKeys(psw);
		Thread.sleep(1000);
		
	}

	public void topic(String pr) throws InterruptedException {
		WebElement combo=driver.findElement(By.xpath("/html/body/div/div/div/form/div/div[5]/div/div"));
		combo.click();
		Thread.sleep(1000);
		//combo.sendKeys(Keys.ENTER);
		combo.sendKeys(pr);
		combo.sendKeys(Keys.RETURN);
		driver.findElement(By.xpath("/html/body/div/div/div")).click();
			
		
	}
	public void submit() {
		WebElement sub=driver.findElement(By.xpath("//button[@type='button']"));
		sub.click();
		

	}

	}



