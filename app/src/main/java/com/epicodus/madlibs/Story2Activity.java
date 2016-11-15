package com.epicodus.madlibs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;

public class Story2Activity extends AppCompatActivity {
    @Bind(R.id.storyTextView) TextView mStoryTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story2);
        ButterKnife.bind(this);

        Intent intent = getIntent();
        ArrayList words = intent.getStringArrayListExtra("words");
        String text = "I walk through the color jungle. I take out my "+words.get(0)+" canteen. There's a "+words.get(1)+" parrot with a "+words.get(2)+" "+words.get(3)+" in his mouth right in front of me in the "+words.get(4)+" trees! I gaze at his "+words.get(5)+" "+words.get(6)+". A sudden sound awakes me from my daydream! A panther "+words.get(7)+" in front of my head! I "+words.get(8)+" his "+words.get(9)+" breath. I remember I have a packet of "+words.get(10)+" that makes anything go into a deep slumber! I "+words.get(11)+" it away in front of the "+words.get(12)+". Yes, he's eating it! I "+words.get(13)+" away through the jungle. I meet my parents at the tent. Phew, it's been an exciting day in the jungle.";
        mStoryTextView.setText(text);
    }
}
