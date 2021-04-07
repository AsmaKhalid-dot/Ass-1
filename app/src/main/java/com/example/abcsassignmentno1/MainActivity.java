package com.example.abcsassignmentno1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView=findViewById(R.id.letters);
        ArrayList<String> ltr=new ArrayList<String>();
        char ch='A';
        for (int i = 0; i < 26; i++,ch++) {
            ltr.add(Character.toString(ch));
            ArrayAdapter<String> lt=new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,ltr);
            listView.setAdapter(lt);
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener()
            {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    Intent intent=new Intent(MainActivity.this,MainActivity2.class);
                    intent.putExtra("name",ltr.get(position));
                    startActivity(intent);

                }
            });

        }
    }
}