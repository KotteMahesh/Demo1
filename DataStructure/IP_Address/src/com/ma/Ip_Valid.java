package com.ma;

public class Ip_Valid 
{
	public static void main(String[] args) 
	{
		String s = "125.88.99.46";
		String[] arr = s.split("[.]");
		boolean f = true;
		for(String ele : arr)
		{
			int n = Integer.parseInt(ele);
			
			if(n<0 || n>255)
			{
				f = false;
			}
			if(f==true && arr.length==4)
			{
				System.out.println("Valid");
			}
			else
			{
				System.out.println("Invalid");
			}
		}
	}
}
