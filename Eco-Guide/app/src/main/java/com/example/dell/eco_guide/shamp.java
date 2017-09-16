package com.example.dell.eco_guide;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class shamp extends AppCompatActivity {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shamp);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ArrayList<User> arrayOfUsers = new ArrayList<User>();
        Context context=getApplicationContext();

           arrayOfUsers.add(new User("img_1"));
        arrayOfUsers.add(new User("img_2"));
        arrayOfUsers.add(new User("img_3"));
        my_adapter adapter = new my_adapter(this, arrayOfUsers);
        listView=(ListView)findViewById(R.id.listView);
        listView.setAdapter(adapter);
    }

}
