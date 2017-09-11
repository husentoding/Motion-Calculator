package com.example.husain.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private EditText num1;
    private EditText num2;
    private Button tambah;
    private Button kurang;
    private Button kali;
    private Button bagi;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        num1= (EditText)findViewById(R.id.number1);
        num2= (EditText)findViewById(R.id.number2);
        tambah= (Button)findViewById(R.id.buttonTambah);
        kurang=(Button)findViewById(R.id.buttonKurang);
        kali= (Button)findViewById(R.id.buttonKali);
        bagi=(Button)findViewById(R.id.buttonBagi);
        result= (TextView) findViewById(R.id.viewHasil);

        tambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int x= (int) compute(Integer.parseInt(num1.getText().toString()),Integer.parseInt(num2.getText().toString()),"+" );
                result.setText(Integer.toString(x));

            }
        });
        kurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int x= (int) compute(Integer.parseInt(num1.getText().toString()),Integer.parseInt(num2.getText().toString()),"-" );
                result.setText(Integer.toString(x));}
        });
        kali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int x= (int) compute(Integer.parseInt(num1.getText().toString()),Integer.parseInt(num2.getText().toString()),"*" );
                result.setText(Integer.toString(x));}
        });
        bagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int x= (int) compute(Integer.parseInt(num1.getText().toString()),Integer.parseInt(num2.getText().toString()),"/" );
                result.setText(Integer.toString(x));}
        });

    }

    private double compute(int a, int b, String c){
        if(c=="+")
            return a+b;
        else if(c=="-")
            return a-b;
        else if(c=="*")
            return a*b;
        else if(c=="/")
            return a/b;
        else
            return 0;
    }

}
