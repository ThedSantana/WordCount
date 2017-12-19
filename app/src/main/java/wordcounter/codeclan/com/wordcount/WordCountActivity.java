package wordcounter.codeclan.com.wordcount;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class WordCountActivity extends AppCompatActivity {


    EditText wordCountField;
    TextView wordCountResults;
    Button wordCountButton;
    WordCount wordCount;
    InputMethodManager inputManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_count);

       wordCountField = findViewById(R.id.wordCountField);
       wordCountButton = findViewById(R.id.countWordsButton);
       wordCountResults = findViewById(R.id.wordCountResult);
       wordCount = new WordCount();
    }




    public void onWordCountButtonClicked(View button){

        //Found online - to hide keyboard automatically //
        InputMethodManager inputManager = (InputMethodManager) getSystemService(this.INPUT_METHOD_SERVICE);
        inputManager.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), InputMethodManager.HIDE_NOT_ALWAYS);


        String words = wordCountField.getText().toString();
        Log.d(getClass().toString(), "The words are: '" + words + "'");
        wordCountResults.setText("The number of words is: " + String.valueOf(wordCount.countTotal(words)));
    }
}
