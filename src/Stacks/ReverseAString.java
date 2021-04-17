/*
 Notes : Push()
         Pop()-- > Removes the top element and returns it
         Peek()--> Returns the top element
         isEmpty()
         
 */


/*
 Reverse  a String using a stack
 */
package Stacks;
import java.util.Stack;

public class ReverseAString 
{
	public static void main(String[] args) 
	{
		Stack<Character> stack=new Stack<Character>();
		String s="abcd";
		for(char ch: s.toCharArray()) //Foreach loop
			stack.push(ch);
		
		StringBuffer  rev=new StringBuffer(); // We can also use normal string here but it is costly as the string is immutable
		while(!stack.isEmpty())  //If stack is not empty it willl enter the loop
		{
			rev.append(stack.pop());
		}
		System.out.println(rev.toString());
		
		
		
		
	}

}
