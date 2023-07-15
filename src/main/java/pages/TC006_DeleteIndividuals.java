package pages;

import org.openqa.selenium.By;

import io.cucumber.java.en.And;
import marathon.BaseClass;

public class TC006_DeleteIndividuals extends BaseClass {
	@And("Click on the Delete option in the displayed popup window")
	public TC003_IndividualsPage popUpDelete() {
		driver.findElement(By.xpath("//span[text()='Delete']")).click();
		System.out.println("Delete Individuals");
		return new TC003_IndividualsPage();
	}
}
