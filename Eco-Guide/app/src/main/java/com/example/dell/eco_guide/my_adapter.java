package com.example.dell.eco_guide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by DELL on 4/14/2017.
 */
public class my_adapter extends ArrayAdapter<User> {
    public my_adapter(Context context, ArrayList<User> users) {
        super(context, 0, users);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position
        User user = getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_user, parent, false);
        }
        // Lookup view for data population
        ImageView imageView=(ImageView)convertView.findViewById(R.id.imView);
        // Populate the data into the template view using the data object
        if(user.user=="img_1")
        imageView.setImageResource(R.drawable.img_1);

        if(user.user=="img_2")
            imageView.setImageResource(R.drawable.img_2);
        if(user.user=="img_3")
            imageView.setImageResource(R.drawable.img_3);
        if(user.user=="img_4")
            imageView.setImageResource(R.drawable.img_4);
        if(user.user=="img_5")
            imageView.setImageResource(R.drawable.img_5);
        if(user.user=="img_6")
            imageView.setImageResource(R.drawable.img_6);
        // Return the completed view to render on screen
        return convertView;
    }
}
