/**
   * Gets integers and  turns them into Roman Numerals  
   */
public class RomanNumerals {

	private int number;
	//constructor for Roman numerals
	public RomanNumerals(int n) { 
	number= n;
	}
	
	// accessor for Number
	public int getNumber() 
	  {
	    return number;
	  }
	//mutator for number
	public void setNumber(int n) 
	{
		number=n;
	}
	
	// convert integer to the Roman Numeral
	public String convertNum(){
		
		String roman = null;
		switch(number) {
        case 1 :
           roman = "I";
           break;
        case 2 :
        	roman = "II";
            break;
        case 3 :
          roman = "III";
           break;
        case 4 :
           roman = "IV";
           break;
        case 5 :
           roman = "V";
           break;
        case 6 :
            roman = "VI";
            break;
        case 7 :
            roman= "VII";
            break;
        case 8 :
            roman = "VIII";
            break;
        case 9 :
            roman = "IX";
            break;
        case 10 :
            roman = "X";
            break;
        default :
          roman ="Invalid number, needs to be 1-10";
		}
		return roman;
		
	}
	
	
	
	
}