/*
 In this problem we are performing the following operations
 
 1)Inserting elements at the beginning
 2)Inserting elements at the end
 3) Removing element at the beginning
 4)Removing element at the end
 5)Finding Index of the given element which is present in the list
 6) Checking whether the given element is present or not
 7) Printing the linkedlist elements
 
 
 Here Node class is a class Which has two variables value and next reference.
 */





package LinkedList;


public class LinkedList1 
{
	class Node
	{
		 int value;
		 Node next;
		public Node(int value)
		{
			this.value=value;
			
		}
	}


	Node first;
	Node  last; 
	public  void addLast(int item)  //For adding the elements in the end
	{
		Node node=new Node(item);
		if(first==null)
		{
			first=node;
			last=node;
		}
		else 
		{
			last.next=node;
			last=node;
		}
	}
	
	public void addFirst(int item)  // For adding elements at the beginning.
	{
		Node node=new Node(item);
		if(first==null) // We are seeing if the list is empty or not.
		{
			first=node;
			last=node;
			
		}
		else
		{
		
		node.next=first;
		first=node;
			
			
		}
		
	}
	
	public int indexOf(int item) //For knowing the indexOf the element given.
	{
		Node node=first;
		int count=0;
		while(node.value!=item)
		{
			count++;
			node=node.next;
			
		}
		return count;
		
	}
	
	public boolean containsItem(int item) //Checks whether the given element is present or not.
	{
		Node node=first;
		Node current=first;
		while(current!=null)
		{
			if(current.value==item)
				return true;
			else
				current=current.next;
		}
		return false;
	}
	
	public void removeFirst()  //Removing first element
	{
		if(first==last) //If there is only 1 element
		{
			first=last=null;
		} 
		else  //If there are 2 or more elements
		{
		Node second=first.next;
		first.next=null;
		first=second;
		}
		
	}
	
	public void removeLast() //Removing last element
	{
		Node node=first;
	    Node current=first;
		while(current.next.next!=null)
		{
			current=current.next;
		}
		current.next=null;
		last=current;
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
	
	
	
	
	public static void main(String[] args)
	{
		LinkedList1 l=new LinkedList1();
		l.addLast(10);  // Adds element at the end
		l.addLast(20); // Adds element at the end
		l.addLast(30); // Adds element at the end
		
		l.addFirst(40); //Adds element at the beginning
		l.addFirst(100); // Adds element at the beginning
		
		l.printelements();
		
		int index=l.indexOf(100); //Finding the indexOf required element
		boolean ans=l.containsItem(30); //Finding whether the element 30 is present in the list or not.
		System.out.println("30 present in this list is "+ans);
		System.out.p		System.out.println();
		System.out.println("Elements after removing last element");
rintln("Index of the element 100 is " +index);
		l.removeFirst(); //Removing first element
		System.out.println("Elements after removing first element");
		l.printelements(); 
		l.removeLast();
		l.printelements();
		
		
		
		
		
	}
	
	
}

