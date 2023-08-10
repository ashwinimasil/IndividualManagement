package runner;

import io.cucumber.testng.CucumberOptions;
import parentClass.Baseclass;

@CucumberOptions(features="src/test/java/features/TestCases.feature",glue="steps", 
monochrome=true,publish=true, tags="@Regression" )
//tags= "not @smoke" )
//tags = "@sanity or @smoke")
//tags ="@sanity and @smoke and @Regression")
public class CucumberRunner extends Baseclass{
	
}