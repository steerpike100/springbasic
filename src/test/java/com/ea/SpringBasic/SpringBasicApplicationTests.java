package com.ea.SpringBasic;

import com.ea.SpringBasic.pages.MainPage;
import org.junit.Ignore;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Profile;
import org.springframework.test.context.junit4.SpringRunner;

@Ignore
@SpringBootTest
@RunWith(SpringRunner.class)
class SpringBasicApplicationTests {

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
