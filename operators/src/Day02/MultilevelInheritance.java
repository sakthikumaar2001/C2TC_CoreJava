package Day02;

//public class MultilevelInheritance {
	//Multilevel Inheritance
	class grandfather
	{
	    public void land()
	    {
	        System.out.println("Grand father has 13 land.");
	    }
	}
	class mother extends grandfather
	{
	    public void house()
	    {
	        System.out.println("Father has house.");
	    }
	}
	class daughter extends mother
	{
	    public void car()
	    {
	        System.out.println("Son has own car.");
	    }
	    
	}

public class MultilevelInheritance {
	  public static void main(String[]args)
	  {  
	      daughter s = new daughter();
	      s.land();
	      s.house();
	      s.car();
	  }
}
