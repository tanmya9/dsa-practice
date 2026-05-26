package Queues;
import java.util.*;
public class Usingdeque {
	static Deque<Integer> deque=new LinkedList<>();
	public void push(int data)
	{
		deque.addLast(data);
	}
	
	public static int pop()
	{
		return deque.removeLast();
	}
	
	public static int peek() //only to return the last element 
	{
		return deque.getLast();
	}
	public static void main(String args[])
	{
		Usingdeque s=new Usingdeque();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		System.out.println("Top element"+ s.peek());
		
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
	}
}
