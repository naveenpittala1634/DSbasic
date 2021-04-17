/*
 Kth node from the end: (Do this program in one pass only)
 
 If the list is 10,20,30,40,50 then 3rd node from end is 30.
 
 public int kthNdeFromEnd(int k) ,here k=3
	{
	Node a=first;
	Node b=first;
	for(int i=0;i<k-1;i++)
	{
		b=b.next;
	}
	while(b!=last)
	{
		a=a.next;
		b=b.next;
	}
	return a.value;
		
	}
 
 
 */



package LinkedList;

public class KthNodeFromTheEnd 
{
	public class Node
	{
		int value;
		Node next;
		public Node(int value)
		{
			this.value=value;
		}
	}
	Node first;
	Node last;
	public void addLast(int item)
	{
		Node node=new Node(item);
		if(first==null)
		{
			first=last=node;
			
		}
		else
		{
		     last.next=node;
			 last=node;
		}
			
	}
	public int kthNdeFromEnd(int k)
	{
	 Node a=first;
	Node b=first;
	for(int i=0;i<k-1;i++)
	{
		b=b.next;
	}
	while(b!=last)
	{
		a=a.next;
		b=b.next;
	}
	return a.value;
		
	}
	
	
public static void main(String[] args)
{
	KthNodeFromTheEnd l=new KthNodeFromTheEnd();
	l.addLast(10);
	l.addLast(20);
	l.addLast(30);
	l.addLast(40);
	l.addLast(50);
	
	int num=l.kthNdeFromEnd(3);
	System.out.println("3rd node from the end is "+ num);
	
	
}
}
