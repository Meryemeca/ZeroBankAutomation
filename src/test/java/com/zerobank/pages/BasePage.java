package com.zerobank.pages;

import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

    @FindBy(xpath = "//*[text()='Zero - Account Summary']")
    public WebElement pageTitle;

    @FindBy (id = "searchTerm")
            public  WebElement searchBox;
    @FindBy(xpath = "//*[normalize-space()='Settings']")
            public WebElement settings;
    @FindBy(xpath = "//*[normalize-space()='username']")
            public WebElement userName;
    @FindBy(id = "logout_link")
            public  WebElement logOutLink;

    BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }

    public String getPagetitle() {

        return Driver.get().getTitle();


    }

    public void navigateTo(String moduleName) {

        String moduleLocator = "//a[text()='" + moduleName + "']";


        WebDriverWait wait = new WebDriverWait(Driver.get(), 20);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(moduleLocator)));

        WebElement module = Driver.get().findElement(By.xpath(moduleLocator));
        wait.until(ExpectedConditions.visibilityOf(module));
        wait.until(ExpectedConditions.elementToBeClickable(module));

        module.click();
        BrowserUtils.waitForPageToLoad(10);
    }


        public void logOut() {
            BrowserUtils.wait(2);
            BrowserUtils.clickWithJS(userName);
            BrowserUtils.clickWithJS(logOutLink);
        }

    }



