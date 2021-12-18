package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions( features = "./FeatureWithTag/Tags.feature", glue= {"stepDefinition"},
				  monochrome=true, 
				  tags= {"@regression or @smoke"}
				  
		)
public class TestRunner_Tags {

}
