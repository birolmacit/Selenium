package Selenium2022Summer.day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C05_GetWindowHandle {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe") ;
        WebDriver driver = new ChromeDriver() ;
        driver.manage() .window() .maximize() ;

        System.out.println(driver.getWindowHandle());
       // CDwindow-61D97E180E9B90ADF3ECD2AAF3F9817A    burdaki pencrenin hashcode udur.bu code benzersizdir.
    }
}
