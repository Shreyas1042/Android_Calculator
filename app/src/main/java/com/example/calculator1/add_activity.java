package com.example.calculator1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class add_activity extends AppCompatActivity {


    private EditText et1;
    private EditText et2;
    private Button b1;
    private TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);

        et1 = (EditText)findViewById(R.id.editTextNumber1);
        et2 = (EditText)findViewById(R.id.editTextNumber2);
        b1 = (Button) findViewById(R.id.b1);
        t1 = (TextView) findViewById(R.id.a1_result);
//Getting the components

        //Event Handling Code
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n1 = Integer.parseInt(et1.getText().toString());
                int n2 = Integer.parseInt(et2.getText().toString());

                int n3 = n1+n2;
                t1.setText("Result is: "+String.valueOf(n3));
            }
        });
    }
}