package work;
abstract class Base {
    abstract void fun();
}
 
// Class 2
class Derived extends Base {
    void fun()
    {
        System.out.println("Derived fun() called");
    }
}
public class Demoabstract {
	
	 
	
	    public static void main(String args[])
	    {
	 
	        
	        Base b = new Derived();
	        b.fun();
	    }
	}

