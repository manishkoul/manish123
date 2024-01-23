package BasicTest;

public class BrowserCommandExample extends Base{

public void browserCommandDemo() throws InterruptedException {
//get
    //driver.get("https://www.youtube.com/");

    //GetTitle
    //System.out.println(driver.getTitle());

    //Geturl
System.out.println(driver.getCurrentUrl());



    Thread.sleep(5000);
//Close the tab
  //  driver.close();

    //close the browser itself

    driver.quit();



}
    public static void main(String[] args) throws InterruptedException {
         BrowserCommandExample obj=new BrowserCommandExample();
         obj.SetupBrowser("chrome", "https://fb.com/");
         obj.browserCommandDemo();
    }
}
