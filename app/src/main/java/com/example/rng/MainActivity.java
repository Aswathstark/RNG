package com.example.rng;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    Button btnClickMe;
    int[] numbers = new int[20];
    ListView list;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnClickMe = (Button) findViewById(R.id.gen);

        btnClickMe.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

res();

            }
        });
}


public void res()
{

    int max = 500;
    int min = 0;
    int range = max - min + 1;

    // generate random numbers within 1 to 10
    for (int i = 0; i < 10; i++) {
        int rand = (int) (Math.random() * range) + min;
numbers[i]=rand;

    }
    Arrays.sort(numbers);
    list = findViewById(R.id.number_list);
    ArrayList<String> arrayList = new ArrayList<String>();
    for(int s:numbers) {
        arrayList.add(String.valueOf(s));
    }

    ArrayAdapter adapter = new ArrayAdapter<String>(this,
            android.R.layout.simple_list_item_1, arrayList);
    list.setAdapter(null);
    list.setAdapter(adapter);

}

    }



