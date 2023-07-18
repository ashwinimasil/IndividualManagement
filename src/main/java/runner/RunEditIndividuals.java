package runner;

import org.testng.annotations.Test;

import marathon.BaseClass;
import pages.TC001_LoginPage;

public class RunEditIndividuals extends BaseClass{
@Test
public void runnerEditIndividuals()  throws InterruptedException {
TC001_LoginPage  lpage = new TC001_LoginPage();
lpage.enterUserName("ashwinimasil@gmail.com")
.enterPassword("Rajash123$")
.clickLogin()
.clickWaffle()
.viewAll()
.clickPartyConsent()
.clickIndividuals()
.individualLink()
.firstElementTriangle()
.editIndividual()
.clickMr()
.clickSave()
.verifyFirstName();
	}
	}