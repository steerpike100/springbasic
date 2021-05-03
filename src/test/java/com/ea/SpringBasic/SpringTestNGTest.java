package com.ea.SpringBasic;

import com.ea.SpringBasic.pages.MainPage;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

@SpringBootTest
public class SpringTestNGTest extends AbstractTestNGSpringContextTests {

    @BeforeSuite(alwaysRun = true)
    @Override
    protected void springTestContextPrepareTestInstance() throws Exception {
        super.springTestContextPrepareTestInstance();
    }

    @Autowired
    private WebDriver driver;

    @Value("${app.url}")
    private String appUrl;

    @Autowired
    private MainPage mainPage;


    @BeforeTest
    protected void initWebDriver() {
        driver.navigate().to(appUrl);

    }

    @Test
    public void testLogin(){
        mainPage.performLogin();
    }

}
