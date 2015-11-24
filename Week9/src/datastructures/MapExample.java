package datastructures;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class MapExample {


	public static void main(String[] args){

		HashMap<String, Integer> wordCount = new HashMap<>();
		wordCount.put("a", 1000);
		wordCount.put("science", 20);


		System.out.println(wordCount.get("science"));
		Set<Entry<String, Integer>> entries = wordCount.entrySet();

		wordCount.put("science", 100);

		for(Entry<String, Integer> entry : entries){
			System.out.println(entry.getKey()+", "+entry.getValue());

		}




	}

}
