package day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicTekrar {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Husamettin\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.youtube.com");
        driver.get("https://www.amazon.com");
        driver.navigate().back();
        driver.manage().window().maximize();
        driver.navigate().forward();
        driver.navigate().refresh();
        Thread.sleep(5000);

        driver.close();

    }
}
