package com.ea.springbasic.runner;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features"},
        glue = {"com.ea.springbasic.steps"},
        plugin = {"pretty", "html:target/cucumber", "json:build/cucumber-test.json", "junit:build/cucumber.xml"})
public class TestRunner {

}


