package com.example.tutorial01;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btn_clicks; //i can choose the name i want
    TextView txt_display;
    int clicks =0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_clicks= findViewById(R.id.btn_clickMe);
        txt_display=findViewById(R.id.txt_display);

        btn_clicks.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clicks++;
                txt_display.setText("Total click= "+ clicks);
            }
        });






    }
}