package Google_Search_Engine;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchResultsTest {
    public static void main(String[] args) {
        // Set the path to the Chrome driver executable
        WebDriverManager.chromedriver().setup();

        // Launch Chrome
        WebDriver driver = new ChromeDriver();

        // Navigate to the Google search results page for "java programming"
        driver.get("https://www.google.com/search?q=java+programming");

        // Find the element that displays the number of search results on the first page
        WebElement resultStats = driver.findElement(By.id("result-stats"));

        // Get the text of the resultStats element
        String resultStatsText = resultStats.getText();
        System.out.println(resultStatsText);

        // Extract the number of search results from the resultStats text
        String[] resultStatsParts = resultStatsText.split(" ");
        System.out.println(resultStatsParts);
        String numResultsString = resultStatsParts[1].replace(",", "");
        int numResults = Integer.parseInt(numResultsString);

        // Print the number of search results
        System.out.println("Number of search results on the first page: " + numResults);

        // Close the browser
        driver.quit();
    }
    }

