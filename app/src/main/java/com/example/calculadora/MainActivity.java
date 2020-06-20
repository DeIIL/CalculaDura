package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText EditTextValor1, EditTextValor2, EditTextResult;
    TextView txtView1, txtView2, txtView3;
    Button btnPlus, btnLess, btnHalf, btnX;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditTextValor1 = (EditText)findViewById(R.id.editTextValor1);
        EditTextValor2 = (EditText)findViewById(R.id.editTextValor2);

        txtView1 = (TextView)findViewById(R.id.txtView1);
        txtView2 = (TextView)findViewById(R.id.txtView2);
        txtView3 = (TextView)findViewById(R.id.txtView3);

        btnPlus = (Button)findViewById(R.id.btnPlus);
        btnLess = (Button)findViewById(R.id.btnLess);
        btnHalf = (Button)findViewById(R.id.btnHalf);
        btnX = (Button)findViewById(R.id.btnX);

        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            Double input, input1, result;

            input = Double.parseDouble(EditTextValor1.getText().toString());
            input1 = Double.parseDouble(EditTextValor2.getText().toString());
            result = input + input1;

            txtView3.setText(result.toString());
            }
        });
        btnLess.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             Double input, input1 , result;

             input = Double.parseDouble(EditTextValor1.getText().toString());
             input1 = Double.parseDouble(EditTextValor2.getText().toString());
             result = input - input1;

             txtView3.setText(result.toString());
            }
        });
        btnHalf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double input, input1 , result;

                input = Double.parseDouble(EditTextValor1.getText().toString());
                input1 = Double.parseDouble(EditTextValor2.getText().toString());
                result = input / input1;

                txtView3.setText(result.toString());
            }
        });
        btnX.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double input, input1 , result;

                input = Double.parseDouble(EditTextValor1.getText().toString());
                input1 = Double.parseDouble(EditTextValor2.getText().toString());
                result = input * input1;

                txtView3.setText(result.toString());
            }
        });
    }
}