package wordcounter.codeclan.com.wordcount;

import java.util.HashMap;

/**
 * Created by ianhenderson on 18/12/2017.
 */

public class WordCount {

    HashMap wordCountTable;

    public WordCount() {
        this.wordCountTable = new HashMap<String, Integer>();
    }

    public HashMap getWordCountTable() {
        return wordCountTable;
    }



    public int countTotal(String sentence) {
        return sentence.split(" ").length;
    }

    public void addToHashMap(String word, int count){
        this.wordCountTable.put(word, count);
    }
}
