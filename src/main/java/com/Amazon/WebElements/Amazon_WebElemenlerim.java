package com.Amazon.WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.Amazon.Driver.getDriver;

public class Amazon_WebElemenlerim {

    static public WebElement stayInTheKnowPopUpClose_button;
    static public WebElement searchBar_textBox;

    static public WebElement chooseFirstPicture;
    static public WebElement addToCart_button;
    static public WebElement login_emailTextbox;
    static public WebElement login_passwordTextbox;
    static public WebElement viewCartButton;
    static public WebElement proceedToCheckOutButton;


    public static WebElement getWebElement(String webElement) throws MyWebElementNameIsWrongException {

        WebElement element=null;

        switch (webElement) {
            case "stayInTheKnowPopUpClose_button":
                element=getDriver().findElement(By.xpath("//input[@data-action-params='{\"toasterType\":\"AIS_INGRESS\"}']"));
                //2.locator
                // 3.locator
                // 4.locator
                // 5.locator
                break;
            case "searchBar_textBox":
                element=getDriver().findElement(By.xpath("//input[@id='twotabsearchtextbox']"));break;
            case "chooseFirstPicture":
                element=getDriver().findElement(By.xpath("(//span[@class='a-size-base-plus a-color-base a-text-normal'])[1]"));break;
            case "addToCart_button":
                element=getDriver().findElement(By.xpath("//input[@id='add-to-cart-button']"));break;
            case "viewCartButton":
                element= getDriver().findElement(By.className("nav-cart-count nav-cart-1 nav-progressive-attribute nav-progressive-content"));break;
            case "proceedToCheckOutButton":
                element= getDriver().findElement(By.name("proceedToRetailCheckout"));break;
            //element= getDriver().findElement(By.xpath("//*[@id=\"cart-proceedToCheckOut-button\"]"));break;
            case "login_emailTextbox":
                element=getDriver().findElement(By.xpath("//input[@id='ap_email']"));break;
            //element=getDriver().findElement(By.id("browseCart-signInPopup-emailTextbox"));break;
            case "continueButton":
                element=getDriver().findElement(By.className("a-button-input"));break;
            case "login_passwordTextbox":
                element=getDriver().findElement(By.xpath("//input[@id='ap_password']"));break;
            //element= getDriver().findElement(By.id("browseCart-signInPopup-passwordTextbox"));break;
            case "signInButton":
                element= getDriver().findElement(By.id("signInSubmit"));break;
            //element= getDriver().findElement(By.className("js-clickSignIn-button"));break;
            default:
                throw new MyWebElementNameIsWrongException("Given String parameter is wrong");
        }

        return element;
    }


}
