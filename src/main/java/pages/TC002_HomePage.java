package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.And;
import marathon.BaseClass;

public class TC002_HomePage extends BaseClass {
	@And("Click the Waffle button")
	public TC002_HomePage clickWaffle() {
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		return this;
	}
	@And("Click the View All button")
	public TC002_HomePage viewAll() {
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		return this;
	}
	@And("Scroll the party consent link")
	public TC002_HomePage clickPartyConsent() {
		WebElement scroll = driver.findElement(By.xpath("//p[text()='Party Consent']"));
		driver.executeScript("arguments[0].scrollIntoView();", scroll);
		return this;
	}
	@And("Click the Individuals link")
	public TC003_IndividualsPage clickIndividuals() {

		WebElement individual = driver.findElement(By.xpath("//p[text()='Individuals']"));
		driver.executeScript("arguments[0].click();", individual);
		
		return new TC003_IndividualsPage();

	}
}