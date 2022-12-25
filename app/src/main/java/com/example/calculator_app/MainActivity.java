package com.example.calculator_app;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText etfirstvalue,etsecondvalue;
    Button btnAdd,btnSub,btnMultipy,btnDivide;
    Double num1,num2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etfirstvalue = findViewById(R.id.etfirstvalue);
        etsecondvalue = findViewById(R.id.etsecondvalue);
        btnAdd = findViewById(R.id.btnsadd);
        btnDivide = findViewById(R.id.btnsDevide);
        btnMultipy = findViewById(R.id.btnMultily);
        btnSub = findViewById(R.id.btnsssub);
        Clicklistener();

    }
       public void Clicklistener(){
           btnAdd.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View view) {
                   num1=Double.parseDouble(etfirstvalue.getText().toString());
                   num2=Double.parseDouble(etsecondvalue.getText().toString());
                   Double result=num1+num2;
                   etfirstvalue.setText(String.valueOf(result));
                   etsecondvalue.setText("");
               }
           });

           btnSub.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View view) {
                   num1=Double.parseDouble(etfirstvalue.getText().toString());
                   num2=Double.parseDouble(etsecondvalue.getText().toString());
                   Double result=num1-num2;
                   etfirstvalue.setText(String.valueOf(result));
                   etsecondvalue.setText("");
               }
           });

           btnMultipy.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View view) {
                   num1=Double.parseDouble(etfirstvalue.getText().toString());
                   num2=Double.parseDouble(etsecondvalue.getText().toString());
                   Double result=num1*num2;
                   etfirstvalue.setText(String.valueOf(result));
                   etsecondvalue.setText("");
               }
           });

           btnDivide.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View view) {
                   num1=Double.parseDouble(etfirstvalue.getText().toString());
                   num2=Double.parseDouble(etsecondvalue.getText().toString());
                   Double result=num1/num2;
                   etfirstvalue.setText(String.valueOf(result));
                   etsecondvalue.setText("");
               }
           });



       }

}








