package rec.com;

public class Demo1 
{
	static void m4()
	{
		System.out.println("hai m4");
		System.out.println("bye m4");
	}
	static void m3()
	{
		System.out.println("hai m3");
		m4();
		System.out.println("bye m3");
	}
	static void m2()
	{
		System.out.println("hai m2");
		m3();
		System.out.println("bye m2");
	}
	static void m1()
	{
		System.out.println("hai m1");
		m2();
		System.out.println("bye m1");
	}
	public static void main(String[] args) 
	{
		System.out.println("hai main");
		m1();
		System.out.println("bye main");
	}
}
