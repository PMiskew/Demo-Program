
/*
 * ABSTRACT CLASSES:
 * 
 * 		- Abstract classes are ones that you will never instantiate.  Meaning you will never make an instance.
 * 		- We can have a reference to an abstract class, but we cannot create an instance. 
 * 		- Abstract classes are useful because it helps avoid the need for downcasting. 
 * 		- If you have a single abstract method, you must make the entire class abstract.  
 */
public abstract class Player {

	private int health;
	private String name;
	
	public Player() {
		
		health = 100;
		name = "Unknown";
		
	}
	
	public Player(int h, String p) {
		health = h;
		name = p;
	}

	
	public abstract void executeSpecial();
	
	public void drinkPotion() {
		health = health + 10;
	}
	

}
