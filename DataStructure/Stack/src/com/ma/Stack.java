package com.ma;
import java.util.Scanner;

public class Stack 
{
	static int[] stack;
	static int top;
	
	static void createStack(int size)
	{
		stack = new int [size];
		top = -1;
		System.out.println("Stack has been created with size :"+size);
	}
	
	static void push(int ele)
	{
		if(top==stack.length-1)
		{
			System.out.println("*******************");
			System.out.println("Stack is Overflow...........");
		}
		else
		{
			top++;
			stack[top]=ele;
			System.out.println(ele+"had been inserted..........");
		}
	}
	static void display()
	{
		if(top==-1)
		{
			System.out.println("Stack is empty........");
		}
		else
		{
			for(int i=top;i>=0;i--)
			{
				System.out.println(stack[i]);
			}
		}
		System.out.println("##########################");
	}
	static void pop()
	{
		if(top == -1)
		{
			System.out.println("Stack UnderFlow.........!!!!");
		}
		else
		{
			System.out.println(stack[top]+"got deleted");
			stack[top]=0;
			top--;
		}
	}
	static boolean IsEmpty()
	{
		if(top==-1)
		{
			return true;
		}
		return false;
		
	}
	static boolean IsFull()
	{
		if(top==stack.length-1)
		{
			return true;
		}
		return false;
	}
	public static void main(String[] args) 
	{
//		createStack(5);
//		System.out.println("*******************");
//		     display();
//		push(5);
//		push(10);
//		push(15);
//		     display();
//		push(20);
//		push(25);
//		push(30);
//		     //display();
//		pop();
		
		Scanner sc = new Scanner(System.in);
		System.out.println();
		while(true)
		{
			System.out.println("***Menu***");
			System.out.println("1.CreateStack\n2.Push\n3.Display\n4.Pop\n5.IsEmpty\n6.IsFull\n7.Exit");
			System.out.println("***Enter Option***");
			
			int op = sc.nextInt();
			switch(op)
			{
			case 1: System.out.println("===Enter the Size===");
					int size = sc.nextInt();
					createStack(size);
					break;
			case 2: System.out.println("===Enter the elements===");
					int ele = sc.nextInt();
					push(ele);
					break;
			case 3: System.out.println("===Display===");
					display();
					break;
			case 4: System.out.println("===stack IsEmpty===");
					System.out.println(IsEmpty());
					break;
			case 5: System.out.println("===Stack IsFull===");
					System.out.println(IsFull());
					break;
			case 6: System.out.println("====Thank you visit Again==");
					System.exit(0);
			default: System.out.println("===Invalid===");
			
			}
		}
	}
}
