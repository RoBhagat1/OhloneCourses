/**
   * Gets number and converts it 
   */
import java.util.Scanner;

public class RomanNumeralsApp {

	public static void main(String[] args) {
		int giveNumber; 
		double printArea;
		Scanner input = new Scanner(System.in); 
	    System.out.println("give me a number between 1-10");//ask for input
	    giveNumber = input.nextInt();//give input
	    RomanNumerals convertNumbers = new RomanNumerals(giveNumber);//call convert function
		String roman = convertNumbers.convertNum();
		
		//print it
		System.out.println(roman);
	    }

}

