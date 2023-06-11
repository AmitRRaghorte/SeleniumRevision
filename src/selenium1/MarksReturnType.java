package selenium1;

public class MarksReturnType {
	
	public static int add (int m ,int s ,int g ,int h ,int e) 
	{
		int sum = m+s+h+g+e;
		return sum ;
		
		
		
	}
      public static void main (String [] args )
      {
    	  MarksReturnType k = new MarksReturnType ();
    	   int num =  (78+80+94+96+97);
    	   System.out.println (num);
    	   
    	   System.out.println (add (78,80,94,96,97));
    	   
      }
}
