package OOPS;

class Login
{
    String username;
   private String password;

    public void LoginValidation()
    {
        System.out.println("username is - " +username);
        System.out.println("password is - " +password);
    }

    public void setPassword(String passwd)
    {
        password=passwd;
    }

    public String getPassword()
    {
        return password;
    }

}

public class EncapsulationExample {
    public static void main(String[] args)
    {
        Login obj= new Login();
 //       obj.password="Manishkoul99@";
        obj.setPassword("Manishkoul99@");
        obj.username="manishkoul99@gmail.com";
        obj.LoginValidation();

        //Hacker
        System.out.println("****** From Hacker *****");
       System.out.println(obj.getPassword());
        System.out.println(obj.username);


    }
}
