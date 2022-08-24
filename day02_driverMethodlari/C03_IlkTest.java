package Selenium2022Summer.day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_IlkTest {
    public static void main(String[] args) {
        /*
        1.https://www.amazon.com url sine gidin
        2.baslıgın Amazon  (BUYUK HARFLE) kelimesi icerdiğini test edin
        3.url nin  https://www.amazon.com   a esit oldugunu test edin
        4.sayfayı kapatın
         */

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe") ;

        WebDriver driver = new ChromeDriver() ;
        driver.manage() .window() .maximize() ;

       // 1.https://www.amazon.com url sine gidin
        driver.get("https://www.amazon.com");

        //2.baslıgın Amazon  (BUYUK HARFLE) kelimesi icerdiğini test edin
        String actualTitle=driver.getTitle();
        String arananKelime="Amazon";
        if (actualTitle.contains(arananKelime ) ){
            System.out.println("title testi PASSED");
        }
        else{
            System.out.println("title"+arananKelime+"'yi icermiyor dolayisiyla title testi FAILED");
        }



        //3.url nin  https://www.amazon.com   a esit oldugunu test edin
        String expectedUrl="https://www.amazon.com";
        String actualUrl=driver.getCurrentUrl();

               if(actualUrl.equals(expectedUrl) ){
                   System.out.println("url testi PASSED");
               }
               else{
                   System.out.println("actual url:   "+actualUrl +"  url BEKLENEN URL DEN FARKLİ URL testi FAİLED");
               }

driver.close() ;
    }
}
