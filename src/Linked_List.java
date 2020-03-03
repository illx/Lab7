public class Linked_List extends Generic_List{

    protected Node head;

    Linked_List(){
        head = null;
    }

    public void Build_List(){
        do{
            Node temp = new Node();
            temp.user_input();

            if(head == null)
            {
                head = temp;
            }

            else if(!(head.less_than(temp)))
            {
                temp.set_next(head);
                head = temp;
            }

            else
            {
                Node previous = head;
                Node current = head.go_next();

                while(current != null && current.less_than(temp))
                {
                    previous = current;
                    current = current.go_next();

                }
                previous.set_next(temp);
                temp.set_next(current);


            }
        }while(Again());
    }

    public void Display(){
        Node current = head;
        while( current != null)
        {
            current.display();
            current = current.go_next();
        }

    }

    public boolean Find(String match) {
        Node current = head;
        while(current != null && !current.name_equals(match))
        {
            current = current.go_next();
        }

        if(current != null)
        {
            System.out.println("Match found, displaying contents");
            current.display();
            return true;
        }

        return false;
    }
}
