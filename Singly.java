import java.util.*;
class Node
{
    int rollnumber;
    Node next;
}
public class Singly
{
    Node START;
    Singly()
    {
        START=null;
    }
    void addnode()
    {
        System.out.println("Enter your RollNumber");
        Scanner sc=new Scanner(System.in);
        int rollno=sc.nextInt();
        Node newnode=new Node();
        newnode.rollnumber=rollno;
        newnode.next=null;
        if(START==null)
        {
            START=newnode;
        }
        else
        {
            Node currentnode=START;
            while(currentnode.next!=null)
            {
                currentnode=currentnode.next;
            }
            currentnode.next=newnode;
        }
        System.out.println("Element Inserted...");
    }
    void deletenode()
    {
        if(START==null)
        {
            System.out.println("List is empty");
        }
        else
        {
            
        }
    }
    void search()
    {
        if(START==null)
        {
            System.out.println("List is empty");
        }
        else
        {
            System.out.print("Element to be searched : ");
            Scanner sc=new Scanner(System.in);
            int rollno=sc.nextInt();
            Node current;
            int count=0;
            for(current=START;current!=null;current=current.next)
            {
                if(current.rollnumber==rollno)
                {
                    count++;
                    break;
                }
            }
            if(count==1)
            {
                System.out.println("found...");
            }
            else
            {
                System.out.println("not found...");
            }
        }
    }
    void traverse()
    {
        if(START==null)
        {
            System.out.println("List is empty");
        }
        else
        {
            Node current;
            for(current=START;current!=null;current=current.next)
            {
                System.out.println(current.rollnumber);
            }
        }
    }
    public static void main(String args[])
    {
        Singly obj=new Singly();
        Scanner sc=new Scanner(System.in);
        while(true)
        {
            System.out.println("1. Add");
            System.out.println("2. Delete");
            System.out.println("3. Search");
            System.out.println("4. Display");
            System.out.println("5. Exit");
            System.out.print("Enter your choice : ");
            int ch=sc.nextInt();
            switch(ch)
            {
                case 1:obj.addnode();
                       break;
                case 2:obj.deletenode();
                       break;
                case 3:obj.search();
                       break;
                case 4:obj.traverse();
                       break;
                case 5:System.exit(0);
                       break;
                default:System.out.println("Wrong Choice");
            }
        }
    }
}