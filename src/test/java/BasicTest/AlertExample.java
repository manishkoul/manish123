package BasicTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AlertExample extends Base{

    public void alertDemo()
    {
        WebElement promptAlertBtn = driver.findElement(By.xpath("//button[contains(text(),'Prompt')]"));


        promptAlertBtn.click();
        //promptAlertBtn.click();

        //get the message
        String msg= driver.switchTo().alert().getText();
        System.out.println(msg);

        //Accept or ok or submit
     //  driver.switchTo().alert().accept();

       //dismiss or cancel or close or escape key

       // driver.switchTo().alert().dismiss();

        //type
        driver.switchTo().alert().sendKeys("1234"); // Not supported now by Chrome and Edge ,firefox was supporting not sure now


    }

    public static void main(String[] args)
    {
        AlertExample obj=new AlertExample();
        obj.SetupBrowser("Chrome", "https://the-internet.herokuapp.com/javascript_alerts");
        obj.alertDemo();

    }
}

