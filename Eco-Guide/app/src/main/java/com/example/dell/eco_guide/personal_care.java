package com.example.dell.eco_guide;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class personal_care extends AppCompatActivity {
    ListView listView;

    String[] items={"After Shave","Conditioner","Makeup","Mouthwash","Shampoo","Shaving Cream","Soap","Toothpaste","Eye and Ear Care","Medicine Cabinet"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal_care);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>(this,R.layout.personal_item,items);
        listView=(ListView)findViewById(R.id.listView);
        listView.setAdapter(arrayAdapter);

       listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
           @Override
           public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               if(position==4){
                   Intent intent=new Intent(personal_care.this,shamp.class);
                   startActivity(intent);
               }
               else if(position==7){
                   Intent intent=new Intent(personal_care.this,tooth.class);
                   startActivity(intent);
               }
           }
       });
    }

}
