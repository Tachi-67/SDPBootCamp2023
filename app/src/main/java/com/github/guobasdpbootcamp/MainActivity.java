package com.github.guobasdpbootcamp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText editName;

    @Override 
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editName = (EditText) findViewById(R.id.mainName);

    }

    public void goToGreetingActivity(View view) {
        String personName = editName.getText().toString();
        Intent startGreetIntent = new Intent(this, GreetingActivity.class);
        startGreetIntent.putExtra("UserInputName", personName);
        startActivity(startGreetIntent);
    }
}