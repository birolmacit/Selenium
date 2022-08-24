package Selenium2022Summer.day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_DriverMethodlari {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver  driver = new ChromeDriver();
        driver.manage().window().maximize();//brawser i tam sayfa yapar


        driver.get("https://www.amazon.com");
        System.out.println("actual title: "+ driver.getTitle());
        System.out.println("actual url: "+driver.getCurrentUrl());

        Thread.sleep(3000);
        driver.close() ;



    }
}
