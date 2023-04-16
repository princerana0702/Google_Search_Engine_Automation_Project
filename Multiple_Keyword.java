package Google_Search_Engine;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Multiple_Keyword {
    public static void main(String[] args) {
        // set the path to the chromedriver executable
        WebDriverManager.chromedriver().setup();

        // launch the Chrome browser
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // navigate to the search engine's website
        driver.get("https://www.google.com");

        // locate the search bar element and enter the desired keywords
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("java selenium");

        // submit the search
        searchBox.submit();

        // wait for the search results page to load completely
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        wait.until(ExpectedConditions.titleContains("java selenium"));
        //Declare and initialise a fluent wait
        Boolean wait = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.titleContains("java selenium"));

        // locate the search result elements and loop through them
        List<WebElement> searchResults = driver.findElements(By.xpath("(//div[@id='search'])[1]"));
        for (WebElement result : searchResults) {
            // check if the result contains all the desired keywords
            if (result.getText().contains("java") && result.getText().contains("selenium")) {
                // print the search result that matches the entered keywords
                System.out.println(result.getText());
            }
        }

        // close the browser
//        driver.quit();
    }
    }

