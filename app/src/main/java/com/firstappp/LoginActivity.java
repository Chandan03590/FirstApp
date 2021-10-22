package com.firstappp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    Button loginBtn;
    EditText username,password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        loginBtn=findViewById(R.id.login_button);
        username=findViewById(R.id.username);
        password=findViewById(R.id.password);
        
        

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String user=username.getText().toString();
                String pass=password.getText().toString();
                
                if(user.equals("dilip") && pass.equals("1234")){

                    Intent intent=new Intent(LoginActivity.this,DashboardActivity.class);
                    startActivity(intent);
                    Toast.makeText(LoginActivity.this, "Login Success", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(LoginActivity.this, "Login Failed", Toast.LENGTH_SHORT).show();
                }
                
              

            }
        });

    }
}