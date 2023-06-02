package com.ma;

public class Binarysearch 
{
	static int binarys(int[] arr,int val)
	{
		int low=0, high=arr.length-1;
		while(low<=high)
		{
			int mid=(low+high)/2;
			if(arr[mid]==val)
			{
				return mid;
			}
			else if(arr[mid]>val)
			{
				high=mid-1;
			}
			else
			{
				low=mid+1;
			}
		}
		return -1;
	}
	public static void main(String[] args) 
	{
		int[] arr= {0,10,20,70,80,90,30,60,50,40,100};
		int val=90;
		System.out.println(binarys(arr,val));
	}
}
