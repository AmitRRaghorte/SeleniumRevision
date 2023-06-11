package WebDriver_Method_Title_URL_Check;

// Validate url and TITLE of airtel

public class ValidateURLandTitle extends Airtel {
	
	String expectedUrl = "https://www.airtel.in/";
	String expectedtitle = "Airtel: Prepaid, Postpaid, Broadband, DTH, Bank & Business";
	
	public void titlecheck () 
	{
		String ActualTitle = a.getTitle();
		System.out.println ("Title is : " + ActualTitle);
		if(expectedtitle.equals(ActualTitle))
		{
			System.out.println ("Test1 is passed");
		}
		else 
		{
			System.out.println ("Test2 is failed");
		}
	}
	
	public void urlcheck () 
	{
		
		String ActualUrl = a.getCurrentUrl();
		System.out.println ("URL IS  : " + ActualUrl);
		if (expectedUrl.equals(ActualUrl)) 
		{
			System.out.println ("Test2 is passed");
		}
		else 
		{
			System.out.println ("Test2 is failed");
		}
		
	}
	
   public static void main (String [] args) throws InterruptedException
   {
	   ValidateURLandTitle v = new ValidateURLandTitle ();
	   v.launch();
	   v.welcome();
	   v.data();
	   v.sms();
   }
	
	

}
