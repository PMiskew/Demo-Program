import java.util.ArrayList;
import java.util.List;

public class InspectingListElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create List
		List<String> list = new ArrayList<String>();
		
		//Populate List
		list.add("cat");
		list.add("dog");
		list.add("cat");
		list.add("fish");
		list.add("cat");
		
		//word searching for
		String word = "cat";
		
		//counter to keep track of word
		int ctr = 0;
		
		
		//Forward:
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).equals(word)) {
				ctr = ctr + 1;
			}
		}
		
		//Backwards
		//Re-initialize ctr
		
		for (int i = list.size() - 1; i >= 0; i--) {
			if (list.get(i).equals(word)){
				ctr = ctr + 1;
			}
		}
		
	}

}
