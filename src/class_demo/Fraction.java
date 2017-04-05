package class_demo;

public class Fraction {

	private int num;
	private int den;
	
	public Fraction(int n, int d) {
		
		num = n;
		den = d;
		
	} //end constructor
	
	public Fraction() {
		
		num = 0;
		den = 1;
		
	} //end constructor
	
	//******************************************************************************************************
	//Overloaded Methods:	Overloaded methods are methods that have the same name but different parameters.
	//						The programming language knows which version to call based on the parameters that
	//						are passed. 
	//
	// asDecimal is an overloaded method.
	//******************************************************************************************************
	public double asDecimal(int d) {
		
		double val = (int)(((num*Math.pow(10,d))/(den))+0.5)/Math.pow(10, d);
		return val;
		
	} //end asDecimal
	
	public double asDecmial() {

		return 1.0*num/den;
	
	} //end asDecimal
	
	//******************************************************************************************************
	//
	//toString():	The toString method is a special method that is automatically called when an object is 
	//				treated as a string.  This method can be called directly using an implied object. The 
	//				most common place we see this method being used is when an object is printed to the 
	//				console using the System.out.println call.
	//
	//				Fraction f1 = new Fraction (1,9);
	//				System.out.println(f1);
	//
	//				All classes inherit a toString method from the Object class since it is the root of the
	//				class hierarchy.  The toString method from the Object class prints out the object type
	//				followed by the memory reference location.  
	//
	//				TRY THIS:	Create a fraction object and print it out.  Then remove the toString from the
	//							Fraction class.  Notice the difference in what is displayed to the screen. 
	//
	//******************************************************************************************************
	public String toString() {
		
		return num+"/"+den;
		
	} //end toString
	
	//******************************************************************************************************
	//
	//Overriding:	
	//
	//equals(Object other):	This works, but isn't advised. The reason this isn't advised is that implementing 
	//						an overridden version means you have to check the passed object type and then 
	//						downcast, which is overkill since the version in the Object class will already deal
	//						with situation where we are comparing fractions to other objects.  Doing this is
	//						more complicated and overkill.  That said understanding how it works will help
	//						solidify some ideas. 
	//
	//						It is good to circle back to this concept once you have explored class hierarchies
	//******************************************************************************************************
	
	public boolean equals(Object other) {
		
		if (other == null) return false;
		
		if (other instanceof Fraction) {
			Fraction fother = (Fraction)other;
			
			return this.num == fother.num && this.den == fother.den;
		}
		
		return false;
		
	} //end equals

	
	//******************************************************************************************************
	//
	//Overloading:
	//
	//equals(Fraction other):	
	//
	//
	//
	//******************************************************************************************************

	public boolean equals(Fraction other) {
		
		if (other == null) return false;
		
		return this.num == other.num && this.den == other.den;
	
	} //end equals
}
