package selenium1;

public class WithoutReturn {
	
	public void m5 ()
	
	{
		  int x = 30;
	      int y = 70;
	      int z = x+y;
	      System.out.println (z);
		
	}
    public static void main (String [] args)
    {
    	WithoutReturn w = new WithoutReturn ();
    	w.m5();
    }
}
