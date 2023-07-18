package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import marathon.BaseClass;

public class TC003_IndividualsPage extends BaseClass 
{
	@And("Search the deleted name in search textbox")
	public TC003_IndividualsPage searchNameinSearchTextBoxthatsDeleted() throws InterruptedException 
	{
		driver.findElement(By.xpath("//input[@class='slds-input']")).sendKeys("Kumars", Keys.ENTER);
		Thread.sleep(3000);
		return this;
	}
	@And("Search the Individuals (.*)$")
	public TC003_IndividualsPage searchIndividual() {
		WebElement name = driver.findElement(By.xpath("//input[@name='Individual-search-input']"));
		name.sendKeys("Kumars");
		name.sendKeys(Keys.ENTER);
		return this;
	}
	@Then("Verify again")
	public TC003_IndividualsPage verifyAgain() 
	{
			String verify = driver.findElement(By.xpath("//span[text()='No items to display.']")).getText();
			System.out.println(verify);
			
			if(verify.contains("No items"))
			{
				System.out.println("Individual was deleted using last name");
			}
			else
			{
			System.out.println("Individual not deleted using last name");
			}
			return this;
					
	}
	@And("Click on the Individuals link")
	public TC004_NewIndividuals individualLink() {
		WebElement clk = driver.findElement(By.xpath("//a[@title='Individuals']"));
		driver.executeScript("arguments[0].click();", clk);
		driver.findElement(By.xpath("//div[@class='slds-context-bar__label-action slds-p-left--none slds-p-right--x-small']//a")).click();
		return new TC004_NewIndividuals();
	}
	
}