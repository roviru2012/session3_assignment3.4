package com.varunkumar.myapplication;

import android.content.Intent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText username;
    Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username= (EditText) findViewById(R.id.username);
        mButton= (Button) findViewById(R.id.button);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String enteredUsername = username.getText().toString();
                if(enteredUsername==null || enteredUsername.equals("")){
                    Toast.makeText(MainActivity.this, "Username cannot be empty.", Toast.LENGTH_LONG).show();
                    return;
                }
                else {

                    Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                    Bundle bundle = new Bundle();
                    bundle.putString("username", enteredUsername);
                    intent.putExtras(bundle);
                    startActivity(intent);
                }
            }
        });
    }
}