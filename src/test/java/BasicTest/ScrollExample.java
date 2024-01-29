package BasicTest;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.idealized.Javascript;

import java.awt.Window;

public class ScrollExample extends Base {

    public void youtubeExample()
    {
       SetupBrowser("Chrome", "https://www.youtube.com/");
        JavascriptExecutor js= (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,2000)");
    }
    public void githubExample()
    {
        SetupBrowser("Chrome", "https://github.com/");
        JavascriptExecutor js= (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");// Scroll goes directly bottom of page
    }

    public void amazonExample()
    {
        String url= "https://www.amazon.in/POCO-Power-Black-128GB-Storage/dp/B0CKJ3XLLM/ref=sr_1_1_sspa?crid=1N9RRYBUG4E93&keywords=mobile&qid=1706553202&sprefix=mobil%2Caps%2C681&sr=8-1-spons&sp_csd=d2lkZ2V0TmFtZT1zcF9hdGY&th=1";
        SetupBrowser("Chrome", url);
        WebElement techdetails= driver.findElement(By.xpath("//h1[text()='Technical Details']"));
        JavascriptExecutor js= (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();" , techdetails);
    }
    public static void main(String[] args) {

        ScrollExample obj=new ScrollExample();
        //obj.youtubeExample();
       // obj.githubExample();
        obj.amazonExample();

    }

}
