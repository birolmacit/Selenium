package Selenium2022Summer.day04_xpath_cssLocater;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_CssSelector {
    public static void main(String[] args) {



/*Css selector xpath'e benzer. Üç ana tip kullanılır
1) css = tagName[attribute name= 'value’ ];
driver.findElement(By.cssSelector("input[name='session[password]']"));

2 ) css="tagName#idValue" veya sadece css="#idValue" =>yalnızca id value ile çalışır
driver.findElement(By.cssSelector("input#session_password"));

3 ) css="tagName.classValue" veya sadece css=".classValue"=>yalnızca class value ile çalışır
driver.findElement(By.cssSelector(".form-control"));
*/


        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe") ;
        WebDriver driver =new ChromeDriver() ;
        driver.manage().window().maximize() ;
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10) );



                /*Home Work: Log in Test Using Css
1 ) Bir class oluşturun : Locators_css
2 ) Main method oluşturun ve aşağıdaki görevi tamamlayın.
a. Verilen web sayfasına gidin. http://a.testaddressbook.com/sign_in
b. Locate email textbox
c. Locate password textbox ve
d. Locate signin button
e. Asagidaki kullanıcı adını ve şifreyi girin ve sign in düğmesini tıklayın
i. Username : testtechproed@gmail.com
ii. Password : Test1234!
NOT: cssSelector kullanarak elementleri locate ediniz.
*/

       // 1- web sayfasına git    http://a.testaddressbookcom/sign_in

        driver.get("http://a.testaddressbook.com/sign_in");


        // 2-locate email textbox , password textbox, signin button
        //user name : testtechproed@gmail.com
       // password: Test1234!
// css = tagName[attribute name= 'value’ ];

        driver.findElement(By.cssSelector("input[type='email']")).sendKeys("testtechproed@gmail.com");
        driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("Test1234!");
        driver.findElement(By.cssSelector("input[type='submit']")).click() ;





    }
}
