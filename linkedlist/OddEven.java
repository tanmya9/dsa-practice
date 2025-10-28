class Oddeven
{
  public static class Node
  {
    int data;
    Node next;
    public Node(int data)
    {
      this.data=data;
      this.next=null;
    }
  }
  public static Node head;
  public static Node tail;

public Node OddEven(Node head)
{
  Node resStart=nulll
  Node resEnd=null;

  Node curr=head;
  Node prev=null;

  while(curr!=null)
  {
     if(curr.data%2==0)
     {
       
        //removing curr node from original list
        if(prev!=null)
        {
          prev.next=curr.next;
        }
        else
        {
          head=curr.next;
        }
       
        //adding node to the result list
        if(resStart==null)
        {
          resStart=curr;
          resEnd=resStart;
        }
        else
        {
          resEnd.next=curr;
          resEnd=resEnd.next;
        }
        curr=curr.next;
      }
      else
      {
        prev=curr;
        curr=curr.next;
      }
    }

    //if result list is still empty
    if(resStart==null)
    {
      return head;
    }

    //append original list to result list
    resEnd.next=head;
    return resStart;
  }

  //function to print the linkedlist
  void printList()
  {
    Node temp = head;
    while(temp != null)
    {
      System.out.print(temp.data+" ");
      temp = temp.next;
    }
    System.out.println();
  }
  public static void main(String[] args)
  {
        Main list=new Main();
        list.head=new Node(1);
        list.head.next=new Node(2);
        list.head.next.next=new Node(4);
        list.head.next.next.next=new Node(7);
        list.head.next.next.next.next=new Node(8);
        list.printList();
        
        list.head = list.oddEven(list.head);
        list.printList();
    }
}
