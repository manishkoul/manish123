package OOPS;

class GrandFather {
    public void car() {
        System.out.println("GrandFather's car");
    }
}
class Father extends GrandFather
{
    public void bike()
    {
        System.out.println("Father's Bike");
    }
}
class Son extends Father
{

}

public class InheritenceExample {
    public static void main(String[] args)
    {
Son s1= new Son();
s1.bike();
    }
}
