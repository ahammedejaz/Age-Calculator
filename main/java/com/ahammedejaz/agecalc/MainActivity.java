package com.ahammedejaz.agecalc;

import android.icu.util.Calendar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    EditText et1;
    TextView tvage,t2;
    Button bage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1=(EditText) findViewById(R.id.et1);
        tvage=(TextView) findViewById(R.id.tv3);
        t2=(TextView) findViewById(R.id.tv2);
        bage=(Button)findViewById(R.id.bcalc);
        //Implementing Onclick
        bage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int dob;
                //Converting Text to Integer value
                dob=(Integer.parseInt(et1.getText().toString()));
                //Getting the current year
                Calendar calendar=Calendar.getInstance();
                int year=calendar.get(Calendar.YEAR);
                //Calculating the AGE
                int age=year-dob;
                //Displaying the AGE
                tvage.setText("You are "+age+" years old");
            }
        });
    }
}
