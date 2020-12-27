
/*******************************************************************************************
Name: Rohan Bhagat
Course: CS125-0X
Lab #: Lab Two
Submission Date: 10:00 pm, Wed (7/1)
Brief Description: The driver class to get the area and volume of circles and cylinders 
*********************************************************************************************/
public class CircluarComputingAp {//driver class

	public static void main(String[] args) {//main method
		CircularComputing MyComputing = new CircularComputing();//call method
		
		MyComputing.computeObject(1);//return area of circle
		System.out.println(MyComputing.toString(1));//print area, name, and dimensions
		
		MyComputing.computeObject(1,2);//return area of cylinder
		System.out.println(MyComputing.toString(1,2));//print surface area, name, and dimensions
		
		MyComputing.computeObject(1,2,3);//return volume of cylinder
		System.out.println(MyComputing.toString(1,2,3));//print volume, name, dimensions
		
		
		
	}

}
