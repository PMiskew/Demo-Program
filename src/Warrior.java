/*
 * Since Warrior extends player we can say
 * 
 * Warrior is a subclass of Player
 * Player is a superclass of Warrior
 * 
 * This means that Warrior inherits all fields and methods.  It DOES NOT inhert constructors.
 * 
 * 
 */

public class Warrior extends Player {

	private int power;
	
	public Warrior(int p ) {
		//super calls the constructor of the super class. 
		//It must be the first call.
		//If nothing is written, super() with no parameters is assumed
		
		power = p;
		
		
	}
	
	public Warrior(int p, int h, String name) {
		super(h,name); //invoked super constructor that takes health and name
		power = p;
		
	}
	
	
	public void executeSpecial(){
		
		System.out.println("Crushing Blow");

	}

	
	
}
