package Selenium2022Summer.day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_Locators {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver  driver = new ChromeDriver();
        driver.manage().window().maximize();//brawser i tam sayfa yapar

        //amazona gidip nutella aratalım
        driver.get("https://www.amazon.com");

        //findElement(By ....Locator)--->istedigimiz web elementini bize dondurur
        //biz de o elementi kullanmak icin bir objeye assign ederiz

       WebElement aramaKutusu=driver.findElement(By.id("twotabsearchtextbox"));    //8 tane locators ısmınden herhangi biriyle cagırabılırsın ama
        //control f yaptıgımızda sadece bir match in oldugundan emin olmalıyız


      //WebElement aramaKutusu=driver.findElement(By.className("nav-search-field"));//istersek class name den de bulabiliriz AMA BU CODE CALIŞMADI
        //BU KOD CALISMADIGI ICIN BASKA LOCATORLAR LA BULABILIRIZ BAZEN GOZDEN KACAN SEYLER OLABİLİR.

        //herhangi bir webElementine istedigimiz yazıyı yollamak icin

        aramaKutusu.sendKeys("nutella"+ Keys.ENTER);





    }
}
