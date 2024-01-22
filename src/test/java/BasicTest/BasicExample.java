package BasicTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasicExample {
    WebDriver driver;
    public void setupBrowser(String browser, String url) {
        String currDir = System.getProperty("user.dir");
        //System.out.println(currDir); //C:\Selenium\Selenium_Testing
        String fs = System.getProperty("file.separator"); // output is \
        // System.out.println(fs);
        String driverpath = currDir + fs + "Drivers" + fs;
        //Open chrome Browser
        if (browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", driverpath + "chromedriver.exe");
             driver = new ChromeDriver();
            //Url


        }
        else if (browser.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", driverpath + "geckodriver.exe");
             driver = new FirefoxDriver();
            //Url
           // driver.get("https://www.selenium.dev/documentation/overview/components/");

        }
        else if (browser.equalsIgnoreCase("edge")) {
            System.setProperty("webdriver.edge.driver", driverpath + "msedgedriver.exe");
             driver = new EdgeDriver();
            //Url
            //driver.get("https://www.selenium.dev/documentation/overview/components/");

        }
        else
        {
            System.out.println("Valid browser not provided , hence quiting the automation run");
            System.exit(0);// otherwise for invalid /null brower name it will try to execute driver.get(url)
            //It will terminate program here itself by exit(0)
        }
        driver.get(url);

    }

    public static void main(String[] args)
    {
        BasicExample obj=new BasicExample();
        obj.setupBrowser("edge","");
    }
}
