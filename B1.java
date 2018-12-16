package Inheritance;

public class B1 extends A1{
	
	  public B1()
	{
		super("Atul");
	      System.out.println("B:Const 0  B1");
	      
	      super.m1();
	}
	
	public B1(int a)
	  {
		System.out.println("Const B1 int");
	  }
	    public B1(String x)
	    { this(5);
		System.out.println("Const B1 String");
        }
	
	    
	  public static void main(String[] args)
	  
	  {
		 B1 b=new B1();
	  }

}
