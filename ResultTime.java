package Google_Search_Engine;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ResultTime {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        // Launch Google and search for the keyword
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("Python" + Keys.ENTER);

// Record the start time of the search
        long startTime = System.currentTimeMillis();

// Wait for the search results page to finish loading
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("result-stats")));

// Record the end time of the search
        long endTime = System.currentTimeMillis();

// Calculate the time taken by Google to show the search results
        long searchTime = endTime - startTime;
        System.out.println("Time taken to show search results: " + searchTime + " milliseconds");

    }
}
