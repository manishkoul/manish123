package BasicTest;

import org.openqa.selenium.By;

public class LocatorStrategyExample extends Base {

    public void locatorDemo()
    {
        /*<input type="text" class="inputtext _55r1 _6luy" name="email" id="email" data-testid="royal_email"
        placeholder="Email address or phone number" autofocus="1" aria-label="Email address
        or phone number" data-keeper-lock-id="k-hkdzmdgbms4">*/
        //Locator-1 id
//driver.findElement(By.id("email")).sendKeys("Manishkoul99@gmail.com");
        //Locator-2 ClassName
        //driver.findElement(By.className("inputtext _55r1 _6luy")).sendKeys("From Class Name");
        // Getting error Compound class names not permitted- To solve this pass anyone value it will work
       // driver.findElement(By.className("inputtext")).sendKeys("From Class Name-1");
       // driver.findElement(By.className("_55r1")).sendKeys("From Class Name-2");
        //driver.findElement(By.className("_6luy")).sendKeys("From Class Name-3");

        //Locator-3 Name
       driver.findElement(By.name("email")).sendKeys("By Name ");

        //Locator-4 tagName
       // driver.findElement(By.tagName("button")).click();

        //Locator-5 Linktext- tagename is a
        //driver.findElement(By.linkText("Forgotten password?")).click();

        //Locator-6 PartialLinktext

        //driver.findElement(By.partialLinkText(" rgotten")).click();

        //Locator-7 xpath

       //driver.findElement(By.xpath("//input[@id='email']")).sendKeys("From xpath");





        //Absolute Path

       // String path="/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[1]/input";
        //driver.findElement(By.xpath(path)).sendKeys("From abs path");

        //Relative Path
       // String path="//form/div[1]/div[1]/input";
        //driver.findElement(By.xpath(path)).sendKeys("From relative path");


        // //Locator-8 CSS
        // driver.findElement(By.cssSelector("#email")).sendKeys("From CSS Selector");

        //X-Path Functions
        //starts-with
        //$x("//input[starts-with(@id,'email')]")
        //$x("//input[starts-with(@id,'emai')]")
        //$x("//input[starts-with(@id,'ema')]")
        //$x("//input[starts-with(@id,'em')]")
        //$x("//input[starts-with(@id,'e')]")

        //Contains
        //$x("//input[starts-with(@id,'email')]")
        //$x("//input[starts-with(@id,'l')]")

        //text()
        //$x("//h2[text()='Facebook helps you connect and share with the people in your life.']")

        //text()-starts-with
        //$x("//h2[starts-with(text(),'Facebook helps you connect and share with the people in your life.')]")
        //$x("//h2[starts-with(text(),'Faceb')]")
//text()-contains
        //$x("//h2[contains(text(),'Facebook helps you connect and share with the people in your life.')]")

        //Advance xpath
        //And Operator
        //$x("//input[@id='email'and @name='email']")

        //Or Operator
        //$x("//button[text()='Log in' or text()='लॉग इन करें']")

        //Indexing
        //$x("//input")[2] non-index based identification
        //$x("//select[3]") -siblingbase

        //Chained
       // $x("//form/div/div/input")
        //$x("//form//input[@id='email']")

        //Axes

        //Child Relationship

        //$x("//span[@class='_5k_4']/child::span")
        //Parent relationship
        //$x("//select[@id='month']/parent::span")
        //Following-Sibling
        //$x("//select[@id='day']/following-sibling::*")
        //$x("//select[@id='day']/following-sibling::select[1]")- month
        //$x("//select[@id='day']/following-sibling::select[2]")-year

        //Following
        //$x("//input[@name='firstname']/following::select[@id='month']")

        //preceding-sibling
        //$x("//select[@id='year']/preceding-sibling::select[1]")- month
       // $x("//select[@id='year']/preceding-sibling::select[2]")-day

        //preceding
// $x("//select[@id='year']/preceding:select[2]")-day
      //  $x("//select[@id='year']/preceding::input[@name='firstname']")

        //descendant
        //$x("//form/descendant::select[@id='month']")
        //$x("//div/descendant::select[@id='month']")
        //$x("//body/descendant::select[@id='month']")

        //Ancestor
      //  $x("//select[@id='month']/ancestor::div[@id='reg_box']")
        //$x("//select[@id='month']/ancestor::form")
        //$x("//select[@id='month']/ancestor::body")

        //CSS ::>> id attribute
        // driver.findElement(By.cssSelector("#email")).sendKeys("From CSS Selector");
        //$$("#email")

        //CSS ::>>class attribute
        //$$(".inputtext._55r1._6luy")
        //$$("._55r1._6luy")
        //$$("._6luy")
        //$$(".inputtext._6luy")

        //CSS ::>>class attribute and  id attribute
        //$$("#email.inputtext._55r1._6luy")- any combination will work
        //$$("#email.inputtext")
        //$$("#email._55r1._6luy")
        //$$("._55r1._6luy#email")

        //ccs ==> html tagname

        //$$("button")

        //ccs ==> html attribute
        //$$("[id=''email']")

        //ccs ==> html tagname and html attribute
        //$$("tagname[id='value']")

        //css==>css(id and class attribute)+ html(tagname and attribute)
        //$$("input[id='email']#email.inputtext._55r1._6luy")- In any combination

        //Regular Expression

        //prefix or starts with '^'
        //$$("input[id^='e']")
        //$$("input[id^='em']")- Any combination

        //suffix or ends-with ==> $
        //$$("input[id^='l']")
        //$$("input[id^='email']")
        //$$("input[id^='el']")- Any combination end with l

        //contains or substring ==> '*'
        //$$("input[id*='email']")
        //$$("input[id*='l']")
        //$$("input[id*='e']")
        //$$("input[id*='il']") -Any combination will work







    }

    public static void main(String[] args)
    {
        LocatorStrategyExample obj=new LocatorStrategyExample();
        obj.SetupBrowser("Chrome","https://www.facebook.com/login/");
        obj.locatorDemo();

    }
}
