package WebDriver_Method_Title_URL_Check;

public class ExectionClass {
	
	public static void main (String [] args) throws InterruptedException
	{
		 Airtel a = new  Airtel ();
		 a.launch();
		 a.welcome();
		 a.data();
		 a.sms();
		 
		 Jio j = new Jio ();
		 j.launch1();
		 j.greet ();
		 j.data();
		 j.sms();
	}

}
