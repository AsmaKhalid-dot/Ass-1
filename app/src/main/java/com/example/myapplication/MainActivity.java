package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView=findViewById(R.id.charecters);
        ArrayList <String> chr=new ArrayList<String>();
        char ch='A';
        for (int i = 1; i <27 ; i++,ch++) {
           chr.add(character.toString(ch));
            ArrayAdapter <String> chr1=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,chr);
        }
    }
}