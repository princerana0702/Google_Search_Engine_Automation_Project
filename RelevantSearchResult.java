package Google_Search_Engine;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RelevantSearchResult {
    public static void main(String[] args) {
        // set the path to the chromedriver executable
        WebDriverManager.chromedriver().setup();

        // launch the Chrome browser
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // navigate to the search engine's website
        driver.get("https://www.google.com");

        // locate the search bar element and enter the desired keyword
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("php");

        // submit the search
        searchBox.submit();

        // wait for the search results page to load completely
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.titleContains("php"));


        // retrieve the title of the search results page
        String title = driver.getTitle();

        // check if the title contains the relevant keywords
        if (title.contains("java programming") || title.contains("programming in java")) {
            System.out.println("The search results appear to be relevant to the entered keyword.");
        } else {
            System.out.println("The search results may not be the most popular or relevant to the entered keyword.");
        }

        // close the browser
        driver.quit();
    }
}