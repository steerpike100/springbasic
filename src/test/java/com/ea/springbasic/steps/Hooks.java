package com.ea.springbasic.steps;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Hooks {

    @Autowired
    private WebDriver driver;

    @Value("${app.url}")
    private String appUrl;

    @Before
    public void initializeTest(Scenario scenario){
        driver.navigate().to(appUrl);
    }

    @After
    public void tearDown(Scenario scenario){
        if(scenario.isFailed()){
            System.out.println(scenario.getName());
        }
        driver.quit();
    }


}
