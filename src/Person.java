import java.util.Scanner;

/*
public class Utils{
    protected Scanner input;

    public Utils()
    {
        input = new Scanner(System.in);
    }
}
*/
public class Person {
    protected String name;
    protected int age;
    protected float wage;
    protected int [] array;
    protected Scanner input;

    public Person(){
        name = null;
        age = 0;
        wage = 0;
        array = new int[1];
        input = new Scanner(System.in);
    }

    public Person(int arg){
        name = null;
        age = 0;
        wage = 0;
        array = new int[arg];
        input = new Scanner(System.in);
    }


   public void user_input()
   {

       System.out.println("Enter name of person");
       name = input.nextLine();
       System.out.println("Enter the age of " + name);
       age = input.nextInt();
       System.out.println("Enter the wage for " + name);
       wage = input.nextFloat();

       for (int i=0; i<array.length; ++i)
       {
           System.out.println("Enter grade #" + (i+1));
           array[i] = input.nextInt();
       }

       input.nextLine();
   }

   public void display()
   {
       System.out.println("Name:\t\t" + name);
       System.out.println("Age:\t\t" + age);
       System.out.println("Wage:\t\t" + wage);
       for(int i=0; i<array.length; ++i)
       {
           System.out.println("Grade #" + (i+1) + ":\t" + array[i]);
       }
   }


    public boolean name_equals()
    {

        Scanner megainput = new Scanner(System.in);
        System.out.println("Enter a string to compare to name");
        String to_compare = null;
        to_compare = megainput.nextLine();

        return name.equalsIgnoreCase(to_compare);
    }

    public boolean name_equals(String to_compare)
    {
        return name.equalsIgnoreCase(to_compare);
    }

    public boolean less_than(Person source)
    {
        if(this.name.compareTo(source.name) <= 0)
            return true;

        return false;
    }




   public static void main(String [] arg){

        Scanner test_input = new Scanner(System.in);

        int array_size;
        System.out.println("Enter size of array");
        array_size = test_input.nextInt();

        Person subject = new Person(array_size);

        subject.user_input();
        subject.display();

        /*
       String to_compare = null;
       System.out.println("Enter a string to compare to name");
        // try out test_input.nextLine(); to clear input buffer
       Scanner supertest_input = new Scanner(System.in);
       to_compare = supertest_input.nextLine();

        boolean catcher = subject.name_equals(to_compare);
        */
        /*
        boolean catcher = subject.name_equals();

        if(catcher)
            System.out.println("You're great!");
        else
            System.out.println("You suck!");
        */
   }
}
