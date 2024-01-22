package java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BasicExample1 extends Base {


    public static void main(String[] args)
    {
         BasicExample1 obj= new BasicExample1();
         obj.SetupBrowser("edge", "https://www.facebook.com/");
    }
}
