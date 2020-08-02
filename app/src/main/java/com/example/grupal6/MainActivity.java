package com.example.grupal6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView editTextDate;
    private TextView textView2;
    private TextView textView4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.editTextDate = findViewById(R.id.editTextDate);
        this.textView2 = findViewById(R.id.textView2);
        this.textView4 = findViewById(R.id.textView4);
    }
    public void edad(View view){
        int fecha = Integer.parseInt(editTextDate.getText().toString());
        int operacion = 2020 - fecha;
        textView2.setText(String.valueOf(operacion));
        String[] valor = editTextDate.getText().toString().split("");
        int i = 0;
        for (String x: valor) {
            i = x.equals("")?i:Integer.parseInt(x)+i;
        }
        this.textView4.setText(String.valueOf(i));


    }
}