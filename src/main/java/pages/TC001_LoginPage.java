package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import marathon.BaseClass;

public class TC001_LoginPage extends BaseClass{
		
	@And("Enter the UserName as {string}")
	public TC001_LoginPage enterUserName(String UserName) {
		driver.findElement(By.id("username")).sendKeys(UserName);
		return this;
	}
	@And("Enter the Password as {string}")
	public TC001_LoginPage enterPassword(String Password) {
		driver.findElement(By.id("password")).sendKeys(Password);
		return this;
	}
	@Then("Click the loginbutton")
	public TC002_HomePage clickLogin() {
		driver.findElement(By.id("Login")).click();
		return new TC002_HomePage();
	}

}
