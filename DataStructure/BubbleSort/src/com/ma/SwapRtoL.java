package com.ma;

public class SwapRtoL 
{
	public static void main(String[] args) 
	{
		int[] arr = {12,13,5,11,6};
		for(int i=1;i<arr.length;i++)
		{
			int key = arr[i];
			int j= i-1;
			while(j>=0 && key<arr[j])
			{
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = key;
		}
		for(int ele: arr)
		{
			System.out.print(ele+" ");
		}
	}
}
