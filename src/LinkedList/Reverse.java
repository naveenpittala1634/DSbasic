/*
 DRY RUN
 
p=10        n=40          n=50       n=null
c=20        c.next=20     c.next=30  c.next=null
n=30        p=30          p=40       p=50
c.next=10   c=40          c=50        c=null (After this statement it comes out of the loop)
p=20
c=30


--------------------------------------
(After coming out of loop)
last=first;
last.next=null;
first=previous;




//Input and output
10 20 30 40 50 
Elements after reversal
50 40 30 20 10 




//crux of the program
 * 
 * //crux of the program
 * public void reverse()  //Program to reverse a linkedlist
	{
		
		Node previous=first;
		Node current=first.next;   //10 20 30 40 50
		
		
		while(current!=null)
		{
			
	       
			Node next=current.next;
			current.next=previous;
			previous=current;
			current=next;
		
			
		}
		last=first;
		last.next=null;
		first=previous;
		
		
	}
 */

 


package LinkedList;



public class Reverse {
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
	
	
	public void printelements()  //For printing the elements
	{
		Node head=first;
		while(head!=null)
		{
			System.out.print(head.value+" ");
			head=head.next;
			
		}
		System.out.println(); 
		
	}  
	
	
	public void reverse()  //Program to reverse a linkedlist
	{
		
		Node previous=first;
		Node current=first.next;   //10 20 30 40 50
		
		
		while(current!=null)
		{
			
	       
			Node next=current.next;
			current.next=previous;
			previous=current;
			current=next;
		
			
		}
		last=first;
		last.next=null;
		first=previous;
		
		
	}
	
	
	public static void main(String[] args)
	{
		Reverse l=new Reverse();
		l.addLast(10);
		l.addLast(20);
		l.addLast(30);
		l.addLast(40);
		l.addLast(50);
		l.printelements();
		System.out.println("Elements after reversal");
		l.reverse(); //Calling reverse method
		l.printelements();
	}

}
