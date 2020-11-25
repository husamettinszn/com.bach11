package day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyVsTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Husamettin\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.google.com/");

        String actualResult = driver.getTitle();
        String expectedResult = "google";

        if (actualResult.equals(expectedResult)) {
            System.out.println("Page Title test PASS");
        }else{
            System.out.println("Page Title test FAILED");

            System.out.println("Actual Title :"+ actualResult);
        }
        driver.get("https://youtube.com/");

        String actualURL = driver.getCurrentUrl();
        String expectedURL = "https://youtube.com";

        if (actualURL.equals(expectedURL)) {
            System.out.println("URL testi PASS");
        }else{
            System.out.println("URL testi FAILED");
            System.out.println("Actuel URL : "+ actualURL);
        }
        driver.close();
    }
}
