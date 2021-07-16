package com.ea.springbasic.steps;

import com.ea.springbasic.pages.HomePage;
import com.ea.springbasic.pages.LoginPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;


import java.util.List;

import static junit.framework.TestCase.assertTrue;

@Slf4j
public class LoginSteps {

    @Autowired
    public HomePage homePage;

    @Autowired
    public LoginPage loginPage;

    @Given("I click login in Home Page")
    public void iClickLoginInHomePage() {
        homePage.clickLogin();
    }


    @And("I enter the following for login")
    public void iEnterTheFollowingForLogin(DataTable table) {
        List<String> data = table.asList();
        loginPage.login(data.get(2), data.get(3));

    }

    @And("I click login button")
    public void iClickLoginButton() {
        loginPage.clickLogin();

    }

    @Then("I should see the userform page")
    public void iShouldSeeTheUserformPage() {
        assertTrue(homePage.isEmployeeDetailsExist());
    }

    @Given("I click in Home Page")
    public void iClickInHomePage() {

    }
}



