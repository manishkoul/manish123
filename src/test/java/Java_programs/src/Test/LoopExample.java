package Test;

public class LoopExample
{

   /* public void WhileExample()
    {
        int i=15;
        while (i<=10) {
            System.out.println("Value of i is " + i);
            i++;
        }
    }

    public void DoWhileExample()
    {
        int i=15;
        do {
            System.out.println("Value of i is " + i);
            i++;
        }while (i<=10);
    }
   public void ForLoopExample()
   {
    for (int i=1; i<=10;i++)
       {

           System.out.println("Value of i is " + i);
       }
    }*/

    public void MultiplcationExample(int num, int limit)
    {
        for(int i=0;i<=limit;i++)
        {

            System.out.println(num+ "*" + i+ "=" +(num*i));
        }
    }

    public static void main (String[] args)
    {
        LoopExample l1 = new LoopExample();
       // l1.WhileExample();
        // l1.DoWhileExample();
        //l1.ForLoopExample();
        l1.MultiplcationExample(2,10);
        //System.out.println("Done");
    }
}
