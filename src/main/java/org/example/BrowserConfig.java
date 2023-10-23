package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class BrowserConfig {
    public static WebDriver driver = new ChromeDriver();
    public static String baseurl = "https://www.selenium.dev/";
    public static String username = "username";
    public static String password = "password";
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    public static DevTools devTools;

}
