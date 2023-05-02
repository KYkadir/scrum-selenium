package junit;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class AmazonTestCaseInJunit {

    // 1- Go to https:www.amazon.com
    // 2- put "Nutella" in the search bar
    // 3- After typing Nutella, press ENTER to search
    // 4- Print the result item found.

    @Test
    public void test01() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // 1-  Go to https:www.amazon.com
        driver.get("https://www.amazon.com");
        // 2- put "Nutella" in the search bar
        WebElement searchBox = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        searchBox.sendKeys("Nutella");
        // 3- After typing Nutella, press ENTER to search
        searchBox.submit();
        //4- Print the result item found.
        WebElement resultElement = driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));
        System.out.println(resultElement.getText());

        driver.close();
    }
}
