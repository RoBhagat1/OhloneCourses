/*******************************************************************************************
Name: Rohan Bhagat
Course: CS125-0X
Lab #: Lab Two
Submission Date: 10:00 pm, Wed (7/1)
Brief Description: The operation class to enter a serials of
integers with a loop until -99 is entered and display the
greatest, the least, the sum and the average of the data entries 
*********************************************************************************************/
import java.util.*;//import java

public class ArrayComputing {//operation class

	ArrayList <Integer> nums = new ArrayList<Integer>();//make array list
	
	public void makeArray()//ask user for input, and create array 
	{		
		int userInput=-99;//define variable, for user input
		Scanner input = new Scanner(System.in);//create Scanner method
		boolean needMoreInput=true;//when to break
		
		while (needMoreInput)//while loop to keep going
		{//start while loop
			System.out.println("Enter an integer");//ask for user input
			userInput= input.nextInt();//save user input
			if (userInput==-99)//check if -99, break if it is
			{
				needMoreInput=false;//stop the while loop
			}//close if
			else	//else statement, add to array
			{
				nums.add(Integer.valueOf(userInput));//add to array
			}//close else	
		}//close while loop
		
		input.close(); //close the input stream. 
		
	}//close make array method
	
	
	public void getMax()//get the max
	{
		if (nums.size()==0)
		{
			System.out.println("Error, no values found");
			return;
		}

		
		int max = nums.get(0);//create the max
		for (int i = 0; i < nums.size(); i++)//for loop to get max
		{
			if (nums.get(i) > max) //check if max
				max = nums.get(i);//if it is, then define as max
		}
		System.out.println("Max is "+max);//print max
	}
	
	public void getSmall()//find small
	{
		if (nums.size()==0)
		{
			System.out.println("Error, no values found");
			return;
		}
		
		int small =nums.get(0);//create small variable
		for(int g=0; g< nums.size(); g++)//for loop to get smallest
		{
			 if (nums.get(g) < small)//if number smallest
				 small = nums.get(g);//define as smallest       
		}
		System.out.println("Smallest number is "+ small);//print smallest number
	}
	
	public void getSum() //find the sum 
	{
		int sum =0;//create sum variable
		for (int k=0;k<nums.size();k++)//for loop to get sum
		{
			sum +=nums.get(k);//add all numbers 
		}
		System.out.println("Sum is "+sum);//print sum
	}
	
	public void getAverage()//create average method
	{
		if (nums.size()==0)
		{
			System.out.println("Error, no values found");
			return;
		}
		
		double average = 0;//variable for average

		double sum =0;//create sum variable
		for (int k=0;k<nums.size();k++)//get the sum
		{
			sum +=nums.get(k);//get the sum
		}
		average=  sum/nums.size();//compute the average
		System.out.println( "Average is "+average);//print average
	}
}


