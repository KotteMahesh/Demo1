package pat.com;

public class Number
{
	static void col(int n)
	{
		if(n>=1) 
		{
			col(n-1);
			System.out.print(n+" ");
		}
	}
	static void row(int r,int c)
	{
		if(r>=1)
		{
			col(c);
			System.out.println();
			row(r-1,c-1); //10 by 1
			//row(r-1,c); //10 by 10
		}
	}
	public static void main(String[] args) 
	{
	row(10,10);	
	}
}
