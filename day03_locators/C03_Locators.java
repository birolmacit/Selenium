package Selenium2022Summer.day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C03_Locators {
     /*Main method oluşturun ve aşağıdaki görevi tamamlayın.
         a. http://a.testaddressbook.com adresine gidiniz.
         b. Sign in butonuna basin
         c. email textbox,password textbox, and signin button elementlerini locate ediniz..
         d. Kullanıcı adını ve şifreyi aşağıya girin ve oturum aç (sign in)buttonunu tıklayın:
                 i. Username : testtechproed@gmail.com
                 ii. Password : Test1234!
         e. Expected user id nin testtechproed@gmail.com oldugunu dogrulayin(verify).
         f. “Addresses” ve “Sign Out” textlerinin görüntülendiğini( displayed) doğrulayin(verify).

         Sayfada kac tane link oldugunu bulun.

        */


    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();//brawser i tam sayfa yapar
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

       // a. http://a.testaddressbook.com adresine gidiniz.
        driver.get("http://a.testaddressbook.com");

        WebElement signinLinki=driver.findElement(new By.ByLinkText("Sign in"));

        //b. Sign in butonuna basin
                signinLinki.click();
// c. email textbox,password textbox, and signin button elementlerini locate ediniz..
       WebElement emailtextbox=driver.findElement(By.id("session_email")) ;
       WebElement passwordtextbox=driver.findElement(By.id("session_password")) ;
       WebElement signinButonu=driver.findElement(By.name("commit")) ;


      //d. Kullanıcı adını ve şifreyi aşağıya girin ve oturum aç (sign in)buttonunu tıklayın:
        //                 i. Username : testtechproed@gmail.com
        //                 ii. Password : Test1234!

        emailtextbox.sendKeys("testtechproed@gmail.com");
        passwordtextbox.sendKeys("Test1234!");
        signinButonu.click() ;


    //e. Expected user id nin testtechproed@gmail.com oldugunu dogrulayin(verify).
        WebElement actualKullaniciAdiELEMENTI=driver.findElement(By.className("navbar-text")) ;
        System.out.println(actualKullaniciAdiELEMENTI.getText());////////   BİR ELEMENTİN UZERİNDE NE YAZDIGINI ALMAK İSTİYORSAK
        ///////////////////    webELEMNTİSMİ.getText()   metodunu kullanabiliriz


        String expectedUserMail="testtechproed@gmail.com";
        if (expectedUserMail.equals(actualKullaniciAdiELEMENTI.getText())){
            System.out.println("expected kullanici testi PASSED");
        }else{ System.out.println("expected kullanici testi FAİLED");}

// System.out.println("expected kullanıcı testi PASSED");

        // f. “Addresses” ve “Sign Out” textlerinin görüntülendiğini( displayed) doğrulayin(verify).

        WebElement addressesLinki = driver.findElement(By.linkText("Addresses"));
        WebElement signoutLinki = driver.findElement(By.linkText("Sign out"));

        if (addressesLinki.isDisplayed()) {////////////////web elementinin gorulur olup olmadıgını test etmek ıcın .isDisplayed komutu kullanılır
            System.out.println("adresses linki testi PASSED");}else{
            System.out.println("addresses linki testi FAILED");
        }
        if (signoutLinki.isDisplayed()) {
            System.out.println("signout linki testi PASSED");}else{
            System.out.println("signout linki testi FAILED");
        }



       // Sayfada kac tane link oldugunu bulun.

        List<WebElement> linklerListesi=driver.findElements(By.tagName("a")) ;
        System.out.println(linklerListesi.size());


        // Lınkleri yazdıralım

        // listemiz webelementlerden olustukları ıcın direk yazdırırsak referansları yazdırır
        //onun yerine for each loop yapıp her bir link webelementinin uzerındekı yazıyı yazdırmalıyız
        for (WebElement linkler : linklerListesi) {
            System.out.println(linkler.getText() );
        }
        driver.close();
        }




    }

