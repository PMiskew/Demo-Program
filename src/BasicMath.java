/**
 * Java supports basic Mathematics operations and more complex operations are supported though the Math class and 
 * its built in functions.  Java will consider order of operations.   
 *
 * @author PMiskew
 *
 */
public class BasicMath {

	public static void main(String[] args) {
	
		
		int sum = 1 + 2;
		System.out.println(sum);
		int product = 3 * 4;
		System.out.println(product);
		int quotient = 4/5;
		System.out.println(quotient);
		int modulus = 10 % 2;
		System.out.println(modulus);
		
		/*
		 * 
		 * Comment on Modulus:
		 * 
		 * The modulus operator generates the remainder when division is applied.  
		 * 
		 * For example 
		 * 
		 * 		10 % 2 = 0 because 10/2 = 5 remainder 1
		 * 		7 % 4 = 3 because 7/4 = 1 remainder 3
		 *		0%5 = 0 because 0/5 = 0 remainder 0
		 *		5 % 0 = undefined because 5 / 0 is undefined.  This will show up as a runTime error
		 * 
		 * Note that modulus has the same precedence as multiply and divide.  
		 * 
		 */
		
		int example1 = 1 + 5 * 4; //Java will support order of operations
		int example2 = (1 + 5) * 4; // Java will support brackets.  Note that you must explicitly place the operator infront of brackets.  This means 4(1 + 5) is not valid in Java. 
		int example3 = 5 + 6 % 2;  //Modulus operator has the same precedence as multiply and divide
		
		/*
		 * Comment of Exponents:
		 * 
		 * Java DOES NOT support the ^ or the ** operator for exponents.  
		 * 
		 * For example in Python you could write 3**4 to generate 3 to the power of 4. 
		 * 
		 * In Java you must use a built in function in the Math class.  Please see MathClassDemo for exampples. 
		 * 
		 * 
		 */
		
		
	
	}

}
