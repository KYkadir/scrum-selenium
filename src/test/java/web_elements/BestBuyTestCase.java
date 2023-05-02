package web_elements;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class BestBuyTestCase {
    //      Test Case-3
    // 1- Go to https://www.bestbuy.com
    // 2- If cookies appear, press accept button
    // 3- print how many button tags there are on the page
    // 4- print the text on each button on the page
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //      1- Go to https://www.bestbuy.com
        driver.get("https://www.bestbuy.com");
        //      2- If cookies appear, press accept button
        //      3- print how many button tags there are on the page
        List<WebElement> buttonList = driver.findElements(By.tagName("button"));
        System.out.println("size of the list : " + buttonList.size());
        //      4- print the text on each button on the page

        for (WebElement each : buttonList
        ) {
            System.out.println(each.getText());

        }

    }
}
