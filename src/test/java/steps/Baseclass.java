package steps;

import java.time.Duration;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import io.cucumber.testng.AbstractTestNGCucumberTests;

public class Baseclass extends AbstractTestNGCucumberTests{
	public static ChromeDriver driver;
	
	@BeforeMethod
	public void preCondition() 
	{
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--disable-notifications--");
	driver = new ChromeDriver(options);	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
	driver.get("https://login.salesforce.com/");
	driver.manage().window().maximize();
	}
		
	@AfterMethod
	public void close() 
	{
	driver.close();
	}

}
 