package day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TekrarTekrarT {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Husamettin\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        //1. Yeni bir class olusturun (TekrarTesti)
        //2. Youtube web sayfasına gidin ve sayfa başlığının “youtube” olup olmadığını
        driver.get("https://www.youtube.com/");

        String actualTitel = driver.getTitle();
        String expectedTitel = "youtube";

        if (actualTitel.equals(expectedTitel)) {
            System.out.println("Page Title test PASS");
        }else{
            System.out.println("Page Title test FAILED");
            System.out.println("Page Title :"+ actualTitel);
        }
        //   doğrulayın (verify), eğer değilse doğru başlığı(Actual Title) konsolda yazdirin.
        //3. Sayfa URL'sinin “youtube” içerip içermediğini (contains) doğrulayın, içermiyorsa
        //   doğru URL'yi yazdırın.
        String actualURL = driver.getCurrentUrl();
        String expectedURL = "youtube";

        if (actualURL.contains(expectedURL)) {
            System.out.println("URL testi PASS");

        }else{
            System.out.println("URL testi FAILED");
            System.out.println("URL " + expectedURL + " icermiyor");
        }
        //4. Daha sonra Amazon sayfasina gidin https://www.amazon.com/
        driver.get("https://www.amazon.com/");
        //5. Youtube sayfasina geri donun
        driver.navigate().back();
        //6. RefrSayfayi yenileyin
        driver.navigate().refresh();
        //7. Amazon sayfasina donun
        driver.navigate().forward();
        //8. Sayfayi tamsayfa yapin
        driver.manage().window().maximize();
        //9. Ardından sayfa başlığının "Amazon" içerip içermediğini (contains) doğrulayın, Yoksa
        String actuelTitle2 = driver.getTitle();
        String expectedTitel2 = "Amazon";

        //   doğru başlığı(Actual Title) yazdırın.
        if (actuelTitle2.contains(expectedTitel2)) {
            System.out.println("Title test PASS");
            System.out.println("Title "+ expectedTitel2 + " iceriyor");
        }else{
            System.out.println("Title test FAILED");
            System.out.println("Title " + expectedTitel2 + " icermiyor");
        }
        //10.Sayfa URL'sinin https://www.amazon.com/ olup olmadığını doğrulayın, degilse doğru URL'yi yazdırın
        String actuelURL2 = driver.getCurrentUrl();
        String expectedURL2 = "https://www.amazon.com/";

        if (actuelURL2.equals(expectedURL2)) {
            System.out.println("URL test PASS");
        }else{
            System.out.println("URL testi FAILED");
            System.out.println("Actual URL :" + expectedURL2);
        }
        //11.Sayfayi kapatin
        driver.close();
    }
}
