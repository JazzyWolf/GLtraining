package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class BrowserConfig {
    public static WebDriver driver = new ChromeDriver();
    public static String baseurl = "https://www.selenium.dev/";
    private static String username = "username"; //this is just a placeholder

    public static String getUsername() {
        return username;
    }

    public static void setUsername(String username) {
        BrowserConfig.username = username;
    }

    private static String password = "password"; //this is just a placeholder

    public static String getPassword() {
        return password;
    }

    public static void setPassword(String password) {
        BrowserConfig.password = password;
    }

    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    public static DevTools devTools;

}
