package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions( features = "./BGDemoFeature/BackgroundDemo.feature", 
				  monochrome=true, 
				  plugin={"pretty","html:target/HtmlReports/report.html",
						  "json:target/JsonReport/report.json","junit:target/JunitReport/report.xml"}
						  	  
		)
public class TestRunnerForBG {

}
