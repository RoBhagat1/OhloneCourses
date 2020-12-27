
/*******************************************************************************************
Name: Rohan Bhagat
Course: CS125-0X
Lab #: Lab Three
Submission Date: 10:00 pm, Wed (7/8)
Brief Description: The main class to determine the area and the perimeter 
*********************************************************************************************/
import java.util.*;//imports java

public class Rectangle {// creates class rectangle
	private double length;// creates variable length
	private double width;// variable width

	public Rectangle(double l, double w)// constructor for Rectangle
	{
		length = l;// defines length
		width = w;// defines width
	}

	public void setlength(double l) { // mutator for length
		length = l;// sets length

	}

	public void setwidth(double w) {// mutator for width
		width = w;// sets width

	}

	public double getlength() // accessor for length
	{
		return length;// returns length
	}

	public double getwidth() // accessor for width
	{
		return width;// returns width
	}

	public double ComputePerimeter() {// get perimeter
		double perimeter;// perimeter variable
		perimeter = length * 2 + width * 2;// create perimeter
		return perimeter;// return perimeter
	}

	public double computeArea() { // get area
		double area;// area variable
		area = length * width;// create area
		return area;// return area

	}

}
