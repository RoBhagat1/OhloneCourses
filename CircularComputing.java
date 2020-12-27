
/*******************************************************************************************
Name: Rohan Bhagat
Course: CS125-0X
Lab #: Lab Two
Submission Date: 10:00 pm, Wed (7/1)
Brief Description: The operation class to get the area and volume of circles and cylinders 
*********************************************************************************************/
public class CircularComputing {//operation class
	
	public CircularComputing()//constructor
	{
	}

	public  double computeObject(double radius) //method for circle
    { 
        double area= Math.PI*radius*radius;//get area of circle
        return area;//return it
    } 
    public  double computeObject(double radius, double height)//surface area of cylinder 
    { 
        double surfaceArea=2*Math.PI*radius*height+2*Math.PI*radius*radius;//get surface area of cylinder
        return surfaceArea;//return it
    }
    public double computeObject(double radiusOutside, double radiusInside, double height)//method for volume of cylinder 
    { 
        double volume = Math.PI*height*(Math.pow(radiusInside, 2)-Math.pow(radiusOutside,2));//get volume
        return volume;//return volume
    } 
    
    public String toString(double radius)//String conversion for circle
    {
    	String ObjectName = "Circle";//get name 
    	double area = computeObject(radius);//get area
    	return  "Object Name is "+ObjectName +". Radius is "+radius+". Area is "+area;//return name, radius, and area
    }
    public String toString(double radius, double height)//String conversion for cylinder
    {
        String ObjectName="Cylinder";//get name
    	double surfaceArea = computeObject(radius, height);//get surface area
       return "Object Name is "+ObjectName+". Radius is "+radius+". Height is "+height+". Surface area is "+surfaceArea;//return the name, dimensions and area
    	
    }
    public String toString(double radOut, double radIn, double h)//String conversion for cylinder volume
    {
    	double volume = computeObject(radOut, radIn, h);//get volume
        String ObjectName="Cylinder";//get name of it
        return "Object Name is "+ObjectName+". Height is "+h+". Outside Radius is "+radOut+". Inside Radius is "+radIn+". Volume is "+volume;//return volume, name and dimensions    
    	
    }

}
