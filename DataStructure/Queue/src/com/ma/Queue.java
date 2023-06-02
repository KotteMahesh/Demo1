package com.ma;

public class Queue 
{
	static int[] queue;
	static int front;
	static int rear;
	
	
	static void createqueue(int size)
	{
		queue = new int[size];
		front = 0;
		rear = 0;
		System.out.println("Queue had been Created with size: "+size);
		System.out.println("===========");
	}
	static void enqueue(int ele)
	{
		if(rear == queue.length)
		{
			System.out.println("Queue is Full....!!!!!!");
		}
		else
		{
			queue[rear] = ele;
			rear++;
			System.out.println(ele+" Queue has been inserted");
		}
	}

	static void display()
	{
		System.out.println("===Queue Elements===");
		if(rear==0)
		{
			System.out.println("Queue is Empty.....!!!!!!");
		}
		else
		{
			for(int i=front;i<rear;i++)
			{
				System.out.println(queue[i]);
			}
		}
	}
	static void dequeue(int ele)
	{
//		if(front == queue.length)
//		{
//			System.out.println("Queue is Empty....!!!!!!");
//		}
//		else
//		{
//			queue[front] = ele;
//			front++;
//			System.out.println(ele+" Queue has been deleted");
//		}		
		if(rear==0)
			{
				System.out.println("Queue is Empty....!!!!");
			}
			else
			{
				System.out.println(queue[front]+"is deleted.....!!!!!");
				for(int i=front;i<rear-1;i++)
				{
					queue[i] = queue[i+1];
				}
				rear--;
				queue[rear] = 0;
			}
		System.out.println("====================");
	}
	static boolean isEmpty()
	{
		if(rear==0)
		{
			return true;
		}
		return false;
	}
	static boolean isFull()
	{
		if(front==0)
		{
			return true;
		}
		return false;
	}
	public static void main(String[] args) 
	{
		createqueue(5);
		isEmpty();
		enqueue(10);
		enqueue(20);
		enqueue(30);
		display();
		enqueue(40);
		enqueue(50);
		enqueue(60);
		display();
		dequeue(10);
		display();
		enqueue(60);
		display();
		isFull();
	}
}