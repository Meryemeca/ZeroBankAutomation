package com.zerobank.pages;

import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage{

    @FindBy(id = "signin_button")
    public WebElement signInButton;

    @FindBy(id="user_login")
    public WebElement loginBox;

    @FindBy(id = "user_password")
    public WebElement passwordInput;

    @FindBy(id="user_remember_me")
    public WebElement useRememberMe;

    @FindBy(css = "[class='btn btn-primary']")
    public WebElement submitButton;

    @FindBy(css="div[class='alert alert-error']")
    public WebElement warningMessage;

    public LoginPage(){
        PageFactory.initElements(Driver.get(), this);
    }

    public void login(String userName, String password){

        BrowserUtils.waitForVisibility(submitButton,10);
        loginBox.sendKeys(userName);
        passwordInput.sendKeys(password);

    }

}
