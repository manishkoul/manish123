package OOPS;

abstract class car
{
    public abstract void carName();
    public abstract void manufacturer();
}
 abstract class Venue extends car
{

}
class Breeze extends car{

    @Override
    public void carName() {
        System.out.println("ABC");
    }

    @Override
    public void manufacturer() {
        System.out.println("ABCEEEED");

    }
}

public class AbstractionExample {
    public static void main(String[] args) {
        car c1 = new  Breeze();
        c1.carName();

    }
}
