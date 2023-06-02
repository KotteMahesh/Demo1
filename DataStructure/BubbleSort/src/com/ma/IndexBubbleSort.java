package com.ma;

public class IndexBubbleSort {
	private static int i;
	private static int min;
	private static int j;
	public static void main(String[] args) {
		int[] arr= {44,67,90,23,102,63,1,9};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length-1;j++)
			{
				int temp = arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
			for(int ele : arr)
			{
				System.out.print(ele+" ");
			}
		}
		
		//Reverse of Array{9,1,63,102,23,90,67,44}
//		for(int i=0;i<arr.length;i++)
//		{
//			int max=i;
//			for(int j=i+1;j<arr.length;j++)
//			{
//			
//		
//		int temp=arr[max];
//		arr[max]=arr[j];
//		arr[j]=temp;
//		}
//	
//			
//		}
//	for(int ele : arr)
//		{
//			System.out.print(ele+" ");
//		}
}
}

