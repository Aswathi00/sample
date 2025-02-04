package pageobjects;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MentorDashboardPage {
		WebDriver driver;
		public MentorDashboardPage(WebDriver driver) {
			this.driver=driver;
		}

		public void showProject()
		{
			WebElement sp=driver.findElement(By.xpath("//button[@class='MuiButtonBase-root MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-colorPrimary MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-colorPrimary css-1ujsas3']"));
		sp.click();
		}
		public void view()
		{
			WebElement vp=driver.findElement(By.xpath("//a[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-colorPrimary MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-colorPrimary css-1hw9j7s']"));
			vp.click();
			driver.findElement(By.xpath("//a[@href='/viewsubmissions/66a73d587bd69ecd4b69e2e4']")).click();
			WebElement vn=driver.findElement(By.xpath("//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-colorPrimary MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-colorPrimary css-1hw9j7s']"));
		vn.click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		 Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		 alert.dismiss();

		
		}
		

	}

