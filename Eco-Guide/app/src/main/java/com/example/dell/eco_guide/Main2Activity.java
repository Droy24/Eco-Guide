package com.example.dell.eco_guide;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Intent intent=getIntent();
        Bundle extras=intent.getExtras();
        String file_name=extras.getString("file_name");

        ImageView imageView=(ImageView)findViewById(R.id.img_v);
        switch (file_name){
            case "img_1":{
                imageView.setImageResource(R.drawable.img_1);
                break;
            }
            case "img_2":{
                imageView.setImageResource(R.drawable.img_2);
                break;
            }
            case "img_3":{
                imageView.setImageResource(R.drawable.img_3);
                break;
            }
            case "img_4":{
                imageView.setImageResource(R.drawable.img_4);
                break;
            }
            case "img_5":{
                imageView.setImageResource(R.drawable.img_5);
                break;
            }
            case "img_6":{
                imageView.setImageResource(R.drawable.img_6);
                break;
            }

            default:{
                Toast.makeText(Main2Activity.this, "This Item Is Yet Not Available In Our Database", Toast.LENGTH_SHORT).show();
                break;
            }
        }
    }

}
