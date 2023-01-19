package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static Locators.Driver.driver;

public class WebElementlerim {

    static WebElement enter = driver.findElement(By.className("theme-IYtZzqYPto8PhOx3ku3c"));

    static WebElement UrunTikla = driver.findElement(By.xpath("/html/body/div[3]/main/div[2]/div/div[6]/div[2]/div[2]/div[4]/div/div/div/div/div/div/ul/li[2]/div/a/div/div/div/div/picture/img"));
}
