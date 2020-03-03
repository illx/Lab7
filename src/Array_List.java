
class Array_List extends Generic_List
{
    protected Person[] list;
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
            list[i].user_input();

        } while(i < this.list.length && Again());
        num_people = i;

    }

    public void Display()
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
            if(list[i].name_equals(match))
            {
                System.out.println("\nMatch to: ");
                list[i].display();
                return true;
            }
        }

        return false;
    }
}