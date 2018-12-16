package Inheritance;

public class C extends B {
	
public C(){
		
		System.out.println("C cons");
		
	}
	
	public A m3()
    {
		
		
	A a=new A();
	B b=new B();
	C c=new C();
	return c;	
	}

public B m4()
{
	
	
	A a=new A();
	B b=new B();
	C c=new C();
	
	return b;
	
}

public C m5()
{

	A a=new A();
	B b=new B();
	C c=new C();
	return c;
	
}

}
