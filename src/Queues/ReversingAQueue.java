/*
 We need to reverse the queue by only using add,remove and isempty methods.
 Here the apporach is for reversing we are storing the elements in the stack by removing from queue
 and adding it again into the queue . This will reverse the queue.
 
 */


package Queues;
import java.util.*;

public class ReversingAQueue 
{
	public static void main(String[] args) 
	{
		Queue<Integer> q=new LinkedList<Integer>();
		q.add(10);
		q.add(20);
		q.add(30);
		reverse(q);
		
		
		
	}
	public static void reverse(Queue<Integer> queue)

	{
		Queue<Integer> q1=new LinkedList();
		Stack<Integer> stack=new Stack();
		while(!queue. isEmpty())
		{
			stack.push(queue.remove());
		}
		while(!stack.isEmpty())
			queue.add(stack.pop());
		System.out.println(queue);
		
		
	}
}
