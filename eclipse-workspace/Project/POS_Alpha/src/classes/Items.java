package classes;

	//Importing Files
import java.util.Scanner;

public class Items
{
		//Declare Class Variables
	
	private int id;
	private String name;
	public int stock;
	private double price;
	
	Scanner sc = new Scanner(System.in);

	//Methods
	
		//Construct Constructor
	public Items(int id , String name, int stock, double price)
	{
		this.setId(id);
		this.setName(name);
		this.setStock(stock);
		this.setPrice(price);
	}

		//Getters & Setters
	
			//Id Getter
	public int getId()
	{
	return id;
	}
			//Id Setter
	public void setId(int id)
	{
	this.id = id;
	}
			//Name Getter
	public String getName()
	{
		return name;
	}
			//Name Setter
	public void setName(String name)
	{
	this.name = name;
	}
			//Stock Getter
	public int getStock()
	{
		return stock;
	}
			//Stock Setter
	public void setStock(int stock)
	{
		this.stock = stock;
	}
			//Price Getter
	public double getPrice()
	{
		return price;
	}
			//Price Setter
	public void setPrice(double price)
	{
		this.price = price;
	}
	
	
		//Stock Prompt
	public void sPrompt()
	{
		System.out.println();
		System.out.println("How many " + name + " do we have today?");
		System.out.print("Enter here:  ");
		stock = sc.nextInt();
	}
	
		//Stock Display
	public void sDisplay()
	{
		System.out.println();
		System.out.println("We currently have " + stock + " " + name);
	}
		//Transaction Prompt
	public void tDisplay()
	{
		System.out.println();
		System.out.println("Enter " + id + " to add " + name + " to transaction.");
	}
		//Transaction
	public double transaction()
	{
		stock = stock - 1;
		
		return(price);
	}
}
