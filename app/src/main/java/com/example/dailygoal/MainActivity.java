package com.example.dailygoal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    RadioButton readYes;
    RadioButton readNo;
    RadioButton arriveYes;
    RadioButton arriveNo;
    RadioButton attemptYes;
    RadioButton attemptNo;
    EditText Personal;
    Button btnok;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        readYes = findViewById(R.id.radioReadYes);
        readNo = findViewById(R.id.radioReadNo);
        arriveYes = findViewById(R.id.radioArriveYes);
        arriveNo = findViewById(R.id.radioArriveNo);
        attemptYes = findViewById(R.id.radioAttemptYes);
        attemptNo = findViewById(R.id.radioAttemptNo);
        Personal = findViewById(R.id.editTextPersonal);
        btnok = findViewById(R.id.btnok);

        btnok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                String read = "";

                if(readYes.isChecked()) {
                    read = readYes.getText().toString();
                }
                else if (readNo.isChecked()) {
                    read = readNo.getText().toString();
                }

                String arrive = "";

                if(arriveYes.isChecked()) {
                    arrive = arriveYes.getText().toString();
                }
                else if (arriveNo.isChecked()) {
                    arrive = arriveNo.getText().toString();
                }

                String attempt = "";

                if(attemptYes.isChecked()) {
                    attempt = attemptYes.getText().toString();
                }
                else if (attemptNo.isChecked()) {
                    attempt = attemptNo.getText().toString();
                }

                String personal = Personal.getText().toString();


                Intent intent = new Intent(getBaseContext(), Main2Activity.class);
                intent.putExtra("read", read);
                intent.putExtra("arrive", arrive);
                intent.putExtra("attempt", attempt);
                intent.putExtra("personal", personal);


                startActivity(intent);


            }
        });



    }


}
