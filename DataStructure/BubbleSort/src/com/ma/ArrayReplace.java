package com.ma;

public class ArrayReplace //Higest value inserted
{
  public static void main(String[] args) 
  {
	  int[] arr= {18,50,6,62,15,28};
	  
	  for(int i=0;i<arr.length;i++)
	  {
		  for(int j=0;j<arr.length;j++)
		  {
			  if(arr[i]<=arr[j])
			  {
				  int temp=arr[j];
				 arr[j]=arr[i];
				 arr[i]=temp;
			  }
		  }
		  System.out.print(arr[i]+" ");
		 
	  }
  }
}