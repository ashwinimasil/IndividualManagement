package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import marathon.BaseClass;

public class TC004_NewIndividuals extends BaseClass {
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

	@And("Search the Individuals (.*)$")
	public TC004_NewIndividuals searchIndividual() {
		WebElement name = driver.findElement(By.xpath("//input[@name='Individual-search-input']"));
		name.sendKeys("Kumars");
		name.sendKeys(Keys.ENTER);
		return this;
	}

	@And("The Individual has been deleted")
	public TC006_DeleteIndividuals verifyDeleteMessage() {
		String msg = driver.findElement(By.xpath("//span[contains(@class,'toastMessage')]")).getText();
		System.out.println(msg);
		return new TC006_DeleteIndividuals();
	}

	@And("Search the deleted name in search textbox")
	public TC006_DeleteIndividuals searchDeletedName() throws InterruptedException {
		driver.findElement(By.xpath("//input[@class='slds-input']")).sendKeys("Kumars", Keys.ENTER);
		Thread.sleep(3000);
		return new TC006_DeleteIndividuals();
	}

	@Then("Verify Whether Individual is Deleted using Individual last name")
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
