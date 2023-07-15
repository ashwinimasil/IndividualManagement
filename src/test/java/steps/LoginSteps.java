package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
public ChromeDriver driver;	
	
	@Given("Open the chrome browser")
	public void chromeBrowser() {
	driver = new ChromeDriver();
	}
	
	@And("Load the url")
	public void loadUrl() {
	driver.get("http://leaftaps.com/opentaps/control/login");
	}
	
	@Given("Enter the username as {string}")
	public void enterUserName(String username) {
	driver.findElement(By.id("username")).sendKeys(username);
	}
	@Given("Enter the Password as {string}")
	public void enter_the_password_as(String password) {
		driver.findElement(By.id("password")).sendKeys(password);
	}
	
	@When("click on the Login button")
	public void loginButton() {
	driver.findElement(By.className("decorativeSubmit")).click();
	}
	
	@Then("Home page is displayed")
	public void homePageDisplay() {
	String title = driver.getTitle();
	if(title.contains("Leaf Taps")) {
		System.out.println("Login is successful");
	}
	else
		System.out.println("Login not successful");
	}
		
	@But("error is displayed")
	public void errorThrown() {
	System.out.println("Error is thrown");
	}
			
	@When("Click on the CRMSFA button")
	public void clickCRMSFA() {
	driver.findElement(By.linkText("CRM/SFA")).click();
	}
	
	@And("Click on the Leads tab")
	public void clickLeads() {
	driver.findElement(By.linkText("Leads")).click();
	}
	
	@And("Click on the Create Lead tab")
	public void createLead() {
	driver.findElement(By.linkText("Create Lead")).click();
	}
	
	@Given("Enter the company Name as (.*)$")
	public void enterCompanyName(String cName) {
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cName);
	}
	
	
	@And("Enter the First Name as (.*)$")
	public void enterFirstName(String FName) {
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys(FName);
	}
	
	@And("Enter the Last Name as (.*)$")
	public void lastName(String LName) {
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys(LName);
	}
	
	@When("Click on the submit button")
	public void submitButton() {
	driver.findElement(By.name("submitButton")).click();
	}
	
	@Then("A Lead is created as (.*)$")
	public void leadCreated() {
	driver.findElement(By.name("submitButton")).click();
	}
}
