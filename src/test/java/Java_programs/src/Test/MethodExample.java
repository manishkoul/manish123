package Test;

public class MethodExample {

    public void m1()
    {
        int a=10;
        int b=20;
        int c= a+b;
        System.out.println("Addition of 2 number is " + c);
    }

    public void m2(int a, int b)
    {

        int c= a+b;
        System.out.println("Addition of 2 number is " + c);
    }
    public int m3(int a, int b)
    {

        int c= a+b;
        return c;
    }

    public static void main(String[] args)
    {
        MethodExample a1 = new MethodExample();

         //a1.m1();
         a1.m2(25,35);


       //int res= a1.m3(20,50);
       // System.out.println("From calling method " + res);
    }
}
