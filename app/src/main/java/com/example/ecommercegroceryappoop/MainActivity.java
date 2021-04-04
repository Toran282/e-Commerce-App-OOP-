package com.example.ecommercegroceryappoop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button JoinNow,LoginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        JoinNow=(Button)findViewById(R.id.JoinNow);
        LoginButton=(Button)findViewById(R.id.login);


        JoinNow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(getApplicationContext(),Register.class));

            }
        });
    }
}