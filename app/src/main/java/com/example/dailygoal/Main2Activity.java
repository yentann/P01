package com.example.dailygoal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView ResultRead;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ResultRead = findViewById(R.id.textViewResultRead);

        Intent intentReceived1 = getIntent();
        Intent intentReceived2 = getIntent();
        Intent intentReceived3 = getIntent();
        Intent intentReceived4 = getIntent();

        String read = intentReceived1.getStringExtra("read");
        String arrive = intentReceived2.getStringExtra("arrive");
        String attempt = intentReceived3.getStringExtra("attempt");
        String personal = intentReceived4.getStringExtra("personal");

        ResultRead.setText("Read up the material before class: " + read + "\n" + "Arrive on time so as not to miss important part of the lesson: " + arrive + "\n" + "Attempt the problem myself: " + attempt + "\n" + "Reflection: " + personal);




    }
}
