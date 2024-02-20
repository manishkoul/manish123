package BasicTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropDownDemo extends Base{

    public void selectDropDownExample()
    {
        Select month= new Select(driver.findElement(By.id("month")));
        //By Index
        //month.selectByIndex(2);

        //By Value

        //month.selectByValue("3");

       // month.selectByVisibleText("Oct");

        // To check if drop-down is multi-select
        System.out.println("Is month drop down a multi select "  + month.isMultiple() );

        //If we need to select multiple values in drop-down
        //month.selectByVisibleText("Oct");
        //month.selectByVisibleText("Nov");

      // WebElement FirstSelectedOption=  month.getFirstSelectedOption();
       // System.out.println(FirstSelectedOption.getText());

        //all selected option
       List<WebElement> AllSelectedOptions=  month.getAllSelectedOptions();
        for (WebElement elem:AllSelectedOptions
             ) {
            System.out.println(elem.getText());
        }
    }

    public static void main(String[] args)
    {
        DropDownDemo obj= new DropDownDemo();
        obj.SetupBrowser("Chrome", "https://www.facebook.com/reg/");
        obj.selectDropDownExample();

    }
}
