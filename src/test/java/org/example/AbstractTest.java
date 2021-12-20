package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public abstract class AbstractTest {

    static WebDriver driver;

    @BeforeAll
    static void setDriver() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        options.addArguments("--start-maximized");
        driver = new ChromeDriver(options);
    }

    @BeforeEach
    void initMainPage() {
        Assertions.assertDoesNotThrow( ()-> driver.navigate().to("https://diary.ru"), "Страница недоступна");
    }

    @AfterAll
    public static void exit() {
        if (driver !=null)
            driver.quit();
    }

    public WebDriver getDriver() {
        return this.driver;
    }
}
