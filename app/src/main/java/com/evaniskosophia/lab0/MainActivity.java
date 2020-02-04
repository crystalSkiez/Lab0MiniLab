package com.evaniskosophia.lab0;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button myButton2;
    int clicks = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myButton2=findViewById(R.id.myButton);
        myButton2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                clicks += 1;
                System.out.println(clicks);
            }
        });

    }
}
