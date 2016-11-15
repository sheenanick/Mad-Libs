package com.epicodus.madlibs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    @Bind(R.id.createButton) Button mCreateButton;
    @Bind(R.id.word0EditText) EditText mWord0EditText;
    @Bind(R.id.word1EditText) EditText mWord1EditText;
    @Bind(R.id.word2EditText) EditText mWord2EditText;
    @Bind(R.id.word3EditText) EditText mWord3EditText;
    @Bind(R.id.word4EditText) EditText mWord4EditText;
    @Bind(R.id.word5EditText) EditText mWord5EditText;
    @Bind(R.id.word6EditText) EditText mWord6EditText;
    ArrayList<String> words = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        mCreateButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v == mCreateButton) {
            words.add(mWord0EditText.getText().toString());
            words.add(mWord1EditText.getText().toString());
            words.add(mWord2EditText.getText().toString());
            words.add(mWord3EditText.getText().toString());
            words.add(mWord4EditText.getText().toString());
            words.add(mWord5EditText.getText().toString());
            words.add(mWord6EditText.getText().toString());
            Intent intent = new Intent(MainActivity.this, StoryActivity.class);
            intent.putExtra("words", words);
            startActivity(intent);
        }

    }
}
