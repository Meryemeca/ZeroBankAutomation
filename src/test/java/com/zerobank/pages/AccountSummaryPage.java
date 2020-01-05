package com.zerobank.pages;

import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AccountSummaryPage extends BasePage{

    @FindBy (xpath = "//h2[text()='Cash Accounts']")
    public WebElement cashAccount;

    @FindBy (xpath = "//h2[text()='Investment Accounts']")
    public WebElement investmentAccount;

    @FindBy (xpath = "//h2[text()='Loan Accounts']")
    public WebElement loanAccount;

    @FindBy (xpath = "//h2[text()='Credit Accounts']")
    public WebElement creditAccount;

    @FindBy(css = ".board-header")
    public List<WebElement> accountType;

    @FindBy(css = "div[class='board']:nth-of-type(3) tr>th")
    public List<WebElement> creditAccountTableColumnNames;



        public List<String> getAccountNames(){
            return BrowserUtils.getListOfString(accountType);
        }

    public List<String> getColumnNames(){
        return BrowserUtils.getListOfString(creditAccountTableColumnNames);
    }
    }

