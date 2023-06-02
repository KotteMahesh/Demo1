package com.map;

public class HashMap 
{
	static int[] hashmap;
	
	static void createmap(int size)
	{
		hashmap = new int[size];
		for(int i=0;i<hashmap.length;i++)
		{
			hashmap[i] = -1;
		}
		System.out.println("HashMap had been created with size: "+size);
	}
	static void put(int value)
	{
		int index = value%hashmap.length;
		if(hashmap[index]!=-1)
		{
			System.out.println("Its Already Occupied...!!!!");
		}
		else
		{
			hashmap[index]=value;
			System.out.println(value+" value had been added to the map with key: "+index);
		}
	}
	static void delete(int value)
	{
		int index=value%hashmap.length;
		if(hashmap[index]==value)
		{
			System.out.println(value+": got deleted....!");
			hashmap[index]=-1;
		}
		else
		{
			System.out.println("Value not found....!!");
		}
	}
	static void display()
	{
		System.out.println("====HashMap====");
		int c=0;
		for(int i=0;i<hashmap.length;i++)
		{
			if(hashmap[i]!=-1)
			{
				c++;
				System.out.println("Key: "+i+" Value: "+hashmap[i]);
			}
		}
		if(c==0)
		{
			System.out.println("HashMap Is Empty....!!!!!");
		}
	}
	static void reset()
	{
		
	}
	public static void main(String[] args) 
	{
		createmap(5);
		put(10);
		put(11);
		put(12);
		put(13);
		//display();
		put(14);
		put(17);
		display();
		put(20);
		display();
		//delete(10);
		
		display();
		delete(60);
		display();
	}
}