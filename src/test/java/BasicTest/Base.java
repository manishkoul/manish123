package BasicTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

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

        //Implicit wait
      //  driver.manage().timeouts().implicitlyWait(Duration.ofNanos(1));

        //Page load timeout

      //driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));

        //Scriptload Timeout
        driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(10));

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
