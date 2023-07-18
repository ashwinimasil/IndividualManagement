package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import marathon.BaseClass;

public class TC004_NewIndividuals extends BaseClass {

	@And("Click on the New Individuals tab")
	public TC004_NewIndividuals newIndividualTab() {
		WebElement clk = driver.findElement(By.xpath("//span[text()='New Individual']"));
		driver.executeScript("arguments[0].click();", clk);
		return this;
	}

	@And("Click on the Dropdown icon")
	public TC004_NewIndividuals firstElementTriangle() throws InterruptedException {
		Thread.sleep(3000);
		// .sendKeys("Kumars",Keys.ENTER);
		WebElement ele = driver
				.findElement(By.xpath("//div[@class='forceVirtualActionMarker forceVirtualAction']/a[@role='button']"));
		driver.executeScript("arguments[0].click();", ele);
		return new TC004_NewIndividuals();
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

	@Given("Enter the LastName (.*)$")
	public TC004_NewIndividuals enterLName(String lName) {
		driver.findElement(By.xpath("//input[contains(@class,'lastName compound')]")).sendKeys(lName);
		return this;
	}

	@Then("Click the save button")
	public TC004_NewIndividuals clickSave() {
		driver.findElement(By.xpath("(//span[text()='Save'])[2]")).click();
		return this;
	}

	@Then("Verify the first name as (.*)$")
	public TC003_IndividualsPage verifyIndividuals() {
		String message = driver
				.findElement(By.xpath("//span[@class='toastMessage slds-text-heading--small forceActionsText']"))
				.getText();
		// verify Individuals Name
		System.out.println(message);
		if (message.contains("created")) {
			System.out.println("Individuals created" + message);
		} else
			System.out.println("Doesnt contains" + message);
		return new TC003_IndividualsPage();
	}

	@And("The Individual has been deleted")
	public TC006_DeleteIndividuals verifyDeleteMessage() {
		String msg = driver.findElement(By.xpath("//span[contains(@class,'toastMessage')]")).getText();
		System.out.println(msg);
		return new TC006_DeleteIndividuals();
	}

	@Then("Verify Whether Individual is Deleted using (.*)$")
	public TC003_IndividualsPage verifyFinalMessage() {
		String verify = driver.findElement(By.xpath("//span[text()='No items to display.']")).getText();
		System.out.println(verify);
		if (verify.contains("Kumar")) {
			System.out.println("Kumar is deleted");
		} else {
			System.out.println("Kumar not deleted");
		}
		return new TC003_IndividualsPage();
	}
}
