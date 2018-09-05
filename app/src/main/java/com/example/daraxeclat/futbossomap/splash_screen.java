package com.example.daraxeclat.futbossomap;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

public class splash_screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        new Handler().postDelayed(new Runnable(){
  @Override
        public void run(){
  startActivity(new Intent(getApplicationContext(),all_menu.class));
  finish();}},5000);



    }}