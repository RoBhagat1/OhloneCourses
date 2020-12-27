/*******************************************************************************************
Name: Rohan Bhagat
Course: CS125-0X
Lab #: Lab Three
Submission Date: 10:00 pm, Wed (7/8)
Brief Description: The main class that creates person and its attributes
*********************************************************************************************/
public class Person {// create class for person

	private String name;// create name variable
	private String address;// create address variable
	private String phoneNumber;// create phone number variable

	public Person(String n, String a, String p)// constructor
	{
		name = n;// name variable
		address = a;// address variable
		phoneNumber = p;// phone number variable

	}

	public Person(String n, String a)// overloaded constructor
	{
		name = n;// name variable
		address = a;// address variable
		phoneNumber = "";// no phone number

	}

	public void setName(String n) { // mutator for name
		name = n;// set name
	}

	public void setAddress(String a) {// mutator for address
		address = a;// set address
	}

	public void setPhoneNumber(String p) {// mutator for phone number
		phoneNumber = p;// set phone number
	}

	public String getName() // accessor for name
	{
		return name;// return name
	}

	public String getAddress() // accessor for address
	{
		return address;// return address
	}

	public String getPhoneNumber() // accessor for phone number
	{
		return phoneNumber;// return phone number
	}

	public String toString()// convert to string
	{

		return "The name of the person is " + name + ". " + name + " live at " + address + ". The phone number is "
				+ (phoneNumber.length() > 0 ? phoneNumber : "not available") + ".";// print the whole thing
	}

}
