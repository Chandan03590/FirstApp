package com.firstappp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ProgressBar;
import android.widget.Toast;

public class LoginModenUiActivity extends AppCompatActivity {

    CheckBox rememberMe;
    Button loginButton;
    ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_moden_ui);

        rememberMe=findViewById(R.id.remember_me);
        loginButton=findViewById(R.id.loginButton);
        progressBar=findViewById(R.id.progress_bar);


        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



                if (rememberMe.isChecked()){
                    progressBar.setVisibility(View.VISIBLE);
                    loginButton.setVisibility(View.INVISIBLE);
                    Intent intent=new Intent(LoginModenUiActivity.this,DashboardActivity.class);
                    startActivity(intent);

                }
                else{
                    loginButton.setVisibility(View.VISIBLE);
                    progressBar.setVisibility(View.INVISIBLE);
                    Toast.makeText(LoginModenUiActivity.this, "Remember Me is not selected", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        loginButton.setVisibility(View.VISIBLE);
        progressBar.setVisibility(View.INVISIBLE);
    }

    public void RegisterPage(View view) {
        Intent intent=new Intent(LoginModenUiActivity.this,RegistrationActivity.class);
        startActivity(intent);
    }
}