
public class CoversionStringToInt {

	public static void main(String[] args) {

		
		/*
		 * Before starting you need understand that you can only
		 * convert a string to an int if the String is actually 
		 * an integer.  I am not talk about a mapping approach 
		 * where each letter has an integer value and then you 
		 * find the total.  When we talk about conversion from String
		 * to int we mean a direct conversion
		 * 
		 * String value = "1";
		 * 
		 * We want to convert value to an int 1
		 * 
		 */
		
		
		String value = "67";
		
		/*
		 * To do this we use a built in method contained within
		 * the INteger class caled parseInt
		 */
		
		//Watch if value is NOT an integer this generates a 
		//runtime error
		int intValue = Integer.parseInt(value);
		
		intValue = intValue + 1;
		
		System.out.println(intValue);
		
		
	}

}
