package MyRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber; 

@RunWith(Cucumber.class)
@CucumberOptions(features ="./src/main/java/Features/myInfo.feature", glue="stepDefinition"
, monochrome=true, dryRun=false, strict=true
,plugin={"pretty","html:test-output","json:json_output/Cucumber.json"})

public class TestRunner {

}
