package com.ismadoro.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {

    private WebDriver driver;

    public RegisterPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "InputUsername")
    public WebElement inputUsername;

    @FindBy(id = "InputPassword")
    public WebElement inputPassword;

    @FindBy(id = "InputFirstName")
    public WebElement inputFirstName;

    @FindBy(id = "InputLastName")
    public WebElement inputLastName;

    @FindBy(id = "InputEmail")
    public WebElement inputEmail;

    @FindBy(id = "InputPhone")
    public WebElement inputPhone;

    @FindBy(id = "InputCity")
    public WebElement inputCity;

    @FindBy(id = "InputState")
    public WebElement inputState;

    @FindBy(id = "floatingTextarea")
    public WebElement floatingTextArea;

    @FindBy(id = "button-submit")
    public WebElement buttonSubmit;

    @FindBy(id = "new-user-error")
    public WebElement newUserError;


//    @FindBy(id = "")
//    public WebElement ;
}
