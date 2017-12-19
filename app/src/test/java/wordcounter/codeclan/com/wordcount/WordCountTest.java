package wordcounter.codeclan.com.wordcount;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;

/**
 * Created by ianhenderson on 18/12/2017.
 */

public class WordCountTest {

    WordCount wordCount;
    String test;

    @Before
    public void before(){
        wordCount = new WordCount();
        test = "This is a test string a test string it is";
    }

    @Test
    public void canCountTotalWords(){
        assertEquals(10, wordCount.countTotal(test));
    }

    @Test
    public void canAddToHashMap(){
        wordCount.addToHashMap("test", 1);
        String word = "test";
        int count = 1;
        HashMap testhash = new HashMap<>();
        testhash.put(word, count);
        assertEquals(testhash, wordCount.getWordCountTable());
    }




}
