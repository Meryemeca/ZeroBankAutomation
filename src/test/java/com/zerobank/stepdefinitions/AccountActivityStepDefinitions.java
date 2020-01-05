package com.zerobank.stepdefinitions;

import com.zerobank.pages.AccountActivityPage;
import com.zerobank.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


import java.util.List;

public class AccountActivityStepDefinitions {

   AccountActivityPage accountActivityPage= new AccountActivityPage();
    @When("Account drop down should be clickable")
    public void account_drop_down_should_be_clickable() {

    }

    @Then("{string} option should be selected.")
    public void option_should_be_selected(String string) {
      Assert.assertEquals(string, BrowserUtils.selectedOptionFromDropBox(accountActivityPage.accountDropBox).getText());
    }

    @Then("Account drop down should have following fields")
    public void account_drop_down_should_have_following_fields(List<String> dataTable) {
       // Assert.assertEquals(dataTable,BrowserUtils.getListOfString(BrowserUtils.getOptionsFromDropBox(accountActivityPage.accountDropBox)));
        Assert.assertEquals(dataTable,accountActivityPage.getAccountNames());
    }

    @When("Transactions table should have following columns")
    public void transactions_table_should_have_following_columns(List<String> dataTable) {

        BrowserUtils.wait(3);
        Assert.assertEquals(dataTable,accountActivityPage.getColumnNames());
        System.out.println(dataTable);
        System.out.println(accountActivityPage.getColumnNames());



    }



}
