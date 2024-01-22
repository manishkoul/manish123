package Test;

public class AritmeticOperations {

    public void m1()
    {
        int a=10;
        int b=5;

        //boolean result = ! ( a>0 && a>=10);
      //  System.out.println("answer  =" + result);
        int d=10;
        //d=d+1;
        //d++;
       // d= d-1;
        //d--;
        //d=d+5;
       // d =+5;
        System.out.println("answer  =" + d);
        System.out.println("answer  =" + (++d));
        System.out.println("answer  =" + d);
    }

    public void miscExample()
    {
        int a=11;
        /*
        int b;

        if (a>10)
            b=2;
        else b=3; */

        int b= (a>10) ? 3:2;

        System.out.println("value is " + b);
    }

    public static void main(String[] args)
    {
        AritmeticOperations a1= new AritmeticOperations();
a1.miscExample();
    }

}
