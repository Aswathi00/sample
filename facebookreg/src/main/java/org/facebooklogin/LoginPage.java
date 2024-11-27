package org.facebooklogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	public void setConfirm()
	{
	driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();	
	}
	public void setFirstname(String firstname)
	{
	WebElement 	fnamebox=driver.findElement(By.name("firstname"));
	fnamebox.sendKeys(firstname);
	
	}
	public void setSurname(String surname)
	{
	WebElement 	snamebox=driver.findElement(By.name("lastname"));
	snamebox.sendKeys(surname);
	
    }
	public void setEmail(String email)
	{
	WebElement 	emailbox=driver.findElement(By.name("reg_email__"));
	emailbox.sendKeys(email);
	}

    public void setPassword(String password)
     {
     WebElement 	passwordbox=driver.findElement(By.name("reg_passwd__"));
     passwordbox.sendKeys(password);
     }
    // public void setPassword(String password)
    // {
    // WebElement 	passwordbox=driver.findElement(By.name("reg_passwd__"));
    // passwordbox.sendKeys(password);
    // }
     }



