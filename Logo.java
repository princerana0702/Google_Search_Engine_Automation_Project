package Google_Search_Engine;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Logo {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        // Create a new instance of the Chrome driver
        WebDriver driver = new ChromeDriver();

// Navigate to the Google homepage
        driver.get("https://www.google.com");


// Find the Google logo element by its xpath
        WebElement logo = driver.findElement(By.xpath("//img[@alt='Google']"));

// Check if the Google logo is displayed
        if(logo.isDisplayed()) {
            System.out.println("Google logo is displayed");
        } else {
            System.out.println("Google logo is not displayed");
        }

// Close the browser
//        driver.quit();
    }
}
