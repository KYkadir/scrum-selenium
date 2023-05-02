package web_elements;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class FaceBookTestCase {
    public static void main(String[] args) {
//        Test
// 1- Go to https://www.facebook.com
// 2- If cookies pop up, press the heart button
// 3- Enter a random e-mail in the e-mail box
// 4- Enter a random password in the password field
// 5- press the login button
// 6- check that there is information message
// 7- close the page

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //        1- Go to https://www.facebook.com
        driver.get("https:www.facebook.com");
        //        2- If cookies pop up, press the heart button
        driver.findElement(By.xpath("//button[@class='_42ft _4jy0 _9xo7 _4jy3 _4jy1 selected _51sy']")).click();
        //        3- Enter a random e-mail in the e-mail box
        WebElement eMailBox=driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy']"));
        eMailBox.sendKeys("Aleksey");

        //        4-Enter a random password in the password field
        WebElement passwordBox=driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy _9npi']"));
        passwordBox.sendKeys("123456789");
        //        5- click the login button
        WebElement loginButton=driver.findElement(By.xpath("//button[@name='login']"));
        loginButton.click();
        //        6- check that there is information message
        WebElement infoText=driver.findElement(By.className("_9ay7"));
        System.out.println(infoText.getText());
        //        7- close the page
        driver.close();

    }
}
