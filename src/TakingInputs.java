import java.util.Scanner; //IMPORTANT:  To use the Scanner class we must import it. 

/**
 * This file gives basic examples of how to take inputs from the console in Java
 * @author PMiskew
 *
 */
public class TakingInputs {

	public static void main(String[] args) {
		
		/*
		 * To take inputs from the console in Java you must use a Scanner Object.  If you have not learned what an object is yet you
		 * can think of it as a more complex variable.  We will use the Scanner object that we create to call a specific method that 
		 * will actually "tell" the computer to take an input, which is actually rather complex
		 * 
		 * IMPORTANT:   At this stage we will create two Scanner objects.  One will be used for taking String and character inputs, the 
		 * 				other will be used for taking numeric inputs. You will run into problems when dealing with Strings that have spaces
		 * 				in them.  It is easier at this stage to separate the process.
		 */
		//Step 1: Create Scanner Objects.
		
		Scanner s = new Scanner(System.in);
		Scanner snum = new Scanner(System.in);
		
		
		//Step 2: Use the scanner object to invoke the method that takes an input from the console. 
		System.out.print("Input a word: "); //Numbers can be inputted, but they will be interpreted as Strings.
		String word = s.nextLine(); 
		
		System.out.print("Input a character: "); //Can input a long word, but it only takes the first character. 
		char character = s.next().charAt(0);
		
		System.out.print("Input an integer: "); //Will crash if you input a String or decimal values.
		int iNum = snum.nextInt();
		
		System.out.print("Input a number: "); //Will crash if you input a String.
		double dNum = snum.nextDouble();
		
		
		//Step 3 (Optional): Print out the values
		System.out.println("The word is "+word);
		System.out.println("The character is "+character);
		System.out.println("The integer is "+iNum);
		System.out.println("The decimal number is "+dNum);
		
		
		
		
	}

}
