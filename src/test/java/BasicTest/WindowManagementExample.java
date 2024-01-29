package BasicTest;

import org.openqa.selenium.By;

import java.util.ArrayList;

public class WindowManagementExample extends Base{

public void demo()
{
    /*
driver.getWindowHandle(); // Give current window id
    driver.getWindowHandles(); // Give all the window id's which is opened by the current driver object
    driver.switchTo().window("<window-id>");
    driver.close(); //close the tab
    driver.quit();//quit the browser*/
    System.out.println("current window(focus)= "+ driver.getWindowHandle() );
    System.out.println("Total window's open= "+ driver.getWindowHandles() );

    System.out.println("******-----Opening insta link**************");

    driver.findElement(By.partialLinkText("Instagram")).click();
    System.out.println("current window(focus)= "+ driver.getWindowHandle() );
    System.out.println("Total window's open= "+ driver.getWindowHandles() );
    System.out.println("Page title= "+ driver.getTitle() );
    System.out.println("\n******** Switching to new window/Instapage *********" );

    ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
    driver.switchTo().window(tabs.get(1));
    System.out.println("current window(focus)= " + driver.getWindowHandle() );
    System.out.println("Total window's open= "+ driver.getWindowHandles() );

    System.out.println("Page title= "+ driver.getTitle());
    System.out.println("\n******** Closing the Insta page *********" );
    driver.close();// will throw error there is no window , to overcome we have to switch back
    System.out.println("\n******** Switching controll back to facebook page *********" );
    driver.switchTo().window(tabs.get(0)); System.out.println("current window(focus)= " + driver.getWindowHandle() );
    System.out.println("Total window's open= "+ driver.getWindowHandles() );

    System.out.println("Page title= "+ driver.getTitle());
    System.out.println("Closing the browser" );
    driver.quit();
    System.out.println("Page title= "+ driver.getTitle());



}
    public static void main(String[] args)
    {
        WindowManagementExample obj=new WindowManagementExample();
        obj.SetupBrowser("Chrome", "https://www.facebook.com/");
        obj.demo();
    }
}
