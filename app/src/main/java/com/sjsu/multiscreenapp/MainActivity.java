package com.sjsu.multiscreenapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText userName;
    private EditText pwd;
    private Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        userName = (EditText) findViewById(R.id.userNameId);
        pwd = (EditText) findViewById(R.id.pwdId);
        loginButton = (Button) findViewById(R.id.buttonId);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validateLogin(userName.getText().toString(), pwd.getText().toString());
            }
        });
    }

    private void validateLogin(String username, String password){
        if((username.endsWith("admin")) && (password.equals("admin"))) {
         Intent intent = new Intent(MainActivity.this, OrderActivity.class);
         startActivity(intent);
            Toast.makeText(getApplicationContext(),"Login Successfull",Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(getApplicationContext(),"Login failed",Toast.LENGTH_SHORT).show();
        }
        }

    }
