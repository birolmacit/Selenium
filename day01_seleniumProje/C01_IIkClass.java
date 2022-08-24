package Selenium2022Summer.day01_seleniumProje;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_IIkClass {
    public static void main(String[] args) throws InterruptedException {
        /*   en ilkel haliyle bir otomasyon yapmak icin
        class ımıza otomasyon ıcın gereklı olan web driver ın yerini gostermemiz gerekir
        bunun ıcın java kutuphanesinden System.setProperty() metodunu kullanırız
        metodumuz 2 parite istemektedir
        ilki kullanıcagımız driver : webdriver.chrome.driver
        ikincisi ise bu driverin fizik, yolu: src/resources/drivers/chromedriver.exe
         */
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver  driver = new ChromeDriver();

        driver.get("https://www.amazon.com");
        Thread.sleep(3000);  //arada beklemesi icin yazılan kod keyfe gore tabi
        driver.get("https://www.facebook.com");
        Thread.sleep(3000);


        driver.get("https://www.spotify.com");

        driver.close() ;
    }
}
