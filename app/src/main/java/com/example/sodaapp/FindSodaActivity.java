package com.example.sodaapp;


import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class FindSodaActivity extends AppCompatActivity {

    private Spinner spinner;
    private TextView text;
    private SodaExpert expert;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_soda);
        spinner = findViewById(R.id.spinner);
        text = findViewById(R.id.result);

    }

    public void onClickFindSoda(View view){
        String itemChosen = String.valueOf(spinner.getSelectedItem());
        SodaExpert expert = new SodaExpert();
        ArrayList<String> sodas = expert.findMySoda(itemChosen);

        //String s = sodas.get(0) +"\n"+sodas.get(1);

        StringBuilder s = new StringBuilder();
        for(String soda : sodas){
            s.append(soda).append("\n");
        }
        text.setText(s);
    }
}