package grid.controller;

import grid.model.AwesomeCandyVillain;
import grid.view.GridView;

public class GridController
{
	private	int [] [] RandomNumbers;
	private String [] [] Celebreties;
	public GridView myView;
	public AwesomeCandyVillain  [] [] myVillain;
	
	public GridController()
	{
		myView = new GridView();
		RandomNumbers = new int [3][3];
		Celebreties =  new String [4][4];
		myVillain = new AwesomeCandyVillain [2] [2];
	}
	
	public void start()
	{
		FillTheIntArray(RandomNumbers);
		FillTheStringArray(Celebreties);
		myView.printIntInformation(RandomNumbers);
		 PrintStringInformation(Celebreties);
		PrintMyVillain(myVillain);
	}
	
	public void PrintStringInformation(String [] [] currentArray)
	{
		System.out.println("foreach printing");
		for(String[] currentRow : currentArray)
		{
			for(String currentNumber : currentRow)
			{
				System.out.print(currentNumber + "\t");
			}
			System.out.println();
		}
		
		System.out.println("for printing");
		for(int row = 0; row < currentArray.length; row++)
		{
			for(int col = 0; col < currentArray[0].length; col++)
			{
				System.out.print(row + "," + col + ": " + currentArray[row][col] + "\t");
			}
			System.out.println();
		}
	}

	public void PrintMyVillain(AwesomeCandyVillain[][] currentArray)
	{
		System.out.println("foreach printing");
		for(AwesomeCandyVillain[] currentRow : currentArray)
		{
			for(AwesomeCandyVillain currentVillain : currentRow)
			{
				System.out.print(currentVillain.getName() + "\t");
			}
			System.out.println();
		}
		
		System.out.println("for printing");
		for(int row = 0; row < currentArray.length; row++)
		{
			for(int col = 0; col < currentArray[0].length; col++)
			{
				System.out.print(row + "," + col + ": " + currentArray[row][col].getName()+ "\t");
			}
			System.out.println();
		}
	}
	
	public void FillMyVillain(AwesomeCandyVillain [] []myVillain)
	{
		myVillain [0] [0] = new AwesomeCandyVillain();
		myVillain [0] [1] = new AwesomeCandyVillain();
		myVillain [1] [0] = new AwesomeCandyVillain().;
		myVillain [1] [1] = new AwesomeCandyVillain();
	}
	
	public void FillTheIntArray(int [] [] RandomNumbers)
	{
		RandomNumbers [0] [0] = 1;
		RandomNumbers [0] [1] = 2;
		RandomNumbers [0] [2] = 3;
		RandomNumbers [1] [0] = 4;
		RandomNumbers [1] [1] = 5;
		RandomNumbers [1] [2] = 6;
		RandomNumbers [2] [0] = 7;
		RandomNumbers [2] [1] = 8;
		RandomNumbers [2] [2] = 9;
	}
	
	public void FillTheStringArray(String [] [] Celebreties)
	{
		Celebreties [0] [0] = "Morgan Freeman";
		Celebreties [0] [1] = "George Clooney";
		Celebreties [0] [2] = "Clint Eastwood";
		Celebreties [0] [3] = "Katy Perry";
		Celebreties [1] [0] = "Lady Gaga";
		Celebreties [1] [1] = "Samuel L. Jackson";
		Celebreties [1] [2] = "Matt Damon";
		Celebreties [1] [3] = "Silvester Stallon";
		Celebreties [2] [0] = "Arnold Schwarchneggar";
		Celebreties [2] [1] = "Brad Pitt";
		Celebreties [2] [2] = "Bruce Willis";
		Celebreties [2] [3] = "Mila Kunis";
		Celebreties [3] [0] = "Jack Nicholson";
		Celebreties [3] [1] = "Michael Jordan";
		Celebreties [3] [2] = "Michael Jackson";
		Celebreties [3] [3] = "Shaquille O'Neal";
	}
}
