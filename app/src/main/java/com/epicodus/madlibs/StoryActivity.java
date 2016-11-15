package com.epicodus.madlibs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;

public class StoryActivity extends AppCompatActivity {
    @Bind(R.id.storyTextView) TextView mStoryTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story);
        ButterKnife.bind(this);

        Intent intent = getIntent();
        String word1 = intent.getStringExtra("word1");
        String word2 = intent.getStringExtra("word2");
        String word3 = intent.getStringExtra("word3");
        String word4 = intent.getStringExtra("word4");
        String word5 = intent.getStringExtra("word5");
        String word6 = intent.getStringExtra("word6");
        String word7 = intent.getStringExtra("word7");
        String text = "Last month, I went to Disney World with " + word1 + ". We traveled for " + word2 + " by " + word3 + ". " +
                "Finally, we got there and it was very " + word4 + ". There were " + word5 + " people " + word6 +
                " everywhere. There were also people dressed up in " + word7 + " costumes.";
        mStoryTextView.setText(text);
    }
}
