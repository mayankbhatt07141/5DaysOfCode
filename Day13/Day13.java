package Day13;

import java.util.Scanner;

// find the middle element in linked list 
public class Day13 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        Node head=new Node(s.nextInt());
        Node tail=head;
        for(int i=0;i<n-1;i++){
            tail.next=new Node(s.nextInt());
            tail=tail.next;
        }
        System.out.println(getMiddle(head));
        s.close();
    }
    static int getMiddle(Node head)
    {
         // Your code here.
         int len=0;
         Node temp=head;
         while(temp.next!=null){
             len++;
             temp=temp.next;
         }
        temp=head;
        if((len&1)!=0)
             len=len/2 +1;
        else{
            len=len/2;
        }
         while(len>0){
             temp=temp.next;
             len--;
         }
         return temp.data;
    }

}
class Node {
   int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}