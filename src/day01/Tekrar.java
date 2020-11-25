package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tekrar {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Husamettin\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com/");
        driver.navigate().to("https://www.youtube.com/");
        driver.navigate().back();
        driver.navigate().refresh();
        driver.navigate().forward();
        driver.manage().window().maximize();
        driver.manage().window().fullscreen();
        driver.quit();

        driver.close();
    }
}
