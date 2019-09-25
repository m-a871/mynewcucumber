package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features="Feature\\demo.feature",glue= {"stepDef"},plugin= {"html:target/cucumber.html"})

public class demo1_runner {
	
}
