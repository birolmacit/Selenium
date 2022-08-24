package Selenium2022Summer.day04_xpath_cssLocater;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import java.time.Duration;

public class C05_RelativeXpath {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe") ;
        WebDriver driver =new ChromeDriver() ;
        driver.manage().window().maximize() ;
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10) );
        driver.get("https://www.diemol.com/selenium-4-demo/relative-locators-demo.html");

        //boston ı locate et

        WebElement boston= driver.findElement(By.xpath("//img[@id='pid6_thumb']"));

        // sailor u locate et
        WebElement sailor= driver.findElement(By.id("pid11_thumb"));

        //mountie yi bu ikisi ile birlikte cagıralım

        WebElement mountie=driver.findElement(RelativeLocator.with(By.tagName("img")).below(boston ).toLeftOf(sailor ) ) ;
        mountie.click() ;



    }
}
