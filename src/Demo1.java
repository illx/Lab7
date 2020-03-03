import java.util.Scanner;
import java.io.*;



public class Demo1 {
    /*Send out a welcome message, getting started with Java!*/

    protected Scanner input=null;


    public Demo1() {

        input = new Scanner(System.in);
    }

    public static void main(String[] args){
        // Let's get started with Demo #1

        Demo1 test = new Demo1();
        System.out.println("Welcome to CS202's Java Workshop\n" + "Enjoy!");
        System.out.println("Enter an integer");
        int catcher = test.input.nextInt();
        System.out.println(catcher);

        /*
        // Worksheet #2
        int counter = 0;
        for(int i=1; i <= 100; ++i)
        {
            boolean outputted = false;
            if(i % 2 == 0)
            {
                System.out.print(i + "\t");
                ++counter;
                outputted = true;
            }

            else if( (i % 2 == 1) && !(i % 3 == 0) && !(i % 5 == 0))
            {
                System.out.print(i + "\t");
                ++counter;
                outputted = true;
            }

            if(counter % 10 == 0 && outputted)
                System.out.println();

        }

         */

    }


}
