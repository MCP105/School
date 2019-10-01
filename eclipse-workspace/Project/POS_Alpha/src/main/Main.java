package main;

	//Importing Files
import java.util.Scanner;
import classes.Items;

public class Main
{
		//Main Method
	public static void main(String[] args)
	{
			//Declaring Variables
		int ctrl1;
		int ctrl2;
		String ctrl3;
		double transactionValue = 0;
		double reValue;
		String a = "Enter here:  ";
		boolean on = true;
		boolean on2 = true;

			//Declare Scanner
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		//Items for sale
		
			//Takoyaki Flavors
		Items tBacn = new Items(1 , "Bacon Takoyaki",0, 46.00);
		Items tCrab = new Items(2 , "Crab Takoyaki",0, 46.00);
		Items tSqud = new Items(3 , "Squid Takoyaki",0, 46.00);
		Items tOctp = new Items(4 , "Octopus Takoyaki", 0, 60.00);
		                         
			//Japanese Food  
		Items MiSou = new Items(5 , "Miso Soup", 0, 35.00);
		Items Katsd = new Items(6 , "Katsudon", 0, 60.00);
		Items Gyoza = new Items(7 , "Gyoza", 0, 70.00);
		Items Kmchi = new Items(8 , "Kimchi",0, 50.00);
		Items Ykisb = new Items(9 , "Yakisoba", 0, 45.00);
                                 
			//Filipino Food      
		Items tapSi = new Items(10, "Tapsilog", 0, 46.00);
		Items banSi = new Items(11, "Bangsilog", 0, 46.00);
		Items hotSi = new Items(12, "Hotsilog", 0, 46.00);
		Items chxSi = new Items(13, "Chixilog", 0, 46.00);
		Items prkSi = new Items(14, "Porksilog", 0, 46.00);
		Items tocSi = new Items(15, "Tocilog", 0, 46.00);

			//Work Loop
		do
		{
				//User Prompt 1
			System.out.println();
			System.out.println("What shall we do?");
			System.out.println("Enter 1 to set stock");
			System.out.println("Enter 2 to display stock");
			System.out.println("Enter 3 to make a transaction");
			System.out.println("Enter 4 to turn off");
			System.out.println();
            
				//Getting User Input
			System.out.print(a);
			ctrl1 = sc.nextInt();
			
				//Main Decisions
			switch (ctrl1)
			{
			case 1:
					//Setting Stock
				tBacn.sPrompt();
				tCrab.sPrompt();
				tSqud.sPrompt();
				tOctp.sPrompt();
				MiSou.sPrompt();
				Katsd.sPrompt();
				Gyoza.sPrompt();
				Kmchi.sPrompt();
				Ykisb.sPrompt();
				tapSi.sPrompt();
				banSi.sPrompt();
				hotSi.sPrompt();
				chxSi.sPrompt();
				prkSi.sPrompt();
				tocSi.sPrompt();
				
				break;
				
			case 2:
					//Display Stock
				tBacn.sDisplay();
				tCrab.sDisplay();
				tSqud.sDisplay();
				tOctp.sDisplay();
				MiSou.sDisplay();
				Katsd.sDisplay();
				Gyoza.sDisplay();
				Kmchi.sDisplay();
				Ykisb.sDisplay();
				tapSi.sDisplay();
				banSi.sDisplay();
				hotSi.sDisplay();
				chxSi.sDisplay();
				prkSi.sDisplay();
				tocSi.sDisplay();
				
				break;
				
			case 3:
				//Begin Transaction
				on2 = true;
				
					//Ask User to add an item to the transaction or end the transaction
				while(on2 == true)
				{
					System.out.println("Add an item to transaction?");
					
					System.out.println(a);
					System.out.println();

					
						//Display what User can add to the transaction
					tBacn.tDisplay();
					tCrab.tDisplay();
					tSqud.tDisplay();
					tOctp.tDisplay();
					MiSou.tDisplay();
					Katsd.tDisplay();
					Gyoza.tDisplay();
					Kmchi.tDisplay();
					Ykisb.tDisplay();
					tapSi.tDisplay();
					banSi.tDisplay();
					hotSi.tDisplay();
					chxSi.tDisplay();
					prkSi.tDisplay();
					tocSi.tDisplay();
					
						//Get the item User added to the transaction
					ctrl2 = sc.nextInt();
	
						//Add item to the transaction
					switch(ctrl2)
					{
						case 1:
							
							transactionValue = transactionValue + tBacn.transaction();
							
							break;
							
						case 2:
						
							transactionValue = transactionValue + tCrab.transaction();
							
							break;
							
						case 3:
						
							transactionValue = transactionValue + tSqud.transaction();
							
							break;
							
						case 4:
							
							transactionValue = transactionValue + tOctp.transaction();
							
							break;
							
						case 5:
							
							transactionValue = transactionValue + MiSou.transaction();
							
							break;
							
						case 6:
							
							transactionValue = transactionValue + Katsd.transaction();
		
							break;
							
						case 7:
							
							transactionValue = transactionValue + Gyoza.transaction();
		
							break;
							
						case 8:
							
							transactionValue = transactionValue + Kmchi.transaction();
		
							break;
							
						case 9:
							
							transactionValue = transactionValue + Ykisb.transaction();
		
							break;
							
						case 10:
							
							transactionValue = transactionValue + tapSi.transaction();
		
							break;
							
						case 11:
							
							transactionValue = transactionValue + banSi.transaction();
		
							break;
							
						case 12:
							
							transactionValue = transactionValue + hotSi.transaction();
		
							break;
							
						case 13:
							
							transactionValue = transactionValue + chxSi.transaction();
		
							break;
							
						case 14:
							
							transactionValue = transactionValue + prkSi.transaction();
		
							break;
							
						case 15:
							
							transactionValue = transactionValue + tocSi.transaction();
							
							break;
							
							}
						//Display Total Value
					System.out.println("The transaction is now at: " + transactionValue);
					System.out.println();
					
						//Ask User if they want to end the transaction
					System.out.println("End the transaction?");
					
					System.out.println("Enter 'Y' for yes.");
					System.out.println("Enter 'N' for no. " );
					
					ctrl3 = sc.next();
					
					switch(ctrl3)
					{
					case "y":
							//Asking User how much we recieved
						System.out.println("How much money did we recieve?");
						System.out.println(a);
						
							//Taking value User recieved
						reValue = sc.nextInt();
						
							//Calculating change
						reValue = reValue - transactionValue;
						
							//Displaying change
						System.out.println("The change is " + reValue);
						
						on2 = false;
						
						break;

					case "n":
						
						break;
												
					default:
						
					System.out.println("Please enter a valid letter.");
					
					break;
					}
					
				}
				
				break;
				
			case 4:
				
				on = false;
				
			break;
			}
		
		}while(on == true);
		
		System.out.println("Program is shutting down");
	}
}
