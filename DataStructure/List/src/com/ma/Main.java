package com.ma;

public class Main 
{
	public static void main(String[] args) 
	{
		LinkedList l1=new LinkedList();
		l1.display();
		l1.insert(10);
		l1.insert(20);
		l1.insert(30);
		l1.display();
		l1.delete();
		l1.display();
		l1.insert(40);
		l1.insert(50);
		l1.delete();
		l1.display();
		l1.insertFront(32);
		l1.insertFront(62);
		l1.insertFront(92);
		l1.display();
		l1.deleteFront();
		l1.display();
		l1.insertFront(685);
		l1.display();
	}
}
