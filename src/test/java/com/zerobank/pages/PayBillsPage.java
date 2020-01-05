package com.zerobank.pages;


import com.zerobank.utilities.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;


public class PayBillsPage extends BasePage {

    @FindBy(id="sp_payee")
    public WebElement payee;

    @FindBy(id="sp_account")
    public WebElement account;

    @FindBy(id="sp_amount")
    public WebElement amount;

    @FindBy(id="sp_date")
    public WebElement date;

    @FindBy(id="sp_description")
    public WebElement description;

    @FindBy(id="pay_saved_payees")
    public WebElement payButton;

    @FindBy(css = "div[id='alert_content']")
    public WebElement successfulPaymentMessage;


    public void selectDropBox(String str, WebElement element){

        BrowserUtils.wait(2);
        Select select = new Select(element);
        BrowserUtils.wait(2);
        select.selectByVisibleText(str);

    }

}
