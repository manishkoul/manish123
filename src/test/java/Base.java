package java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Base {

    WebDriver driver;
    public void SetupBrowser(String browser, String url)
    {
        //Browser management code
        if(browser.equalsIgnoreCase("chrome"))
        {
            driver=new ChromeDriver();

        } else if (browser.equalsIgnoreCase("Edge")) {
            driver=new EdgeDriver();
        }
        else
        {
            System.out.println("Valid browser not provided , hence quiting the automation run");
            System.exit(0);
        }

        //url management code
        if (url != "")
        {
            driver.get(url);
        }

        else
        {
            driver.get("About: Blank");
        }

    }
}
