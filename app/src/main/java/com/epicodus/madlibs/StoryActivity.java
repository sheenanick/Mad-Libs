package com.epicodus.madlibs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

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
        ArrayList words = intent.getStringArrayListExtra("words");
        String text = "Last month, I went to Disney World with " + words.get(0) + ". We traveled for " + words.get(1) + " by " + words.get(2) + ". " +
                "Finally, we got there and it was very " + words.get(3) + ". There were " + words.get(4) + " people " + words.get(5) +
                " everywhere. There were also people dressed up in " + words.get(6) + " costumes.";
        mStoryTextView.setText(text);
    }
}
