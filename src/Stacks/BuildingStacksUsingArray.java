/*
 In this program i have implemented stacks using arrays
 These are the following methods i have implemented 
 1) push
 2)pop
 3)peek
 
 */


package Stacks;

public class BuildingStacksUsingArray 
{
	int arr[]=new int[5];
	
	public static void main(String[] args) 
	{
		BuildingStacksUsingArray stack=new BuildingStacksUsingArray ();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
	
		stack.printstack();
	
		
		
	}
	int count=0;
	public  void push(int item)
	{
		arr[count++]=item;
	}
	public void pop()
	{
		int poppeditem=arr[count-1];
		System.out.println("popped item is "+poppeditem);
		count--;
		
	}
	public void peek()
	{
		System.out.println(arr[count]);
		
	}
	public void printstack()
	{
		System.out.println("Elements in the stack are");
		for(int i=0;i<count;i++)
		{
			System.out.println(arr[i]);
		}
	}

}
