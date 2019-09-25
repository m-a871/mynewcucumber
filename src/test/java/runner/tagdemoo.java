package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="Feature\\tagdemo.feature",glue= {"stepDef"},plugin= {"html:target/cucumber.html"},tags= {"@RegressionTest"})

public class tagdemoo {
	

}
