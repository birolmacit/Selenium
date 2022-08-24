package Selenium2022Summer.day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_WebElementMetodlari {
    public static void main(String[] args) {
        /*

       1- amazon.coma gidip arama kutusunu locate edin
       2-arama kutusunun tag name inin input oldugunu test edin
       3-arama kutusunun name attribute unun degerinin field-keywords oldugunu test edin


         */

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe") ;
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();//brawser i tam sayfa yapar
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // 1- amazon.coma gidip arama kutusunu locate edin
        driver.get("https://www.amazon.com");
        WebElement searchbox=driver.findElement(By.id("twotabsearchtextbox")) ;

        // 2-arama kutusunun tag name inin input oldugunu test edin

        String expectedtagname="input";
        String actualtagname=searchbox.getTagName();
        if(expectedtagname.equals(actualtagname) ){
            System.out.println("tag name testi PASSED");
        }else{
            System.out.println("tag name testi FAILED");
        }

        String expectedname="field-keywords";
        String actualname=searchbox.getAttribute("name");
        if(expectedtagname.equals(actualtagname) ){
            System.out.println(" name attribute testi PASSED");
        }else{
            System.out.println(" name attribute testi FAILED");
        }

        //asagıdakiler oylesıne ornek olarak verılmıstır
        System.out.println(searchbox.getLocation());
        System.out.println(searchbox.getSize());

        driver.close() ;



        /*
        <input type="text" id="twotabsearchtextbox" value="" name="field-keywords"
        autocomplete="off" placeholder="" class="nav-input nav-progressive-attribute" dir="auto" tabindex="0"
         aria-label="Search">


                webElementİsmi.getTagName()---->daha once locate ettıgımız webelementının tagname ını dondurur
                 webElementİsmi.getAttribute(attributeİsmi)---->daha once locate ettıgımız webelementının istediğimiz
                 attribute unu dondurur.yani mesela name yazarsan name attributunun degerini dondurur.
                 class yazarsan class attribute unun degerini dondurur
         */
    }
}
