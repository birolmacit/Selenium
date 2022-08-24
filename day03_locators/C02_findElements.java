package Selenium2022Summer.day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C02_findElements {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();//brawser i tam sayfa yapar
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));



        //amazon sayfasında kac tane link bulundugunu yazdıralım

        driver.get("https://www.amazon.com");

        List<WebElement > LinkListesi=driver.findElements(By.tagName("a"));
        //System.out.println(LinkListesi);
        System.out.println(LinkListesi.size());
    }
}
