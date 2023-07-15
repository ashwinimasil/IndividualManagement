package runner;

import io.cucumber.testng.CucumberOptions;
import marathon.BaseClass;
@CucumberOptions(features="src/main/java/features/CreateIndividuals.feature",
glue="pages",monochrome=true,publish =true)
public class RunIndividuals extends BaseClass{
	
	
}