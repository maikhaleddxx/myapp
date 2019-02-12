package com.example.thermonitor;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListActivity extends AppCompatActivity {
    ListView simpleList;
    String nameArray[] = new String[] {"Iphone", "Linux", "BlackBerry", "Android", "Windows"};
    Integer[] imageArray= {R.drawable.iphone, R.drawable.linux, R.drawable.blackberry,
            R.drawable.android,R.drawable.windows} ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listactivity);

        CustomListAdapter whatever = new CustomListAdapter(this, nameArray, imageArray);
        simpleList = (ListView) findViewById(R.id.simplelist);
        simpleList.setAdapter(whatever);
        simpleList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position,
                                    long id) {

                Intent intent = new Intent(ListActivity.this, DeviceDetailActivity.class);
                startActivity(intent);
            }
        });
    }
}
