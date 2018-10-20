package com.example.csmyp7.helloworld;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Home extends AppCompatActivity {

    public void iLeave(View v)

    {

        Intent exdirect = new Intent(Home.this, Login.class);
        startActivity(exdirect);


    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }




}
