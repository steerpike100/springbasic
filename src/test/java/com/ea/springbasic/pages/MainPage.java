package com.ea.springbasic.pages;


import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
//@ConditionalOnProperty(name = "env", havingValue = "qa")
public class MainPage {

    public MainPage() {
        System.out.println("In Main Page");
    }

    @Autowired
    private LoginPage loginPage;

    @Autowired
    private HomePage homePage;

    @Autowired
    private WebDriver driver;

    public void performLogin() {

        driver.navigate().to("http://eaapp.somee.com");
        homePage.clickLogin();
        loginPage.login("admin", "adminpassword23432");
        loginPage.clickLogin();
    }
}
