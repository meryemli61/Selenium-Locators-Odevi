package Locators;

public class MyWebAppAutomationProgram extends Metodlarim{

    public static void main(String[] args) throws InterruptedException{

        launchChromeBrowser();

        Thread.sleep(3000);

        sendKeysToSearchEngine();

        enter();
        Thread.sleep(3000);

        urunTikla();
        Thread.sleep(2000);



    }
}
