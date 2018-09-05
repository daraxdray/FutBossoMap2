package com.example.daraxeclat.futbossomap;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class all_menu extends AppCompatActivity{

    private Button mapBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_menu);
        mapBtn = (Button) findViewById(R.id.map_btn);



    }

    public void gotoMap(View view) {
        startActivity(new Intent(getApplicationContext(),launch.class));
    }

    //goto e-portal

    public void gotoEportal(View view){
        startActivity(new Intent(getApplicationContext(),eportal.class));
    }

    //got e-result
    public void gotoEresult(View view){
        startActivity(new Intent(getApplicationContext(),eresult.class));
    }

    //gallery
    public void gotogallery(View view){
        startActivity(new Intent(getApplicationContext(),gallery.class));
    }

    }


