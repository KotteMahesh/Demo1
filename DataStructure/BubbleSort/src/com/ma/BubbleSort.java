package com.ma;

public class BubbleSort
{
	public static void main(String[] args) 
	{
		int[] arr= {18,27,6,11,15};
		
		for(int i=0;i<arr.length;i++)//Low -> High // High-> Low
		{
			//for(int j=0;j<arr.length-1;j++)		// High-> Low 
			//for(int j=0;j<arr.length;j++)			// High-> Low 
			for(int j=i+1;j<arr.length;j++)//Low -> High
			{
				//if(arr[j]>arr[j+1])
				if(arr[i]>arr[j])//Low -> High  // High-> Low
				{
					int temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
					
				}
			}
		}
		for(int ele:arr)
		{
			System.out.print(ele+" ");
		}
	}
}
