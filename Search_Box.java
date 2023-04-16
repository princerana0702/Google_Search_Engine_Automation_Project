package Google_Search_Engine;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Search_Box {
    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();
        // Create a new instance of the Chrome driver
        WebDriver driver = new ChromeDriver();

// Navigate to the Google homepage
        driver.get("https://www.google.com");

        // Find the search box element by its name attribute
        WebElement searchBox = driver.findElement(By.name("q"));

// Check if the search box is clickable
        if (searchBox.isEnabled()) {
            System.out.println("Search box is clickable");
        } else {
            System.out.println("Search box is not clickable");
        }

// Close the browser
        driver.quit();
    }
}
