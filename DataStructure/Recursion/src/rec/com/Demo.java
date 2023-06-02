package rec.com;

public class Demo 
{
	static int sum(int n)
	{
		if(n==0)
		{
			return 0;
		}
		else
		{
			return n+sum(n-1);
		}
		}
		
	public static void main(String[] args)
	{
		System.out.println("START\n");
		System.out.println("sum :"+sum(5));
		System.out.println("\nSTOP");
	}
}

