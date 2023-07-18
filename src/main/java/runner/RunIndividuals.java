package runner;

import org.testng.annotations.Test;

import marathon.BaseClass;
import pages.TC001_LoginPage;

public class RunIndividuals extends BaseClass{
	@Test
	public void runIndividuals() {
		TC001_LoginPage lp = new TC001_LoginPage();
		lp.enterUserName("ashwinimasil@gmail.com")
		.enterPassword("Rajash123$")
		.clickLogin()
		.clickWaffle()
		.viewAll()
		.clickPartyConsent()
		.clickIndividuals()
		.individualLink()
		.newIndividualTab()
		.enterLName("kumar")
		.clickSave()
		.verifyIndividuals();		
}
}