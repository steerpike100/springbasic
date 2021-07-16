package com.ea.springbasic.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.springframework.stereotype.Component;

@Component
public class HomePage extends BasePage {

    @FindBy(how = How.LINK_TEXT, using = "Login")
    public WebElement lnkLogin;

    @FindBy(how = How.LINK_TEXT, using = "Employee List")
    public WebElement lnkEmployeeList;

    @FindBy(how = How.LINK_TEXT, using = "Employee Details")
    public WebElement lnkEmployeeDetails;

    public LoginPage clickLogin() {
        lnkLogin.click();
        System.out.println("Click the home page login");
        return new LoginPage();
    }

    public void clickEmployeeList() {
        lnkEmployeeList.click();
    }

    public boolean isEmployeeDetailsExist(){
        return lnkEmployeeDetails.isDisplayed();
    }


}

