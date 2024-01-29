package BasicTest;

public class NavigationExample extends Base{

    public void NavigationCommandsDemo() throws InterruptedException {

        driver.navigate().refresh();
        Thread.sleep(1000);
        driver.navigate().refresh();
//Navigate to
       /* System.out.println("Navigate to Youtube page");
        Thread.sleep(3000);
        driver.navigate().to("https://www.youtube.com/");

        //Navigate back
        System.out.println("Navigate back to google  page");
        Thread.sleep(3000);
        driver.navigate().back();

        //Forward
        System.out.println("Navigate again to Youtube page");
        Thread.sleep(3000);
        driver.navigate().forward();

        //refresh browser

        driver.navigate().refresh();

        //Driver Management Commands

        driver.manage().window().fullscreen();
        Thread.sleep(2000);
        driver.manage().window().minimize();
        Thread.sleep(2000);
        driver.manage().window().maximize();*/
    }

    public static void main(String[] args) throws InterruptedException {
        NavigationExample obj=new NavigationExample();
        obj.SetupBrowser("Chrome","https://www.google.com/");
        obj.NavigationCommandsDemo();
    }

}
