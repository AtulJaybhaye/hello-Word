package Inheritance;

public class Child extends Parent {
	
	int a=60;
	int b=60;
  public void add(int a,int b){
	  
	  System.out.println(this.a+this.b);
	  System.out.println(super.a + super.b);
	  System.out.println(a+b);
	  
  }
  public void m1()
  {
	 
	 System.out.println("Child m1"); 
	 super.m1();
  }
  
  public void m2()
  {
	  this.m1();
	System.out.println("chile m2");
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
  Child c=	new Child();
  c.add(100, 100);
  c.m1();
  c.m2();
	}

}
