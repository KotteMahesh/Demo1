package rec.com;

public class Demo2 
{
	static void fun(int n)
	{
		if(n>=1)
		{
			System.out.println(n);
			fun(n-1);
			System.out.println(n);
		}
	}
	public static void main(String[] args) 
	{
		System.out.println("satrt");
		fun(5);
		System.out.println("stop");
	}
}
