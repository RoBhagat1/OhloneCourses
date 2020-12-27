/*******************************************************************************************
Name: Rohan Bhagat
Course: CS125-0X
Lab #: Lab Three
Submission Date: 10:00 pm, Wed (7/8)
Brief Description: The main class to create the Customer class that inherits from Person
*********************************************************************************************/
public class Customer extends Person {// class that inherits from person
	private boolean mailing;// variable for mailing
	private int customerID;// variable for the ID

	public Customer(String n, String a, String p, boolean m, int i) {// create the constructor
		super(n, a, p);// call the super method
		mailing = m;// mailing variable
		customerID = i;// ID variable
	}

	public void setMailing(boolean m) { // mutator for mailing
		mailing = m;// set mailing
	}

	public void setID(int i) { // mutator for ID
		customerID = i;// set ID
	}

	public boolean getMailing() // accessor for mailing
	{
		return mailing;// return mailing
	}

	public int getCustomerID() // accessor for ID
	{
		return customerID;// return ID
	}

	public String toString()// convert to string
	{

		return super.toString() + " It is " + mailing + " that they want to be mailed. Their customer id is "
				+ customerID;// first return person details, then return customer details
	}

}
