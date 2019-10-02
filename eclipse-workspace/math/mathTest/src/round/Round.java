package round;

public class Round
{
	public static void main(String[] args)
	{
		long weather = Math.round(Math.random());
		
		if(weather == 1)
		{
			System.out.println("Sunny");
		}
		else
		{
			System.out.println("Rainy");
		}
	}
}
