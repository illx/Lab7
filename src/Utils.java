import java.util.Scanner;


public class Utils{
    protected Scanner input;

    public Utils()
    {
        input = new Scanner(System.in);
    }

    public boolean Again()
    {
        System.out.println("Would you like to enter another one? YES/NO");
        String response = new String();
        response = input.next();
        input.nextLine();

        if(response.toUpperCase().equals("YES"))
            return true;

        return false;
    }

}
