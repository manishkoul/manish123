package Test;

public class Student {

    String name;
    public void Welcomemessage()
    {
       System.out.println("heelo " + name + " welcome to our collage");
    }

    public static void main(String [] args )
    {
Student s1= new Student();
s1.name= "Ramesh";
s1.Welcomemessage();

        Student s2= new Student();
        s2.name= "Merry";
        s2.Welcomemessage();

    }
}
