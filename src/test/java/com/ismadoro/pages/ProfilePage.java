package com.ismadoro.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfilePage {

    private WebDriver driver;

    public ProfilePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(id="button-private")
    public WebElement buttonPrivate;

    @FindBy(id="button-public")
    public WebElement buttonPublic;

    @FindBy(id="visibility-text")
    public WebElement visibilityText;

    @FindBy(id="settings-tab")
    public WebElement settingsTab;

    @FindBy(id="InputCity")
    public WebElement inputCity;

    @FindBy(id="update-button")
    public WebElement updateButton;

    @FindBy(id="profile-tab")
    public WebElement profileTab;

    @FindBy(id="city-state-text")
    public WebElement cityStateText;

    @FindBy(id="delete-user-button")
    public WebElement deleteUserButton;

    @FindBy(tagName = "h1")
    public WebElement privateNotice;

    @FindBy(id="button-new-event")
    public WebElement buttonNewEvent;

    @FindBy(id="event-tab")
    public WebElement eventTab;

    @FindBy(id="create-table-row-1")
    public WebElement createTableRow1;


}
