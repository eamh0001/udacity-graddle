package com.example.jokesbar;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class JokesActivity extends AppCompatActivity {

    public static final String INTENT_KEY_JOKE = "IKJ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jokes);

        TextView mTextView = findViewById(R.id.mTextView);

        Intent intent = getIntent();
        if (intent != null && intent.hasExtra(INTENT_KEY_JOKE)) {
            String joke = intent.getStringExtra(INTENT_KEY_JOKE);
            mTextView.setText(joke);
        }
    }
}
