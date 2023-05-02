package driver_methods;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DriverManageMethods {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
       //1-driver.manage().window() methodlari
       //1-A driver.manage().window().getSize()------>icinde oldugu sayfanin pixel olarak olculerini dondurur
        System.out.println(driver.manage().window().getSize());    // (1050,832) pixel
        //1-B driver.manage().window().getPosition()---->icinde oldugu sayfanin pixel olarak konumunu dondurur
        System.out.println(driver.manage().window().getPosition()); //(10,10)

        //1-C driver.manage().window().setPosition(new Point(15,15));
        // icinde oldugu sayfanin sol alt kosesini bizim yazacagimiz pixel noktasina tasir
        driver.manage().window().setPosition(new Point(15,15));

        //1-D driver.manage().window().setSize(new Dimension(900,600));
        //icinde oldugu sayfanin sol alt kosesi sabit olrak bizim yazacagimiz olculere getirir
        driver.manage().window().setSize(new Dimension(900,600));

        //konumu ve boyutu yeniledikten sonra tekrar yazdirirsak
        System.out.println("yeni pencere olculeri : "+driver.manage());//(900,600)
        System.out.println("yeni pencere konumu : "+driver.manage().window().getPosition());//(15,15)

        // 1-E driver.manage() .window() .maximize(); --> icinde oldugu sagfagi maximize gapar
        // 1 -F driver.manage() .window() .fullscreen();----> icinde OldtjgU sayfagİ fullscreen yapar

        driver.manage().window().fullscreen();
        System.out.println("fullscreen konum : " +driver.manage().window().getPosition());// (0,0)
        System.out.println("fullscreen boyut : " +driver.manage().window().getSize()); // (1600,900)

        //1-G driver.manage().window().minimize();----> sayfayi simge durumuna kucultur
          driver.manage().window().minimize();

        //2-driver.manage().timeouts().methods
          driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));// her sayfa acilisinda kullanmaliyiz
//        wait konusunu ilerde tek basina ele alacagiz
//        ancak her cLass icin yapmamiz gereken bir agar OldL-ıgU icin burada kisaca deginelim
//        impIicitIgWait : diniver 'a sayfanin guklenmesi ve kullanacagimiz webelementlerin bUILjnmaŞİ icin
//        bekleyecegi maximum Süreyi belirtir.
//        driver bu Süre icerisinde sayfa guklenir/web element bUILjnL-ırŞa
//        beklemeden calismaga devam eder.
//        DU SL_ıre bittigi halde sayfa gukLenememis/webEIement bulunamamissa
//        exception vererek calismagi dUPdLJPLJ,n
//        Duration. ofSecondş (15)
//        Duration class'i Selenium-4 ile gelen zaman Class ' idin
//        Yani diniver 'a ne kadar bekleyecegini sogler
//        Duration. ofŞeconds(15) gerine milis, minutes,hours da kullanilabilir




    }
}
