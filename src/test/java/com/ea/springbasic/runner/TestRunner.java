package com.ea.springbasic.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features"},
        glue = {"com.ea.springbasic.steps"},
        plugin = {"pretty", "html:target/cucumber", "json:build/cucumber-test.json", "junit:build/cucumber.xml"})
public class TestRunner {

}


