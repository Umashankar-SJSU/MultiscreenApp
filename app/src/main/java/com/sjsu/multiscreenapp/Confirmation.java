package com.sjsu.multiscreenapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Confirmation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmation);

        Intent intent = getIntent();
        String orderMessage = intent.getStringExtra(OrderActivity.ORDER_KEY);

        TextView contents = findViewById(R.id.confirmationId);
        contents.setText("You have ordered "+orderMessage);
    }
}