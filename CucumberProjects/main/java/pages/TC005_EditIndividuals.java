package pages;

import org.openqa.selenium.By;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import marathon.BaseClass;

public class TC005_EditIndividuals extends BaseClass {
	@And("Select Salutation")
	public TC005_EditIndividuals selectIndividual() {
		driver.findElement(By.xpath("//a[@class='select']")).click();
		return this;
	}

	@And("Enter the first name as (.*)$")
	public TC005_EditIndividuals clickMr() {
		driver.findElement(By.xpath("//a[text()='Mr.']")).click();
		driver.findElement(By.xpath("//input[contains(@class,'firstName')]")).sendKeys("Ganesh");
		return this;
	}

	@And("Click on Save")
	public TC005_EditIndividuals clickSave() throws InterruptedException {
		driver.findElement(By.xpath("(//span[text()='Save'])[2]")).click();
		Thread.sleep(2000);
		return this;
	}

	@Then("Verify the first name as (.*)$)")
	public TC005_EditIndividuals verifyFirstName() {
		String msg = driver.findElement(By.xpath("//span[contains(@class,'toastMessage')]")).getText();
		// Verify the first name as 'Ganesh'
		System.out.println(msg);
		if (msg.contains("saved")) {
			System.out.println("The individual is saved" + msg);
		} else
			System.out.println("The individual is not saved" + msg);

		return new TC005_EditIndividuals();
	}

}
