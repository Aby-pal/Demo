package Demo.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class FirstHighesOccurence {

	static String FirstMostFrequentWord(List<String> listOfWords) {

		// Insert all elements in hash
		Map<String, Integer> hm = new HashMap<String, Integer>();

		for (int i = 0; i < listOfWords.size(); i++) {
			String key= listOfWords.get(i);
			if (hm.containsKey(key)) {
				int freq = hm.get(key);
				freq++;
				hm.put(key, freq);
			} else {
				hm.put(key, 1);
			}
		}
		
		// find max frequency.
		String FistMaxOccurenceWord = ""; int max_count = 0;

		for (Entry<String, Integer> val : hm.entrySet()) {
			System.out.println("key :: "+val.getKey());
			System.out.println("val :: "+val.getValue());

			if (max_count < val.getValue()) {
				FistMaxOccurenceWord = val.getKey();
			}
		}


		return FistMaxOccurenceWord;
	}

	// Driver code
	public static void main(String[] args) {

		  Scanner s=new Scanner(System.in);

	        System.out.println("Enter number of list size");

	        int ListSize=s.nextInt();

	        List<String> listItems = new ArrayList<>();

	        System.out.println("enter elements");

	        for(int i=0;i<ListSize;i++){//for reading array
	        	listItems.add(s.next());

	        }
	        
          System.out.println(listItems);
          System.out.println(FirstMostFrequentWord(listItems));

	}
}
