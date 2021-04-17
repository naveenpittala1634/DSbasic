/*
Check to see if a linked list has a loop. 
	

	public void loopornot()
	{
	 Node a=first;
	 Node b=first;
	 int flag=0;
	 while(b!=null)
	 {
		 a=a.next;
		 b=b.next.next;
		 if(a==b)
		 {
			 System.out.println("Loop is present");
			 flag=1;
			 break;
		 }
		     
	 }
	 if(flag==0)
	 {
		 System.out.println("Loop is not present");
	 }
		 
	 
	  
	}
	
 
 
 */



package LinkedList;

public class LoopOrNot
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
	public void loopornot()
	{
	 Node a=first;
	 Node b=first;
	 int flag=0;
	 while(b!=null)
	 {
		 a=a.next;
		 b=b.next.next;
		 if(a==b)
		 {
			 System.out.println("Loop is present");
			 flag=1;
			 break;
		 }
		     
	 }
	 if(flag==0)
	 {
		 System.out.println("Loop is not present");
	 }
		 
	 
	  
	}
	
	
public static void main(String[] args)
{
LoopOrNot l=new LoopOrNot();
	l.addLast(10);
	l.addLast(20);
	l.addLast(30);
	l.addLast(40);
	l.addLast(50);
	l.addLast(60);
	
	l.loopornot();

	
	
}
}
