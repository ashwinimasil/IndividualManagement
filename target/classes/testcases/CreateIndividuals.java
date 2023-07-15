package testcases;

import org.testng.annotations.Test;

import marathon.BaseClass;
import pages.TC001_LoginPage;

public class CreateIndividuals extends BaseClass {
	@Test
	public void runCreateIndividuals() throws InterruptedException{
		TC001_LoginPage LP = new TC001_LoginPage();
		LP.enterUserName("ashwinimasil@gmail.com")
		.enterPassword("Rajash123$")
		.clickLogin()
		.clickWaffle()
		.viewAll()
		.clickPartyConsent()
		.clickIndividuals()
		.newIndividual()
		.enterLName("Ravi")
		.clickSave()
		.verifyIndividuals();
		
		
		
}
}