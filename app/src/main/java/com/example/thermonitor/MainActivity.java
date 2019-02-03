package com.example.thermonitor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.content.Intent;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import android.view.View.OnClickListener;


public class MainActivity extends AppCompatActivity {
    //ListActivity simpleList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Button button = findViewById(R.id.button);
        button.setOnClickListener(new OnClickListener() {
            @Override

            public void onClick(View v) {
                Intent gotoL = new Intent(MainActivity.this, ListActivity.class);
                startActivity(gotoL);
            }
        });






    }




}
