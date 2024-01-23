package com.example.votingsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    Button btn;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        btn=findViewById(R.id.abc);
        textView=findViewById(R.id.xyz);

       btn.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               textView.setText("Thanks for the voting");
           }
       });
    }
}