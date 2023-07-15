package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions (features="src/main/java/features",glue="pages",monochrome =true, publish=true)
public class CucumberRunnerIndividual extends AbstractTestNGCucumberTests{

	}