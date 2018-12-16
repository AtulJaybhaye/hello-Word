package Inheritance;

public class A1 {
	
	
	
public A1()
{   this(5);
	System.out.println("A: 0 const");
}
public A1(int a)
{     this("Atul");
	System.out.println("A: Int const");
}
public A1(float b)
{
	System.out.println("A: Float const");
	m1();
	//this.m1();
}
public A1(String c)
{   this(10.5f);
	System.out.println("A: String const");
	
}	
	public void m1()
	{
		
		System.out.println("A1: m1");
		
	}

	public void m2()
	{
	  System.out.println("A1: m2");
		
	}


}
