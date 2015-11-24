package wordcount;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordCount {

	List<String> allLines;
	HashMap<String, Integer> wordCountMap = new HashMap<>();

	public WordCount(List<String> lines) {
		this.allLines = lines;
		this.computeWordCount();
	}

	public Map<String, Integer> getCountMap(){
		return this.wordCountMap;
	}

	public void computeWordCount(){
		for(String line : allLines){
			String[] words = line.split("\\s+");
			for (int i = 0; i < words.length; i++) {
				Integer previousValue = wordCountMap.get(words[i]);
				if(previousValue==null){
					previousValue = 0;
				}
				wordCountMap.put(words[i], previousValue+1);
			}
		}




	}

}
