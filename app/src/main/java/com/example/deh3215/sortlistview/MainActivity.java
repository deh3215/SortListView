package com.example.deh3215.sortlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {

    ListView lv;
    String[] months = {
            "January",
            "February",
            "March",
            "April",
            "May",
            "June",
            "July",
            "August",
            "September",
            "October",
            "November",
            "December"
    };
    ArrayAdapter<String> adapter;
    ArrayList<String> list;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = findViewById (R.id.listviw);
        lv.setFastScrollEnabled(true);
        list = new ArrayList<String>(Arrays.asList(months));
        adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, list);
        lv.setAdapter(adapter);
    }
    
    public void onclick(View v)   {
        Collections.sort(list);
        for(int i=0; i < list.size(); i++){
            System.out.println(list.get(i));
        }

        adapter.notifyDataSetChanged();
    }
}
