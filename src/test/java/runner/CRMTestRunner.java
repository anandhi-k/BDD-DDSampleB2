package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src\\test\\java\\features\\backgroundsample.feature",
		glue = {"stepdefinitions"},
		monochrome=true,
		plugin= {"pretty"},
		tags= {"@BackgroundTag"}
		//OR
		//tags= {"@SmokeTest, @RegressionTest"}
		//And
		//tags= {"@SmokeTest", "@RegressionTest"}
		//Whichever is marked SmokeTest
		//tags= {"@SmokeTest"}
		//Only SmokeTest
		//tags= {"@SmokeTest", "~@RegressionTest"}
		//Not Tagged
		//tags= {"~@SmokeTest","~@RegressionTest"}
		//Scenarios without tags 
		//tags= {"@FunctionalTest","~@SmokeTest", "~@RegressionTest"}
		)
public class CRMTestRunner {

}
