package com.zerobank.stepdefinitions;

import com.zerobank.pages.LoginPage;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class LoginStepDefinitions {

    LoginPage loginPage = new LoginPage();
    @Given("user is on the login page")
    public void user_is_on_the_login_page() {

        System.out.println("I am on the login page");
        Driver.get().get(ConfigurationReader.getProperty("url"));
        loginPage.signInButton.click();

    }

    @Then("user can click on login button")
    public void user_can_click_on_login_button() {
//    loginPage.submitButton.click();
        //loginPage.submitButton
        loginPage.submitButton.click();
    }

    @Then("User can login with username {string} and password {string}")
    public void user_can_login_with_username_and_password(String string, String string2) {

       // String userName = ConfigurationReader.getProperty("user_name");
        //String password = ConfigurationReader.getProperty("password");
        loginPage.login(string, string2);


    }

    @Then("user verifies that {string} page title displayed.")
    public void user_verifies_that_page_title_displayed(String string) {
        BrowserUtils.wait(4);
        Assert.assertEquals(string, loginPage.getPagetitle());
    }

    @Then("Then User can login with username {string} and password {string}")
    public void then_User_can_login_with_username_and_password(String string, String string2) {
        loginPage.login(string,string2);

    }

    @Then("user verifies that {string} message is displayed")
    public void user_verifies_that_message_is_displayed(String string) {
        BrowserUtils.waitForVisibility(loginPage.warningMessage,3);

        Assert.assertEquals("Login and/or password are wrong.",loginPage.warningMessage.getText());


    }

    @Then("user enters {string} username and {string} password")
    public void user_enters_username_and_password(String string, String string2) {
        loginPage.login(string,string2);

    }


}
