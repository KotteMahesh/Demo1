package com.ma;

public class LinkedList 
{		
	Node head;
	void insert(int ele) 
	{
		Node n=new Node(ele);
		if(head==null) 
		{
			head=n;
		}
		else 
		{
			Node temp=head;
			while(temp.next!=null) 
			{
				temp=temp.next;
			}
			temp.next=n;
		}
		System.out.println(ele+" is successfully added.......!!!");
		
	}
	void display() 
	{
		if(head==null) 
		{
			System.out.println("Linked List is Empty...!!!");
		} 
		else 
		{
			Node temp=head;
			while(temp.next!=null) 
			{
				System.out.println(temp.data+" --->");
				temp=temp.next;
		}
			System.out.println(temp.data+" --->");
	}
		System.out.println("================");
	}
	void delete()
	{
		if(head==null)
		{
			System.out.println("LinkedList is Empty.....!!!!");
		}
		else if(head.next==null)
		{
			head=null;
		}
		else
		{
			Node temp=head;
			while(temp.next.next!=null)
			{
				temp=temp.next;
			}
			System.out.println(temp.next.data+" Got Deleted Sucessfully....!!!!");
			temp.next=null;
		}
	}
	void insertFront(int ele)
	{
		Node n=new Node(ele);
		if(head==null)
		{
			head=n;
			System.out.println(ele+" Inserted Sucessfully....!!!!");
		}
		else
		{
			n.next=head;
			head=n;
		}
		System.out.println(ele+" Inserted Sucessfully....!!!!");
	}
	void deleteFront() 
	{
		if(head==null)
		{
			System.out.println("LinkedList Is Empty...!!!");
		}
		else
		{
			System.out.println(head.data+" Got Deleted Sucessfully....!!!!");
			head=head.next;
		}
	}
	void delete(int ele)
	{
		int key = 0;
		if(head==null)
		{
			System.out.println("LinkedList Is Empty...!!!!");
		}
		else if(head.next==null)
		{
			if(head.data==key)
			{
				head=null;
				System.out.println("Data had been Deleted.....!!!!!");
			}
			else
			{
				System.out.println("Invalid Data...!!!!");
			}
		}
		else if(head.data==key)
		{
			deleteFront();
		}
		else
		{
			Node temp=head;
			while(temp.next.data!=key && temp.next.next!=null)
			{
				temp=temp.next;
			}
			if(temp.next.data==key)
			{
				temp.next=temp.next.next;
				System.out.println("Data had been Deleted.....!!!!!");
			}
			else
			{
				System.out.println("Invalid Data...!!!!");
			}
		}
	}
}
