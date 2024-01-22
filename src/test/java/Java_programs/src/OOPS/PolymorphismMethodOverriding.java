package OOPS;

class Mother
{
    public void Bike()
    {
        System.out.println("Mother's bike - Activa");
    }
}
    class Daughter extends Mother
{

    public void Bike()
    {
    System.out.println("Mother's bike - Enfield");
    }
    }

public class PolymorphismMethodOverriding {
    public static void main(String[] args)
    {
        Daughter d1=new Daughter();
        d1.Bike();
    }
}
