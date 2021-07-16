package com.ea.springbasic.steps;

import com.ea.springbasic.pages.MainPage;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@Ignore
@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootBaseTest {

    @Autowired
    private MainPage mainPage;

    @Value("${app.url}")
    private String appUrl;

    @Autowired
    private WebDriver driver;

    @Test
    void performLoginTest() {
        mainPage.performLogin();
    }
}
