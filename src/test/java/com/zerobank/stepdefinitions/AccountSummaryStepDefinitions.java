package com.zerobank.stepdefinitions;

import com.zerobank.pages.AccountSummaryPage;
import com.zerobank.pages.LoginPage;
import com.zerobank.utilities.BrowserUtils;
import io.cucumber.java.en.*;
import org.junit.Assert;

import java.util.List;


public class AccountSummaryStepDefinitions {


    AccountSummaryPage accountSummaryPage = new  AccountSummaryPage();
    LoginPage loginPage= new LoginPage();
    @Given("user is already on Account summary page.")
    public void user_is_already_on_Account_summary_page() {

        System.out.println("user is on Account summary page.");

    }

    @Then("user navigates to {string}")
    public void user_navigates_to(String string) {

        loginPage.navigateTo(string);
    }

    @When("user verifies that account types are displayed")
    public void user_verifies_that_account_types_are_displayed(List<String> dataTable) {
        Assert.assertEquals(dataTable,accountSummaryPage.getAccountNames());
    }

    @When("user verifies that Credit Accounts tables column names are displayed")
    public void user_verifies_that_Credit_Accounts_tables_column_names_are_displayed(List<String> dataTable) {
        Assert.assertEquals(dataTable,accountSummaryPage.getColumnNames());
    }





}
