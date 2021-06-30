package com.ismadoro.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NavbarPage {

    private WebDriver driver;

    public NavbarPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "dropdownMenu2")
    public WebElement dropDownMenu;

    @FindBy(id = "sign-up-button")
    public WebElement signUpButton;

    @FindBy(className = "h4")
    public WebElement banner;

    @FindBy(id = "logout-button")
    public WebElement logoutButton;


}
