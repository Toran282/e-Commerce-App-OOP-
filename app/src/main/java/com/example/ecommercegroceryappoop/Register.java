package com.example.ecommercegroceryappoop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Register extends AppCompatActivity {
    private Button Register,Already_a_user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        Register=(Button)findViewById(R.id.register);
        Already_a_user=(Button)findViewById(R.id.already_a_user);

        Already_a_user.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(getApplicationContext(),MainActivity.class));

            }
        });
    }
}