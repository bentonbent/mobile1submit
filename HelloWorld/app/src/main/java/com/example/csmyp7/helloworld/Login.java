package com.example.csmyp7.helloworld;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Login extends AppCompatActivity {

    public void iCheck(View v){
        EditText user=findViewById(R.id.editText);
        EditText pass=findViewById(R.id.editText2);
        String userName=user.getText().toString();
        String password=pass.getText().toString();

        boolean myFlag = false;

        if(!userName.isEmpty()&&!password.isEmpty()){
            if(userName.equals("Admin")&&password.equals("Admin")) {
                myFlag = true;
                Intent redirect = new Intent(Login.this, Home.class); startActivity(redirect);
            }
        }

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
}
