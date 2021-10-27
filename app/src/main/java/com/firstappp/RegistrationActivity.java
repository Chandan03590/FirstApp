package com.firstappp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegistrationActivity extends AppCompatActivity {

    EditText username, password, confirmPassword;
    Button registerBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        username=findViewById(R.id.username);
        password=findViewById(R.id.password);
        confirmPassword=findViewById(R.id.confirm_password);
        registerBtn=findViewById(R.id.register_button);


        registerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user=username.getText().toString().trim();
                String pass=password.getText().toString().trim();
                String cpass=confirmPassword.getText().toString();

                if(user.isEmpty() && pass.isEmpty() && cpass.isEmpty()){

                    Toast.makeText(getApplicationContext(), "All field are required", Toast.LENGTH_SHORT).show();
                }
                else{
                    if (user.isEmpty()){
                        username.setError("Please Enter Username");
                    }
                    else if (pass.isEmpty()){
                        password.setError("Enter Password");
                    } else if (cpass.isEmpty()) {
                        confirmPassword.setError("Please Enter Confirm Password");
                    }


                }

            }
        });

    }
}