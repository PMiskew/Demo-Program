
public class InspectingArrayElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Generate Array
		String[] words = {"cat","dog","cat","fish","cat"}; //sample array
		int ctr = 0; //keeps track of how many times word appears
		String word = "cat"; //Stores word we are searching for
		
		//Forward
		for (int i = 0; i < words.length; i++) {
			if (words[i].equals(word)) {
				ctr = ctr + 1;
			}
		}
		System.out.println(ctr);
		//Backwards
		ctr = 0; //reset ctr
		for (int i = words.length - 1; i >= 0; i--) {
			if (words[i].equals(word)) {
				ctr = ctr + 1;
			}
		}

		System.out.println(ctr);
			
			
				
		
		
	}

}
