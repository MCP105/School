package random;

public class Random
{
	public static void main(String [] args)
	{		
		double weather = Math.random() * 10;
		
		
		if(weather >= 5)
		{
			System.out.println("Rainy");
		}
		else
		{
			System.out.println("Sunny");
		}
	}	
}
