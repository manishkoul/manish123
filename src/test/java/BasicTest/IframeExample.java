package BasicTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class IframeExample extends Base {

    public void demo()
    {
        //Index-Switching with Index
       // driver.switchTo().frame(1);

        //id or name
       // driver.switchTo().frame("iframeResult");

        //By Webelement
        WebElement Iframe= driver.findElement(By.id("iframeResult"));
        driver.switchTo().frame(Iframe);

        driver.findElement(By.xpath("//button[text()='Try it']")).click();

        //From anyPage to BasePage
        driver.switchTo().defaultContent();

        //Switch from child frame to 1 level up parent frame
        driver.switchTo().parentFrame();
    }

    public static void main(String[] args)
    {
        IframeExample obj=new IframeExample();
        obj.SetupBrowser("Chrome", "https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
        obj.demo();
    }
}
