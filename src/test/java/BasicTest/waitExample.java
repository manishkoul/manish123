package BasicTest;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class waitExample extends Base {

    public void test()
    {
System.out.println(driver.getTitle());
    }

    public void scriptErrorDemo()
    {

        JavascriptExecutor js= (JavascriptExecutor) driver;
        js.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 15000);");
    }


public void explicitWaitExample() // Has default 500 milliseconds interval - Will try to find element for 10 seconds with interval of 500 milliseconds
{
    //WebElement email= driver.findElement(By.id("email"));
    WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
  //  WebElement email=wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("email"))));
    //email.sendKeys("Mkoul@gmail.com");

    WebElement hiddenElem= wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.name("jazoest"))));
    hiddenElem.sendKeys("Mkoul@gmail.com");


}

    public void fluentWaitExample()  // We can manage interval by giving it specifically which explict wait is taking 500 milliseconds on its own
    {
        //WebElement email= driver.findElement(By.id("email"));
        Wait<WebDriver> wait= new FluentWait<WebDriver>(driver)
            .withTimeout(Duration.ofSeconds(10))
            .pollingEvery(Duration.ofSeconds(2))
            .ignoring(NoSuchElementException.class);
        // WebElement email=wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("email"))));
        //email.sendKeys("Mkoul@gmail.com");

       WebElement hiddenElem= wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.name("jazoest"))));
        hiddenElem.sendKeys("Mkoul@gmail.com");


    }
    public static void main(String[] args)
    {
        waitExample obj= new waitExample();
        obj.SetupBrowser("Chrome","https://www.facebook.com/" );
       // obj.test();
      //  obj.scriptErrorDemo();
       // obj.explicitWaitExample();

        obj.fluentWaitExample();

    }
}
