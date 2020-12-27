
/*******************************************************************************************
Name: Rohan Bhagat
Course: CS125-0X
Lab #: Lab Three
Submission Date: 10:00 pm, Wed (7/8)
Brief Description: The driver class to check if the input is valid and display it in a JOptionPane 
*********************************************************************************************/
import javax.swing.JOptionPane;//import JOptionPane
public class RectangleValidationApp{//main class

	public static void main(String[] args) { // main method
		
		boolean run = true;// run variable
		double convertDouble = 0;// input variable
		double length = 0;// length variable
		double width = 0;// width variable

		while (run)// first while for length
		{
			String inputPane = JOptionPane.showInputDialog(null, "Input the length");// ask for input
			try// exception handeling
			{
				convertDouble = Double.parseDouble(inputPane);// convert input to double
				if (convertDouble < 0)// check if negative
				{
					throw new NegativeDoubleException();// if it is, throw to negative double exception
				}
				length = convertDouble;// gives input
				run = false;// stops run
			} catch (NumberFormatException exception)// if exception
			{
				JOptionPane.showMessageDialog(null, "Invalid Entry, enter a positive real number for length", "ERROR",
						JOptionPane.ERROR_MESSAGE);// return error message
				run = true;// continues run
			} catch (NegativeDoubleException exception)// catch for negative
			{
				JOptionPane.showMessageDialog(null, exception.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);// returns error message
				run = true;// continue run
			}
		}
		
		run=true;

		while (run)// run for width
		{
			String inputPane = JOptionPane.showInputDialog(null, "Input the width");// ask for width
			try// exception handeling
			{
				convertDouble = Double.parseDouble(inputPane);// converts input to double
				if (convertDouble < 0)// checks if double negative
				{
					throw new NegativeDoubleException();// throws to NegativeDoubleException
				}
				run = false; // stops run
				width = convertDouble;// assigns width
			} catch (NumberFormatException exception)// exception
			{
				JOptionPane.showMessageDialog(null, "Invalid Entry, enter a positive real number for width", "ERROR",
						JOptionPane.ERROR_MESSAGE);// string exception
				run = true;// continues run
			} catch (NegativeDoubleException exception)// exception
			{
				JOptionPane.showMessageDialog(null, exception.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);// error
																												// for
																												// negative
				run = true;// continues run
			}
		}
		
		double printArea;// creates variable for area
		double printPerimeter;// creates variable for perimeter
		Rectangle givedimensions = new Rectangle(length, width);// creates object of rectangle
		printArea = givedimensions.computeArea(); // compute area//computes Area
		JOptionPane.showMessageDialog(null, printArea, "Area of rectangle is ", JOptionPane.INFORMATION_MESSAGE);// prints Area
		printPerimeter = givedimensions.ComputePerimeter();// compute perimeter
		JOptionPane.showMessageDialog(null, printPerimeter, "Perimeter of rectangle is ", JOptionPane.INFORMATION_MESSAGE);// print perimeter
	}

}
	