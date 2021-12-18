package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions( features = "./Features/LoingDemo.feature", glue= {"stepDefinition"},
				  monochrome=true, plugin={"pretty","html:target/HtmlReports/report.html",
				  "json:target/JsonReport/report.json","junit:target/JunitReport/report.xml"}
				  
		)
public class TestRunner {

}
