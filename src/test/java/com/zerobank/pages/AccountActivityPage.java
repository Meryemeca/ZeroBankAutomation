package com.zerobank.pages;

import com.zerobank.utilities.BrowserUtils;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AccountActivityPage extends BasePage {

    @FindBy (id = "aa_accountId")
    public WebElement accountDropBox;

   // @FindBy(css = "[id='all_transactions_for_account'] th")
    @FindBy(css = "thead>tr>th")
    public List<WebElement> transactionTableColumnNames;

    public List<String> getAccountNames(){
        List <WebElement> list =BrowserUtils.getOptionsFromDropBox(accountDropBox);
        return BrowserUtils.getListOfString(list);
    }

    public List<String> getColumnNames(){
        return BrowserUtils.getListOfString(transactionTableColumnNames);
    }


}


