/*
 Here we will use the circular array concept to implement the queues using arrays.
 
Rear--> end
Front--> Starting



package Queues;

public class BuildingQueueUsingArray
{
	int front=0;
	int rear=0;
	int[] arr=new int[5];
	
	public static void main(String[] args) 
	{
		BuildingQueueUsingArray queue=new BuildingQueueUsingArray();
	
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.dequeue();
	    queue.enqueue(40);
		queue.enqueue(50);
		queue.enqueue(60);

		queue.printqueue();
		
		
		
		
		
		
	}
	public void enqueue(int item)
	{
		arr[rear++]=item;
		
	}
     public void dequeue()
     {
    	arr[front]=0;
    	front++;
	   
     }
     public void printqueue()
     {
    	 for(int i=0;i<5;i++)
    	 {
    		 System.out.print(arr[i]+" ");
    	 }
     }
	
	
}

Here at this stage if we are adding any elements it will show as array index out of bounds analyze the code
and get it done thats why use circular array.
*/


package Queues;

import java.util.Scanner;

public class BuildingQueueUsingArray
{
	int front=0;
	int rear=0;
	Scanner sc=new Scanner(System.in);
	int len=sc.nextInt();
	int[] arr=new int[len];
	
	public static void main(String[] args) 
	{
		BuildingQueueUsingArray queue=new BuildingQueueUsingArray();
	
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.dequeue();
	    queue.enqueue(40);
		queue.enqueue(50);
		queue.enqueue(60);

		queue.printqueue();
		
	}
	public void enqueue(int item)
	{
		arr[rear]=item;
		rear=(rear+1)%arr.length; //Here we are making it to cicular
		
	}
     public void dequeue()
     {
    	arr[front]=0;
    	front=(front+1)%arr.length; //Here we are making it to circular
    	
	   
     }
     public void printqueue()
     {
    	 for(int i=0;i<arr.length;i++)
    	 {
    		 System.out.print(arr[i]+" ");
    	 }
     }
	
	
}
























