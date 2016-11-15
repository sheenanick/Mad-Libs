package com.epicodus.madlibs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    @Bind(R.id.createButton) Button mCreateButton;
    @Bind(R.id.word1EditText) EditText mWord1EditText;
    @Bind(R.id.word2EditText) EditText mWord2EditText;
    @Bind(R.id.word3EditText) EditText mWord3EditText;
    @Bind(R.id.word4EditText) EditText mWord4EditText;
    @Bind(R.id.word5EditText) EditText mWord5EditText;
    @Bind(R.id.word6EditText) EditText mWord6EditText;
    @Bind(R.id.word7EditText) EditText mWord7EditText;

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
            String word1 = mWord1EditText.getText().toString();
            String word2 = mWord2EditText.getText().toString();
            String word3 = mWord3EditText.getText().toString();
            String word4 = mWord4EditText.getText().toString();
            String word5 = mWord5EditText.getText().toString();
            String word6 = mWord6EditText.getText().toString();
            String word7 = mWord7EditText.getText().toString();
            Intent intent = new Intent(MainActivity.this, StoryActivity.class);
            intent.putExtra("word1", word1);
            intent.putExtra("word2", word2);
            intent.putExtra("word3", word3);
            intent.putExtra("word4", word4);
            intent.putExtra("word5", word5);
            intent.putExtra("word6", word6);
            intent.putExtra("word7", word7);
            startActivity(intent);
        }

    }
}
