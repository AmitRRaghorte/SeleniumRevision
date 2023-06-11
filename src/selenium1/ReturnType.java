package selenium1;

public class ReturnType {
	
	// method with int return type
	
	public static int add (int a ,int b) 
	
	{
		int sum = a+b ;
		return sum ; 
	}
	
	public static void main (String [] args )
	{
		int num1 = add (5,10);       // Fisrt approach if you want to use retrun value then used this approach
		System.out.println (num1);
		
		//System.out.println (add(7,10)) ; // Second approach if 
		
		//System.out.println (add(10,9));
	}


}
