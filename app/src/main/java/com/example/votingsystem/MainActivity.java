package com.example.votingsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.icu.text.Edits;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    TextView textView;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText=findViewById(R.id.age);
        textView=findViewById(R.id.ans);
        btn=findViewById(R.id.checkbtn);






      btn.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              int abc= Integer.parseInt(editText.getText().toString());
              if(abc>=18){
                  textView.setText("You are eligible for the voting");
                  Intent intent=new Intent(MainActivity.this, MainActivity2.class);
                  startActivity(intent);
                  finish();
              }
              else {
                  textView.setText("You are not eligible for the voting");
              }


          }
      });

        }
}