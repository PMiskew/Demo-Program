
public class RPGRunner {

	public static void main(String[] args) {
		
		Warlock warlock1 = new Warlock(100,100,"Warlock 1");
		warlock1.executeSpecial();
		
		Warrior warrior1 = new Warrior(100,100,"Warrior 1");
		warrior1.executeSpecial();
		
		/*
		 * At compile time we assume that the reference and object type match. 
		 * We assume pwarlock is actually a Player object.  Even though we know
		 * it isn't. 
		 * 
		 */
		Player pwarlock = new Warlock(100,100,"Player Warlock");
		
		/*
		 * If Player is not abstract and does not contain its own executeSpecial
		 *		Since at compile time we assume that pwarlock is a player Java can't find
		 *		executeSpecial because that is written in the Warlock class
		 *		Downcasting needed.
		 * If Player is not abstract and we write an executeSpecial, even if it is empty. 
		 * 		At compile time this is fine becuase Java assumes it will call the executeSpecial in
		 * 		the player class.  There is one to use.  However, at run time it uses the Warlock version.
		 * 		No downcasting needed.
		 * If Player is abstract
		 * 		At compile time Java is reassued that the subclass contains a version of executeSpecial.
		 * 		No downcasting needed!
		 */
		pwarlock.executeSpecial();
	
	}

}
