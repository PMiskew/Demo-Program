
public class Warlock extends Player implements MagicUser{

	private int mana;
	
	public Warlock(int m ) {
		//super calls the constructor of the super class. 
		//It must be the first call.
		//If nothing is written, super() with no parameters is assumed
		
		mana = m;
		
		
	}
	
	public Warlock(int m, int h, String name) {
		super(h,name); //invoked super constructor that takes health and name
		mana = m;
		
	}
	
	public void executeSpecial(){
		
		System.out.println("Casting Spell");

	}
	
	public void rideDragon() {
		System.out.println("Riding Dragon");
				
	}
	
}
