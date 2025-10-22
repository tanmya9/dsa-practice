class LlSwap
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

  public void swap(int x, int y)
  {
	if(x==y)
	{
		return;
	}
	Node prevX=null;
	Node currX=head;
	while(currX!=null && currX.data!=x)
	{
				
	}
  }

  public void print()
	{
		if(head==null)
		{
			System.out.println("LinkedList is empty");
			return;
		}
		Node temp=head;
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println();
	}

  public static void main(String args[])
	{
		LinkedListSwap ll=new LinkedListSwap();
		ll.head=new Node(1);
		ll.head.next=new Node(2);
		ll.head.next.next=new Node(3);
		ll.head.next.next.next=new Node(4);
		ll.head.next.next.next.next=new Node(5);
		ll.head.next.next.next.next.next=new Node(6);
		ll.head.next.next.next.next.next.next=new Node(7);
		ll.print();
		
		ll.swap(3, 5);
		ll.print();
	}
}
