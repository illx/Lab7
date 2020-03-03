public class Node extends Person {
    protected Node next;

    public Node()
    {
        next = null;
    }

    public void set_next(Node to_connect)
    {
        next = to_connect;
    }

    public Node go_next()
    {
        return next;
    }
}

/*abstract class Generic_List extends Utils
{
    abstract public void Build_List();
    abstract public void Display();
    abstract public boolean Find(String match);
}

class Array_List extends Generic_List
{
    protected Person list[];
    protected int num_people;

    public Array_List()
    {
        System.out.print("Enter total number of persons in this array");
        list = new Person[input.nextInt()];

        for( int i = 0; i < list.length; ++i)
            list[i] = null;

        num_people = 0;
    }

    public void Build_List()
    {
        int i = 0;

        do
        {
            list[i] = new Person();
            list[i].input();

        } while(i < this.list.length && Again());
        num_people = i;

    }

    public void Display_List()
    {
        for (int i = 0; i < num_people; ++i)
        {
            list[i].display();
            System.out.println();
        }
    }

    public boolean Find(String match)
    {
        for (int i = 0; i < num_people; ++i)
        {
            if(list[i].Equals(match))
            {
                System.out.println("\nMatch to: ");
                list[i].display();
                return true;
            }
        }

        return false;
    }
}
 */

