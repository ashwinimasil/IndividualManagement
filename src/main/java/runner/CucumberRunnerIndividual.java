package runner;

import io.cucumber.testng.CucumberOptions;
import marathon.BaseClass;
@CucumberOptions (features="src/main/java/features/ManageIndividuals.feature",glue="pages",monochrome =true, publish=true)
public class CucumberRunnerIndividual extends BaseClass{

	}