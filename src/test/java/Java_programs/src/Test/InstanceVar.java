package Test;

public class InstanceVar {
    String name;
    public void m1()
    {
        System.out.println("Welcome to  " + name);
    }
    public static void main(String[] args)
    {

        InstanceVar obj1=new InstanceVar();
        obj1.name = "abc";
        obj1.m1();
        InstanceVar obj2=new InstanceVar();
        obj2.name = "abcd";
        obj2.m1();
        obj1.m1();
    }
}
