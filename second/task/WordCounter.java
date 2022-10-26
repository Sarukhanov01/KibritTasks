package second.task;

import java.util.HashMap;
import java.util.Map;

public class WordCounter {
    private static Map<String,Integer> wordCounts = new HashMap<>();

    public void take(String word){
        if (wordCounts.containsKey(word)){
            int count = wordCounts.get(word);
            wordCounts.replace(word,count,++count);
            return;
        }
        wordCounts.put(word,1);
    }

    public int count(String word){
        return wordCounts.get(word);
    }
}
