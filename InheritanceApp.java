/*******************************************************************************************
 * Name: Rohan Bhagat
 * Course: CS125-0X 
 * Lab #: Lab Three
 * Submission Date: 10:00 pm, Wed (7/8) 
 * Brief Description: The app class to give the input and print the input
 *********************************************************************************************/
public class InheritanceApp {// creates inheritance class

	public static void main(String[] args) {// create the main method

		Person newPerson = new Person("Joe", "456 PQR ST USA", "111-111-1111");// create new object of person
		System.out.println(newPerson.toString());// call toString method to print
		
		Person newPerson2 = new Person("John", "321 XYZ ST USA");// create second object with overloaded constuctors
		System.out.println(newPerson2.toString());// call toString method to print it
		
		Customer newCustomer = new Customer("Bob", "123 ABC ST USA", " 498-728-544", false, 324);// creates Customer method with data
		System.out.println(newCustomer.toString());// calls the toString method to print
	}

}
