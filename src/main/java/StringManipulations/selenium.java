package StringManipulations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;


public class selenium {

    public static void main(String[] args) {
        // Set the path to your ChromeDriver executable
        // System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Initialize the WebDriver
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        try {
            // Navigate to the website
            driver.get("https://www.info-pg.com/");

            // Create a WebDriverWait instance
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

            // Wait for the cookie banner to load and become clickable
            WebElement acceptCookiesButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Accept All Cookies']")));

            // Click on the Accept All Cookies button
            acceptCookiesButton.click();
            Thread.sleep(10000);

            // Additional actions can be performed here after accepting cookies

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}
