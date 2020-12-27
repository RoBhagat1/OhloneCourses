import java.util.*;
public class RectangleApp {

	public static void main(String[] args) {
		//write comments, declare variables before
		
		double printArea;
		double giveLength;
		Scanner input = new Scanner(System.in); 
	    System.out.println("give me the length");//ask for length
	    giveLength = input.nextDouble();
	    System.out.println("give me the width");//ask for width
	    double givewidth = input.nextDouble();
		Rectangle givedimensions = new Rectangle(giveLength, givewidth );
		printArea = givedimensions.computeArea(); //compute area
		System.out.println("Area is "+printArea);
		double printPerimeter = givedimensions.ComputePerimeter();//compute perimeter
		System.out.println("Perimeter is "+printPerimeter);
	}
	
	/* Testing code
	private static void TestRectangle()
	{
		Rectangle givedimensions = new Rectangle(3, 5);
		double printArea = givedimensions.computeArea();
		if (printArea==15)
		{
			System.out.println("Test1 succeed");
		}
		
		double printPerimeter = givedimensions.ComputePerimeter();
		if (printPerimeter==16) {
			System.out.println("Test2 succeed");
		}
		
		
		Rectangle givedimensions1 = new Rectangle(3, -55);
		printArea = givedimensions1.computeArea();
		if (printArea==0)
		{
			System.out.println("Test3 succeed");
		}
		
		printPerimeter = givedimensions1.ComputePerimeter();
		if (printPerimeter==0) {
			System.out.println("Test4 succeed");
		}
			
		
		givedimensions.setlength(5);
		if (givedimensions.getlength()==5)
		{
			System.out.println("Test5 success");
		}
		givedimensions.setwidth(5);
		if (givedimensions.getwidth()==5)
		{
			System.out.println("Test6 success");
		}
		*/
	

}
