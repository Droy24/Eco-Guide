package com.example.dell.eco_guide;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class household extends AppCompatActivity {
    ListView listView;

    String[] items={"Air Fresheners","Dishwashing","Household Cleaners","Laundry"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_household);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>(this,R.layout.personal_item,items);
        listView=(ListView)findViewById(R.id.listView);
        listView.setAdapter(arrayAdapter);
    }

}
