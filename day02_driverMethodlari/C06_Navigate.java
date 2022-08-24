package Selenium2022Summer.day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C06_Navigate {
    public static void main(String[] args) throws InterruptedException {
        /*eger testimiz sırasında birdenfazla sayfa arasında ıleri geri hareket edeceksek
        driver.get yerine driver.navigate .to meytodunu kullanırız
        ve sonrasında forward(),refresh(),back() gibi komutları kullanabiliriz
         */
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe") ;

        WebDriver driver = new ChromeDriver() ;
        driver.manage().window() .maximize() ;

        driver.navigate().to("https://www.amazon.com");//get ile yapılan ıslemın aynısını yapar
        Thread.sleep(3000) ;
        driver.navigate().to("https://www.facebook.com");
        Thread.sleep(3000) ;

        //amazona geri donelım
        driver.navigate().back() ;
        Thread.sleep(3000) ;

        //facebook sayfasına tekrar gidelım
        driver.navigate().forward() ;
        Thread.sleep(3000) ;

        driver.navigate().refresh();///sayfayı yenıleyelım
        Thread.sleep(3000) ;

        driver.close() ;




    }
}
