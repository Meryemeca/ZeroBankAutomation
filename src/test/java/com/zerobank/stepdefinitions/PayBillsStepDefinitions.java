package com.zerobank.stepdefinitions;

import com.zerobank.pages.PayBillsPage;
import com.zerobank.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.util.List;
import java.util.Map;

public class PayBillsStepDefinitions {


    PayBillsPage payBillsPage = new PayBillsPage();

    @Then("user adds payment information :")
    public void user_adds_payment_information( List<Map<String, String>> dataTable) {

        BrowserUtils.waitForClickablility(payBillsPage.payee,4);
        for(Map<String, String> map: dataTable) {
        payBillsPage.selectDropBox(map.get("Payee"), payBillsPage.payee);
           // payBillsPage.payee.sendKeys(map.get("Account"));
            payBillsPage.selectDropBox(map.get("Account"), payBillsPage.account);
           // payBillsPage.account.sendKeys(map.get("Account"));

            payBillsPage.amount.sendKeys(map.get("Amount"));
            payBillsPage.date.sendKeys(map.get("Date"));
            payBillsPage.description.sendKeys(map.get("Description"));
            payBillsPage.payButton.click();
            BrowserUtils.wait(2);
         }

    }


    @Then("user verifies that {string} message is displayed on screen")
    public void user_verifies_that_message_is_displayed_on_screen(String string) {
        BrowserUtils.waitForVisibility(payBillsPage.successfulPaymentMessage,3);

        Assert.assertEquals(string,payBillsPage.successfulPaymentMessage.getText());
    }

    @Then("user verifies that validation message is displayed")
    public void user_verifies_that_validation_message_is_displayed() {
       // Assert.assertEquals("true", payBillsPage.amount.getAttribute("required"));
        Assert.assertEquals("Please fill out this field.", payBillsPage.amount.getAttribute("validationMessage"));

    }

    @Then("user verifies that validation message is displayed without date")
    public void user_verifies_that_validation_message_is_displayed_without_date() {
        Assert.assertEquals("Please fill out this field.", payBillsPage.date.getAttribute("validationMessage"));
    }


}
