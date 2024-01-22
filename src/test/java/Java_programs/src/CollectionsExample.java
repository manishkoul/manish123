import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class CollectionsExample {

    public void arrayExample() {
        // String name="John";
        //System.out.println(name);

        String[] names = {"John", "Michelle", "Obama"};
       // System.out.println(names);// will get memory location of the string
        //for (int i = 0; i < 3; i++)
        // For each loop
        for(String str:names)
        {
            System.out.println(str);
        }
    }

    //Collections-SLL- HashSet- minimum memory consumption
    public void setExample()
    {
      /*  //SLL


        HashSet<String> names= new HashSet<>();
        names.add("john");
        names.add("john"); //uniqueness ia maintained and does not maintain insertion order
        names.add("micheele");
        names.add("Obama");
        names.add("Manish");
System.out.println(names); //Printing all the values in 1 short
        //Here we did not insertead using indexing only way to list there values is by using Iterator
        Iterator<String> itr= names.iterator(); // Iterator go to values one by one
        while (itr.hasNext())
        System.out.println(itr.next());

        //To main insertion Order we need to use DLL- However it won't maintain the uniqueness of values
        LinkedHashSet<String> names= new LinkedHashSet<>();
        names.add("john");
        names.add("john"); //maintain insertion order and uniqueness
        names.add("micheele");
        names.add("Obama");
        names.add("Manish");
        System.out.println(names);
        Iterator<String> itr= names.iterator();
        while (itr.hasNext())
            System.out.println(itr.next());*/

    }


public void ListExample() {
    //SLL
    /*ArrayList<String> names= new ArrayList<>();
    names.add("john");
    names.add("john"); // insertion order is maintained but not uniqueness
    names.add("micheele");
    names.add("Obama");
    names.add("Manish");


    for (String str:names)
    {
        System.out.println(str);
    }

    names.add(1,"Rahim");
    System.out.println(names);*/

    //DLL- It has additional features like add first, lst

    LinkedList<String> names = new LinkedList<>();

    names.add("john");
    names.add("john"); // insertion order is maintained but not uniqueness
    names.add("micheele");
    names.add("Obama");
    names.add("Manish");


    for (String str : names) {
        System.out.println(str);
    }

    names.add(1, "Rahim");
    System.out.println(names);

    names.addFirst("Somoya");
    names.addLast("HHH");// It has addtional features as compare to Array List
    //Will inset to ist and last without giving any insertion
    System.out.println(names);
}
//--------------------------********---------------------------------------------------------------------
    //HashMap Example (It has values in the form of key and value ) pair
    //SLL
public void MapExample()
    {
    /*HashMap<String,String> s1=new HashMap<>();//Uniqueness is maintained , but not Insertion Order
    s1.put("FN", "Manish");
    s1.put("LN", "Koul");
    s1.put("Mobile_Number" ,"8899340669");
    s1.put("Email_id", "manishkoul99@gmail.com");
        s1.put("Email_id", "manishkoul99@gmail.com");
    System.out.println(s1);
        System.out.println(s1.get("Mobile_Number"));*/

        //-------------------------------**************************-------------------------------

        //DLL
        LinkedHashMap<String,String> s1= new LinkedHashMap<>();// uniqueness and Insertion Order is maintained 
        s1.put("FN", "Manish");
        s1.put("LN", "Koul");
        s1.put("Mobile_Number" ,"8899340669");
        s1.put("Email_id", "manishkoul99@gmail.com");
        s1.put("Email_id", "manishkoul99@gmail.com");
        System.out.println(s1);
        System.out.println(s1.get("Mobile_Number"));

}


    public static void main(String[] args)
    {
        CollectionsExample c1=new CollectionsExample();

       //c1.arrayExample();
        //c1.setExample();
        //c1.ListExample();
        c1.MapExample();
    }
}
