package Locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;



public class Metodlarim extends Driver {

    static Constants constants = new Constants();

    public static void launchChromeBrowser() {

        ChromeOptions chromeOption = new ChromeOptions();
        chromeOption.addArguments("--start-maximized");

        driver = WebDriverManager.chromedriver().avoidShutdownHook().capabilities(chromeOption).create();
        driver.get(constants.URL);

    }


    public static void sendKeysToSearchEngine(){

        driver.findElement(By.className("theme-IYtZzqYPto8PhOx3ku3c")).sendKeys("gozluk");
    }


    public static void enter(){

        WebElement enter = driver.findElement(By.className("theme-IYtZzqYPto8PhOx3ku3c"));
        enter.sendKeys(Keys.ENTER);
    }

    public static void urunTikla(){

        WebElement urunTikla = driver.findElement(By.xpath("/html/body/div[3]/main/div[2]/div/div[6]/div[2]/div[2]/div[4]/div/div/div/div/div/div/ul/li[2]/div/a/div/div/div/div/picture/img"));
        urunTikla.click();
    }



}
