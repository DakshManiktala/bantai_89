package Cucum_package_2;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "Feature99"
		,glue={"step_definition_2"}
		)

public class Test_runner_2 {


}
