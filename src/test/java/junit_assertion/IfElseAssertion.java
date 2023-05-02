package junit_assertion;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class IfElseAssertion {
    WebDriver driver;


    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }
    @After
    public void tearDown() {driver.close();}

    @Test
    public void test01() {
        // 1-  Go to https:www.amazon.com
        driver.get("https://www.amazon.com");
        // 2- put "Nutella" in the search bar
        WebElement searchBox = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        searchBox.sendKeys("Nutella");
        // 3- After typing Nutella, press ENTER to search
        searchBox.submit();
        //4- Print the result item found.
        WebElement resultElement = driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));
        String actualResult = resultElement.getText(); //1-48 of 105 results for "Nutella"
        String expectedResult = "Nutella";

        if (actualResult.contains((expectedResult))) {
            System.out.println("Nutella test PASSED");
        } else {
            System.out.println("Sonuc yazisi Nutella icermiyor" +
                    "\nNutella tests FAILED");
        }
    }

}
