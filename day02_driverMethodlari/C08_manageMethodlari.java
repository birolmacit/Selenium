package Selenium2022Summer.day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C08_manageMethodlari {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts() .implicitlyWait(Duration.ofSeconds(15));//acılana kadar bekle acılmazsa 15 saniye beklersin en fazla.sonra kapanırsın
        //15 saniye oncesinde acılırsa hemen kapanır acıldıktan sonra
        driver.get("https://www.amazon.com");
        //driver.close() ;  eger bunu burda kullanırsak bir sonraki komutla tekrar pencere acamıyor yeni bir driver objesi kullanmalıyız.


        /*ilerde wait konusu anlatılırken daha fazla islenecek
        bir sayfa acılırken ilk basta sayfanın ıcerisinde bulunan elementlere gore
        bir yuklenme suresine ihtiyac vardir
        veya bir web elementinin kullanılabilmesi icin zamana ihtiyac olabilir
        implicitlywait bize sayfanın yuklenmesi ve sayfadaki elementlere ulasım ıcın beklenecek maksımum sureyi belirleme olanagı saglar

        illaki 15 saniye bekleyecek diye birsey yok yuklenme tamamlanır tamamlanmaz kapanır zaten
         */


        driver.get("https://www.facebook.com");
        Thread.sleep(10000) ;
        driver.close() ;

    }
}
