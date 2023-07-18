package runner;

import org.testng.annotations.Test;

import marathon.BaseClass;
import pages.TC001_LoginPage;

public class RunDeleteIndividuals extends BaseClass{
	@Test
	public  void rundeleteIndividualsbyLastName() throws InterruptedException  {
		TC001_LoginPage lpage = new TC001_LoginPage();
		lpage.enterUserName("ashwinimasil@gmail.com")
		.enterPassword("Rajash123$")
		.clickLogin()
		.clickWaffle()
		.viewAll()
		.clickPartyConsent()
		.clickIndividuals()
		.individualLink()
		.firstElementTriangle()
		.clickDelete()
		.popUpDelete()
		.verifyAgain()
		.searchNameinSearchTextBoxthatsDeleted();
		
	}

}
