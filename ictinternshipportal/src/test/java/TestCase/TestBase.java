package TestCase;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;

public class TestBase {
	WebDriver driver;
	Properties prop;
	public void readprop() throws IOException
	{
		prop= new Properties();
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\log.properties");
		prop.load(fis);
	}
	@BeforeMethod
	public void test() throws IOException
	{
		readprop();
	driver=new FirefoxDriver();
	driver.get(prop.getProperty("url"));
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	
	}

}
