package driver_methods;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManagerMethods {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        // 1- driver.navigate().to("url")  istenen url e gider
        //  driver.get(url) ile ayni islemi yapar ama forward ve back yapilmasina imkan tanir

        driver.get("https://www.amazon.com");
        driver.navigate().to("https://www.facebook.com");

        //2-driver.navigate().back();    ----->> bir onceki sayfaya donus yapar
        driver.navigate().back();

        //3-driver.navigate().forward();   ------->>tekrar bir onceki sayfaya doner
        driver.navigate().forward();

        //4-driver.navigate().refresh();     -------------> icinde oldugu sayfayi refresh eder.
        driver.navigate().refresh();


        //5-driver olsuturuldugunda acilan sayfayi kapatmak istersek
       // driver.close();

        //6-driver calisirken birden fazla tab veya window actiysa tumunu kapatmak icin
        // driver.quit


    }
}
