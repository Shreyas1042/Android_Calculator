package com.example.calculator1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button b1;
    private Button b2;
    private Button b3;
    private Button b4;
    private Button b5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Get button
        b1 = (Button)findViewById(R.id.add_button);
        b2 = (Button)findViewById(R.id.sub_button);
        b3 = (Button)findViewById(R.id.multi_Button);
        b4 = (Button)findViewById(R.id.mod_button);
        b5 = (Button)findViewById(R.id.div_button);
        //Event handling Code
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                open_add_activity();
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open_sub_activity();
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open_multi_activity();
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open_mod_activity();
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open_div_activity();
            }
        });
    }

    public void open_add_activity()
    {
        Intent i1 = new Intent(this,add_activity.class);
        startActivity(i1);
    }
    public void open_sub_activity()
    {
        Intent i2 = new Intent(this, sub_activity.class);
        startActivity(i2);
    }
    public void open_multi_activity(){
        Intent i3 = new Intent(this,multi_activity.class);
        startActivity(i3);
    }
    public void open_mod_activity(){
        Intent i4 = new Intent(this, modulo_activity.class);
        startActivity(i4);
    }
    public void open_div_activity(){
        Intent i5 = new Intent(this, div_activity.class);
        startActivity(i5);
    }

}