package com.epicodus.madlibs;

import android.content.Intent;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    @Bind(R.id.startButton) Button mStartButton;
    @Bind(R.id.radioGroup) RadioGroup mRadioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        mStartButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v == mStartButton) {
            int selectedId = mRadioGroup.getCheckedRadioButtonId();
            RadioButton radioButton = (RadioButton)findViewById(selectedId);
            CharSequence radioButtonText = radioButton.getText();
            if (radioButtonText.equals("Fun places")) {
                Intent intent = new Intent(MainActivity.this, Choice1Activity.class);
                startActivity(intent);
            } else if (radioButtonText.equals("Adventure")) {
                Toast.makeText(MainActivity.this, radioButton.getText(),Toast.LENGTH_LONG).show();
            }
        }
    }
}
