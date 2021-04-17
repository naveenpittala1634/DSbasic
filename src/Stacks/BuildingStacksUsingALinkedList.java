/*
  In this program i have implemented stacks using LinkedList
 These are the following methods i have implemented 
 1) push
 2)pop
 3)peek
 
 */

package Stacks;



public class BuildingStacksUsingALinkedList {
	
    int arr[]=new int[5];
	
	public static void main(String[] args) 
	{
	
		LinkedList1 stack=new LinkedList1();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		stack.push(60);
		
		stack.printstack();
		stack.pop();
		stack.peek();
		
		
		
	}
}
	
	class LinkedList1
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
		Node last;
		public void push(int item)
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
		
		public void pop()
		{
			Node head=first;
			while(head.next.next!=null)
			{
			  head=head.next;
			}
			System.out.println("Popped item is "+head.next.value);
			head.next=null;
		}
		public void printstack()
		{
			System.out.println("Elements of stack are ");
			Node head=first;
			while(head!=null)
			{
				System.out.println(head.value);
				head=head.next;
			}
		}
		
		public void peek()
		{
			Node head=first;
			while(head.next!=null)
			{
			  head=head.next;
			}
			System.out.println("Peek item is "+head.value);
			
		}
	}


