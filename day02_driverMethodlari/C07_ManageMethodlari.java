package Selenium2022Summer.day02_driverMethodlari;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C07_ManageMethodlari {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        System.out.println("pencere olculeri:  " + driver.manage().window().getSize());
        System.out.println("pencere konumu:  " + driver.manage().window().getPosition());



        //pencerenin konumunu ve buyuklugunu degistirelim
        driver.manage() .window().setPosition(new Point(15,23));
        driver.manage() .window().setSize(new Dimension(500,300));

        //yeni pencere olculeri, ve konumu
        System.out.println("pencere olculeri:  " + driver.manage().window().getSize());
        System.out.println("pencere konumu:  " + driver.manage().window().getPosition());

    }

}
