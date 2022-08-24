package Selenium2022Summer.day02_driverMethodlari;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_DriverMethodlari {
    //amazon siitesine gidip kaynak kodlarında "spend less " yazdıgını test edin
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe") ;
        WebDriver driver =new ChromeDriver() ;

        driver.manage() .window() .maximize() ;
        driver.get("https://www.amazon.com");
        String sayfaKaynakKodlari=driver.getPageSource();
        String aranankelime="spend less";

        if(sayfaKaynakKodlari .contains(aranankelime ) ){
            System.out.println("kaynak kodu testi PASSED");

        }
        else{
            System.out.println("kaynak kodlarinda "+aranankelime + "   yok.kaynak kodu testi FAILED");
        }
        driver.close() ;

    }
}
