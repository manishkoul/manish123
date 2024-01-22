package Test;

public class DecesionMakingExample {

    public void ifExample(int x)
    {
        System.out.println("Number is " +x);
        if (x%2==0)
            System.out.println("Number is even number");


    }
    public void ifElseExample(int x)
    {
        System.out.println("Number is " +x);
        if (x%2==0)
            System.out.println("Number is even number");
        else
            System.out.println("Number is odd number");
    }
    public void ElseIfExample(int x)
    {
        System.out.println("Number is " +x);
        if (x==0)
            System.out.println("x is neither even or odd number");
        else if (x%2==0)
            System.out.println("Number is even number");
        else
            System.out.println("Number is odd number");
    }

    public void NestedIFExample(int x)
    {
        System.out.println("Number is " +x);
        if (x<0)
            System.out.println("x is negative number");
        else {
            if (x == 0)
                System.out.println("x is neither even or odd number");
            else if (x % 2 == 0)
                System.out.println("Number is even number");
            else
                System.out.println("Number is odd number");
        }
    }
    public void SwitchCaseExample(String day)
    {
        switch (day)
        {
            case "Monday":
                System.out.println("Today is Monday");
                break;
            case "Tuesday":
                System.out.println("Today is Tuesday");
                break;
            case "Wednesday":
                System.out.println("Today is Wednesday");
                break;

            case "Thursday":
                System.out.println("Today is Thursday");
                break;
            case "Friday":
                System.out.println("Today is Friday");
                break;

            case "Saturday":
                System.out.println("Today is Saturday");
                break;
            case "Sunday":
                System.out.println("Today is Sunday");
                break;

            default:
                System.out.println("Please provide the valid day");
                break;

        }

    }

    public static void main(String[] args)
    {
        DecesionMakingExample a1=new DecesionMakingExample();
       // a1.ifExample(11);
        //a1.ifElseExample(11);
       // a1.ElseIfExample(-8);
       // a1.NestedIFExample(9);
        a1.SwitchCaseExample("Monday");
    }
}
