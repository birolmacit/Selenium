package Selenium2022Summer.day04_xpath_cssLocater;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_AmazonSearch {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe") ;
        WebDriver driver =new ChromeDriver() ;
        driver.manage().window().maximize() ;
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10) );

        //1- amazona gidin

        driver.get("https://www.amazon.com");


        //2-search box a "city bike" arattırın

        WebElement searchBox= driver.findElement(By.id("twotabsearchtextbox")) ;
        searchBox.sendKeys("city bike", Keys.ENTER );

        Thread.sleep(10000 );
        driver.close();







    }

}
