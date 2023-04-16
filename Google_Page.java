package Google_Search_Engine;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_Page {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        // Create a new instance of the Chrome driver
        WebDriver driver = new ChromeDriver();

// Navigate to the Google homepage
        driver.get("https://www.google.com");

        // Verify that the Google page is opened
        if(driver.getTitle().equals("Google")) {
            System.out.println("Google page is opened");
        } else {
            System.out.println("Google page is not opened");
        }

// Close the browser
//        driver.quit();
    }
}
