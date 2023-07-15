package steps;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateNewOpportunity extends Baseclass{

	/*
	 * @Given("Load the browser") public void classloadBrowser() { driver = new
	 * ChromeDriver(); }
	 * 
	 * @And("Enter the url") public void enterUrl() {
	 * driver.get("https://login.salesforce.com/"); }
	 */
@Given("Enter the username {string}")
public void enterUserName(String username) 
{
	driver.findElement(By.xpath("//input[@id='username']")).sendKeys("ashwinimasil@gmail.com");	
}

@And("Enter the password {string}")
public void enterPassword(String password) 
{
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Rajash123$");
}

@When("click on the login button")
public void loginSalesForce() 
{
	driver.findElement(By.xpath("//input[@id='Login']")).click();	
}

@And("Click on toggle menu button from the left corner")
public void toggleIcon() throws InterruptedException 
{
	Thread.sleep(6000);
	WebElement toggle = driver.findElement(By.xpath("//div[@class='slds-icon-waffle']"));
	toggle.click();
	System.out.println("toggle clicked");
	Thread.sleep(5000);
	//view all link
	driver.findElement(By.xpath("//button[contains(text(),'View All')]")).click();
}

@And("Click view All and click Sales from App Launcher")
public void salesApp() 
{
	//sales button in new window
	Set<String> windowHandles = driver.getWindowHandles();
	List <String> winList = new ArrayList<>(windowHandles);
	System.out.println(windowHandles.size());
	driver.switchTo().defaultContent();
	System.out.println("Window handled");
	WebElement toggle2 = driver.findElement(By.xpath("//div[@class='slds-icon-waffle']"));
	toggle2.click();
	//click sales
	WebElement sales = driver.findElement(By.xpath("//p[text()='Sales']"));
	driver.executeScript("arguments[0].click();", sales);
	System.out.println("sales clicked");
}

@When("Click on Opportunity tab")
public void opportunitiesTab() throws InterruptedException 
{
//click on opportunities
	Thread.sleep(3000);
	WebElement opportunities = driver.findElement(By.xpath("//span[text()='Leads']/preceding::span[text()='Opportunities']"));
	driver.executeScript("arguments[0].click();", opportunities);
}

@And("Click on New button")
public void newButton() 
{
	//click on New
	driver.findElement(By.xpath("//div[@title='New']")).click();
	Set<String> newOppoWindow = driver.getWindowHandles();
	List <String> winList1 = new ArrayList<>(newOppoWindow);
	System.out.println(newOppoWindow.size());
	driver.switchTo().window(winList1.get(0));
	System.out.println("Window handled for opportunity window");
}
@Given("Choose Close date as Tomorrow Date")
public void closeDate() throws InterruptedException 
{
	Thread.sleep(5000);
	//Enter Close date
	driver.findElement(By.xpath("//input[@name='CloseDate']")).sendKeys("13/06/2023");
	
}
@And("Enter Opportunity name as {string} by Your Name Get the text and store it")
public void opportunityName(String opportunityName) 
{
	//Enter opportunity as 'salesforce Automation'
	driver.findElement(By.xpath("//label[text()='Opportunity Name']/following::input[@class='slds-input'][1]")).sendKeys(opportunityName);		
}
	
@And("Select Stage as Needs Analysis")
public void selectStage() throws InterruptedException 
{
	//click on the stage link
	driver.findElement(By.xpath("//span[text()='--None--']")).click();
	//click on the Needs Analysis row td
	Thread.sleep(3000);
	driver.findElement(By.xpath("//span[@class='slds-media__body']//span[text()='Needs Analysis']")).click();
}
@When("Click on save")
public void saveVerifyOpportunityName() 
{
	//click on save
	driver.findElement(By.xpath("//button[text()='Save']")).click();
}
@And("VerifyOppurtunity Name")
	//verify opportunity Name
public void verifyOpportunity() 
{
	String verifyOppourtunity = driver.findElement(By.xpath("//div[@class='slds-theme--success slds-notify--toast slds-notify slds-notify--toast forceToastMessage']")).getText();
	
	if(verifyOppourtunity.equalsIgnoreCase("created")) 
	{
	System.out.println(verifyOppourtunity);
	}
	else
		System.out.println(verifyOppourtunity);
}

@When("Verify the Alert message displayed for Name and Stage")
public void errorMessage() 
{
	String Title = driver.findElement(By.xpath("//strong[contains(text(),'fields')]")).getText();
	System.out.println(Title);
	for(int i=0;i<=1;i++) 
	{
	String mandatoryOptions = driver.findElement(By.xpath("//strong[contains(text(),'fields')]//following::li")).getText();
	System.out.println(mandatoryOptions);
	}
}
@And("Click view All and click Dashboards from App Launcher")
public void clickDashboards() throws InterruptedException 
{
	Thread.sleep(5000);
	driver.findElement(By.xpath("//label[contains(text(),'Search apps and items')]//following::input")).sendKeys("Dashboards",Keys.ENTER);
}

@And("Click on the New Dashboard option")
public void newDashboard() throws InterruptedException 
{
	Thread.sleep(5000);
	driver.findElement(By.xpath("//div[text()='New Dashboard']")).click();
}
@Given("Enter Name as Salesforce Automation by Your Name and Click on Create")
public void enterNameCreate() throws InterruptedException 
{
	Thread.sleep(3000);
	Set<String> windowHandles = driver.getWindowHandles();
	List<String> arrayList = new ArrayList<>(windowHandles);
	driver.switchTo().window(arrayList.get(0));
	driver.findElement(By.id("dashboardNameInput")).sendKeys("Ashwini");
}

@When("Click on Save and Verify Dashboard name")
public void saveVerifyDashboardName() 
{
	driver.findElement(By.xpath("//button[@id='submitBtn']")).click();
	String verifyDashboardName = driver.findElement(By.xpath("//span[@class='slds-form-element__static slds-grid slds-grid_align-spread']")).getText();
	if(verifyDashboardName.equalsIgnoreCase("Salesforce Automation")) 
	{
		System.out.println(verifyDashboardName+ "The End");
	}
} 
}