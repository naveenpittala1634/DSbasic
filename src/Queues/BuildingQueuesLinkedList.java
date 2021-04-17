/*
 Queue operations can be implemented using two stacks
 Operations performed here are 
 1) Enqueue( adding the elements)
 2) Dequeue( Removing the elements)
 Stack 1 is only used for eneuque
 Stack 2 is used for dequeue.
 Thats why we are considering two stacks to solve this question.
 
 
 */

package Queues;

import java.util.Stack;

public class BuildingQueuesUsingLinkedList 
{
	public static void main(String[] args) {
		BuildingQueuesUsingLinkedList  q=new BuildingQueuesUsingLinkedList();
		q.enqueue(5);
		q.enqueue(10);
		q.enqueue(15);
		q.dequeue();
		
	
		
		
	}
	Stack<Integer> s1=new Stack<Integer>();
	Stack<Integer> s2=new Stack<Integer>();
	
	public void enqueue(int item)
	{
		
  
      
        s1.push(item);  
  
      
        
	   
	}
	

	public void dequeue()
	{
		  // if first stack is empty  
        if (s1.isEmpty())  
        {  
            System.out.println("Queue is Empty");  
            System.exit(0);  
        }  
  
       while(!s1.isEmpty())
       {
    	   s2.push(s1.pop());
       }
       System.out.println(s2.pop()); 
       
	}
	

	
	

}
