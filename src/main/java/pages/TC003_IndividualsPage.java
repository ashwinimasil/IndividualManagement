package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import marathon.BaseClass;

public class TC003_IndividualsPage extends BaseClass 
{
	
	@And("Click on the New Individuals tab")
	public TC004_NewIndividuals newIndividual() throws InterruptedException 
	{
		driver.findElement(
				By.xpath("//div[@class='slds-context-bar__label-action slds-p-left--none slds-p-right--x-small']//a"))
				.click();
		Thread.sleep(5000);
		WebElement clk = driver.findElement(By.xpath("//span[text()='New Individual']"));
		driver.executeScript("arguments[0].click();", clk);
		return new TC004_NewIndividuals();
	}

	@And("Search the deleted name in search textbox")
	public TC003_IndividualsPage searchDeletedNameinSearchTextBox() throws InterruptedException 
	{
		driver.findElement(By.xpath("//input[@class='slds-input']")).sendKeys("Kumars", Keys.ENTER);
		Thread.sleep(3000);
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
	@And("Click on the Individuals tab")
	public TC003_IndividualsPage individualLink() {
		WebElement clk = driver.findElement(By.xpath("//a[@title='Individuals']//span[1]"));
		driver.executeScript("arguments[0].click();", clk);
		return this;
	}
	
	@And("Click on the Dropdown icon")
	public TC003_IndividualsPage firstElementTriangle() throws InterruptedException {
		Thread.sleep(3000);
		// .sendKeys("Kumars",Keys.ENTER);
		WebElement ele = driver
				.findElement(By.xpath("//div[@class='forceVirtualActionMarker forceVirtualAction']/a[@role='button']"));
		driver.executeScript("arguments[0].click();", ele);
		return this;
	}

	@And("Select Edit")
	public TC005_EditIndividuals editIndividual() throws InterruptedException {
		Thread.sleep(3000);
		WebElement edit = driver.findElement(By.xpath("//a[@title='Edit']/div"));
		driver.executeScript("arguments[0].click();", edit);
		return new TC005_EditIndividuals();
	}

	@And("Select Delete")
	public TC006_DeleteIndividuals clickDelete() throws InterruptedException {
		WebElement delete = driver.findElement(By.xpath("//a[@role='menuitem']/div[@title='Delete']"));
		driver.executeScript("arguments[0].click();", delete);
		Thread.sleep(3000);
		return new TC006_DeleteIndividuals();
	}

}




