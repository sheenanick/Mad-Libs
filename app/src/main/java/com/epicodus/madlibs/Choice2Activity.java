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

public class Choice2Activity extends AppCompatActivity implements View.OnClickListener {
    @Bind(R.id.createButton) Button mCreateButton;
    @Bind(R.id.word0EditText) EditText mWord0EditText;
    @Bind(R.id.word1EditText) EditText mWord1EditText;
    @Bind(R.id.word2EditText) EditText mWord2EditText;
    @Bind(R.id.word3EditText) EditText mWord3EditText;
    @Bind(R.id.word4EditText) EditText mWord4EditText;
    @Bind(R.id.word5EditText) EditText mWord5EditText;
    @Bind(R.id.word6EditText) EditText mWord6EditText;
    @Bind(R.id.word7EditText) EditText mWord7EditText;
    @Bind(R.id.word8EditText) EditText mWord8EditText;
    @Bind(R.id.word9EditText) EditText mWord9EditText;
    @Bind(R.id.word10EditText) EditText mWord10EditText;
    @Bind(R.id.word11EditText) EditText mWord11EditText;
    @Bind(R.id.word12EditText) EditText mWord12EditText;
    @Bind(R.id.word13EditText) EditText mWord13EditText;
    ArrayList<String> words = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choice2);
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
            words.add(mWord7EditText.getText().toString());
            words.add(mWord8EditText.getText().toString());
            words.add(mWord9EditText.getText().toString());
            words.add(mWord10EditText.getText().toString());
            words.add(mWord11EditText.getText().toString());
            words.add(mWord12EditText.getText().toString());
            words.add(mWord13EditText.getText().toString());
            Intent intent = new Intent(Choice2Activity.this, Story2Activity.class);
            intent.putExtra("words", words);
            startActivity(intent);
        }
    }
}
