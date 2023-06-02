package com.Binary;

public class Node 
{
	private static Object root;
	int data;
	Node left;
	Node right;
	
	Node(int data)
	{
		this.data=data;
	}
	static void insert(Node root,int ele)
	{
		if(ele<root.data)
		{
			if(root.left==null)
			{
				root.left = new Node(ele);
				System.out.println(ele+" had been added towards left: "+root.data);
			}
			else
			{
				insert(root.left,ele);
			}
		}
		else if(ele>root.data)
		{
			if(root.right==null)
			{
				root.right = new Node(ele);
				System.out.println(ele+" had been added towards right: "+root.data);
			}
			else
			{
				
			}
		}
	}
	static void preOrder(Node root)
	{
		if(root!=null)
		{
			System.out.println(root.data+" ");
			preOrder(root.left);
			preOrder(root.right);
		}
		
	}
	
	static void postOrder(Node root)
	{
		if(root!=null)
		{
			postOrder(root.left);
			postOrder(root.right);
			System.out.println(root.data+" ");
		}
		
	}
	
	static void inOrder(Node root)
	{
		if(root!=null)
		{
			inOrder(root.left);
			System.out.println(root.data+" ");
			inOrder(root.right);
		}
		
	}
	static int height(Node root)
	{
		if(root==null)
		{
			System.out.println("tree is Empty.....!!!!");
			return 0;
		}
		else
		{
			int lh=0,rh=0;
			if(root.left!=null)
			{
				lh=height(root.left);
			}
			if(root.right!=null)
			{
				lh=height(root.right);
			}
			int max=lh>rh?lh:rh;
			return (max+1);
		}
		
	}
	public static void main(String[] args) 
	{
		Node root = new Node(15);
		insert(root,10);
		insert(root,9);
		insert(root,110);
		insert(root,62);
		insert(root,8);
		System.out.println("===preOrder===");
		preOrder(root);
		System.out.println("===postOrder===");
		postOrder(root);
		System.out.println("===inOrder===");
		inOrder(root);
		System.out.println(height(root)-1+" ");
		height(root);
	}
}
