package Test;

public class Dog {

    /*
    Constructor is special method
    You may choose to define it or not to define it
    Does not have return type
    Method name is same as class name
    This is the first method which gets called & executed when an object is getting created
    It is primarily used to perform set up related activities
    Constructor can be also parametrized
    Constructor can be overloaded
     */
    Dog ()
    {
        System.out.println("ABD " );
    }
    Dog (String name)
    {
        System.out.println("ABD " + name);
    }

    public static void main(String[] args)
    {
        Dog obj= new Dog("pinky");
    }
}
