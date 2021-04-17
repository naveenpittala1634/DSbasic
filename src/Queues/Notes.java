package Queues;
import java.util.*;

/*
In Queue the first item that is inserted is the first item that is removed.
First in First Out .
Queues work exactly like people standing in queue.
Operations:
1) Enqueue : For adding an item at the back of the queue.
2) Dequeue : For removing the item at the front of the queue.
3) peek    : For getting the item at the front without removing it
4) isEmpty , isFull

Queue in java is an interface so we cannot instantiate them.
LinkedList class in java implements Queue. (There are also many other classes that implements the queue)

There are few methods in this queue 
1) add() and offer() :
when queue is full add throws an exception where as offer doesnt

2) poll() and remove()
  remove() method will retrieve and removes the head of the queue and throws exception if it is empty.
  poll() method will retrieve and removes the head of the queue or returns null if it is empty.
  
3) peek() and element()
  
  If our queue is empty peek() will return null and element() will throw an exception.
  
Check out the sample program that is written below.


 
 
 */

public class Notes
{
	public static void main(String[] args) {
		Queue<Integer> q=new LinkedList();
		//Here, LinkedList is upcasted to Queue type.This LinkedList class is implementing the queue
		q.add(10);
		q.add(20);
		q.add(30);
		System.out.println(q.remove());
		System.out.println(q);		
		
	}
}