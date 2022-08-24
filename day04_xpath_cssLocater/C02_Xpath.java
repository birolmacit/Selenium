package Selenium2022Summer.day04_xpath_cssLocater;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_Xpath {
    public static void main(String[] args) throws InterruptedException {
        /*<img class="s-image" src="https://m.media-amazon.com/images/I/71E3uz+g+eL._AC_UY218_.jpg"
        srcset="https://m.media-amazon.com/images/I/71E3uz+g+eL._AC_UY218_.jpg 1x,
        https://m.media-amazon.com/images/I/71E3uz+g+eL._AC_UY327_FMwebp_QL65_.jpg 1.5x,
        https://m.media-amazon.com/images/I/71E3uz+g+eL._AC_UY436_FMwebp_QL65_.jpg 2x,
        https://m.media-amazon.com/images/I/71E3uz+g+eL._AC_UY545_FMwebp_QL65_.jpg 2.5x,
        https://m.media-amazon.com/images/I/71E3uz+g+eL._AC_UY654_FMwebp_QL65_.jpg 3x"
        alt="Sponsored Ad - Costic Kids Bike for 3-8 Year Old Boys Girls BMX Freestyle Kid's Bicycle 12 14 16 Inch with Removable Train..." data-image-index="1"
        data-image-load="" data-image-latency="s-product-image" data-image-source-density="1">
         */


       //----> //tagName[@attributeIsmi=‘attributeValue']
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe") ;
        WebDriver driver =new ChromeDriver() ;
        driver.manage().window().maximize() ;
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10) );
        driver.get("https://www.amazon.com");

        driver.findElement(By.xpath("//img[@alt='Headsets']")).click() ;
        driver.findElement(By.xpath("(//span[@class='a-size-base a-color-base'])[1]")).click() ;


        Thread.sleep(5000);



    }
}
