package day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTitleAndUrl {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\Husamettin\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();


        String actualleResult = driver.getTitle();
        String expectedResult = "google";

        if (actualleResult.equals(expectedResult)) {
            System.out.println("Page Title testi PASS");
        }else{
            System.out.println("Page Title testi FAILED");
            System.out.println("Actual Page Title : " + actualleResult);
        }
        driver.navigate().to("https://www.youtube.com/");
        driver.manage().window().maximize();

        String actualleURL = driver.getCurrentUrl();
        String expectedURL = "http://www.youtube.com/";

        if (actualleURL.equals(expectedURL)) {
            System.out.println("Url testi PASS");
        }else {
            System.out.println("Page Url testi FAILED");
            System.out.println("Actual Page Url :" + actualleURL);
        }

        driver.close();


    }
}
