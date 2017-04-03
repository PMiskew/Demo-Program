import java.util.Scanner;

public class MathClassDemo {

	
	public static void main (String[] args) {
		
		
		/*
		 * 
		 * Java has thousands of classes that you can access and use. Classes contain constants and methods that can be used to 
		 * do specific tasks, many of which are actually very hard to code for.  One class that is commonly used 
		 * is the Math class.  It contains a variety of methods and two constants that are very useful when performing 
		 * mathematical operations. 
		 *
		 *
		 * THe constants contained are PI and E.  This is the best way to access these values as
		 * you will get the most precise value. 
		 * 
		 * The Math class is included by default so there is no need to include an import statement.  Since there are 
		 * so many different classes in Java only a select few are loaded by default.  
		 * 
		 * When looking at methods in the math class, or any class, you need to consider the parameters (what needs to 
		 * be passed) and the return type (what is returned by the function).  Types are important in Java.  If you 
		 * have coded in Python types do not play as important a role so watch this!
		 *
		 */
		
		//I like to store PI in a constant.  Note that constants are regularly capitalized. 
		double PI = Math.PI;
		System.out.println(PI);
		
		double E = Math.E;
		System.out.println(E);
		
		
		/*
		 * Variable Types:
		 * 
		 * Remember that you can pass an integer into a double, but not a double into an integer.  A double is a larger variable
		 * type than an integer, meaning it takes more memory to store a double than an integer.  If an integer is passed into a double
		 * the variable is converted into a double before being stored. 
		 * 
		 *  double number = 9;
		 *  
		 *  The above line will sore number as 9.0 since 9 the integer value is being stored into a double. 
		 *    
		 */
		//Finding square root of number - sqrt takes a double as an argument and returns a double. 
		
		double square1 = Math.sqrt(9);
		double square2 = Math.sqrt(145.34);
		
		//Finding an power - pow takes two double arguments and returns a double. 
		
		double pow1 = Math.pow(3, 9);
		double pow2 = Math.pow(7,2);
		
		/*
		 * Angle Measurements:
		 * 
		 * The Math class supports trigonometric functions.  However, all the angle measurements must be passed in radians.  Most students 
		 * are familiar with degrees.  As such a common error is for example sin(30) does not return 0.5 but -0.988.  This is becuase Java
		 * is caluclating sin of 30 radians.  
		 * 
		 * Without getting into a lesson on radians verse degrees you can simply think about it as a different way to represent an angle.
		 * There are two methods in the Math class that can convert between degrees and radians. 
		 */
		
		
		double angleInRadians = Math.toRadians(30); //Coverts 30 degrees into radians
		double angleInDegrees = Math.toDegrees(180/Math.PI); //Converts radians measure to degrees
		
		//Example Program:
		
		Scanner s = new Scanner(System.in);
		
		
		System.out.print("Please input the opposite of the triangle: ");
		double opposite = s.nextDouble();
		
		System.out.print("Please input an angle in degrees: ");
		double angle = s.nextDouble();
		
		
		double angleRads = Math.toRadians(angle); //converts degree measure to radian
		double hypotenuse = opposite * Math.sin(angleRads);
		
		System.out.println("A right traiangle wiht opposite "+opposite+" and angle "+angle+" degrees has a hypotenuse of "+hypotenuse);
		
		//NOTE:	Computers don't do their math like us and as a result rounding errors can result.  If you enter an opposite of 40 and an angle of 30 degrees you might get 39.999999999999.
		//		It should be 40, but because of how Java processes the math you don't gee the exact answer.  Watch for this!
		
		
		
	}
}
