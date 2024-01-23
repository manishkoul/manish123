package BasicTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebElementExample extends Base {

public void fetchDemo()
{
    //WebElement email= driver.findElement(By.id("email"));

//Get Attribute
   // System.out.println(email.getAttribute("class"));


    //WebElement instalink=driver.findElement(By.partialLinkText("Instagram"));
    //Get tool tip
    //System.out.println("Tool tip name is " + instalink.getAttribute("title"));

   // WebElement Loginbutton =driver.findElement(By.tagName("Button"));
   // WebElement WelcomeMessage =driver.findElement(By.xpath("//h2[@class='_8eso']"));
    //Get text
    //System.out.println("Text for Login button  is " + Loginbutton.getText());
    //System.out.println("FB Welcomemessage  is " + WelcomeMessage.getText());

    //Get tagname
    //WebElement email= driver.findElement(By.id("email"));
    //System.out.println("Tag name for email textbox is " + email.getTagName());

    //Get location of button or anything on screen like message/text
    WebElement Loginbutton =driver.findElement(By.tagName("Button"));
     WebElement WelcomeMessage =driver.findElement(By.xpath("//h2[@class='_8eso']"));
    System.out.println("Location of login button is " +Loginbutton.getLocation() );
    System.out.println("Location of login button is " +Loginbutton.getLocation().x );
    System.out.println("Location of login button is " +Loginbutton.getLocation().y );
    System.out.println("Location of WelcomeMessage is " +WelcomeMessage.getLocation() );

    //Get Size
    System.out.println("Dimension of login button is " +Loginbutton.getSize() );
    System.out.println("Dimension of login button is " +Loginbutton.getSize().height );
    System.out.println("Dimension of login button is " +Loginbutton.getSize().width );

    //Get CSS Value
    System.out.println(" login button fontize  is " +Loginbutton.getCssValue("font-size") );
    System.out.println(" login button border-radius  is " +Loginbutton.getCssValue("border-radius") );


}

public void performActions()
{
    WebElement email= driver.findElement(By.id("email"));
    WebElement instalink=driver.findElement(By.partialLinkText("Instagram"));
    WebElement Loginbutton =driver.findElement(By.tagName("Button"));

    //Click
    Loginbutton.click();
    instalink.click();

    //Sendkeys- to type something
    email.sendKeys("ABC");
    email.sendKeys("8889999");

    // claer
    email.clear();
    email.sendKeys("AAA");

    //submit
    WebElement Loginform= driver.findElement(By.xpath("//form[@class='_9vtf']"));
    Loginform.submit();
    Loginbutton.submit();


}
public void elementStateExample()
{
   //Is Visible and Enabled
    WebElement email= driver.findElement(By.id("email"));
    WebElement hiddenelemet= driver.findElement(By.name("jazoest"));

   // System.out.println("Is emailaddress visible " + email.isDisplayed());
    //System.out.println("Is hiddenelemet visible " + hiddenelemet.isDisplayed());

    //Is Enabled
    //System.out.println("Is emailaddress visible " + email.isEnabled());

    //Is Selected
    driver.findElement(By.partialLinkText("Sign Up")).click();
    WebElement MaleradioButton= driver.findElement(By.name("sex"));
    System.out.println("Is male radio button selected  " + MaleradioButton.isSelected());
    MaleradioButton.click();

    System.out.println("After clicking Is male radio button selected  " + MaleradioButton.isSelected());

}
    public static void main(String[] args)
    {
        WebElementExample obj=new WebElementExample();
        obj.SetupBrowser("Chrome", "https://www.facebook.com/");
       // obj.fetchDemo();
       // obj.performActions();
        obj.elementStateExample();

    }
}
