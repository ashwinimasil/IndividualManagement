package steps;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import parentClass.Baseclass;

public class CreateDash extends Baseclass {
@Test
	public static void main(String[] args) throws InterruptedException{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications--");
		driver = new ChromeDriver(options);	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("ashwinimasil@gmail.com");	
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Rajash123$");
		driver.findElement(By.xpath("//input[@id='Login']")).click();	
		Thread.sleep(6000);
		WebElement toggle = driver.findElement(By.xpath("//div[@class='slds-icon-waffle']"));
		toggle.click();
		System.out.println("toggle clicked");
		Thread.sleep(5000);
		//view all link
		driver.findElement(By.xpath("//button[contains(text(),'View All')]")).click();
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@class='slds-input']")).sendKeys("Dashboards");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//mark[text()='Dashboards']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='New Dashboard']")).click();
		/*Set<String> windowHandles = driver.getWindowHandles();
		for (String each : windowHandles) {
			System.out.println(each);
		}
		List<String> arrayList = new ArrayList<>(windowHandles);
		System.out.println(arrayList.size());
		driver.switchTo().window(arrayList.get(0));
		// doubt clarification reqd
		System.out.println(driver.findElement(By.xpath("//h1[@id='XOyYnmw_y-heading']")).getText());
		driver.findElement(By.xpath("(//input[@class='slds-input'])[1]")).sendKeys("Ashwini");
		
		Thread.sleep(7000);
		//nameInput.sendKeys("Ashwini");
		driver.findElement(By.xpath("//button[text()='Select Folder']")).click();	*/
		Thread.sleep(5000);	
		
		WebElement dashboardFrame = driver.findElement(By.xpath("//div[@class='dashboardContainer']//iframe"));
		
		driver.switchTo().frame(dashboardFrame);
		
		driver.findElement(By.id("dashboardNameInput")).sendKeys("SalesForce Automation");
		
		driver.findElement(By.xpath("//button[text()='Create']")).click();
		
		driver.switchTo().defaultContent();
		
	  // Click on Save and Verify Dashboard name.
		
		Thread.sleep(5000);
		
		driver.switchTo().frame(0);
			
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[text()='Save']")).click();
							//String dashboardName = driver.findElement(By.xpath("//div[contains(@class,'slds-has-divider_bottom')]")).getText();
		Thread.sleep(3000);
		
		String verifyDashboardName = driver.findElement(By.xpath("//span[text()='Dashboard saved']")).getText();
		System.out.println(verifyDashboardName);
		if(verifyDashboardName.equals(verifyDashboardName)) 
		{
			System.out.println(verifyDashboardName+ "The End");				
		} 
		
	}


}