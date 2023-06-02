package com.ma;

public class bracketBalancing
{
	static char[] stack;
	static int top = -1;
	static boolean flag = true;
	static void pop()
	{
		top--;
	}
	static void push()
	{
		top++;
		stack[top]='(';
	}
	
	public static void main(String[] args) 
	{
		String s="()(()";
		stack =new char[s.length()];
		//boolean flag = true;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='(')
			{
				push();
			}
			else if(s.charAt(i)==')' && top != -1)
			{
				pop();
			}
			else
			{
				flag = false;
				break;
			}
		}
		if(top == -1 && flag == true)
		{
			System.out.println("Balanced");
		}
		else
		{
			System.out.println("Un_Balanced");
		}
	}
}