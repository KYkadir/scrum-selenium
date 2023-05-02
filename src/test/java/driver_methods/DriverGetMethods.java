package driver_methods;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverGetMethods {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.com");

        //2-driver.getTitle();
        System.out.println("page title : "+driver.getTitle());    //Amazon.com Spend Less ..Smile more

        //3-driver.getCurrentUrl();        icinde oldugu sayfanin Url ini doner
        System.out.println(driver.getCurrentUrl());   //https://www.amazon.com

        //4- driver.getPageSource();----->>icinde oldugu sayfanin kaynak kodlarini dondurur
        System.out.println("===========================================");
        System.out.println(driver.getPageSource());

        System.out.println("============================================");
        //5-driver.getWindowHandle()----------->>icinde oldugu sayfanin UNIQUE hash kodunu dondurur
        System.out.println(driver.getWindowHandle());

        //6-driver.getWindowHandles()------->   driver calisirken acilan tum sayfalarin UNIQUE hash kodunu dondurur

    }
}
