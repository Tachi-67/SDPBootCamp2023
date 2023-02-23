package com.github.guobasdpbootcamp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class GreetingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_greeting);

        Intent Extra = getIntent();
        String inputName = Extra.getStringExtra("UserInputName");
        TextView displayText = (TextView) findViewById(R.id.greetText);
        displayText.setText("Hello! " + inputName);
    }
}