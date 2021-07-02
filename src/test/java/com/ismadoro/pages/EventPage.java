package com.ismadoro.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EventPage {

    private WebDriver driver;

    public EventPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(id="register-event-button")
    public WebElement registerEventButton;

    @FindBy(id="register-info")
    public WebElement registerInfo;

    @FindBy(id="update-event-button")
    public WebElement updateEventButton;

    @FindBy(id="delete-event-button")
    public WebElement deleteEventButton;

}
