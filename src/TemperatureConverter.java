import java.util.Scanner;
public class TemperatureConverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float tempC = 0, tempF= 0;
		String temp;		
		
		Scanner keyboard = new Scanner(System.in);

		
	    System.out.print( "Faranheit or Celcius? F  or C" );
	    temp = keyboard.nextLine();
	    
	    if (temp.equals("F")) {
	    	
	    			System.out.print( "Temperature in F" );
	    		    tempF = keyboard.nextFloat();
	    		    keyboard.nextLine();
	    		    tempC = toDegFtoC(tempF);
	    		    
	    		    System.out.println(tempF+  " F is "+ tempC + " C" );
	    			
	    	}
	    else {
	    	System.out.print( "Temperature in C" );
		    tempC = keyboard.nextFloat();
		    tempF = toDegCtoF(tempC);
		    
		    System.out.println(tempC + " C is "+  tempF + " F" );
	    }
	    
	}
	
	private static float toDegCtoF(float Y)
	{
	    // Some code here where plumber does his thing - I don't even
	    // know what he does because I don't have to pay attention
	    // I just call him and pay him.

	    //return true;
		//T(°F) = T(°C) × 9/5 + 32 
		float tempF= 0;
		
		tempF = (Y * (9/5)) + 32;
		
		return tempF;
	}
	private static float toDegFtoC(float X)
	{
	    // Some code here where plumber does his thing - I don't even
	    // know what he does because I don't have to pay attention
	    // I just call him and pay him.

	    //return true;
		//  T(°C) = (T(°F) - 32)x5/9
		float tempC = 0;
		
		tempC = ((X - 32) * (5/9));
		System.out.println(tempC + " C is " );
		
		return tempC;
	}

}
