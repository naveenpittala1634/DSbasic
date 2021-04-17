package Stacks;

import java.util.Stack;

public class BalancedParanthesisCheck 
{
    
	public static void main(String[] args) 
	{
		String s="(())";
		Stack<Character> stack=new Stack<Character>();
		char[] ch=s.toCharArray();
		int count=0;
		for(int i=0;i<ch.length;i++)
		{
			
			if(ch[i]=='('||ch[i]=='{'||ch[i]=='[')
			{
				stack.push(ch[i]);
			}
			else if(stack.isEmpty())
			{
				break;
			}
			else 
			{
				
			
				if(!(isMatching(stack.peek(),ch[i])))
				{
				System.out.println("Not balanced");
			
				 
				 break;
				 
				}
				else
					stack.pop();
			 }
			count++;
			
		}
		if(count==s.length() && stack.isEmpty())
		{
			System.out.println("Balanced");
			
		}
		else
			System.out.println("Not Balanced");
	
		
	}
	
	public static boolean isMatching(char ch1,char ch2)
	{
		if(ch1=='(' && ch2==')')
			return true;
		if(ch1=='{' && ch2=='}')
			return true;
		if(ch1=='[' && ch2==']')
			return true;
		else
			return false;
	}
	
	

}
