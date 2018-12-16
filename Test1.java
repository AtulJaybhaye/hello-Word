package Inheritance;

public class Test1 {
	
	
	
	public A m3(){
		B b1=new B();
		A a=new A();
		a.b=100;
		System.out.println(a);
		return a;
	}
	
	public B m4(){
		A a=new A();
		B b1=new B();
		
		System.out.println(a);
		return b1;
	}
	
	public String m5()
	{
	return "NDA";	
	}
	
	public Object m6()
	{
		return 20;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test1 t=new Test1();
		
		A a=new B();
		A a1=t.m3();
		A a2=t.m4();
		B b=t.m4();
		System.out.println("------------------");
		
		Object o=t.m5();
		Object o1=t.m6();
		
		int i=(int)o1;
		
		String ss=(String)o;
		System.out.println(i);
		System.out.println(ss);
		
		
	
		
		
		

	}

}
