package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="featurefiles",glue={"stepDefinition"},
dryRun=false,
monochrome=true,
plugin = {"pretty","html:htmlreports/report.html","json:report/webreport.json","junit:target/xmlreport.xml"},
tags= "@passitive")
public class runnerClass {
	
}
