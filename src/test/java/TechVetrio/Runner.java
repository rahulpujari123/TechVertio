package TechVetrio;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		
		dryRun=false,
		//strict=true,
		monochrome=true,
		features= {"src/test/resources"},
		glue= {"TechVetrioLogin",}
	//	tags= {"@TechVetrio","@Login"}.
		
		)


public class Runner extends AbstractTestNGCucumberTests {

	
}
