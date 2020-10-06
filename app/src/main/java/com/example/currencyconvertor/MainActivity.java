package com.example.currencyconvertor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public void Dollartorupees(View view){
    EditText editText=(EditText)findViewById(R.id.editText);
     String get=editText.getText().toString();
        Float convert=Float.parseFloat(get);
        Float store=convert;
         convert=convert*75.5f;
         Toast.makeText(this, store+" $"+" is equals to "+convert+"Rs", Toast.LENGTH_LONG)
                 .show();
     }
     public void Rupeestodollar(View view){
         EditText editText=(EditText)findViewById(R.id.editText);
         String get=editText.getText().toString();
         Float convert1=Float.parseFloat(get);
         Float store1=convert1;
         convert1=convert1/75.5f;
         Toast.makeText(this, store1+" Rs"+" is equals to "+convert1+" $", Toast.LENGTH_LONG)
                 .show();}
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
