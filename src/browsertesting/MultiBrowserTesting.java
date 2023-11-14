package browsertesting;
/**
 * BaseUrl = https://www.saucedemo.com/
 * 1. Setup chrome browser.
 * 2. Open URL.
 * 3. Print the title of the page.
 * 4. Print the current url.
 * 5. Print the page source.
 * 6. Enter the email to email field.
 * 7. Enter the password to password field.
 * 8. Click on Login Button.
 * 9. Print the current url.
 * 10. Navigate to baseUrl
 * 11. Refresh the page.
 * 12. Close the browser.
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class MultiBrowserTesting {
    public static void main(String[] args) {
       String baseUrl = "https://www.saucedemo.com/";
 // Launch the browser
        WebDriver driver = new ChromeDriver();
 // Open the Url into the browser
        driver.get(baseUrl);
 // Maximise the browser
        driver.manage().window().maximize();
 // We give Implicit wait to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
 // Get the title
        String title = driver.getTitle();
        System.out.println(title);
 // Get the current Url
        System.out.println("The current Url: " + driver.getCurrentUrl());
 // Get page source
        String p = driver.getPageSource();
        System.out.println("Page Source is : " + p);
 // Find userNameField element and type the userName
        WebElement usernameField = driver.findElement(By.id("user-name"));
        usernameField.sendKeys("Prime Testing");
 // Find passwordField element and type the password
        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys("Prime123");
 // Click on login button
        WebElement loginButton = driver.findElement(By.id("login-button"));
        loginButton.click();
 // Print the current Url
        System.out.println("Current Url after clicking loginButton : " + driver.getCurrentUrl());
 // Navigate back to the login page
        driver.navigate().back();
 // Refresh the page
        driver.navigate().refresh();
 // Close the browser
        driver.quit();
    }
}
