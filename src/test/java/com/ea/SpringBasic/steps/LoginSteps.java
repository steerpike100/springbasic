package com.ea.SpringBasic.steps;

import com.ea.SpringBasic.pages.HomePage;
import com.ea.SpringBasic.pages.LoginPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

@Slf4j
public class LoginSteps  {

    @Autowired
    public HomePage homePage;

    @Autowired
    public LoginPage loginPage;

    @Given("I click login in Home Page")
    public void iClickLoginInHomePage() {

    }


    @And("I enter the following for login")
    public void iEnterTheFollowingForLogin() {
    }

    @Given("I click in Home Page")
    public void iClickInHomePage() {

    }

    @And("I click login button")
    public void iClickLoginButton() {

    }

    @Then("I should see the userform page")
    public void iShouldSeeTheUserformPage() {
    }
}



