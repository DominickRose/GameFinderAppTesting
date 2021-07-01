package com.ismadoro.runners;

import com.ismadoro.pages.*;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

@RunWith(Cucumber.class)
@CucumberOptions(features= "classpath:features", glue="com.ismadoro.steps")

public class BasicRunner {

    public static WebDriver driver = null;
    public static WikiHomePage wikiHomePage = null;
    public static NavbarPage navbarPage = null;
    public static RegisterPage registerPage = null;
    public static DashboardPage dashboardPage = null;
    public static ProfilePage profilePage = null;
    public static SearchPage searchPage = null;
    public static NewEventPage newEventPage = null;
    public static EventPage eventPage = null;

    @BeforeClass
    public static void setup() {
        File file = new File("src/test/resources/chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
        driver = new ChromeDriver();
        wikiHomePage = new WikiHomePage(driver);
        navbarPage = new NavbarPage(driver);
        registerPage = new RegisterPage(driver);
        dashboardPage = new DashboardPage(driver);
        profilePage = new ProfilePage(driver);
        searchPage = new SearchPage(driver);
        newEventPage = new NewEventPage(driver);
        eventPage = new EventPage(driver);
    }

    @AfterClass
    public static void teardown(){driver.quit();}
}
