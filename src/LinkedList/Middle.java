/*
Middle of the linkedlist
If there are even numbers in the list then the output should be n/2,n/2+1
else
It should print n/2th value, here n is number of elements

public void middle()
	{
	 Node a=first;
	 Node b=first;
	 while(b!=last && b.next!=last)
	 {
		 a=a.next;
		 b=b.next.next;
	 }
	    if(b==last)
	    {
		System.out.println("Middle of the linked list is "+ a.value);
	    }
	    else
	    	System.out.println(a.value + ", " + a.next.value);
		
	}

 
 
 */



package LinkedList;

import java.util.Scanner;

public class ElementsWithGap
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
	public void printelements(int x,int y)
	{
		String[] s= {"Raghu-1","Mona-2","Tim-3","Anu-4","Fida-5","Joe-6","Priya-7","Guna-8","Raj-9","Unni-10"};
	 for(int i=0;i<10;i=i+y)
	 {
		 int count=x;
		 int count1=y;
		 while(count!=0)
		 {
			 System.out.print(s[i]+" ");
			 i=i+1;
			 count--;
		 }
		 
		
		 
		 
		 
	 }
		
	}
	
	
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
ElementsWithGap l=new ElementsWithGap();
	l.addLast(10);
	l.addLast(20);
	l.addLast(30);
	l.addLast(40);
	l.addLast(50);
	l.addLast(60);
	int x,y;
	 x=sc.nextInt();
	 y=sc.nextInt();
	
	l.printelements(x,y);

	
	
}

}
