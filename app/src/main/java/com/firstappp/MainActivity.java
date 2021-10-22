package com.firstappp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    Button loginBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginBtn=findViewById(R.id.login_button);

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //intent
                //commuicate between one app to another app

                //Explicit intent==communicate between one activity to another activity     and Implicit Intent
//Implicit Intent === One App To Another
                Intent intent=new Intent(MainActivity.this,LoginActivity.class);
                startActivity(intent);

            }

        });



    }
}