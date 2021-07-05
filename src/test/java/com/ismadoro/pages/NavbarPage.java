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

    @FindBy(id = "username-input")
    public WebElement usernameInput;

    @FindBy(id = "password-input")
    public WebElement passwordInput;

    @FindBy(id = "login-button")
    public WebElement loginButton;

    @FindBy(className = "u-center-text")
    public WebElement uCenterText;

    @FindBy(id = "login-error")
    public WebElement loginError;

    @FindBy(id = "new-event-button")
    public WebElement newEventButton;

    @FindBy(id = "my-events-button")
    public WebElement myEventsButton;

    @FindBy(id = "navbar-search-query")
    public WebElement navbarSearchQuery;

    @FindBy(id="navbar-search-option")
    public WebElement navbarSearchOption;

    @FindBy(id="event-search-option")
    public WebElement eventSearchOption;

    @FindBy(id="player-search-option")
    public WebElement playerSearchOption;

    @FindBy(id="navbar-search")
    public WebElement navbarSearch;

    @FindBy(id="nav-profile-info")
    public WebElement navProfileInfo;


}
