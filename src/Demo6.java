public class Demo6 extends Utils {

    public static void main(String [] args)
    {
        //Generic_List people = new Array_List();
        //people.Build_List();
        //people.Display();

        System.out.println(" Time to create an LLL");
        Generic_List people = new Linked_List();
        people.Build_List();
        people.Display();
        people.Find("Karla Fant");
    }
}
