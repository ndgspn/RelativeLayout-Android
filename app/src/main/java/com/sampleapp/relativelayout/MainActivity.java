package com.sampleapp.relativelayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner spinner = (Spinner) findViewById(R.id.dates_spinner);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, getResources().getStringArray(R.array.dates_spinner));
        spinner.setAdapter(adapter);

        Spinner spinnerTimes = findViewById(R.id.times);
        ArrayAdapter<CharSequence> timesAdapter = ArrayAdapter.createFromResource(this, R.array.times, android.R.layout.simple_spinner_item);
        timesAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerTimes.setAdapter(timesAdapter);
    }
}
