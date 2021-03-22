package com.sjsu.multiscreenapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class OrderActivity extends AppCompatActivity {

    public static final String  ORDER_KEY ="ORDER_KEY";
    private Button orderButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

        orderButton = (Button) findViewById(R.id.placeOrderId);

        orderButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                placeOrder();
            }
        });
    }

    public void placeOrder(){
        Intent intent = new Intent(OrderActivity.this,Confirmation.class);

        EditText ed1 = findViewById(R.id.itemOneId);
        EditText ed2 = findViewById(R.id.itemTwoId);
        EditText ed3 = findViewById(R.id.itemThreeId);
        EditText ed4 = findViewById(R.id.itemFourId);

        String orderMessageCaptured =   ed1.getText().toString()+", "+ed2.getText().toString()+ ", " +ed3.getText().toString()+ " and " + ed4.getText().toString();
        intent.putExtra(ORDER_KEY,orderMessageCaptured);
        startActivity(intent);
    }
}