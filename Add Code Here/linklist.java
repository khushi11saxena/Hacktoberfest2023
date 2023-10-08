import java.util.Scanner;

public class linklist{
    class Node{
        int data;
        Node link;
    public Node(int data){
        this.data=data;
        this.link=null;
    }
    public Node() {
    }
    }
    /*Inserting  */
    public Node start=null;
    void insert(int val)
    {
        Node nptr=new Node();
        nptr.data=val;
        nptr.link=null;
        if (start==null)
        start=nptr;
        else{
            nptr.link=start;
            start=nptr;
        }
    }
    /*Display */
    void display()
    {
        for(Node ptr=start;ptr!=null;ptr=ptr.link)
        System.out.print(ptr.data+"->");
    }
    /*Main class */
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the values you want to insert in the linklist");
        int x=sc.nextInt();
        linklist ob=new linklist();
        for(int i=0;i<x;i++)
        {
            int val=sc.nextInt();
            ob.insert(val);
        }
       ob.display();
    }
}