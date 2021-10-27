package com.firstappp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DashboardActivity extends AppCompatActivity {

    Button linearActivity, horizontalLayout, tableLayoutBtn, gridBtn;
    Button loginUiBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        linearActivity = findViewById(R.id.linear_activity_btn);
        horizontalLayout = findViewById(R.id.horizontal_lyt);
        tableLayoutBtn = findViewById(R.id.table_lyt);
        gridBtn = findViewById(R.id.grid_btn);
        loginUiBtn = findViewById(R.id.login_ui_btn);

        linearActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(DashboardActivity.this, LinearActivity.class);
                startActivity(intent);

            }
        });

        horizontalLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent hintent = new Intent(DashboardActivity.this, HorizontalLinearLayoutActivity.class);
                startActivity(hintent);

            }
        });

        tableLayoutBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent tableIntent = new Intent(DashboardActivity.this, TableLayoutActivity.class);
                startActivity(tableIntent);

            }
        });

        gridBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gridIntent = new Intent(DashboardActivity.this, GridLayoutActivity.class);
                startActivity(gridIntent);
            }
        });


        loginUiBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent loginIntent = new Intent(DashboardActivity.this, LoginModenUiActivity.class);
                startActivity(loginIntent);
            }
        });

    }
}